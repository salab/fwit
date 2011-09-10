package jp.ac.titech.cs.se.fwit.core.model.fw;

import java.util.HashSet;
import java.util.Set;

import jp.ac.titech.cs.se.fwit.core.FatalFwitterException;
import jp.ac.titech.cs.se.fwit.core.model.State;
import jp.ac.titech.cs.se.fwit.core.model.Transition;
import jp.ac.titech.cs.se.fwit.core.model.req.Scenario;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class FTransition extends Transition {

	public static Log logger = LogFactory.getLog(FTransition.class);

	/** domain variables by which the LTS switches the transitions */
	private Set<String> polymorphicKeys = new HashSet<String>();

	private FTransition original = null;

	private Set<FGuard> evaluatedGuards = new HashSet<FGuard>();

	public Boolean isTransible(Set<Scenario> scenarios) {
		if (this.guard == null) {
			return true;
		}
		for (Scenario scenario : scenarios) {
			if (!this.guard.getAssignment(scenario)) {
				return false;
			}
		}
		return true;
	}

	@Override
	public void setTarget(State target) {
		if (this.source == null) {
			logger.error("soruce state must be set before target");
			throw new FatalFwitterException("target set before source");
		}
		this.target = target;
		if (this.target.equals(this.source)) {
			return; // ignore loop action
		}
		this.target.setIncoming(this);
	}

	public Boolean isTau() {
		return this.action instanceof TauAction;
	}

	public Boolean isPolymorphic() {
		return !(polymorphicKeys.isEmpty());
	}

	public void addPolymorphicKey(String domainVariable) {
		this.polymorphicKeys.add(domainVariable);
	}

	public Set<String> getPolymorphicKey() {
		return this.polymorphicKeys;
	}

	/**
	 * get copy of this transition without the source, target, and the truth
	 * assignment of the guard condition)
	 */
	public FTransition getUnconnectedCopy() {
		FTransition newTransition = new FTransition();
		newTransition.setAction(action);
		if (guard != null) {
			newTransition.setGuard(((FGuard) guard).copyWithoutAssignment());
		}
		for (String key : polymorphicKeys) {
			newTransition.addPolymorphicKey(key);
		}
		newTransition.setOriginal(this);
		return newTransition;
	}

	public void setGuardEvaluator(FTransition evaluator) {
		if (this.guard == null) {
			if (evaluator != null) {
				logger.error("unexpected call of setGuardEvaluator() "
						+ evaluator.toString() + " to " + this.toString());
			}
			return;
		}
		((FGuard) this.guard).setEvaluator(evaluator);
	}

	public FTransition getOriginal() {
		return original;
	}

	public void setOriginal(FTransition original) {
		this.original = original;
	}

	public FAction getFAction() {
		return (FAction) action;
	}

	public FGuard getFGuard() {
		return (FGuard) guard;
	}

	public Set<FGuard> getEvaluatedGuards() {
		return evaluatedGuards;
	}

	public void addEvaluatedGuard(FGuard evaluatedGuard) {
		this.evaluatedGuards.add(evaluatedGuard);
	}
}
