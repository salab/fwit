package jp.ac.titech.cs.se.fwit.webapp.fwmodels.util.freemarker;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import jp.ac.titech.cs.se.fwit.core.model.State;
import jp.ac.titech.cs.se.fwit.core.model.Transition;
import jp.ac.titech.cs.se.fwit.core.model.req.RAction;
import jp.ac.titech.cs.se.fwit.core.model.req.RGuard;
import jp.ac.titech.cs.se.fwit.core.model.req.RTransition;
import jp.ac.titech.cs.se.fwit.core.model.req.action.AbstractStatementAction;
import jp.ac.titech.cs.se.fwit.core.model.req.action.IfStatementAction;
import jp.ac.titech.cs.se.fwit.core.model.req.action.StatementAction;

public abstract class ClassElement extends FileElement {
	public static final String FIELDS = "fields";
	public static final String METHOD_ARGUMENTS = "methodArguments";
	public static final String METHOD_TYPES = "methodTypes";
	public static final String METHOD_STATEMENTS = "methodStatements";

	public  static final String indentUnit = "    ";
	
	// field name to type
	protected Map<String, String> fields = new HashMap<String,String>();
	
	// temporally map to store structure of code 
	protected Map<String, Set<RTransition>> methods = new HashMap<String, Set<RTransition>>();
	
	protected Map<String, List<String>> methodStatements = new HashMap<String, List<String>>();
	protected Map<String, String> methodTypes = new HashMap<String, String>();
	protected Map<String, String> methodArguments = new HashMap<String, String>();
	
	@Override 
	public void init(){
		this.buildStatements();
		postBuildStatements();
		data.put(METHOD_STATEMENTS, methodStatements);
		data.put(METHOD_TYPES, methodTypes);
		data.put(METHOD_ARGUMENTS, methodArguments);
		data.put(FIELDS, fields);
	}

	protected void postBuildStatements() {}

	public void addField(String name, String type) {
		fields.put(name, type);
	}

	public Map<String, String> getFields() {
		return fields;
	}

	public boolean hasField(String name){
		return fields.containsKey(name);
	}
	
	public void addRTransition(String method, RTransition rt) {
		if (!methods.containsKey(method)) {
			methods.put(method, new HashSet<RTransition>());
		}
		Set<RTransition> transitions = methods.get(method);
		transitions.add(rt);
		methods.put(method, transitions);
	}

	public void buildStatements() {
		for (String method : methods.keySet()) {
			List<String> statements = new ArrayList<String>();
			this.buildStatements(method, findStartTransitions(method),
					statements, "");
			methodStatements.put(method, statements);
		}
	}

	private List<RTransition> findStartTransitions(String method) {

		Set<RTransition> transitions = methods.get(method);
		List<RTransition> startTransitions = new ArrayList<RTransition>();
		RTransition startTransition = null;
		for (RTransition t : transitions) {
			while (transitions.contains(t)) {
				startTransition = t;
				t = (RTransition) t.getSource().getIncoming();
			}
			if (!startTransitions.contains(startTransition)) {
				startTransitions.add(startTransition);
			}
		}
		return startTransitions;
	}

	public void buildStatements(String method, State state,
			List<String> statements, String indent) {
		Set<RTransition> transitions = methods.get(method);
		List<RTransition> nextTransitions = new ArrayList<RTransition>();
		List<Transition> outgoings = state.getOutgoings();
		for (Transition t : outgoings) {
			if (transitions.contains(t)) {
				nextTransitions.add((RTransition) t);
			}
		}
		if (nextTransitions.isEmpty()) {
			return;
		} else {
			buildStatements(method, nextTransitions, statements, indent);
		}

	}

	private void buildStatements(String method,
			List<RTransition> nextTransitions, List<String> lines,
			String indent) {

		if (nextTransitions.size() == 1) {
			RTransition t = nextTransitions.get(0);
			RAction action = t.getRAction();
			RGuard guard = (RGuard) t.getGuard();
			if (guard != null) {
				String guardExpression=this.transformGuardExpression(method, guard);
				lines.add(toIfStatementLine(indent, guardExpression));
				indent = indent + indentUnit;
			}
			if (!(action instanceof IfStatementAction)) {
				lines.add(indent + getStatement(method, action));
			}
			buildStatements(method, t.getTarget(), lines, indent);
			if (guard != null){
				indent = indent.substring(indentUnit.length());
				lines.add(toCloseBlockLine(indent));
			}
		} else {
			boolean first = true;
			for (RTransition t : nextTransitions) {
				RGuard guard = (RGuard) t.getGuard();
				if (guard != null) {
					String guardExpression=this.transformGuardExpression(method, guard);
					if (first) {
						lines.add(toIfStatementLine(indent, guardExpression));
						first = false;
					} else {
						lines.add(toElseIfStatementLine(indent, guardExpression));
					}
				}
				RAction action = t.getRAction();
				if (!(action instanceof IfStatementAction)) {
					lines.add(indent + indentUnit
							+ getStatement(method, action));
				}

				buildStatements(method, t.getTarget(), lines, indent+indentUnit);
				if (t.equals(nextTransitions.get(nextTransitions.size()-1))){
					lines.add(toCloseBlockLine(indent));
				}
			}
		}
	}

	protected abstract String toCloseBlockLine(String indent);

	protected abstract String toElseIfStatementLine(String indent, String guardExpression);

	protected abstract String toIfStatementLine(String indent, String guardExpression);

	protected String getStatement(String method, RAction action) {
		if (action instanceof AbstractStatementAction) {
			return transformStatementAction(method,
					(StatementAction) action)+";";
		}
		return action.getLabel()+";";
	}

	/**
	 * a hook method for Framework-Specific transformation rule
	 * 
	 * @param method
	 *            the method where the action is implemented
	 * @param action
	 *            action representing the statement
	 * @return transformed statement
	 */
	protected String transformStatementAction(String method,
			StatementAction action) {
		return action.getLabel();
	}
	
	protected String transformGuardExpression(String method, RGuard guard){
		return guard.getExpression();
	}
	

	public Integer getNumberOfStatements() {
		int numberOfStatements = 0;

		for (List<String> statements : methodStatements.values()) {
			numberOfStatements += statements.size();
		}
		return numberOfStatements;
	}

	public String getClassName() {
		return (String) data.get("className");
	}
}
