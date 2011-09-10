package jp.ac.titech.cs.se.fwit.dsl.visitor;

import jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.AssignmentStatement;
import jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.Comparision;
import jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.Conjunction;
import jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.Expression;
import jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.IntegerLiteral;
import jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.MethodInvocation;
import jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.MethodInvocationExpression;
import jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.Multiplication;
import jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.NullLiteral;
import jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.ParExpression;
import jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.PrefixOperatorExpression;
import jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.QualifiedExpression;
import jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.StringLiteral;
import jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.ValueExpression;
import jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.VariableDeclaration;

import org.eclipse.emf.ecore.EObject;

public class ExpressionToStringConverter extends
		FwitRequirementsModelHookedSwitch<String> {
	
	private static ExpressionToStringConverter instance = new ExpressionToStringConverter();
	
	public static String toString(EObject object){
		return instance.doSwitch(object);
	}
	
	@Override
	public String caseExpression(Expression object) {
		String left = doSwitch(object.getLeftOperand());
		String operator = object.getOperator();
		if(operator == null){
			return left;
		}
		String right = doSwitch(object.getRightOperand());
		return left +" "+operator +" " + right;
	}

	@Override
	public String caseConjunction(Conjunction object) {
		String left = doSwitch(object.getLeftOperand());
		String operator = object.getOperator();
		if(operator == null){
			return left;
		}
		String right = doSwitch(object.getRightOperand());
		return left +" "+operator +" " + right;
	}

	@Override
	public String caseComparision(Comparision object) {
		String left = doSwitch(object.getLeftOperand());
		String operator = object.getOperator();
		if(operator == null){
			return left;
		}
		String right = doSwitch(object.getRightOperand());
		return left +" "+operator +" " + right;
	}

	
	
	@Override
	public String caseValueExpression(ValueExpression object) {
		String left = doSwitch(object.getLeftOperand());
		String operator = object.getOperator();
		if(operator == null){
			return left;
		}
		String right = doSwitch(object.getRightOperand());
		return left +" "+operator +" " + right;
	}
	
	@Override
	public String caseMultiplication(Multiplication object) {
		String left = doSwitch(object.getLeftOperand());
		String operator = object.getOperator();
		if(operator == null){
			return left;
		}
		String right = doSwitch(object.getRightOperand());
		return left +" "+operator +" " + right;
	}
	

	@Override
	public String caseStringLiteral(StringLiteral object) {
		return "\""+object.getValue()+"\"";
	}

	@Override
	public String caseIntegerLiteral(IntegerLiteral object) {
		return Integer.toString(object.getValue());
	}

	@Override
	public String caseQualifiedExpression(QualifiedExpression object) {
		return object.getValue();
	}

	@Override
	public String caseNullLiteral(NullLiteral object) {
		return object.getValue();
	}

	@Override
	public String casePrefixOperatorExpression(PrefixOperatorExpression object) {
		String operator = object.getOperator();
		String operand = doSwitch(object.getOperand());
		return operator+operand;
	}

	@Override
	public String caseMethodInvocationExpression(
			MethodInvocationExpression object) {
		String invocation = doSwitch(object.getMethod());
		VariableDeclaration receiver = object.getReceiver();
		if(receiver == null){
			return invocation;
		}
		return receiver.getName()+"."+invocation;
	}
	
	@Override
	public String caseMethodInvocation(
			MethodInvocation object) {
		StringBuffer buf = new StringBuffer();
		buf.append(object.getName().getValue());
		buf.append("(");
		boolean first = true;
		for(Expression arg:object.getArguments()){
			if(first){
				first = false;
			}else{
				buf.append(", ");
			}
			buf.append(doSwitch(arg));
		}
		buf.append(")");
		return  buf.toString();
	}
	

	@Override
	public String caseParExpression(ParExpression object) {
		String expression = doSwitch(object.getExpression());
		return "(" +expression +")";
	}

	@Override
	public String caseAssignmentStatement(AssignmentStatement object) {
		String assignee = object.getVariable().getName();
		String assigned = doSwitch(object.getValue());
		return assignee +" = "+assigned;
	}
	
	
}
