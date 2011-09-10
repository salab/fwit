package jp.ac.titech.cs.se.fwit.webapp.fwmodels;

import java.util.HashSet;

import java.util.Set;

import jp.ac.titech.cs.se.fwit.core.model.DomainConceptSupport;

public class Session extends DomainConceptSupport {
public static Set<String> DOMAIN_VARIABLES = new HashSet<String>();
	
	static {
		DOMAIN_VARIABLES.add(WebApp.WEBAPP_SESSION_DOMAIN_VARIABLE);
	}
	
	@Override
	public Set<String> getDomainVariableNames() {
		return DOMAIN_VARIABLES;
	}

}
