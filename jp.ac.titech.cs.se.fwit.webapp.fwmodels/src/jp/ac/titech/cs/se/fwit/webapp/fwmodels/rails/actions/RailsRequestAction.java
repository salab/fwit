package jp.ac.titech.cs.se.fwit.webapp.fwmodels.rails.actions;

import java.util.ArrayList;
import java.util.List;

import jp.ac.titech.cs.se.fwit.core.model.Domain;
import jp.ac.titech.cs.se.fwit.core.model.fw.FrameworkTemplate;
import jp.ac.titech.cs.se.fwit.core.model.req.RTransitionWrapper;
import jp.ac.titech.cs.se.fwit.webapp.fwmodels.WebApp;
import jp.ac.titech.cs.se.fwit.webapp.fwmodels.actions.RequestAction;
import jp.ac.titech.cs.se.fwit.webapp.fwmodels.rails.RailsTemplate;
import jp.ac.titech.cs.se.fwit.webapp.fwmodels.rails.elements.ActionController;
import jp.ac.titech.cs.se.fwit.webapp.fwmodels.util.freemarker.FileElement;

public class RailsRequestAction extends RequestAction  {
    @Override
    public FrameworkTemplate applyCustomizeOperation(FrameworkTemplate fw, RTransitionWrapper reqTransition){
        final RailsTemplate rails = (RailsTemplate)fw;
        final String klass = reqTransition.getSingletonDomainVariableValue(Domain.MODULE_DOMAIN_VARIABLE_NAME);
        final String method = reqTransition.getSingletonDomainVariableValue(Domain.FUNCTION_DOMAIN_VARIABLE_NAME);

        final ActionController ctlr = rails.getController(klass);
        rails.setController(ctlr);

        final String refferrer = reqTransition.getSingletonDomainVariableValue(WebApp.REFERRER_DOMAIN_VARIABLE);
        final FileElement view = rails.getViewElement(refferrer);
        if(!view.containsKey("links")){
            view.put("links", new ArrayList<String>());
        }
        @SuppressWarnings("unchecked")
        final List<String> links = (List<String>) view.get("links");
        links.add(klass+"/"+method);
        view.put("links", links);
        rails.setViewElement(view);
        return rails;
    }
}
