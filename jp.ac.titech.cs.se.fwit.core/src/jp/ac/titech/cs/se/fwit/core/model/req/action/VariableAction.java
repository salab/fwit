package jp.ac.titech.cs.se.fwit.core.model.req.action;

import jp.ac.titech.cs.se.fwit.core.FatalFwitterException;
import jp.ac.titech.cs.se.fwit.core.model.Domain;

public class VariableAction extends NameAction {

	public VariableAction(String variable, String type) {
		this.label = variable;
		this.type = type;
		if(type == null){
			throw new FatalFwitterException("type of " +variable +" is not defied");
		}
	}
	
	public String toString(){
		return this.label;
	}

	
}
