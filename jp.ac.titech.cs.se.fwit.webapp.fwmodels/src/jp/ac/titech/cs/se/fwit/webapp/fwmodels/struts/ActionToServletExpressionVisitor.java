package jp.ac.titech.cs.se.fwit.webapp.fwmodels.struts;

import jp.ac.titech.cs.se.fwit.core.model.req.RAction;
import jp.ac.titech.cs.se.fwit.core.model.req.action.AssignmentAction;
import jp.ac.titech.cs.se.fwit.core.model.req.action.VariableAction;
import jp.ac.titech.cs.se.fwit.core.util.ActionToExpressionVisitor;

import jp.ac.titech.cs.se.fwit.webapp.fwmodels.Session;
import jp.ac.titech.cs.se.fwit.webapp.fwmodels.WebApp;

public class ActionToServletExpressionVisitor extends
		ActionToExpressionVisitor {
	
	@Override
	protected void visitAction(VariableAction action) {
		if(WebApp.WEBAPP_SYSTEM_DOMAIN_VARIABLE.equals(action.getType())){
			result =  StrutsTemplate.CONTEXT+".getAttribute(\""+action.getLabel()+"\")";
		}else if(Session.class.getName().equals(action.getType())){
			result =  StrutsTemplate.SESSION+".getAttribute(\""+action.getLabel()+"\")";
		}else{
			result = action.getLabel();
		}
	}
	
	@Override
	protected void visitAction(AssignmentAction action) {
		VariableAction assignee = action.getAssignee();
		RAction assigned = action.getAssignedAction();
		if(WebApp.WEBAPP_SYSTEM_DOMAIN_VARIABLE.equals(assignee.getType())){
			result =  StrutsTemplate.CONTEXT+".setAttribute(\""+assignee.getLabel()+"\", " + visit(assigned)+")";
		}else if(WebApp.WEBAPP_SESSION_DOMAIN_VARIABLE.equals(action.getType())){
			result =  StrutsTemplate.SESSION+".setAttribute(\""+assignee.getLabel()+"\", " + visit(assigned)+")";
		}else{
			super.visitAction(action);
		}
	}
}
