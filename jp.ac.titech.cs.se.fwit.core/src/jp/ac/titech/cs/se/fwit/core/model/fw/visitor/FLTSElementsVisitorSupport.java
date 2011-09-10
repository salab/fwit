package jp.ac.titech.cs.se.fwit.core.model.fw.visitor;

import jp.ac.titech.cs.se.fwit.core.model.State;
import jp.ac.titech.cs.se.fwit.core.model.Transition;
import jp.ac.titech.cs.se.fwit.core.model.fw.FState;
import jp.ac.titech.cs.se.fwit.core.model.fw.FTransition;
import jp.ac.titech.cs.se.fwit.core.model.visitors.SLTSElementsVisitorSupport;

public abstract class FLTSElementsVisitorSupport<T> extends
		SLTSElementsVisitorSupport<T> {

	@Override
	protected Boolean visitState(State state) {
		return visitFState((FState) state);
	}

	protected Boolean visitFState(FState state) {
		return true;
	}

	@Override
	protected Boolean visitTransition(Transition transition) {
		return visitFTransition((FTransition) transition);
	}

	protected Boolean visitFTransition(FTransition transition) {
		return true;
	}

}
