package jp.ac.titech.cs.se.fwit.core.model.req.guard;

import java.util.HashSet;
import java.util.Set;

import jp.ac.titech.cs.se.fwit.core.FatalFwitterException;
import jp.ac.titech.cs.se.fwit.core.logic.Disjunction;
import jp.ac.titech.cs.se.fwit.core.model.Guard;
import jp.ac.titech.cs.se.fwit.core.model.req.RGuard;
import jp.ac.titech.cs.se.fwit.core.model.req.RGuardProposition;
import jp.ac.titech.cs.se.fwit.core.model.req.Scenario;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class NotGuard extends RGuardSupport{

	private static final Log logger = LogFactory.getLog(NotGuard.class);
	private RGuard operand;

	public NotGuard(RGuard operand) {
		this.operand = operand;
	}

	public String getExpression() {
		return "!(" + this.operand.toString() + ")";
	}

	public String toString() {
		return this.getExpression();
	}

	public Set<Disjunction> toCNF(Scenario scenario) {
		if (this.operand instanceof NotGuard) {
			return ((NotGuard) this.operand).getOperand().toCNF(scenario);
		}
		if (this.operand instanceof PrimitiveGuard) {
			Set<Disjunction> cnf = new HashSet<Disjunction>();
			Disjunction disjunction = new Disjunction();
			disjunction.addProposition(new RGuardProposition(operand, scenario,
					false));
			cnf.add(disjunction);
			return cnf;
		}else if(this.operand instanceof OrGuard){
			OrGuard orGuard = (OrGuard)this.operand; 
			RGuard left = (RGuard)orGuard.getLeft().getNegation();
			RGuard right = (RGuard)orGuard.getRight().getNegation();
			RGuard formattedGuard = new AndGuard(left, right);
			return formattedGuard.toCNF(scenario);
		}else if(this.operand instanceof AndGuard){
			AndGuard andGuard = (AndGuard)this.operand; 
			RGuard left = (RGuard)andGuard.getLeft().getNegation();
			RGuard right = (RGuard)andGuard.getRight().getNegation();
			RGuard formattedGuard = new OrGuard(left, right);
			return formattedGuard.toCNF(scenario);
		}
		logger.error("unknown guard "+ this);
		throw new FatalFwitterException("unknown guard "+ this);
	}

	public RGuard getOperand() {
		return operand;
	}

	public Guard getNegation() {
		return operand;
	}

}
