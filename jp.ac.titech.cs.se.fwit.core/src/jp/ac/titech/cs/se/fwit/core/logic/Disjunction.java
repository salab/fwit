package jp.ac.titech.cs.se.fwit.core.logic;

import java.util.ArrayList;
import java.util.List;

public class Disjunction {

    private final List<Proposition> propositions;

    public Disjunction(){
        propositions = new ArrayList<Proposition>();
    }

    public void addProposition(Proposition proposition){
        propositions.add(proposition);
    }

    public void addDisjunction(Disjunction disjunction){
        this.propositions.addAll(disjunction.getPropositions());
    }

    public List<Proposition> getPropositions(){
        return this.propositions;
    }

    @Override
    public String toString() {
        final StringBuffer buf = new StringBuffer();
        for(final Proposition prop:propositions){
            if(propositions.indexOf(prop) > 0){
                buf.append(" V ");
            }
            buf.append(prop.toString());
        }
        return buf.toString();
    }
}
