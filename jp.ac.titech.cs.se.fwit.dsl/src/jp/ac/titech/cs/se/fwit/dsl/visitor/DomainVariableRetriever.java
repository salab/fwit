package jp.ac.titech.cs.se.fwit.dsl.visitor;

import java.util.HashSet;
import java.util.Set;

import jp.ac.titech.cs.se.fwit.core.model.Domain;
import jp.ac.titech.cs.se.fwit.core.model.DomainConcept;
import jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.Type;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class DomainVariableRetriever extends
		FwitRequirementsModelHookedSwitch<Set<String>> {

	public Log logger = LogFactory.getLog(DomainVariableRetriever.class);
	private Domain domain;

	public DomainVariableRetriever(Domain domain) {
		this.domain = domain;
	}

	@Override
	public Set<String> caseType(Type object) {
		//String className = object.getClassName().getCanonicalName();
		String className = object.getClassName();
		
		if (className == null) {
			className = object.getName();
		}
		
		DomainConcept concept = domain.getDomainConcept(className);
		if (concept != null) {
			return concept.getDomainVariableNames();
		}

		return new HashSet<String>();
	}
}
