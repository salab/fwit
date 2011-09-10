package jp.ac.titech.cs.se.fwit.webapp.fwmodels.struts.actions;

import jp.ac.titech.cs.se.fwit.core.model.fw.FrameworkTemplate;
import jp.ac.titech.cs.se.fwit.core.model.req.RTransitionWrapper;
import jp.ac.titech.cs.se.fwit.core.model.req.action.AssignmentAction;
import jp.ac.titech.cs.se.fwit.core.model.req.action.VariableAction;
import jp.ac.titech.cs.se.fwit.webapp.fwmodels.WebApp;
import jp.ac.titech.cs.se.fwit.webapp.fwmodels.actions.ReadFormAction;
import jp.ac.titech.cs.se.fwit.webapp.fwmodels.struts.StrutsTemplate;
import jp.ac.titech.cs.se.fwit.webapp.fwmodels.struts.elements.ActionElement;
import jp.ac.titech.cs.se.fwit.webapp.fwmodels.struts.elements.ActionForm;
import jp.ac.titech.cs.se.fwit.webapp.fwmodels.struts.elements.JSPElement;

public class StrutsReadFormAction extends ReadFormAction {
	
	public FrameworkTemplate applyCustomizeOperation(FrameworkTemplate fw,
			RTransitionWrapper reqTransition) {
		StrutsTemplate struts = (StrutsTemplate) fw;
		String reqType = reqTransition
				.getSingletonDomainVariableValue(WebApp.REQUEST_DOMAIN_VARIABLE);
		String refferrer = reqTransition.getSingletonDomainVariableValue(WebApp.REFERRER_DOMAIN_VARIABLE);
		String path = reqTransition.getSingletonDomainVariableValue(WebApp.REQUEST_DOMAIN_VARIABLE);
		
		
		ActionElement actionElement = struts.getActionElement(reqType);
		ActionForm form = struts.getActionForm(actionElement.getName());
		AssignmentAction action = (AssignmentAction) reqTransition.getTransition().getRAction().getAction();
		VariableAction var = action.getAssignee();
		form.addField(var.getLabel(), var.getType());
		
		
		JSPElement jsp = struts.getJSPElement(refferrer);
		jsp.addFormField(path, var.getLabel(), JSPElement.TEXT_FIELD);
		struts.setJSPElement(jsp);
		
		struts.setActionForm(form);
		return struts;
	}

}
