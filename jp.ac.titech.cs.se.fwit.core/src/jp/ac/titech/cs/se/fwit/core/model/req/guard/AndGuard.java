package jp.ac.titech.cs.se.fwit.core.model.req.guard;

import java.util.HashSet;
import java.util.Set;

import jp.ac.titech.cs.se.fwit.core.logic.Disjunction;
import jp.ac.titech.cs.se.fwit.core.model.Guard;
import jp.ac.titech.cs.se.fwit.core.model.req.RGuard;
import jp.ac.titech.cs.se.fwit.core.model.req.Scenario;

public class AndGuard extends RGuardSupport {

    RGuard left;
    RGuard right;
    RGuard negation;

    public AndGuard(RGuard left, RGuard right) {
        this.left = left;
        this.right = right;
        this.negation = null;
    }

    @Override
    public String getExpression() {
        return left.toString() + " && " + right.toString();
    }

    @Override
    public String toString() {
        return this.getExpression();
    }

    @Override
    public Set<Disjunction> toCNF(Scenario scenario) {
        final Set<Disjunction> cnf = new HashSet<Disjunction>();
        cnf.addAll(left.toCNF(scenario));
        cnf.addAll(right.toCNF(scenario));
        return cnf;
    }

    public RGuard getLeft() {
        return left;
    }

    public RGuard getRight() {
        return right;
    }

    @Override
    public Guard getNegation() {
        if (this.negation == null) {
            this.negation = new OrGuard(
                    (RGuard) left.getNegation(), (RGuard) right.getNegation());
        }
        return this.negation;
    }
}
