package jp.ac.titech.cs.se.fwit.core.model;

import java.util.Map;

import jp.ac.titech.cs.se.fwit.core.model.req.Scenario;

public interface Guard {

	/**
	 * @param scenario
	 * @param value 
	 * @return false if the value is contradicted to the current setting
	 */
	public Boolean setAssignment(Scenario scenario,Boolean value);
	public Boolean getAssignment(Scenario scenario);
	public Map<Scenario,Boolean> getAssignments();
	public void clearAssignments();
	
	public Boolean weakOrInconsistent(Guard guard);
}