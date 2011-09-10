package jp.ac.titech.cs.se.fwit.webapp.fwmodels.actions;

import jp.ac.titech.cs.se.fwit.core.model.Action;
import jp.ac.titech.cs.se.fwit.core.model.fw.FActionSupport;
import jp.ac.titech.cs.se.fwit.core.model.req.action.AssignmentAction;
import jp.ac.titech.cs.se.fwit.core.model.req.action.MethodInvocationAction;
import jp.ac.titech.cs.se.fwit.webapp.fwmodels.HTML;

public class ReadFormAction extends FActionSupport {
	public ReadFormAction(){
		this.label = "read";
	}
	
	@Override
	public Boolean matchWith(AssignmentAction action) {
		Action assignedAction = action.getAssignedAction();
		if (!(assignedAction instanceof MethodInvocationAction)) {
			return false;
		}
		
		MethodInvocationAction invocation = (MethodInvocationAction) assignedAction;
		if (!HTML.class.getName().equals(invocation.getReceiverType())) {
			return false;
		}
		if (HTML.readMethods.contains(invocation.getMethodName())){
			return true;
		}
		return false;
	}
}
