package jp.ac.titech.cs.se.fwit.core.model.fw;

import java.util.Arrays;
import java.util.Map;

import jp.ac.titech.cs.se.fwit.core.logic.Proposition;
import jp.ac.titech.cs.se.fwit.core.model.DomainVariable;

public class FGuardProposition implements Proposition {

    private final String name;
    private final Map<String,DomainVariable> arguments;
    private final Boolean value;

    public FGuardProposition(String name, Map<String,DomainVariable> arguments, Boolean value){
        this.name  = name;
        this.arguments  = arguments;
        this.value = value;
    }

    /* (non-Javadoc)
     * @see jp.ac.titech.cs.se.fwit.slts.req.guard.proposition.Proposition#getBaseName()
     */
    @Override
    public String getBaseName() {
        final StringBuffer buf = new StringBuffer();
        buf.append(name);
        buf.append("(");
        final String[] args = arguments.keySet().toArray(new String[0]);
        Arrays.sort(args);// assure same order
        for(int i=0;i<args.length;i++){
            if(i>0){
                buf.append(", ");
            }
            buf.append(arguments.get(args[i]));
        }
        buf.append(")");
        return buf.toString();
    }

    /* (non-Javadoc)
     * @see jp.ac.titech.cs.se.fwit.slts.req.guard.proposition.Proposition#getValue()
     */
    @Override
    public Boolean getValue() {
        return value;
    }

    @Override
    public String toString() {
        final StringBuffer buf = new StringBuffer();
        buf.append(getBaseName());
        buf.append("=");
        buf.append(value);
        return buf.toString();
    }
}
