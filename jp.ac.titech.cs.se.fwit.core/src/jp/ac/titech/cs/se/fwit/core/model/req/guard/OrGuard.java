package jp.ac.titech.cs.se.fwit.core.model.req.guard;

import java.util.HashSet;
import java.util.Set;

import jp.ac.titech.cs.se.fwit.core.logic.Disjunction;
import jp.ac.titech.cs.se.fwit.core.model.Guard;
import jp.ac.titech.cs.se.fwit.core.model.req.RGuard;
import jp.ac.titech.cs.se.fwit.core.model.req.Scenario;

public class OrGuard extends RGuardSupport {

	RGuard left;
	RGuard right;
	RGuard negation;

	public OrGuard(RGuard left, RGuard right) {
		this.left = left;
		this.right = right;
		this.negation = null;
	}

	public String getExpression() {
		return left.toString() + " || " + right.toString();
	}

	public String toString() {
		return this.getExpression();
	}
	
	public Set<Disjunction> toCNF(Scenario scenario) {
		Set<Disjunction> cnf = new HashSet<Disjunction>();
		Set<Disjunction> leftConjunction = left.toCNF(scenario);
		Set<Disjunction> rightConjunction = right.toCNF(scenario);
		for (Disjunction ld : leftConjunction) {
			for (Disjunction rd : rightConjunction) {
				Disjunction d = new Disjunction();
				d.addDisjunction(ld);
				d.addDisjunction(rd);
				cnf.add(d);
			}
		}
		return cnf;
	}

	public RGuard getLeft() {
		return left;
	}

	public RGuard getRight() {
		return right;
	}

	public Guard getNegation() {
		if (this.negation == null) {
			this.negation = new AndGuard(
					(RGuard) left.getNegation(), (RGuard) right.getNegation());
		}
		return this.negation;
	}
}
