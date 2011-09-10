package jp.ac.titech.cs.se.fwit.core.model.visitors;

import java.util.HashSet;
import java.util.Set;

import jp.ac.titech.cs.se.fwit.core.model.SLTSElement;
import jp.ac.titech.cs.se.fwit.core.model.State;
import jp.ac.titech.cs.se.fwit.core.model.Transition;

public abstract class SLTSElementsVisitorSupport<T> implements
		SLTSElementsVisitor<T> {

	protected Set<State> visitedStates;

	protected T result;

	public SLTSElementsVisitorSupport() {
		this.visitedStates = new HashSet<State>();
	}

	public T parse(State state) {
		this.visitedStates.clear();
		init();
		state.accept(this);
		return getResult();
	}

	protected void init() {
	}

	protected T getResult() {
		return result;
	}

	public Set<State> getVisistedStates() {
		return this.visitedStates;
	}

	public Boolean visit(State state) {
		this.visitedStates.add(state);
		return visitState(state);
	}

	protected Boolean visitState(State state) {
		return true;
	}

	public Boolean visit(Transition transition) {
		return visitTransition(transition);
	}

	protected Boolean visitTransition(Transition transition) {
		return true;
	}

	public void endVisit(State state) {
	}

	public void endVisit(Transition transition) {
	}

	public void preVisit(SLTSElement element) {
	}

	public void postVisit(SLTSElement element) {
	}

}
