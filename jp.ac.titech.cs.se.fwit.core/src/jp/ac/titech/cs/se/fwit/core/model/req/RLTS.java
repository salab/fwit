package jp.ac.titech.cs.se.fwit.core.model.req;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import jp.ac.titech.cs.se.fwit.core.model.Domain;
import jp.ac.titech.cs.se.fwit.core.model.DomainConcept;
import jp.ac.titech.cs.se.fwit.core.model.DomainVariable;
import jp.ac.titech.cs.se.fwit.core.model.DomainVariableSpace;
import jp.ac.titech.cs.se.fwit.core.model.Guard;
import jp.ac.titech.cs.se.fwit.core.model.SLTS;
import jp.ac.titech.cs.se.fwit.core.model.State;
import jp.ac.titech.cs.se.fwit.core.model.req.action.MethodInvocationAction;

public class RLTS extends SLTS {

	private List<Scenario> scenarios;

	private String functionName;
	private String moduleName;

	private Domain domain;
	
	
	public static Set<RState> createTransitions(Set<RState> currentStates,
			RAction action, RGuard guard) {

		Set<RState> nextStates = new HashSet<RState>();
		for (RState src : currentStates) {
			RGuard g = guard;
			RTransition transition = getTransition(src, g, action);
			src = (RState) transition.getTarget();
			nextStates.add(src);
		}
		return nextStates;
	}

	public static Set<RState> createEvaluatorTransitions(
			Set<RState> currentStates, RAction evaluator, RGuard evaluatee) {
		Set<RState> nextStates = new HashSet<RState>();
		for (RState src : currentStates) {
			RTransition transition = getTransition(src, null, evaluator);
			evaluatee.addEvaluators(transition);
			nextStates.add((RState) transition.getTarget());
		}
		return nextStates;
	}

	public static RTransition getTransition(RState src, RGuard guard,
			RAction action) {
		RTransition transition;
		if (src.getIncoming() != null && src.getIncoming().isEpsilon()) {
			// shrink epsilon transitions
			transition = (RTransition) src.getIncoming();
			transition.addGuard(guard);
			transition.setAction(action);
		} else {
			RState target = RState.newRState();
			transition = new RTransition(src, target, guard, action);
		}
		return transition;
	}

	public RLTS(Domain domain, String moduleName, String functionName) {
		this.domain = domain;
		this.moduleName = moduleName;
		this.functionName = functionName;
		scenarios = new ArrayList<Scenario>();
	}

	public List<Scenario> getScenarios() {
		return scenarios;
	}

	/**
	 * @param bindings
	 *            map from specification variables to a set of domain variable
	 *            names
	 */
	public void init() {
		super.init();
		Set<State> ts = new HashSet<State>(terminationStates);
		for (State state : ts) {
			Scenario scenario = Scenario.createScenarioTo(state);
			if (scenario == null) {
				state.getIncoming().destroySequence();
				this.terminationStates.remove(state);
			} else {
				scenario.setModuleName(moduleName);
				scenario.setFunctionName(functionName);
				initDomainVariables(scenario);
				scenarios.add(scenario);
			}
		}
	}

	// manipulate values of this domain variables
	private void initDomainVariables(Scenario scenario) {
		List<RTransition> transitions = scenario.getTransitions();
		for (RTransition transition : transitions) {
			Guard g = transition.getGuard();
			if (g != null) {
				RAction action = ((RGuard)g).getAction();
				action.init(domain);
				Set<String> types = action.getDomainVariableNames();
				for (String type : types) {
					scenario.addDomainVariableCondition(type, g.toString());
				}
			}
			List<RAction> actions = transition.getRAction().getActions();
			for (RAction a : actions) {
				if (a instanceof MethodInvocationAction) {
					MethodInvocationAction invocation = (MethodInvocationAction) a;
					initScenario(scenario, invocation);
				}
			}
		}
	}

	private void initScenario(Scenario scenario,
			MethodInvocationAction invocation) {
		DomainConcept concept = domain.getDomainConcept(invocation.getReceiverType());
		if (concept != null) {
			concept.updateDomainVariablesByMethod(scenario,
					invocation.getMethodName(), invocation.getReceiverName(),
					invocation.getArguments());
		}
	}

	public DomainVariableSpace getDomainVariableSpace() {
		DomainVariableSpace domain = new DomainVariableSpace();
		for (Scenario scenario : scenarios) {
			Collection<DomainVariable> variablesInScenario = scenario
					.getDomainVariables().values();
			for (DomainVariable value : variablesInScenario) {
				domain.addDomainVariableValue(value);
			}
		}
		return domain;
	}
}
