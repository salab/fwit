package jp.ac.titech.cs.se.fwit.webapp.fwmodels.rails.elements;

import jp.ac.titech.cs.se.fwit.core.model.req.action.MethodInvocationAction;
import jp.ac.titech.cs.se.fwit.core.model.req.action.StatementAction;
import jp.ac.titech.cs.se.fwit.webapp.fwmodels.HTML;
import jp.ac.titech.cs.se.fwit.webapp.fwmodels.util.freemarker.RubyClassElement;
import freemarker.template.utility.StringUtil;

public class ActionController extends RubyClassElement {
	
	private String moduleName;

	public ActionController(String moduleName) {
		this.moduleName = moduleName;
		put("className", StringUtil.capitalize(moduleName)+"Controller");
	}
	
	@Override
	protected String transformStatementAction(String method,
			StatementAction action) {
		if (action.getActions().size() == 1
				&& action.getActions().get(0) instanceof MethodInvocationAction) {
			MethodInvocationAction invocation = (MethodInvocationAction) action
					.getActions().get(0);
			if (HTML.class.getName().equals(invocation.getReceiverType())
					&& HTML.outputMethods.contains(invocation.getMethodName())) {
				return "render :action => :"	+ invocation.getReceiverName();
			}
		}
		return super.transformStatementAction(method, action);
	}
	
	public String getModuleName(){
		return moduleName;
	}
	
	public String getFileName(){
		String file =  moduleName.substring(0,1)+  moduleName.substring(1).replaceAll("([A-Z])", "_$1") + "_controller";
		return file.toLowerCase();
	}
}
