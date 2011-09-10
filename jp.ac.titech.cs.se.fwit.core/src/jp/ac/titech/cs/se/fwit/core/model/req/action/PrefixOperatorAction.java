
package jp.ac.titech.cs.se.fwit.core.model.req.action;

import jp.ac.titech.cs.se.fwit.core.model.Domain;
import jp.ac.titech.cs.se.fwit.core.model.req.RAction;

public class PrefixOperatorAction extends RActionSupport {

	private String operator;
	private RAction operand;
	
	public PrefixOperatorAction(String operator, RAction operand) {
		this.operator = operator;
		this.operand = operand;
	}
	
	public String getLabel(){
		return this.operator+this.operand.getLabel();
	}

	public String getOperator() {
		return operator;
	}

	public RAction getOperand() {
		return operand;
	}

	@Override
	protected void initDomainVariableNames(Domain domain) {
		domainVariables.addAll(operand.getDomainVariableNames());
	}
}
