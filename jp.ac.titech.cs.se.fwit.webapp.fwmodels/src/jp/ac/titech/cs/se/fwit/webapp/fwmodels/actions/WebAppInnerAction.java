package jp.ac.titech.cs.se.fwit.webapp.fwmodels.actions;

import java.util.List;

import jp.ac.titech.cs.se.fwit.core.model.fw.FActionSupport;
import jp.ac.titech.cs.se.fwit.core.model.req.RAction;
import jp.ac.titech.cs.se.fwit.core.model.req.action.AbstractStatementAction;
import jp.ac.titech.cs.se.fwit.core.model.req.action.MethodInvocationAction;
import jp.ac.titech.cs.se.fwit.webapp.fwmodels.HTML;

public abstract class WebAppInnerAction extends FActionSupport {

	public WebAppInnerAction() {
		super();
	}

	@Override
	public Boolean match(RAction reqAction) {
		if(reqAction instanceof AbstractStatementAction){
			List<RAction> actions = ((AbstractStatementAction)reqAction).getActions();
			for(RAction action:actions){
				if(!match(action)){
					return false;
				}
			}
			return true;
		}
		if(reqAction instanceof MethodInvocationAction){
			return matchWith((MethodInvocationAction)reqAction);
		}
		return true;
	}

	public Boolean matchWith(MethodInvocationAction action) {
		if(HTML.inputMethods.contains(action.getMethodName())){
			return false;
		}
		if(HTML.outputMethods.contains(action.getMethodName())){
			return false;
		}
		// avoid match with read Action
		if(HTML.readMethods.contains(action.getMethodName())){
			return false;
		}
		return true;
	}

}