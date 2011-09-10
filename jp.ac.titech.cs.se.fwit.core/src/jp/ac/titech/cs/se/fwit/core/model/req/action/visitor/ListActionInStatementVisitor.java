package jp.ac.titech.cs.se.fwit.core.model.req.action.visitor;

import java.util.ArrayList;
import java.util.List;

import jp.ac.titech.cs.se.fwit.core.model.req.RAction;
import jp.ac.titech.cs.se.fwit.core.model.req.action.AbstractStatementAction;

public class ListActionInStatementVisitor extends ActionInStatementVisitor<List<RAction>> {

	public ListActionInStatementVisitor(){
		result = new ArrayList<RAction>();
	}

	@Override
	protected void preVisit(RAction action) {
		if (action instanceof AbstractStatementAction) {
			return;
		}
		result.add(action);
	}	
}
