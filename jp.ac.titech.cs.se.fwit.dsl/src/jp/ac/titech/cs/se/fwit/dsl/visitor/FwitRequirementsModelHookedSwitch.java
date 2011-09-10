package jp.ac.titech.cs.se.fwit.dsl.visitor;

import org.eclipse.emf.ecore.EObject;

import jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.util.FwitRequirementsModelSwitch;

public class FwitRequirementsModelHookedSwitch<T> extends FwitRequirementsModelSwitch<T> {
	
	protected T value;

	@Override
	public T doSwitch(EObject theEObject) {
		preSwitch(theEObject);
		value = super.doSwitch(theEObject);
		postSwitch(theEObject);
		return value;
	}

	protected void postSwitch(EObject theEObject) {
		// TODO Auto-generated method stub
		
	}

	protected void preSwitch(EObject theEObject) {
		// TODO Auto-generated method stub
		
	}

}
