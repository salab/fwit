package jp.ac.titech.cs.se.fwit.core.model.req;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jp.ac.titech.cs.se.fwit.core.FatalFwitterException;
import jp.ac.titech.cs.se.fwit.core.logic.CNFCondition;
import jp.ac.titech.cs.se.fwit.core.model.Domain;
import jp.ac.titech.cs.se.fwit.core.model.DomainVariable;
import jp.ac.titech.cs.se.fwit.core.model.State;
import jp.ac.titech.cs.se.fwit.core.model.Transition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class Scenario {

	public static Log logger = LogFactory.getLog(Scenario.class);

	private State terminationState;

	private List<RTransition> transitions;

	// variable name to variable object
	private Map<String, DomainVariable> domainVariables;

	private Scenario(State terminationState) {
		this.terminationState = terminationState;
		this.transitions = new ArrayList<RTransition>();
		this.domainVariables = new HashMap<String, DomainVariable>();
	}

	public static Scenario createScenarioTo(State terminationState) {
		Scenario scenario = new Scenario(terminationState);
		scenario.initTransitions();
		if (scenario.checkConsistency()) {
			for (Transition t : scenario.getTransitions()) {
				((RState) t.getSource()).addPassingScenario(scenario);
				if (t.getGuard() != null) {
					t.getGuard().setAssignment(scenario, true);
				}
			}
			((RState) scenario.terminationState).addPassingScenario(scenario);
			return scenario;
		}
		return null;
	}

	private void initTransitions() {
		State s = this.terminationState;
		while (!s.isInitial()) {
			RTransition t = (RTransition) s.getIncoming();
			if (t != null) {
				this.transitions.add(0, t);
			}
			s = t.getSource();
		}
	}

	private Boolean checkConsistency() {
		CNFCondition cnf = new CNFCondition();
		for (Transition t : this.transitions) {
			if (t.getGuard() != null) {
				RGuard guard = (RGuard) t.getGuard();
				cnf.addAllDisjunctions(guard.toCNF(this));
			}
		}
		return cnf.isConsistent();
	}

	// ////////////////////////////
	// accessors
	// ////////////////////////////

	public DomainVariable getDomainVariable(String domainVariableName) {
		if (!this.domainVariables.containsKey(domainVariableName)) {
			this.domainVariables.put(domainVariableName, new DomainVariable(
					domainVariableName));
		}
		return this.domainVariables.get(domainVariableName);
	}

	public void setDomainVariableValue(String domainVariableName, String value) {
		if (this.domainVariables.containsKey(domainVariableName)) {
			logger.warn("domain variable " + domainVariableName
					+ " is overwritten");

			throw new FatalFwitterException(this.getName() + " , "
					+ this.domainVariables.get(domainVariableName) + " to "
					+ value);
		}
		this.getDomainVariable(domainVariableName).setValue(value);
	}

	public void addDomainVariableCondition(String domainVariableName,
			String condition) {
		this.getDomainVariable(domainVariableName).addCondition(condition);
	}

	public Map<String, DomainVariable> getDomainVariables() {
		return domainVariables;
	}

	/**
	 * return a string which can identify this scenario
	 * 
	 * @return
	 */
	public String getName() {
		return terminationState.getName();
	}

	public void setModuleName(String name) {
		DomainVariable module = new DomainVariable(
				Domain.MODULE_DOMAIN_VARIABLE_NAME);
		module.setValue(name);
		domainVariables.put(Domain.MODULE_DOMAIN_VARIABLE_NAME, module);
	}

	public void setFunctionName(String name) {
		DomainVariable function = new DomainVariable(
				Domain.FUNCTION_DOMAIN_VARIABLE_NAME);
		function.setValue(name);
		domainVariables.put(Domain.FUNCTION_DOMAIN_VARIABLE_NAME, function);
	}

	public List<RTransition> getTransitions() {
		return transitions;
	}

	public State getTerminationState() {
		return terminationState;
	}

	public String toString() {
		StringBuffer buf = new StringBuffer();
		buf.append("Scenario to " + terminationState.toString() + ": ");
		buf.append(System.getProperty("line.separator"));
		for (Transition t : transitions) {
			buf.append(t + ", ");
		}

		buf.append(System.getProperty("line.separator"));
		for (String kind : this.domainVariables.keySet()) {
			buf.append(this.domainVariables.get(kind).toString());
			buf.append(System.getProperty("line.separator"));
		}

		return buf.toString();
	}
}
