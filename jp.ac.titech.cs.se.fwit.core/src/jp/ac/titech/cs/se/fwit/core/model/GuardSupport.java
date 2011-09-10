package jp.ac.titech.cs.se.fwit.core.model;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import jp.ac.titech.cs.se.fwit.core.model.req.Scenario;

public abstract class GuardSupport implements Guard {
	protected Map<Scenario, Boolean> assignments = new HashMap<Scenario, Boolean>();

	public Boolean weakOrInconsistent(Guard guard) {
		Set<Scenario> scenarios = new HashSet<Scenario>(assignments.keySet());
		scenarios.addAll(guard.getAssignments().keySet());
		for (Scenario s : scenarios) {
			// check weakness
			if (this.getAssignment(s)) {
				if (!guard.getAssignment(s)) {
					return true;
				}
			}
			// check inconsistent
			if (guard.getAssignment(s)) {
				if (!this.getAssignment(s)) {
					return true;
				}
			}
		}
		return false;
	}

	/**
	 * set assignment for the given scenario
	 * 
	 * @param scenario
	 * @param value
	 * @return false if the value is contradicted to the current setting
	 */
	public Boolean setAssignment(Scenario scenario, Boolean value) {
		if (this.assignments.containsKey(scenario)) {
			return value.equals(this.assignments.get(scenario));
		}
		this.assignments.put(scenario, value);
		return true;
	}

	public Boolean getAssignment(Scenario scenario) {
		if (this.assignments.containsKey(scenario)) {
			return this.assignments.get(scenario);
		}
		return false;
	}

	public Map<Scenario, Boolean> getAssignments() {
		return this.assignments;
	}

	public void clearAssignments() {
		assignments.clear();
	}

}
