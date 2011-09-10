package jp.ac.titech.cs.se.fwit.core.model.req.action;

import jp.ac.titech.cs.se.fwit.core.model.Domain;
import jp.ac.titech.cs.se.fwit.core.model.req.RAction;

public class EpsilonAction extends RActionSupport {
    public static final String LABEL = "epsilon";

    @Override
    public String getLabel() {
        return LABEL;
    }

    @Override
    public String getType() {
        return RAction.VOID_TYPE;
    }

    @Override
    protected void initDomainVariableNames(Domain domain) {
    }

}
