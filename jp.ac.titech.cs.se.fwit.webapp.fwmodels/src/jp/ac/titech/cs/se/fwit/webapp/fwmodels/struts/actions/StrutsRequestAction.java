package jp.ac.titech.cs.se.fwit.webapp.fwmodels.struts.actions;

import jp.ac.titech.cs.se.fwit.core.model.fw.FrameworkTemplate;
import jp.ac.titech.cs.se.fwit.core.model.req.RTransitionWrapper;
import jp.ac.titech.cs.se.fwit.webapp.fwmodels.WebApp;
import jp.ac.titech.cs.se.fwit.webapp.fwmodels.actions.RequestAction;
import jp.ac.titech.cs.se.fwit.webapp.fwmodels.struts.StrutsTemplate;
import jp.ac.titech.cs.se.fwit.webapp.fwmodels.struts.elements.ActionElement;
import jp.ac.titech.cs.se.fwit.webapp.fwmodels.struts.elements.JSPElement;

public class StrutsRequestAction extends RequestAction  {
	@Override
	public FrameworkTemplate applyCustomizeOperation(FrameworkTemplate fw, RTransitionWrapper reqTransition){
		final StrutsTemplate struts = (StrutsTemplate)fw;		
		final String path = reqTransition.getSingletonDomainVariableValue(WebApp.REQUEST_DOMAIN_VARIABLE);
		final ActionElement action = struts.getActionElement(path);
		struts.setActionElement(action);
		
		final String refferrer = reqTransition.getSingletonDomainVariableValue(WebApp.REFERRER_DOMAIN_VARIABLE);
		final JSPElement jsp = struts.getJSPElement(refferrer);
		jsp.addForm(path);
		struts.setJSPElement(jsp);
		
		return struts;
	}
}
