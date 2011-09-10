package jp.ac.titech.cs.se.fwit.core.model.fw.visitor;

import java.util.Set;

import jp.ac.titech.cs.se.fwit.core.logic.CNFCondition;
import jp.ac.titech.cs.se.fwit.core.model.DomainVariableSpace;
import jp.ac.titech.cs.se.fwit.core.model.State;
import jp.ac.titech.cs.se.fwit.core.model.Transition;
import jp.ac.titech.cs.se.fwit.core.model.fw.FGuard;
import jp.ac.titech.cs.se.fwit.core.model.fw.FState;
import jp.ac.titech.cs.se.fwit.core.model.fw.FTransition;
import jp.ac.titech.cs.se.fwit.core.model.req.Scenario;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * build a CNF constraint which should be true for a mapping between a RLTS and a FLTS is consistent
 * @author zenmyo
 *
 */
public class ValidConditionSetupVisitor extends FLTSElementsVisitorSupport<CNFCondition> {

	public static Log logger = LogFactory
			.getLog(ValidConditionSetupVisitor.class);

	private DomainVariableSpace domainVariableSpace;

	public void setDomainVariableSpace(DomainVariableSpace space){
		this.domainVariableSpace = space;
	}

	protected void init() {
		result = new CNFCondition();
	}

	@Override
	protected Boolean visitFState(FState state) {
		if(result == null){
			return false;
		}
		return true;
	}

	@Override
	protected Boolean visitFTransition(FTransition transition) {
		if(result == null){
			return false;
		}
		return true;
	}

	/**
	 * calculate tree code
	 */
	@Override
	public void endVisit(State state) {
		if(result == null){
			return;
		}
		Set<Transition> nexts = state.getOutgoingsWithoutSelfLoop();
		if (nexts.size() > 1) {
			for (Transition transition : nexts) {
				FGuard guard = (FGuard) transition.getGuard();
				assert (guard != null);
				result.addAllDisjunctions(guard.toCNF(domainVariableSpace));
			}
		}
	}

	@Override
	public void endVisit(Transition transition) {
		if (result == null) {
			return;
		}
		if (transition.isSelfLoop()) {
			return;
		}
		FState source = (FState) transition.getSource();
		FState target = (FState) transition.getTarget();

		// set scenarios to the source state and deny to transit other states
		FGuard guard = (FGuard) transition.getGuard();
		Set<Scenario> scenarios = target.getAssumedScenarios();
		Set<Transition> brothers = transition.getSource()
				.getOutgoingsWithoutSelfLoop();
		for (Scenario scenario : scenarios) {
			source.addAssumedScenario(scenario);
			if (guard == null) {
				continue;
			}
			
			if (!guard.setAssignment(scenario, true)) {
				logger.debug("trivial contradiction on " + transition);
				result = null;
				return;
			}

			// deny to transit other states
			for (Transition other : brothers) {
				if (other.equals(transition)) {
					continue;
				}
				FGuard otherGuard = (FGuard) other.getGuard();
				assert (otherGuard != null);
				if (!otherGuard.setAssignment(scenario, false)) {
					logger.debug("trivial contradiction on " + transition  +" and " + other);
					result = null;
					return;
				}
			}
		}
	}
}
