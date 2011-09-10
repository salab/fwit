package jp.ac.titech.cs.se.fwit.webapp.fwmodels;

import java.util.HashSet;
import java.util.Set;

import jp.ac.titech.cs.se.fwit.core.model.DomainConceptSupport;

public class DBTable extends DomainConceptSupport{

	public void insert(Object...data){}
	public void delete(Object data){}
	public Set select(String query){return null;}
	public void update(Object data){}

	public static Set<String> DOMAIN_VARIABLES = new HashSet<String>();

	static {
		DOMAIN_VARIABLES.add(WebApp.DB_DOMAIN_VARIABLE);
	}
	
	@Override
	public Set<String> getDomainVariableNames() {
		return DOMAIN_VARIABLES;
	}
	
	
}
