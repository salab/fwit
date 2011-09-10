package jp.ac.titech.cs.se.fwit.core.model;

/**
 * Domain is superordinate concept of frameworks
 * @author zenmyo
 *
 */
public interface Domain {

	public static final String MODULE_DOMAIN_VARIABLE_NAME = "__MODULE__";
	public static final String FUNCTION_DOMAIN_VARIABLE_NAME = "__FUNCTION__";
	
	public DomainConcept getDomainConcept(String className);

}
