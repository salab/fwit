package jp.ac.titech.cs.se.fwit.core.model;

import java.util.List;

import jp.ac.titech.cs.se.fwit.core.FatalFwitterException;
import jp.ac.titech.cs.se.fwit.core.model.visitors.SearchTerminationStatesVisitor;
import jp.ac.titech.cs.se.fwit.core.model.visitors.ToStringVisitor;

public class SLTS {
	
	protected State initialState;
	
	// not Set because index access is useful for making assumption between termination states  
	protected List<State> terminationStates;
		
	public State getInitialState() {
		return initialState;
	}
	
	public void setInitialState(State initialState) {
		this.initialState = initialState;
		this.initialState.setLts(this);
	}

	public List<State> getTerminationStates() {
		return terminationStates;
	}

	public String toString(){
		ToStringVisitor visitor = new ToStringVisitor();
		return visitor.parse(this.initialState);
	}

	public void init() {
		SearchTerminationStatesVisitor visitor = new SearchTerminationStatesVisitor();
		this.terminationStates = visitor.parse(this.initialState);
		if(this.terminationStates == null){
			throw new FatalFwitterException("SLTS is undeterministic");
		}
	}
}
