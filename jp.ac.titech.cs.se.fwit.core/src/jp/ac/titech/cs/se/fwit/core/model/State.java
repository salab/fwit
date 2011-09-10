package jp.ac.titech.cs.se.fwit.core.model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import jp.ac.titech.cs.se.fwit.core.model.visitors.SLTSElementsVisitor;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class State implements SLTSElement {

	public static Log logger = LogFactory.getLog(State.class);

	private SLTS lts;

	protected String name;
	protected Transition incoming;
	protected List<Transition> outgoings; // assure same order (not Set)

	public State(String name) {
		this.outgoings = new ArrayList<Transition>();
		this.name = name;
	}

	public boolean isInitial() {
		if (incoming == null) {
			return true;
		} else {
			return false;
		}
	}

	public boolean isTerminal() {
		return this.outgoings.isEmpty();
	}

	public Set<Transition> getOutgoingsWithoutSelfLoop() {
		Set<Transition> transitions = new HashSet<Transition>();
		for (Transition t : this.outgoings) {
			if (!t.isSelfLoop()) {
				transitions.add(t);
			}
		}
		return transitions;
	}

	public void setIncoming(Transition transition) {
		this.incoming = transition;
	}

	public void addOutgoing(Transition transition) {
		this.outgoings.add(transition);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Transition getIncoming() {
		return incoming;
	}

	public List<Transition> getOutgoings() {
		return outgoings;
	}

	public void removeOutgoing(Transition transition) {
		outgoings.remove(transition);
	}

	public String toString() {
		return name;
	}

	public void accept(SLTSElementsVisitor visitor) {
		visitor.preVisit(this);
		if (!visitor.visit(this)) {
			return;
		}

		for (Transition transition : this.outgoings) {
			transition.accept(visitor);
		}
		visitor.endVisit(this);
		visitor.postVisit(this);
	}

	public SLTS getLts() {
		if (this.isInitial()) {
			return lts;
		}
		return this.getIncoming().getSource().getLts();
	}

	public void setLts(SLTS lts) {
		if (this.isInitial()) {
			if (this.lts != null) {
				logger.warn("LTS instance is overwridden");
			}
			this.lts = lts;
		}else{
			this.getIncoming().getSource().setLts(lts);
		}
	}
}
