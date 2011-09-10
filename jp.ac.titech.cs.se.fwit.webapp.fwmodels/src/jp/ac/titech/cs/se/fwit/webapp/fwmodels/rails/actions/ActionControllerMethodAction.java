package jp.ac.titech.cs.se.fwit.webapp.fwmodels.rails.actions;


import jp.ac.titech.cs.se.fwit.core.model.Domain;
import jp.ac.titech.cs.se.fwit.core.model.fw.FrameworkTemplate;
import jp.ac.titech.cs.se.fwit.core.model.req.RTransitionWrapper;
import jp.ac.titech.cs.se.fwit.webapp.fwmodels.actions.WebAppInnerAction;
import jp.ac.titech.cs.se.fwit.webapp.fwmodels.rails.RailsTemplate;
import jp.ac.titech.cs.se.fwit.webapp.fwmodels.rails.elements.ActionController;

public class ActionControllerMethodAction extends WebAppInnerAction {

    public ActionControllerMethodAction() {
        this.label = "execute";
    }

    @Override
    public FrameworkTemplate applyCustomizeOperation(FrameworkTemplate fw, RTransitionWrapper reqTransition) {
        final RailsTemplate rails = (RailsTemplate)fw;
        final String klass = reqTransition.getSingletonDomainVariableValue(Domain.MODULE_DOMAIN_VARIABLE_NAME);

        final String method = reqTransition.getSingletonDomainVariableValue(Domain.FUNCTION_DOMAIN_VARIABLE_NAME);

        final ActionController ctlr = rails.getController(klass);


        ctlr.addRTransition(method, reqTransition.getTransition());
        rails.setController(ctlr);

        return rails;
    }
}
