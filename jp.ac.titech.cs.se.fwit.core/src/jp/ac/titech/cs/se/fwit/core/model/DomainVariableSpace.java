package jp.ac.titech.cs.se.fwit.core.model;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import jp.ac.titech.cs.se.fwit.core.util.StringConverter;

public class DomainVariableSpace {
    private final Map<String, Set<DomainVariable>> domain = new HashMap<String,Set<DomainVariable>>();

    public Set<DomainVariable> getValuesOf(String variableName){
        return domain.get(variableName);
    }

    public void addDomainVariableValue(DomainVariable var){
        Set<DomainVariable> variables;
        if(domain.containsKey(var.getVariableName())){
            variables = domain.get(var.getVariableName());
        }else{
            variables  = new HashSet<DomainVariable>();
        }
        variables.add(var);
        domain.put(var.getVariableName(), variables);
    }

    public Map<String, Integer> sizes() {
        final Map<String,Integer> sizes = new HashMap<String,Integer>();
        final Set<String> vars = domain.keySet();
        for(final String var:vars){
            sizes.put(var, domain.get(var).size());
        }
        return sizes;
    }

    @Override
    public String toString() {
        final StringBuffer buf = new StringBuffer();
        for(final String var:domain.keySet()){
            buf.append(var+" = ");
            buf.append(StringConverter.set2String(domain.get(var)));
            buf.append(System.getProperty("line.separator"));
        }
        return buf.toString();
    }

}
