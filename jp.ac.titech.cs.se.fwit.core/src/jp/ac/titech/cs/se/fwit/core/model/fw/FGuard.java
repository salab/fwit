package jp.ac.titech.cs.se.fwit.core.model.fw;

import java.util.Set;

import jp.ac.titech.cs.se.fwit.core.logic.Disjunction;
import jp.ac.titech.cs.se.fwit.core.model.DomainVariableSpace;
import jp.ac.titech.cs.se.fwit.core.model.Guard;

public interface FGuard extends Guard{

	public abstract FGuard copyWithoutAssignment();

	public abstract Set<Disjunction> toCNF(DomainVariableSpace domain);

	public abstract void setName(String name);

	public abstract String getName();

	/** add a domain variable which define truth assignments of this condition */
	public abstract void addDomainVarialbeType(String variableName);

	/** add domain variables which define truth assignments of this condition */
	public abstract void addDomainVarialbeTypes(Set<String> types);
	
	/**
	 *  
	 * @return a transition which determines the value of this guard
	 */
	public FTransition getEvaluator();
	
	/**
	 * 
	 * @param transition a transition which determines the value of this guard
	 */
	public void setEvaluator(FTransition transition);
	
	/**
	 * For guards copied form other guards (with indefinite numbers of choices), return the original guard. 
	 * @return
	 */
	public FGuard getOriginal();
	
	
	public void setOriginal(FGuard original);

}