package jp.ac.titech.cs.se.fwit.core.model.fw;

import java.util.Comparator;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

import jp.ac.titech.cs.se.fwit.core.model.State;
import jp.ac.titech.cs.se.fwit.core.model.Transition;
import jp.ac.titech.cs.se.fwit.core.model.req.Scenario;
import jp.ac.titech.cs.se.fwit.core.model.visitors.SLTSElementsVisitor;
import jp.ac.titech.cs.se.fwit.core.util.StringConverter;

public class FState extends State {

    private final SortedMap<FTransition, SortedSet<String>> childCodes = new TreeMap<FTransition, SortedSet<String>>(
            new TransitionComparator());

    private class TransitionComparator implements Comparator<Transition> {
        @Override
        public int compare(Transition t1, Transition t2) {
            return t1.toString().compareTo(t2.toString());
        }
    }

    // should be sorted for isomorphism check
    private final Set<Scenario> assumedScenarios;

    private String subtreeCode = null;

    public FState(String name) {
        super(name);
        assumedScenarios = new TreeSet<Scenario>(new ScenarioComparator());
    }

    private class ScenarioComparator implements Comparator<Scenario> {
        @Override
        public int compare(Scenario s1, Scenario s2) {
            return s1.getName().compareTo(s2.getName());
        }
    }

    public String getSubtreeCode() {
        if (subtreeCode != null) {
            return subtreeCode;
        }

        final StringBuffer buf = new StringBuffer();
        buf.append("[");
        if (this.isTerminal()) {
            boolean first = true;
            for (final Scenario s : assumedScenarios) {
                if (first) {
                    first = false;
                } else {
                    buf.append(",");
                }
                buf.append(s.getName());
            }
        } else {
            for(final Transition t:this.outgoings){
                if(t.isSelfLoop()){
                    continue;
                }
                final FTransition org = ((FTransition) t).getOriginal();
                SortedSet<String> code;
                if (!childCodes.containsKey(org)) {
                    code = new TreeSet<String>();
                } else {
                    code = childCodes.get(org);
                }
                final FState target = (FState)t.getTarget();
                code.add(target.getSubtreeCode());
                this.childCodes.put(org, code);
            }
            for(final FTransition child:this.childCodes.keySet()){
                buf.append(StringConverter.set2String(this.childCodes.get(child)));
            }
        }
        buf.append("]");
        this.subtreeCode = buf.toString();
        return this.subtreeCode;
    }

    public void addAssumedScenario(Scenario scenario) {
        assumedScenarios.add(scenario);
    }

    public void reset() {
        assumedScenarios.clear();
        this.subtreeCode = null;
        this.childCodes.clear();
    }

    public Set<Scenario> getAssumedScenarios() {
        return this.assumedScenarios;
    }

    @Override
    public void accept(SLTSElementsVisitor visitor) {
        visitor.preVisit(this);
        if(!visitor.visit(this)){
            return;
        }
        // process loop transitions first for evaluator setting in FLTS extraction
        for(final Transition transition:this.outgoings){
            final FTransition ft = (FTransition)transition;
            if(ft.isSelfLoop()){
                ft.accept(visitor);
            }
        }
        final Set<Transition> prceeds = this.getOutgoingsWithoutSelfLoop();
        for(final Transition transition:prceeds){
            transition.accept(visitor);
        }
        visitor.endVisit(this);
        visitor.postVisit(this);
    }



    @Override
    public String toString() {
        final StringBuffer buf = new StringBuffer();
        buf.append(name);
        buf.append("(");
        boolean first = true;
        for (final Scenario scenario : assumedScenarios) {
            if (first) {
                first = false;
            } else {
                buf.append(",");
            }
            buf.append(scenario.getName());
        }
        buf.append(")");
        return buf.toString();
    }



}
