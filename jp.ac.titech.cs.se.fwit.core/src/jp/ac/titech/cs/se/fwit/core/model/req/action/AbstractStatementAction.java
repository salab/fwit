package jp.ac.titech.cs.se.fwit.core.model.req.action;

import java.util.List;

import jp.ac.titech.cs.se.fwit.core.model.req.RAction;
import jp.ac.titech.cs.se.fwit.core.model.req.action.visitor.ListActionInStatementVisitor;

public abstract class AbstractStatementAction extends RActionSupport {

	protected String expression;
	protected RAction action;
	
	protected List<RAction> actions = null;
	
	@Override
    public String getLabel() {
		if (expression.indexOf(System.getProperty("line.separator")) > 0) {
			expression = expression.substring(0,
					expression.lastIndexOf(System.getProperty("line.separator")));
		}
		return expression;
	}

	public RAction getAction() {
		return action;
	}

	public List<RAction> getActions(){
		if(actions == null){
			final ListActionInStatementVisitor visitor = new ListActionInStatementVisitor();
			actions = visitor.visit(this);
		}
		return actions;
	}
}
