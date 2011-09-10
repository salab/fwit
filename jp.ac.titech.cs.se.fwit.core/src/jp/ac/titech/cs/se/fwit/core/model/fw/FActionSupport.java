package jp.ac.titech.cs.se.fwit.core.model.fw;

import jp.ac.titech.cs.se.fwit.core.model.composite.CTransition;
import jp.ac.titech.cs.se.fwit.core.model.req.RAction;
import jp.ac.titech.cs.se.fwit.core.model.req.RTransitionWrapper;
import jp.ac.titech.cs.se.fwit.core.model.req.action.AbstractStatementAction;
import jp.ac.titech.cs.se.fwit.core.model.req.action.AssignmentAction;
import jp.ac.titech.cs.se.fwit.core.model.req.action.InfixOperatorAction;
import jp.ac.titech.cs.se.fwit.core.model.req.action.MethodInvocationAction;
import jp.ac.titech.cs.se.fwit.core.model.req.action.NameAction;
import jp.ac.titech.cs.se.fwit.core.model.req.action.PrefixOperatorAction;

public abstract class FActionSupport implements FAction{

    protected String label;

    @Override
    public Boolean match(RAction reqAction) {

        if(reqAction instanceof AbstractStatementAction){
            return match(((AbstractStatementAction) reqAction).getAction());
        }
        if(reqAction instanceof AssignmentAction){
            return matchWith((AssignmentAction)reqAction);
        }
        if(reqAction instanceof InfixOperatorAction){
            return matchWith((InfixOperatorAction)reqAction);
        }
        if(reqAction instanceof PrefixOperatorAction){
            return matchWith((PrefixOperatorAction)reqAction);
        }
        if(reqAction instanceof MethodInvocationAction){
            return matchWith((MethodInvocationAction)reqAction);
        }
        if(reqAction instanceof NameAction){
            return matchWith((NameAction)reqAction);
        }
        return false;
    }

    protected Boolean matchWith(NameAction reqAction) {
        return true;
    }

    protected Boolean matchWith(MethodInvocationAction reqAction) {
        return false;
    }

    protected Boolean matchWith(PrefixOperatorAction reqAction) {
        return false;
    }

    protected Boolean matchWith(InfixOperatorAction reqAction) {
        return false;
    }

    protected Boolean matchWith(AssignmentAction reqAction) {
        return false;
    }

    @Override
    public String getLabel() {
        return label;
    }
    public void setLabel(String label){
        this.label = label;
    }

    @Override
    public String toString() {
        return label;
    }

    @Override
    public FrameworkTemplate applyCustomizeOperation(FrameworkTemplate fwTemplate, CTransition transition) {
        return this.applyCustomizeOperation(fwTemplate, new RTransitionWrapper(transition.getReqTransition()));
    }

    public FrameworkTemplate applyCustomizeOperation(FrameworkTemplate fwTemplate, RTransitionWrapper reqTransition){
        return fwTemplate;
    }
}
