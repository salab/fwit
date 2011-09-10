package jp.ac.titech.cs.se.fwit.core.model.req.guard;

import java.util.HashSet;
import java.util.Set;

import jp.ac.titech.cs.se.fwit.core.logic.Disjunction;
import jp.ac.titech.cs.se.fwit.core.model.Guard;
import jp.ac.titech.cs.se.fwit.core.model.req.RGuardProposition;
import jp.ac.titech.cs.se.fwit.core.model.req.Scenario;

public class PrimitiveGuard extends RGuardSupport {

	private String expression;

	private Set<String> variables;

	public PrimitiveGuard(String expression, Set<String> variables){
		this.expression = expression;
		this.variables = variables;
	}

	public String getExpression() {
		return expression;
	}

	public void setExpression(String expression) {
		this.expression = expression;
	}

	public String toString() {
		return this.expression;
	}

	public Set<Disjunction> toCNF(Scenario scenario) {
		Set<Disjunction> cnf = new HashSet<Disjunction>();
		Disjunction disjunction = new Disjunction();
		disjunction.addProposition(new RGuardProposition(this, scenario, true));
		cnf.add(disjunction);
		return cnf;
	}

	public Set<String> getVariables() {
		return this.variables;
	}

	public Guard getNegation() {
		return new NotGuard(this);
	}
}
