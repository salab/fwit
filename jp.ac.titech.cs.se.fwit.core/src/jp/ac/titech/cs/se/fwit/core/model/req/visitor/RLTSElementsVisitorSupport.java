package jp.ac.titech.cs.se.fwit.core.model.req.visitor;

import jp.ac.titech.cs.se.fwit.core.model.State;
import jp.ac.titech.cs.se.fwit.core.model.Transition;
import jp.ac.titech.cs.se.fwit.core.model.req.RState;
import jp.ac.titech.cs.se.fwit.core.model.req.RTransition;
import jp.ac.titech.cs.se.fwit.core.model.visitors.SLTSElementsVisitorSupport;

public abstract class RLTSElementsVisitorSupport<T> extends
		SLTSElementsVisitorSupport<T> {

	@Override
	protected Boolean visitState(State state) {
		return visitRState((RState) state);
	}

	protected Boolean visitRState(RState state) {
		return true;
	}

	@Override
	protected Boolean visitTransition(Transition transition) {
		return visitRTransition((RTransition) transition);
	}

	protected Boolean visitRTransition(RTransition transition) {
		return true;
	}
}
