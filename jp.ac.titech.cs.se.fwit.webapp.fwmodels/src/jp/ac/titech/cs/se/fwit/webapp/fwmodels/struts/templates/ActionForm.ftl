import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

class ${className} extends ActionForm{

	<#list fields?keys as field>
	private ${fields[field]} ${field};
	</#list>

	<#list methodStatements?keys as method>
	public ${methodTypes[method]} ${method}(${methodArguments[method]}){
		<#list methodStatements[method] as statement >
		// ${statement}
		</#list>
	}
	</#list>
}