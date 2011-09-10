package jp.ac.titech.cs.se.fwit.webapp.fwmodels.rails.actions;

import jp.ac.titech.cs.se.fwit.core.model.Domain;
import jp.ac.titech.cs.se.fwit.core.model.fw.FrameworkTemplate;
import jp.ac.titech.cs.se.fwit.core.model.req.RTransitionWrapper;
import jp.ac.titech.cs.se.fwit.webapp.fwmodels.actions.ResponseAction;
import jp.ac.titech.cs.se.fwit.webapp.fwmodels.rails.RailsTemplate;
import jp.ac.titech.cs.se.fwit.webapp.fwmodels.rails.elements.ActionController;

public class RenderAction extends ResponseAction {
	
	@Override
	public FrameworkTemplate applyCustomizeOperation(FrameworkTemplate fw, RTransitionWrapper reqTransition){
		RailsTemplate rails = (RailsTemplate)fw;
		String klass = reqTransition.getSingletonDomainVariableValue(Domain.MODULE_DOMAIN_VARIABLE_NAME);
		String method = reqTransition.getSingletonDomainVariableValue(Domain.FUNCTION_DOMAIN_VARIABLE_NAME);
		
		ActionController ctlr = rails.getController(klass);
		
		
		ctlr.addRTransition(method, reqTransition.getTransition());
		rails.setController(ctlr);
		
		
		return rails;
	}
}
