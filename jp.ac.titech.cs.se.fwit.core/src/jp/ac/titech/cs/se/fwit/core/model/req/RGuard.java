package jp.ac.titech.cs.se.fwit.core.model.req;

import java.util.Set;

import jp.ac.titech.cs.se.fwit.core.logic.Disjunction;
import jp.ac.titech.cs.se.fwit.core.model.Guard;
import jp.ac.titech.cs.se.fwit.core.model.req.action.IfStatementAction;

public interface RGuard extends Guard {
	
	public Set<RTransition> getEvaluators();

	public void addEvaluators(RTransition evaluator);
	
	public abstract String getExpression();
	
	public RAction getAction();
	
	public void setAction(IfStatementAction action);
	
	public abstract Set<Disjunction> toCNF(Scenario scenario);
	
	public Guard getNegation();
	
}
