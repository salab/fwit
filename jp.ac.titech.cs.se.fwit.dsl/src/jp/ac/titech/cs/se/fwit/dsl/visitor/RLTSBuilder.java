package jp.ac.titech.cs.se.fwit.dsl.visitor;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

import jp.ac.titech.cs.se.fwit.core.model.Domain;
import jp.ac.titech.cs.se.fwit.core.model.req.RAction;
import jp.ac.titech.cs.se.fwit.core.model.req.RGuard;
import jp.ac.titech.cs.se.fwit.core.model.req.RLTS;
import jp.ac.titech.cs.se.fwit.core.model.req.RState;
import jp.ac.titech.cs.se.fwit.core.model.req.RTransition;
import jp.ac.titech.cs.se.fwit.core.model.req.action.EpsilonAction;
import jp.ac.titech.cs.se.fwit.core.model.req.action.IfStatementAction;
import jp.ac.titech.cs.se.fwit.core.model.req.action.PrefixOperatorAction;
import jp.ac.titech.cs.se.fwit.core.model.req.action.StatementAction;
import jp.ac.titech.cs.se.fwit.core.model.req.action.VariableAction;
import jp.ac.titech.cs.se.fwit.core.model.req.action.VariableActionManager;
import jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.Block;
import jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.ElseBlock;
import jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.FunctionDeclaration;
import jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.IfStatement;
import jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.LocalVariableDeclaration;
import jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.ReturnStatement;
import jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.Statement;
import jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.TaskStatement;
import jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.VariableDeclaration;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.emf.ecore.EObject;

public class RLTSBuilder extends FwitRequirementsModelHookedSwitch<RLTS> {

	public static Log logger = LogFactory.getLog(RLTSBuilder.class);

	private enum BlockType {
		THEN, ELSE
	};

	private RLTS rlts;

	private String moduleName;

	private DomainVariableRetriever domainVariableRetriever;

	private ActionBuilder actionBuilder;

	private VariableActionManager variableBinding;

	private Stack<Set<RState>> stateStack;

	private Map<EObject, BlockType> blockTypes;

	private Map<EObject, RGuard> guards;

	private Domain domain;

	public RLTSBuilder(Domain domain, String moduleName, VariableActionManager fieldBinding) {
		this.domain = domain;
		this.domainVariableRetriever = new DomainVariableRetriever(domain);
		this.moduleName = moduleName;
		this.variableBinding = new VariableActionManager(fieldBinding);
		this.stateStack = new Stack<Set<RState>>();
		this.blockTypes = new HashMap<EObject, BlockType>();
		this.guards = new HashMap<EObject, RGuard>();
	}

	
	@Override
	protected void preSwitch(EObject object) {
		if(logger.isDebugEnabled()){
			logger.debug(object + " : " + object.getClass());
		}
		if (blockTypes.containsKey(object)
				&& BlockType.ELSE.equals(blockTypes.get(object))) {
			swapTopElementsOfStateStack();
		}
		RGuard guard = guards.get(object);
		if (guard != null) {
			// set the guard for next transition
			addTransitions(new EpsilonAction(), guard);
		}
	}

	private void swapTopElementsOfStateStack() {
		Set<RState> ifStates = stateStack.pop();
		Set<RState> preElseStates = stateStack.pop();
		stateStack.push(ifStates);
		stateStack.push(preElseStates);
	}

	@Override
	public RLTS caseFunctionDeclaration(FunctionDeclaration object) {
		rlts = new RLTS(domain, moduleName, object.getName());
		RState initial = RState.newRState();
		rlts.setInitialState(initial);
		Set<RState> currentState = new HashSet<RState>();
		currentState.add(initial);
		stateStack.push(currentState);
		this.doSwitch(object.getBody());
		rlts.init();
		return rlts;
	}

	@Override
	public RLTS caseBlock(Block object) {
		for (Statement statement : object.getStatements()) {
			this.doSwitch(statement);
		}
		return null;
	}

	@Override
	public RLTS caseTaskStatement(TaskStatement object) {
		actionBuilder = new ActionBuilder(domain,variableBinding);
		RAction action = actionBuilder.doSwitch(object);
		
		addTransitions(new StatementAction(ExpressionToStringConverter.toString(object), action), null);
		return null;
	}

