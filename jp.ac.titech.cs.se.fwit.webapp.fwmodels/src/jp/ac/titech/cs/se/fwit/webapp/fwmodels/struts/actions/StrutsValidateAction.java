package jp.ac.titech.cs.se.fwit.webapp.fwmodels.struts.actions;

import jp.ac.titech.cs.se.fwit.core.model.fw.FrameworkTemplate;
import jp.ac.titech.cs.se.fwit.core.model.req.RTransitionWrapper;
import jp.ac.titech.cs.se.fwit.webapp.fwmodels.WebApp;
import jp.ac.titech.cs.se.fwit.webapp.fwmodels.actions.ValidateAction;
import jp.ac.titech.cs.se.fwit.webapp.fwmodels.struts.StrutsTemplate;
import jp.ac.titech.cs.se.fwit.webapp.fwmodels.struts.elements.ActionElement;
import jp.ac.titech.cs.se.fwit.webapp.fwmodels.struts.elements.ActionForm;


public class StrutsValidateAction extends ValidateAction {

	public FrameworkTemplate applyCustomizeOperation(FrameworkTemplate fw,
			RTransitionWrapper reqTransition) {
		StrutsTemplate struts = (StrutsTemplate) fw;
		String reqType = reqTransition
				.getSingletonDomainVariableValue(WebApp.REQUEST_DOMAIN_VARIABLE);
		ActionElement actionElement = struts.getActionElement(reqType);
		ActionForm form = struts.getActionForm(actionElement.getName());		
		form.addRTransition(ActionForm.VALIDATE_METHOD, reqTransition.getTransition());
		struts.setActionForm(form);
		return struts;
	}

}
