package jp.ac.titech.cs.se.fwit.dsl.visitor;

import java.util.Set;

import jp.ac.titech.cs.se.fwit.core.model.req.RGuard;
import jp.ac.titech.cs.se.fwit.core.model.req.action.VariableActionManager;
import jp.ac.titech.cs.se.fwit.core.model.req.guard.AndGuard;
import jp.ac.titech.cs.se.fwit.core.model.req.guard.NotGuard;
import jp.ac.titech.cs.se.fwit.core.model.req.guard.OrGuard;
import jp.ac.titech.cs.se.fwit.core.model.req.guard.PrimitiveGuard;
import jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.Comparision;
import jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.Conjunction;
import jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.Expression;
import jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.MethodInvocationExpression;
import jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.Multiplication;
import jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.Name;
import jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.ParExpression;
import jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.PrefixOperatorExpression;
import jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.ValueExpression;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.emf.ecore.EObject;

public class GuardBuilder extends FwitRequirementsModelHookedSwitch<RGuard> {
	public static Log logger = LogFactory.getLog(GuardBuilder.class);
	
	private VariableActionManager variableBinding;

	private GuardBuilder childGuardBuilder;
	
	public GuardBuilder(VariableActionManager variableBinding) {
		this.variableBinding = variableBinding;
	}
	
	@Override
	protected void preSwitch(EObject object){
		logger.debug(object);
	}

	@Override
	public RGuard caseParExpression(ParExpression object) {
		return this.doSwitch(object.getExpression());
	}
	
	@Override
	public RGuard caseExpression(Expression object) {
		childGuardBuilder = new GuardBuilder(variableBinding);
		RGuard left = childGuardBuilder.doSwitch(object.getLeftOperand());
		
		String operator = object.getOperator();
		if(operator == null){
			return left;
		}
		
		RGuard right = childGuardBuilder.doSwitch(object.getRightOperand());
		return new OrGuard(left, right);
	}
	
	@Override
	public RGuard caseConjunction(Conjunction object) {
		childGuardBuilder = new GuardBuilder(variableBinding);
		RGuard left = childGuardBuilder.doSwitch(object.getLeftOperand());
		
		String operator = object.getOperator();
		if(operator == null){
			return left;
		}
		
		RGuard right = childGuardBuilder.doSwitch(object.getRightOperand());
		return new AndGuard(left, right);
	}
	
	public RGuard caseComparision(Comparision object) {
		return buildPrimitiveGuard(object.getLeftOperand(), object.getOperator(),object);
	}
	
	public RGuard caseValueExpression(ValueExpression object) {
		return buildPrimitiveGuard(object.getLeftOperand(), object.getOperator(),object);
	}

	public RGuard caseMultiplication(Multiplication object) {
		return buildPrimitiveGuard(object.getLeftOperand(), object.getOperator(),object);
	}

	private RGuard buildPrimitiveGuard(EObject left, String operator, EObject object){
		childGuardBuilder = new GuardBuilder(variableBinding);
		RGuard leftAction = childGuardBuilder.doSwitch(left);
		if(operator == null){
			return leftAction;
		}
		return buildPrimitiveGuard(object);
	}

	@Override
	public RGuard casePrefixOperatorExpression(PrefixOperatorExpression object) {
		String operator = object.getOperator(); 
		if (operator.equals("!")) {
			return new NotGuard(buildPrimitiveGuard(object.getOperand()));
		} else {
			return buildPrimitiveGuard(object);
		}
	}

	@Override
	public RGuard caseName(Name object) {
		return buildPrimitiveGuard(object);
	}

	@Override
	public RGuard caseMethodInvocationExpression(MethodInvocationExpression object) {
		return buildPrimitiveGuard(object);
	}

	private PrimitiveGuard buildPrimitiveGuard(EObject expression){
		VariableRetriever varVisitor = new VariableRetriever();
		varVisitor.doSwitch(expression);
		Set<String> variables = varVisitor.getVariables();
		return new PrimitiveGuard(ExpressionToStringConverter.toString(expression), variables);
	}
	
}