	@Override
	public RLTS caseIfStatement(IfStatement object) {

		IfStatementAction action = createIfStatementAction(object);
		RGuard guard = getThenGuard(object);
		configureThenBlock(object, guard);
		guard.setAction(action);

		Set<RState> currentStates = RLTS.createEvaluatorTransitions(
				stateStack.pop(), action, guard);

		stateStack.push(currentStates);// for else block
		stateStack.push(new HashSet<RState>(currentStates));// for then block

		RGuard negGuard = getElseGuard(guard);
		configureElseBlock(object, negGuard);
		RAction negAction = new PrefixOperatorAction("!",action);
		negAction.init(domain);
		negGuard.setAction(new IfStatementAction(negGuard.getExpression(),negAction));

		this.doSwitch(object.getThenBlok());

		if (object.getElseBlock() != null) {
			this.doSwitch(object.getElseBlock());
			Set<RState> endStates = stateStack.pop(); // end states of the then
														// block
			endStates.addAll(stateStack.pop()); // end states of the else block
			stateStack.push(endStates);
		} else {
			// add supplemental states (which avoid if block) for implicit else
			// block
			Set<RState> thenStates = stateStack.pop();
			Set<RState> elseStates = stateStack.pop();
			elseStates = RLTS.createTransitions(elseStates,
					new EpsilonAction(), negGuard);
			for (RState s : elseStates) {
				// set flag for later sanitization
				((RTransition) s.getIncoming()).setSupplemental(true);
			}
			elseStates.addAll(thenStates);
			stateStack.push(elseStates);
		}
		return null;
	}

	@Override
	public RLTS caseLocalVariableDeclaration(LocalVariableDeclaration object) {
		//String type = object.getType().getClassName().getCanonicalName();
		String type = object.getType().getClassName();
		if(type==null){
			type = object.getType().getName();
		}
		for (VariableDeclaration var : object.getVariables()) {
			VariableAction action = variableBinding.findOrCreateAction(
					var.getName(), type);
			action.addDomainVariableNames(domainVariableRetriever
					.doSwitch(object.getType()));
			
		}
		return null;
	}
	
	@Override
	public RLTS caseReturnStatement(ReturnStatement object) {
		Set<RState> currentStates = stateStack.pop();
		currentStates.clear();
		stateStack.push(currentStates);
		return null;
	}


	// ---begin --- caseIfStatement(IfStatement node) sub routines
	private IfStatementAction createIfStatementAction(IfStatement object) {
		actionBuilder = new ActionBuilder(domain, variableBinding);

		RAction guardEvalAction = actionBuilder.doSwitch(object.getCondition());
		String condition =ExpressionToStringConverter.toString(object.getCondition().getExpression());
		IfStatementAction ifAction =  new IfStatementAction(condition, guardEvalAction);
		ifAction.init(domain);
		return ifAction;
		
	}

	private RGuard getThenGuard(IfStatement object) {
		GuardBuilder guardBuilder = new GuardBuilder(variableBinding);
		RGuard guard = guardBuilder.doSwitch(object.getCondition());
		return guard;
	}

	private void configureThenBlock(IfStatement node, RGuard guard) {
		Block thenBlock = node.getThenBlok();
		blockTypes.put(thenBlock, BlockType.THEN);
		guards.put(thenBlock, guard);
	}

	private RGuard getElseGuard(RGuard guard) {
		RGuard negGuard = (RGuard) guard.getNegation();
		Set<RTransition> evaluators = guard.getEvaluators();
		for (RTransition evaluator : evaluators) {
			negGuard.addEvaluators(evaluator);
		}
		return negGuard;
	}

	private void configureElseBlock(IfStatement object, RGuard negGuard) {
		ElseBlock elseBlock = object.getElseBlock();
		if (elseBlock != null) {
			blockTypes.put(elseBlock, BlockType.ELSE);
			guards.put(elseBlock, negGuard);
		}
	}

	// ---end --- caseIfStatemetn(IfStatement node) sub routines

	private void addTransitions(RAction action, RGuard guard) {
		Set<RState> currentStates = stateStack.pop();
		currentStates = RLTS.createTransitions(currentStates, action, guard);
		stateStack.push(currentStates);
	}
	
}
