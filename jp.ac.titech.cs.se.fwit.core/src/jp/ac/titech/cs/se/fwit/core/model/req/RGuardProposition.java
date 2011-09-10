package jp.ac.titech.cs.se.fwit.core.model.req;

import jp.ac.titech.cs.se.fwit.core.logic.Proposition;

public class RGuardProposition implements Proposition {
	private RGuard guard;
	private Scenario scenario;
	private Boolean value;
	
	public RGuardProposition(RGuard guard, Scenario scenario, Boolean value){
		this.guard = guard;
		this.scenario = scenario;
		this.value = value;
	}
	
	/* (non-Javadoc)
	 * @see jp.ac.titech.cs.se.fwit.slts.req.guard.proposition.Proposition#getBaseName()
	 */ 
	public String getBaseName(){
		StringBuffer buf = new StringBuffer();
		buf.append(guard.getExpression());
		buf.append("("+scenario.getName()+")");
		return buf.toString();
	}
	
	/* (non-Javadoc)
	 * @see jp.ac.titech.cs.se.fwit.slts.req.guard.proposition.Proposition#getValue()
	 */
	public Boolean getValue(){
		return value;
	}
	
	public String toString(){
		StringBuffer buf = new StringBuffer();
		buf.append(guard.getExpression());
		buf.append("("+scenario.getName()+")=");
		buf.append(value);
		return buf.toString();
	}
}
