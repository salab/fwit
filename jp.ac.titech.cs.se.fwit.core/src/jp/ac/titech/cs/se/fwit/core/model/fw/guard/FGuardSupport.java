package jp.ac.titech.cs.se.fwit.core.model.fw.guard;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import jp.ac.titech.cs.se.fwit.core.logic.Disjunction;
import jp.ac.titech.cs.se.fwit.core.logic.Proposition;
import jp.ac.titech.cs.se.fwit.core.model.DomainVariable;
import jp.ac.titech.cs.se.fwit.core.model.DomainVariableSpace;
import jp.ac.titech.cs.se.fwit.core.model.GuardSupport;
import jp.ac.titech.cs.se.fwit.core.model.fw.FGuard;
import jp.ac.titech.cs.se.fwit.core.model.fw.FGuardProposition;
import jp.ac.titech.cs.se.fwit.core.model.fw.FTransition;
import jp.ac.titech.cs.se.fwit.core.model.req.Scenario;

public abstract class FGuardSupport extends GuardSupport implements FGuard {

    protected String name;

    protected Integer numberOfCopies;

    protected FGuard original = null;

    protected FTransition evaluator;

    /** domain variables which define truth assignments of this condition */
    protected Set<String> domainVariableTypes;

    public FGuardSupport(String name) {
        this.name = name;
        this.numberOfCopies = 0;
        this.domainVariableTypes = new HashSet<String>();
    }

    @Override
    public Boolean setAssignment(Scenario scenario, Boolean value) {
        // check there is no contradictions
        if (this.assignments.containsKey(scenario)) {
            return value.equals(this.assignments.get(scenario));
        }

        // check guard-specific constraint
        if(!checkAssignment(scenario,value)){
            return false;
        }

        // set assignment
        this.assignments.put(scenario, value);
        return true;
    }

    /**
     * 	  This method can be overridden to add specific constraints for early contradiction detections
     * (e.g., assure only one value make the guard true);
     */
    protected abstract Boolean checkAssignment(Scenario scenario, Boolean value);


    /* (non-Javadoc)
     * @see jp.ac.titech.cs.se.fwit.slts.fw.FGuard#toCNF(jp.ac.titech.cs.se.fwit.slts.DomainVariableSpace)
     */
    @Override
    public Set<Disjunction> toCNF(DomainVariableSpace domain) {
        final Set<Disjunction> disjunctions = new HashSet<Disjunction>();
        Map<String, DomainVariable> arguments;

        for (final Scenario scenario : this.assignments.keySet()) {
            arguments = this.toArgumentsForGuardProposition(scenario);
            final Disjunction disjunction = new Disjunction();
            final Proposition prop = new FGuardProposition(this.getName(), arguments,
                    this.assignments.get(scenario));
            disjunction.addProposition(prop);
            disjunctions.add(disjunction);
        }
        disjunctions.addAll(this.getSpecificConstraint(domain));

        return disjunctions;
    }

    protected abstract List<Disjunction> getSpecificConstraint(DomainVariableSpace domain);

    protected Map<String,DomainVariable> toArgumentsForGuardProposition(Scenario scenario){
        final Map<String, DomainVariable> arguments = new HashMap<String, DomainVariable>();
        for (final String var : this.domainVariableTypes) {
            arguments.put(var, scenario.getDomainVariable(var));
        }
        return arguments;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void addDomainVarialbeType(String variableName) {
        this.domainVariableTypes.add(variableName);
    }

    @Override
    public void addDomainVarialbeTypes(Set<String> types) {
        this.domainVariableTypes.addAll(types);
    }

    @Override
    public FGuard getOriginal() {
        return original;
    }

    @Override
    public void setOriginal(FGuard original) {
        this.original = original;
    }

    @Override
    public FTransition getEvaluator() {
        return evaluator;
    }

    @Override
    public void setEvaluator(FTransition evaluator) {
        this.evaluator = evaluator;
        if(evaluator!=null){
            // if null there is no evaluation relation
            this.evaluator.addEvaluatedGuard(this);
        }
    }

    @Override
    public String toString() {
        final StringBuffer buf = new StringBuffer();
        buf.append(name);
        buf.append("(");
        boolean first = true;
        for (final String var : this.domainVariableTypes) {
            if (first) {
                first = false;
            } else {
                buf.append(", ");
            }
            buf.append(var);
        }
        buf.append(")");
        if(evaluator != null){
            buf.append("_by_");
            buf.append(evaluator.toString());
        }
        return buf.toString();
    }
}
