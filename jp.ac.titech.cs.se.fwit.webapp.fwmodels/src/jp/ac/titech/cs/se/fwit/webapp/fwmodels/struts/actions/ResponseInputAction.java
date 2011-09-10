package jp.ac.titech.cs.se.fwit.webapp.fwmodels.struts.actions;

import jp.ac.titech.cs.se.fwit.core.model.fw.FrameworkTemplate;
import jp.ac.titech.cs.se.fwit.core.model.req.RTransitionWrapper;
import jp.ac.titech.cs.se.fwit.webapp.fwmodels.WebApp;
import jp.ac.titech.cs.se.fwit.webapp.fwmodels.actions.ResponseAction;
import jp.ac.titech.cs.se.fwit.webapp.fwmodels.struts.StrutsTemplate;
import jp.ac.titech.cs.se.fwit.webapp.fwmodels.struts.elements.ActionElement;

public class ResponseInputAction extends ResponseAction {
	@Override
	public FrameworkTemplate applyCustomizeOperation(FrameworkTemplate fw,RTransitionWrapper reqTransition) {
		StrutsTemplate struts = (StrutsTemplate)fw;
		ActionElement action = struts.getActionElement(reqTransition.getSingletonDomainVariableValue(WebApp.REQUEST_DOMAIN_VARIABLE));
		action.setInput(reqTransition.getSingletonDomainVariableValue(WebApp.RESPONSE_DOMAIN_VARIABLE));
		struts.setActionElement(action);
		return struts;
	}
}
