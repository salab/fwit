package jp.ac.titech.cs.se.fwit.core.model.req.action.visitor;

import jp.ac.titech.cs.se.fwit.core.model.req.RAction;
import jp.ac.titech.cs.se.fwit.core.model.req.action.AbstractStatementAction;
import jp.ac.titech.cs.se.fwit.core.model.req.action.AssignmentAction;
import jp.ac.titech.cs.se.fwit.core.model.req.action.InfixOperatorAction;
import jp.ac.titech.cs.se.fwit.core.model.req.action.LiteralAction;
import jp.ac.titech.cs.se.fwit.core.model.req.action.MethodInvocationAction;
import jp.ac.titech.cs.se.fwit.core.model.req.action.PrefixOperatorAction;
import jp.ac.titech.cs.se.fwit.core.model.req.action.VariableAction;

public class ActionInStatementVisitor<T> {

	protected T result;

	public T visit(RAction action) {
		preVisit(action);
		if (action instanceof AbstractStatementAction) {
			visitAction((AbstractStatementAction) action);
		} else if (action instanceof AssignmentAction) {
			visitAction((AssignmentAction) action);
		} else if (action instanceof InfixOperatorAction) {
			visitAction((InfixOperatorAction) action);
		} else if (action instanceof MethodInvocationAction) {
			visitAction((MethodInvocationAction) action);
		} else if (action instanceof PrefixOperatorAction) {
			visitAction((PrefixOperatorAction) action);
		} else if (action instanceof LiteralAction) {
			visitAction((LiteralAction) action);
		} else if (action instanceof VariableAction) {
			visitAction((VariableAction) action);
		}
		return result;
	}

	protected void preVisit(RAction action) {
	}

	protected void visitAction(VariableAction action) {
	}

	protected void visitAction(LiteralAction action) {
	}

	protected void visitAction(PrefixOperatorAction action) {
		visit(action.getOperand());
	}

	protected void visitAction(MethodInvocationAction action) {
		for (RAction arg : action.getArguments()) {
			visit(arg);
		}
	}

	protected void visitAction(InfixOperatorAction action) {
		visit(action.getLeftAction());
		visit(action.getRightAction());
	}

	protected void visitAction(AbstractStatementAction action) {
		this.visit(action.getAction());
	}

	protected void visitAction(AssignmentAction action) {
		visit(action.getAssignedAction());
	}

}