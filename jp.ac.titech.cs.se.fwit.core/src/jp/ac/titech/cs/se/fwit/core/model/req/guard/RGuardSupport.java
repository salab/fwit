package jp.ac.titech.cs.se.fwit.core.model.req.guard;

import java.util.HashSet;
import java.util.Set;

import jp.ac.titech.cs.se.fwit.core.model.GuardSupport;
import jp.ac.titech.cs.se.fwit.core.model.req.RGuard;
import jp.ac.titech.cs.se.fwit.core.model.req.RTransition;
import jp.ac.titech.cs.se.fwit.core.model.req.action.IfStatementAction;

public abstract class RGuardSupport extends GuardSupport implements RGuard {
	
	protected IfStatementAction action;

	public Set<RTransition> evaluators = new HashSet<RTransition>();

	public Set<RTransition> getEvaluators() {
		return evaluators;
	}

	public void addEvaluators(RTransition evaluator) {
		this.evaluators.add(evaluator);
	}

	public IfStatementAction getAction(){
		return action;
	}

	public void setAction(IfStatementAction action){
		this.action = action;
	}
}
