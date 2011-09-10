package jp.ac.titech.cs.se.fwit.core.model.req;

import java.util.HashSet;
import java.util.Set;

import jp.ac.titech.cs.se.fwit.core.model.State;

public class RState extends State {
	public static int id =0;
	
	public Set<Scenario> passingScenarios;
	
	public static RState newRState(){
		return new RState(id++);
	}

	public RState(Integer id) {
		super(Integer.toString(id));
		passingScenarios  = new HashSet<Scenario>();
	}
	
	public void addPassingScenario(Scenario scenario){
		this.passingScenarios.add(scenario);
	}

	public Set<Scenario> getPassingScenarios() {
		return passingScenarios;
	}
}
