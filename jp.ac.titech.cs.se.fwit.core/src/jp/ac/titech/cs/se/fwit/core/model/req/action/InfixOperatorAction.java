package jp.ac.titech.cs.se.fwit.core.model.req.action;

import jp.ac.titech.cs.se.fwit.core.model.Domain;
import jp.ac.titech.cs.se.fwit.core.model.req.RAction;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class InfixOperatorAction extends RActionSupport {
	
	public static Log logger = LogFactory.getLog(InfixOperatorAction.class);
	
	private String operator;
	private RAction rightAction;
	private RAction leftAction;

	public InfixOperatorAction(String operator, RAction leftAction,RAction rightAction) {
		this.operator = operator;
		this.leftAction = leftAction;
		this.rightAction = rightAction;
	}
	
	public String getLabel(){
		return this.leftAction.getLabel()+this.operator+this.rightAction.getLabel();
	}

	public String getOperator() {
		return operator;
	}

	public RAction getRightAction() {
		return rightAction;
	}

	public RAction getLeftAction() {
		return leftAction;
	}

	@Override
	protected void initDomainVariableNames(Domain domain) {
		this.domainVariables.addAll(leftAction.getDomainVariableNames());
		this.domainVariables.addAll(rightAction.getDomainVariableNames());
	}
}
