package jp.ac.titech.cs.se.fwit.core.model;

import java.util.List;
import java.util.Set;

import jp.ac.titech.cs.se.fwit.core.model.req.RAction;
import jp.ac.titech.cs.se.fwit.core.model.req.Scenario;


/**
 * DomainConcept is an interface for domain specific concept (e.g. HTML in web application domain)
 * This interface defines methods for extracting domain specific information from requirements specifications
 * @author zenmyo
 *
 */
public interface DomainConcept {
	
	/**
	 * @return name of the domain variable related to this concept if the concept related to a domain variable,
	 * otherwise return null 
	 * 
	 */
	public Set<String> getDomainVariableNames();
	
	/** 
	 * @param method method name 
	 * @return a set of domain variable names related to the value returned by the method
	 */
	public Set<String> getDomainVariableNamesReturnByMethod(String method);

	
	/**
	 * Reflect changes of domain variables of a scenario by method invocation 
	 * @param scenario the scenario of which domain variables are to be updated
	 * @param methodName name of the method which affect the variable
	 * @param receiver the receiver object of the method
	 * @param arguments arguments passed to the method 
	 * @return return the value of the domain variable if there exists a domain variable affected by the method,
	 * otherwise null
	 */
	public void updateDomainVariablesByMethod(Scenario scenario, String methodName,String receiver, List<RAction> arguments );

}
