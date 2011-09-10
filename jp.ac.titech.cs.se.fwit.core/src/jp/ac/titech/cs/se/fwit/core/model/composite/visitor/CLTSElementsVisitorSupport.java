package jp.ac.titech.cs.se.fwit.core.model.composite.visitor;

import jp.ac.titech.cs.se.fwit.core.model.State;
import jp.ac.titech.cs.se.fwit.core.model.Transition;
import jp.ac.titech.cs.se.fwit.core.model.composite.CState;
import jp.ac.titech.cs.se.fwit.core.model.composite.CTransition;
import jp.ac.titech.cs.se.fwit.core.model.visitors.SLTSElementsVisitorSupport;

public abstract class CLTSElementsVisitorSupport<T> extends
		SLTSElementsVisitorSupport<T> {

	@Override
	protected Boolean visitState(State state) {
		return visitCState((CState) state);
	}

	protected Boolean visitCState(CState state) {
		return true;
	}

	@Override
	protected Boolean visitTransition(Transition transition) {
		return visitCTransition((CTransition) transition);
	}

	protected Boolean visitCTransition(CTransition transition) {
		return true;
	};
}
