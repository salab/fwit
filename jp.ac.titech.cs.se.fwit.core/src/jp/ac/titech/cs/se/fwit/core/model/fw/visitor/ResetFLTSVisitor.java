package jp.ac.titech.cs.se.fwit.core.model.fw.visitor;

import jp.ac.titech.cs.se.fwit.core.model.fw.FGuard;
import jp.ac.titech.cs.se.fwit.core.model.fw.FState;
import jp.ac.titech.cs.se.fwit.core.model.fw.FTransition;

/**
 * reset assumed mapping between a FLTS and a RLTS
 * @author zenmyo
 *
 */
public class ResetFLTSVisitor extends FLTSElementsVisitorSupport<Void> {

	@Override
	protected Boolean visitFState(FState state) {
		state.reset();
		return true;
	}

	@Override
	protected Boolean visitFTransition(FTransition transition) {
		FGuard guard = transition.getFGuard();
		if(guard !=null){
			guard.clearAssignments();
		}
		return true;
	}
}
