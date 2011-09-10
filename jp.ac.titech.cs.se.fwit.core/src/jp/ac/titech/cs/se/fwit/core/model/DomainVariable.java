package jp.ac.titech.cs.se.fwit.core.model;

import java.util.SortedSet;
import java.util.TreeSet;

/**
 * represents the value of a domain variable.
 * The value can be set by specifying the value of the variable or set(add) conditions which the value has to satisfy.
 * @author zenmyo
 *
 */
public class DomainVariable {

    private final String variableName;

    private String value;

    // set of conditions which the value satisfies
    private final SortedSet<String> conditions;

    /**
     * 
     * @param domain variable name
     */
    public DomainVariable(String variable){
        this.variableName = variable;
        this.value = "";
        this.conditions = new TreeSet<String>();
    }

    public void setValue(String value){
        this.value = value;
    }

    public void addCondition(String value){
        this.conditions.add(value);
    }

    @Override
    public boolean equals(Object o){
        if(o == null){
            return false;
        }
        if(!(o instanceof DomainVariable)){
            return false;
        }
        final DomainVariable other = (DomainVariable)o;
        if(!other.variableName.equals(this.variableName)){
            return false;
        }
        if(!other.value.equals(this.value)){
            return false;
        }

        if(other.conditions.size() != conditions.size()){
            return false;
        }
        if(!other.conditions.equals(this.conditions)){
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        // TODO improve efficiency
        int result = 17 + variableName.hashCode();
        result = result*17+value.hashCode();
        for(final String var :conditions){
            result = result*37 + var.hashCode();
        }
        return result;
    }

    @Override
    public String toString() {
        final StringBuffer buf = new StringBuffer();
        buf.append(variableName+" = ");
        buf.append(value+" : ");
        for(final String v:conditions){
            buf.append(v);
            buf.append(", ");
        }
        return buf.toString();
    }

    public String getVariableName() {
        return variableName;
    }

    public String getValue(){
        return value;
    }
}
