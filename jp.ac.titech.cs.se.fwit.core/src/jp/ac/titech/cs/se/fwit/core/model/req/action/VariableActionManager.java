package jp.ac.titech.cs.se.fwit.core.model.req.action;

import java.util.HashMap;
import java.util.Map;

import jp.ac.titech.cs.se.fwit.core.FatalFwitterException;

public class VariableActionManager {
	
	private Map<String, VariableAction> actions;
	
	public VariableActionManager(){
		actions = new HashMap<String, VariableAction>();
	}
	
	public VariableActionManager(VariableActionManager manager) {
		actions = new HashMap<String, VariableAction>(manager.getActions());
	}

	public VariableAction findOrCreateAction(String variable, String type){
		if(!actions.containsKey(variable)){
			actions.put(variable, new VariableAction(variable, type));
		}
		VariableAction action = actions.get(variable);
		if(action.getType().equals(type)){
			return actions.get(variable);	
		}
		throw new FatalFwitterException("inconsistent variable type: " + variable+ "old: "+ action.getType()+", new: "+ type);
	}
	
	public VariableAction getAction(String variable) {
		if(!actions.containsKey(variable)){
			throw new FatalFwitterException("the variable "+ variable+ " is not initated");
		}
		return actions.get(variable);
	}
	
	public void setAction(VariableAction action){
		actions.put(action.getLabel(), action);
	}
	
	public Map<String, VariableAction> getActions(){
		return actions;
	}
}
