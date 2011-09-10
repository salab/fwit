package jp.ac.titech.cs.se.fwit.webapp.fwmodels.struts.actions;

import jp.ac.titech.cs.se.fwit.core.model.fw.FrameworkTemplate;
import jp.ac.titech.cs.se.fwit.core.model.req.RTransitionWrapper;
import jp.ac.titech.cs.se.fwit.webapp.fwmodels.WebApp;
import jp.ac.titech.cs.se.fwit.webapp.fwmodels.actions.ResponseAction;
import jp.ac.titech.cs.se.fwit.webapp.fwmodels.struts.StrutsTemplate;
import jp.ac.titech.cs.se.fwit.webapp.fwmodels.struts.elements.ActionElement;
import jp.ac.titech.cs.se.fwit.webapp.fwmodels.struts.elements.ActionExecute;

public class ResponseForwardAction extends ResponseAction {
	
	@Override
	public FrameworkTemplate applyCustomizeOperation(FrameworkTemplate fw, RTransitionWrapper reqTransition){
		StrutsTemplate struts = (StrutsTemplate)fw;
		String path = reqTransition.getSingletonDomainVariableValue(WebApp.REQUEST_DOMAIN_VARIABLE);
		ActionElement action = struts.getActionElement(path);
		String response = reqTransition.getSingletonDomainVariableValue(WebApp.RESPONSE_DOMAIN_VARIABLE);
		action.addForwards(response, response);
		struts.setActionElement(action);
		
		ActionExecute execute = struts.getActionExecute(action.getType());
		execute.addRTransition(ActionExecute.EXECUTE_METHOD, reqTransition.getTransition());
		struts.setActionExecute(execute);
		
		return struts;
	}
}
