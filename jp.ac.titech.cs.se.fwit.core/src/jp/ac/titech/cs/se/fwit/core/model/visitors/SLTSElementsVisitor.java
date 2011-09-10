package jp.ac.titech.cs.se.fwit.core.model.visitors;

import java.util.Set;

import jp.ac.titech.cs.se.fwit.core.model.SLTSElement;
import jp.ac.titech.cs.se.fwit.core.model.State;
import jp.ac.titech.cs.se.fwit.core.model.Transition;

public interface SLTSElementsVisitor<T> {
	
	public T parse(State state);
	
	public Set<State> getVisistedStates();
	
	public Boolean visit(State state);
	public Boolean visit(Transition transition);
	
	public void endVisit(State state);
	public void endVisit(Transition transition);
	
	public void preVisit(SLTSElement element);
	public void postVisit(SLTSElement element);
	

}
