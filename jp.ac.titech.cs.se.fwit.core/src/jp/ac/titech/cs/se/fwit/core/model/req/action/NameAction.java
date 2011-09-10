package jp.ac.titech.cs.se.fwit.core.model.req.action;

import java.util.HashSet;
import java.util.Set;

import jp.ac.titech.cs.se.fwit.core.model.Domain;
import jp.ac.titech.cs.se.fwit.core.model.req.RAction;

public abstract class NameAction implements RAction{
	
	protected String label;

	protected String type;

	protected Set<String> domainVariables = new HashSet<String>();
	
	protected Set<String> specificationVariables = new HashSet<String>();
	
	public void addDomainVariableNames(Set<String> domainVariables) {
		this.domainVariables.addAll(domainVariables);
	}
	
	public void init(Domain domain){}

	public Set<String> getDomainVariableNames() {
		return this.domainVariables;
	}

	public String getLabel() {
		return label;
	}

	public String getType() {
		return type;
	}

	public void setVariables(Set<String> variables) {
		this.specificationVariables = variables;
	}
	
	
}
