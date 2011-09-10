package jp.ac.titech.cs.se.fwit.core.model.req.action;

import jp.ac.titech.cs.se.fwit.core.model.Domain;
import jp.ac.titech.cs.se.fwit.core.model.req.RAction;

public class IfStatementAction extends AbstractStatementAction {
	
	public IfStatementAction(String expression, RAction action){
		this.expression = expression;
		this.action = action;
	}

	public String getType(){
		return RAction.BOOLEAN_TYPE;
	}

	@Override
	protected void initDomainVariableNames(Domain domain) {		
		domainVariables.addAll(action.getDomainVariableNames());
	}
}
