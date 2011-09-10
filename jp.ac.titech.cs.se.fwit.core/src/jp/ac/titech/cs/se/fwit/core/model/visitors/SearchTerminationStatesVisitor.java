package jp.ac.titech.cs.se.fwit.core.model.visitors;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import jp.ac.titech.cs.se.fwit.core.model.State;
import jp.ac.titech.cs.se.fwit.core.model.Transition;
import jp.ac.titech.cs.se.fwit.core.model.composite.CState;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class SearchTerminationStatesVisitor extends SLTSElementsVisitorSupport<List<State>> {
	public static final Log logger =LogFactory.getLog(SearchTerminationStatesVisitor.class);
	
	@Override
	protected void init(){
		result = new ArrayList<State>();
	}

	@Override
	protected Boolean visitState(State state) {
		if(state.getOutgoings().isEmpty()){
			result.add(state);
			return true;
		}
		if(state instanceof CState){
			return true;
		}
		Set<Transition> nexts = state.getOutgoingsWithoutSelfLoop(); 
		if(nexts.size() >1){
			for(Transition t:nexts){
				if(!t.isSelfLoop() && t.getGuard() == null){
					logger.error("undeterministic branch from the state " + state);
					result = null;
					return false;
				}
			}
		}
		return true;
	}
}
