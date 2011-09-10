package jp.ac.titech.cs.se.fwit.core.model.req.action;

import java.util.HashSet;
import java.util.Set;

import jp.ac.titech.cs.se.fwit.core.model.Domain;
import jp.ac.titech.cs.se.fwit.core.model.req.RAction;

public abstract class RActionSupport implements RAction{
	
	protected String label;
	
	private String type;
	
	protected Set<String> domainVariables = null;
	
	
	public Set<String> getDomainVariableNames() {
		return domainVariables;
	}
	
	public void init(Domain domain){
		if(domainVariables ==null){
			domainVariables = new HashSet<String>();
			initDomainVariableNames(domain);
		}
	}
	
	protected abstract void initDomainVariableNames(Domain domain);

	public String getType(){
		return type;
	}

	public String toString(){
		return getLabel();
	}

	public String getLabel() {
		return label;
	}
}
