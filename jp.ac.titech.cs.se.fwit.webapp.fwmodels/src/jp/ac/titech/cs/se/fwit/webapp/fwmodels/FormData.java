package jp.ac.titech.cs.se.fwit.webapp.fwmodels;

import java.util.HashSet;
import java.util.Set;

import jp.ac.titech.cs.se.fwit.core.model.DomainConceptSupport;

public class FormData extends DomainConceptSupport{
	public static Set<String> DOMAIN_VARIABLES = new HashSet<String>();
	
	static {
		DOMAIN_VARIABLES.add(WebApp.FORM_DOMAIN_VARIABLE);
	}
	
	@Override
	public Set<String> getDomainVariableNames() {
		return DOMAIN_VARIABLES;
	}
	


	public String getFieldDomainVariableName(String field){
		return WebApp.FORM_DOMAIN_VARIABLE;
	}

	
	
}