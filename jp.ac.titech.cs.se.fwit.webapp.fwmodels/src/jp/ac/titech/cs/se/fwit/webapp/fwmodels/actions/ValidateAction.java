package jp.ac.titech.cs.se.fwit.webapp.fwmodels.actions;

import java.util.Set;

import jp.ac.titech.cs.se.fwit.core.model.Action;
import jp.ac.titech.cs.se.fwit.core.model.fw.FActionSupport;
import jp.ac.titech.cs.se.fwit.core.model.req.RAction;
import jp.ac.titech.cs.se.fwit.core.model.req.action.AssignmentAction;
import jp.ac.titech.cs.se.fwit.core.model.req.action.InfixOperatorAction;
import jp.ac.titech.cs.se.fwit.core.model.req.action.MethodInvocationAction;
import jp.ac.titech.cs.se.fwit.webapp.fwmodels.HTML;
import jp.ac.titech.cs.se.fwit.webapp.fwmodels.WebApp;

public abstract class ValidateAction extends FActionSupport {

	public ValidateAction() {
		this.label = "validate";
	}

	@Override
	public Boolean matchWith(AssignmentAction action) {
		
		if (!checkDomainVariable(action)) {
			return false;
		}

		Action assignedValue = action.getAssignedAction();
		if (!(assignedValue instanceof MethodInvocationAction)) {
			return false;
		}
		MethodInvocationAction invocation = (MethodInvocationAction) assignedValue;

		if (!HTML.class.getName().equals(invocation.getReceiverType())) {
			return false;
		}

		if(HTML.inputMethods.contains(invocation.getMethodName())){
			return true;
		}
		return false;
	
	}

	public Boolean matchWith(MethodInvocationAction action) {
		if (!checkDomainVariable(action)) {
			return false;
		}
		if (!HTML.class.getName().equals(action.getReceiverType())) {
			return false;
		}
		if (HTML.messageMethods.contains(action.getMethodName())) {
			return true;
		}
		return false;
	}

	protected Boolean matchWith(InfixOperatorAction action) {
		return checkDomainVariable(action);
	}
	
	public static boolean checkDomainVariable(RAction action) {
		Set<String> domainVariables = action.getDomainVariableNames();
		for(String var:domainVariables){
			if(!var.equals(WebApp.FORM_DOMAIN_VARIABLE)){
				return false;
			}
		}
		return true;
	}


}