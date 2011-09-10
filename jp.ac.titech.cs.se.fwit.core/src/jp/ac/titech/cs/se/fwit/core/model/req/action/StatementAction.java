package jp.ac.titech.cs.se.fwit.core.model.req.action;

import java.util.List;

import jp.ac.titech.cs.se.fwit.core.model.Domain;
import jp.ac.titech.cs.se.fwit.core.model.req.RAction;

public class StatementAction extends AbstractStatementAction {

	public StatementAction(String statementExpression, RAction action){
		this.expression = statementExpression;
		this.action = action;
	}

	@Override
	protected void initDomainVariableNames(Domain domain) {
		List<RAction> acts = getActions();
		for(RAction act:acts){
			domainVariables.addAll(act.getDomainVariableNames());
		}
	}
}
