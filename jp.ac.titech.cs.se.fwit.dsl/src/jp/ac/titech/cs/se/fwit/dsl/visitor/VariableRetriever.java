package jp.ac.titech.cs.se.fwit.dsl.visitor;

import java.util.HashSet;
import java.util.Set;

import jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.Expression;
import jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.MethodInvocationExpression;
import jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.QualifiedExpression;
import jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.VariableDeclaration;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;


public class VariableRetriever extends FwitRequirementsModelHookedSwitch<Set<String>> {

	public static Log logger = LogFactory.getLog(VariableRetriever.class);

	private Set<String> variables;

	public VariableRetriever(){
		this.variables  = new HashSet<String>();
	}
	
	@Override
	protected void preSwitch(EObject object){
		logger.debug(object);
	}

	@Override
	public Set<String> caseMethodInvocationExpression(MethodInvocationExpression object) {
		VariableDeclaration receiver = object.getReceiver();
		
		if(receiver !=null){
			this.variables.add(receiver.getName());
		}
		EList<Expression> args = object.getMethod().getArguments();
		for(Expression arg:args){
			this.doSwitch(arg);
		}
		return null;
	}
	
	@Override
	public Set<String> caseQualifiedExpression(QualifiedExpression node) {
		this.variables.add(node.toString());
		return null;
	}

	public Set<String> getVariables() {
		return variables;
	}
}
