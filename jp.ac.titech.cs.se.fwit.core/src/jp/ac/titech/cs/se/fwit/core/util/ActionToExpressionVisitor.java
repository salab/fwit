package jp.ac.titech.cs.se.fwit.core.util;

import jp.ac.titech.cs.se.fwit.core.model.req.RAction;
import jp.ac.titech.cs.se.fwit.core.model.req.action.AbstractStatementAction;
import jp.ac.titech.cs.se.fwit.core.model.req.action.AssignmentAction;
import jp.ac.titech.cs.se.fwit.core.model.req.action.InfixOperatorAction;
import jp.ac.titech.cs.se.fwit.core.model.req.action.LiteralAction;
import jp.ac.titech.cs.se.fwit.core.model.req.action.MethodInvocationAction;
import jp.ac.titech.cs.se.fwit.core.model.req.action.PrefixOperatorAction;
import jp.ac.titech.cs.se.fwit.core.model.req.action.VariableAction;
import jp.ac.titech.cs.se.fwit.core.model.req.action.visitor.ActionInStatementVisitor;

public class ActionToExpressionVisitor extends ActionInStatementVisitor<String> {

	@Override
	protected void visitAction(VariableAction action) {
		result = action.getLabel();
	}

	@Override
	protected void visitAction(LiteralAction action) {
		result = action.getLabel();
	}

	@Override
	protected void visitAction(PrefixOperatorAction action) {
		StringBuffer buf = new StringBuffer();
		buf.append(action.getOperator());
		buf.append(visit(action.getOperand()));
		result = buf.toString();
	}

	@Override
	protected void visitAction(MethodInvocationAction action) {
		StringBuffer buf = new StringBuffer();
		if (action.getReceiverName() != null
				&& !action.getReceiverName().equals("")) {
			buf.append(action.getReceiverName());
			buf.append(".");
		}
		buf.append(action.getMethodName());
		buf.append("(");
		boolean first = true;
		for (RAction arg : action.getArguments()) {
			if(first){
				first = false;
			}else{
				buf.append(", ");
			}
			buf.append(visit(arg));
		}
		if (action.getArguments().size() > 1) {
			buf.replace(buf.lastIndexOf(","), buf.length() - 1, "");
		}
		buf.append(")");
		result = buf.toString();
	}

	@Override
	protected void visitAction(InfixOperatorAction action) {
		StringBuffer buf = new StringBuffer();
		buf.append(visit(action.getLeftAction()));
		buf.append(action.getOperator());
		buf.append(visit(action.getRightAction()));
		result = buf.toString();
	}

	@Override
	protected void visitAction(AbstractStatementAction action) {
		result = visit(action.getAction());
	}

	@Override
	protected void visitAction(AssignmentAction action) {
		StringBuffer buf = new StringBuffer();
		buf.append(visit(action.getAssignee()));
		buf.append(action.getOperator());
		buf.append(visit(action.getAssignee()));
		result = buf.toString();
	}

}
