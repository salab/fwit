package jp.ac.titech.cs.se.fwit.webapp.fwmodels.actions;

import jp.ac.titech.cs.se.fwit.core.model.fw.FActionSupport;
import jp.ac.titech.cs.se.fwit.core.model.req.action.MethodInvocationAction;
import jp.ac.titech.cs.se.fwit.webapp.fwmodels.HTML;

public class BuildResponseAction extends FActionSupport {
    // allow setting error messages
    @Override
    public Boolean matchWith(MethodInvocationAction action) {
        if(!HTML.class.getName().equals(action.getReceiverType())){
            return false;
        }
        if(!HTML.messageMethods.contains(action.getMethodName())){
            return false;
        }
        return true;
    }

}
