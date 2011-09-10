package jp.ac.titech.cs.se.fwit.core.model;

import jp.ac.titech.cs.se.fwit.core.model.req.action.EpsilonAction;
import jp.ac.titech.cs.se.fwit.core.model.visitors.SLTSElementsVisitor;

public class Transition implements SLTSElement{

	protected State source;
	protected State target;
	protected Action action;
	protected Guard guard;
	protected boolean supplemental = false;
	
	public boolean isEpsilon(){
		return action instanceof EpsilonAction;
	}
	
	public Action getAction() {
		return action;
	}
	public void setAction(Action action) {
		this.action = action;
	}
	public State getSource() {
		return source;
	}
	
	public void setSource(State source) {
		this.source = source;
		this.source.addOutgoing(this);
	}
	/**
	 * must be called after setSource
	 * @return
	 */
	public State getTarget() {
		return target;
	}
	
	public void setTarget(State target) {
		target.setLts(source.getLts());
		this.target = target;
		this.target.setIncoming(this);
	}

	public Guard getGuard() {
		return guard;
	}
	public void setGuard(Guard guard) {
		this.guard = guard;
	}
	
	/**
	 * destroy the sequence to this transition 
	 */
	public void destroySequence() {
		Transition t = this;
		while(t!=null){
			State src = t.getSource();
			if(src.getOutgoings().size() > 1){
				src.removeOutgoing(t);
				break;
			}
			t = src.getIncoming();
		}
	}

	public String toString(){
		StringBuffer buf = new StringBuffer();
		buf.append(source.toString());
		buf.append("--");
		if(guard != null){
			buf.append("[");
			buf.append(guard.toString());
			buf.append("]");
		}
		
		buf.append(action.toString());
		buf.append("->");
		buf.append(target.toString());
		return buf.toString();
	}

	public void accept(SLTSElementsVisitor visitor) {
		visitor.postVisit(this);
		if(!visitor.visit(this)){
			return;
		}
		// skip visited states (to deal with loop)
		if(!visitor.getVisistedStates().contains(target)){
			target.accept(visitor);
		}
		visitor.endVisit(this);
		visitor.postVisit(this);
	}

	public Boolean isSelfLoop() {
		return source.equals(target);
	}
}
