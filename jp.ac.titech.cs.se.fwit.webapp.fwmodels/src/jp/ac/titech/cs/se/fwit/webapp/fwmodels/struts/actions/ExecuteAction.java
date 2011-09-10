package jp.ac.titech.cs.se.fwit.webapp.fwmodels.struts.actions;

import java.util.List;

import jp.ac.titech.cs.se.fwit.core.model.fw.FrameworkTemplate;
import jp.ac.titech.cs.se.fwit.core.model.req.RAction;
import jp.ac.titech.cs.se.fwit.core.model.req.RTransitionWrapper;
import jp.ac.titech.cs.se.fwit.core.model.req.action.VariableAction;
import jp.ac.titech.cs.se.fwit.webapp.fwmodels.WebApp;
import jp.ac.titech.cs.se.fwit.webapp.fwmodels.actions.WebAppInnerAction;
import jp.ac.titech.cs.se.fwit.webapp.fwmodels.struts.StrutsTemplate;
import jp.ac.titech.cs.se.fwit.webapp.fwmodels.struts.elements.ActionElement;
import jp.ac.titech.cs.se.fwit.webapp.fwmodels.struts.elements.ActionExecute;
import jp.ac.titech.cs.se.fwit.webapp.fwmodels.struts.elements.ActionForm;

public class ExecuteAction extends WebAppInnerAction {

    public ExecuteAction() {
        this.label = "execute";
    }

    @Override
    public FrameworkTemplate applyCustomizeOperation(FrameworkTemplate fw,
            RTransitionWrapper reqTransition) {
        final StrutsTemplate struts = (StrutsTemplate) fw;
        final String request = reqTransition
        .getSingletonDomainVariableValue(WebApp.REQUEST_DOMAIN_VARIABLE);
        final ActionElement actionElement = struts.getActionElement(request);
        final ActionExecute actionClass = struts
        .getActionExecute((String) actionElement.get("type"));
        actionClass.addRTransition(ActionExecute.EXECUTE_METHOD,
                reqTransition.getTransition());

        final ActionForm form = struts.getActionForm(actionElement.getName());
        final List<RAction> actions = reqTransition.getTransition().getRAction()
        .getActions();
        for (final RAction action : actions) {
            VariableAction var;
            if (action instanceof VariableAction) {
                var = (VariableAction) action;
                if (form.hasField(var.getLabel())) {
                    actionClass.addFormVariable(var.getLabel(), var.getType());
                }
            }
        }
        struts.setActionExecute(actionClass);
        return struts;
    }
}
