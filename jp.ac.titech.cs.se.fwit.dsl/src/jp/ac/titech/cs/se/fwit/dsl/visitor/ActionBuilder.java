package jp.ac.titech.cs.se.fwit.dsl.visitor;

import java.util.ArrayList;
import java.util.List;

import jp.ac.titech.cs.se.fwit.core.FatalFwitterException;
import jp.ac.titech.cs.se.fwit.core.model.Domain;
import jp.ac.titech.cs.se.fwit.core.model.req.RAction;
import jp.ac.titech.cs.se.fwit.core.model.req.action.AssignmentAction;
import jp.ac.titech.cs.se.fwit.core.model.req.action.InfixOperatorAction;
import jp.ac.titech.cs.se.fwit.core.model.req.action.LiteralAction;
import jp.ac.titech.cs.se.fwit.core.model.req.action.MethodInvocationAction;
import jp.ac.titech.cs.se.fwit.core.model.req.action.PrefixOperatorAction;
import jp.ac.titech.cs.se.fwit.core.model.req.action.VariableAction;
import jp.ac.titech.cs.se.fwit.core.model.req.action.VariableActionManager;
import jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.AssignmentStatement;
import jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.Comparision;
import jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.Conjunction;
import jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.Expression;
import jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.IntegerLiteral;
import jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.MethodInvocationExpression;
import jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.Multiplication;
import jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.NullLiteral;
import jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.ParExpression;
import jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.PrefixOperatorExpression;
import jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.QualifiedExpression;
import jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.StringLiteral;
import jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.ValueExpression;
import jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.VariableDeclaration;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.emf.ecore.EObject;


public class ActionBuilder extends FwitRequirementsModelHookedSwitch<RAction> {

    public static Log logger = LogFactory.getLog(ActionBuilder.class);

    private final VariableActionManager variableBinding;

    private ActionBuilder childActionBuilder;

    private final Domain domain;

    public ActionBuilder(Domain domain , VariableActionManager variableBinding) {
        this.domain = domain;
        this.variableBinding = variableBinding;
    }

    @Override
    public void preSwitch(EObject object) {
        childActionBuilder = new ActionBuilder(domain,variableBinding);
        logger.debug(object);
    }

    @Override
    public void postSwitch(EObject object){
        value.init(domain);
    }


    @Override
    public RAction caseExpression(Expression object) {
        return buildInfixOperatorAction(object.getLeftOperand(),object.getOperator(),object.getRightOperand());
    }

    @Override
    public RAction caseConjunction(Conjunction object) {
        return buildInfixOperatorAction(object.getLeftOperand(),object.getOperator(),object.getRightOperand());
    }

    @Override
    public RAction caseComparision(Comparision object) {
        return buildInfixOperatorAction(object.getLeftOperand(),object.getOperator(),object.getRightOperand());
    }

    @Override
    public RAction caseValueExpression(ValueExpression object) {
        return buildInfixOperatorAction(object.getLeftOperand(),object.getOperator(),object.getRightOperand());
    }

    @Override
    public RAction caseMultiplication(Multiplication object) {
        return buildInfixOperatorAction(object.getLeftOperand(),object.getOperator(),object.getRightOperand());
    }

    private RAction buildInfixOperatorAction(EObject left, String operator, EObject right){
        final RAction leftAction = childActionBuilder.doSwitch(left);
        if(operator == null){
            return leftAction;
        }
        final RAction rightAction = childActionBuilder.doSwitch(right);
        return new InfixOperatorAction(operator, leftAction, rightAction);
    }


    @Override
    public RAction casePrefixOperatorExpression(PrefixOperatorExpression object) {
        return  new PrefixOperatorAction(object.getOperator(),childActionBuilder.doSwitch(object.getOperand()));
    }

    @Override
    public RAction caseParExpression(ParExpression object) {
        return doSwitch(object.getExpression());
    }

    @Override
    public RAction caseAssignmentStatement(AssignmentStatement object) {

        final RAction assigned = childActionBuilder.doSwitch(object.getValue());

        final RAction left = childActionBuilder.doSwitch(object.getVariable());

        if (!(left instanceof VariableAction)) {
            throw new FatalFwitterException("illegal assignee expression "+ left.getClass() );
        }
        final VariableAction assignee = (VariableAction) left;
        return new AssignmentAction(object.getOperator(), assignee, assigned);
    }

    @Override
    public RAction caseMethodInvocationExpression(
            MethodInvocationExpression object) {
        final VariableDeclaration receiver = object.getReceiver();
        VariableAction receiverAction = null;
        if (receiver != null) {
            receiverAction = variableBinding.getAction(receiver.getName());
        }
        final List<RAction> arguments = new ArrayList<RAction>();
        for (final EObject arg : object.getMethod().getArguments()) {
            arguments.add(childActionBuilder.doSwitch(arg));
        }
        return new MethodInvocationAction(receiverAction, object.getMethod().getName().getValue(), arguments);

    }

    @Override
    public RAction caseQualifiedExpression(QualifiedExpression object) {
        return variableBinding.getAction(object.getValue());
    }

    @Override
    public RAction caseStringLiteral(StringLiteral object) {
        return new LiteralAction(object.getValue(), RAction.STRING_TYPE);
    }

    @Override
    public RAction caseIntegerLiteral(IntegerLiteral object) {
        return new LiteralAction(Integer.toString(object.getValue()), object.getClass().toString());
    }


    @Override
    public RAction caseNullLiteral(NullLiteral object) {
        return new LiteralAction(object.getValue(), object.getClass().toString());
    }

    @Override
    public RAction caseVariableDeclaration(VariableDeclaration object) {
        return variableBinding.getAction(object.getName());
    }




}
