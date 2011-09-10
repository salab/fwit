package jp.ac.titech.cs.se.fwit.core.model.composite.visitor;

import jp.ac.titech.cs.se.fwit.core.model.composite.CState;

/**
 * find a state same as the state specified by the goal attribute.
 * @author zenmyo
 *
 */
public class FindSameStateVisitor extends CLTSElementsVisitorSupport<CState> {

	private CState goal;

	public void setGoal(CState goal) {
		this.goal = goal;
	}

	@Override
	protected Boolean visitCState(CState state) {
		if (goal.isSame(state)) {
			this.result = state;
			return false;
		}
		return true;
	}
}
