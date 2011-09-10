package jp.ac.titech.cs.se.fwit.webapp.fwmodels.rails;

import jp.ac.titech.cs.se.fwit.core.model.Domain;
import jp.ac.titech.cs.se.fwit.core.model.fw.FGuard;
import jp.ac.titech.cs.se.fwit.core.model.fw.FLTS;
import jp.ac.titech.cs.se.fwit.core.model.fw.FState;
import jp.ac.titech.cs.se.fwit.core.model.fw.FTransition;
import jp.ac.titech.cs.se.fwit.core.model.fw.TauAction;
import jp.ac.titech.cs.se.fwit.core.model.fw.guard.NaiveGuard;
import jp.ac.titech.cs.se.fwit.core.model.fw.guard.UniqueValueSatisfyingGuard;
import jp.ac.titech.cs.se.fwit.webapp.fwmodels.WebApp;
import jp.ac.titech.cs.se.fwit.webapp.fwmodels.actions.ReadFormAction;
import jp.ac.titech.cs.se.fwit.webapp.fwmodels.rails.actions.ActionControllerMethodAction;
import jp.ac.titech.cs.se.fwit.webapp.fwmodels.rails.actions.RailsRequestAction;
import jp.ac.titech.cs.se.fwit.webapp.fwmodels.rails.actions.RenderAction;

public class RailsLTS extends FLTS {

	public RailsLTS() {
		this.setInitialState(new FState("a"));

		FState findController = new FState("b");
		FGuard route = new NaiveGuard("ctlr");
		route.addDomainVarialbeType(Domain.MODULE_DOMAIN_VARIABLE_NAME);

		FTransition req = buildTransition((FState) this.initialState,
				findController, new RailsRequestAction(), route);
		req.addPolymorphicKey(Domain.MODULE_DOMAIN_VARIABLE_NAME);

		FState actionMethod = new FState("c");
		FGuard actionSelector = new NaiveGuard("action");
		actionSelector
				.addDomainVarialbeType(WebApp.REQUEST_DOMAIN_VARIABLE);
		FTransition findAction = buildTransition(findController, actionMethod,
				new TauAction(), actionSelector);
		findAction.addPolymorphicKey(WebApp.REQUEST_DOMAIN_VARIABLE);

		buildTransition(actionMethod, actionMethod,
				new ActionControllerMethodAction(), null);
		buildTransition(actionMethod, actionMethod,
				new ReadFormAction(), null);

		FState forward = new FState("d");
		UniqueValueSatisfyingGuard render = new UniqueValueSatisfyingGuard(
				"render");
		render.setUniqueValueVariableName(WebApp.RESPONSE_DOMAIN_VARIABLE);
		render.addDomainVarialbeType(WebApp.FORM_DOMAIN_VARIABLE);
		render.addDomainVarialbeType(WebApp.RESPONSE_DOMAIN_VARIABLE);

		FTransition res = buildTransition(actionMethod, forward,
				new RenderAction(), render);
		res.addPolymorphicKey(WebApp.RESPONSE_DOMAIN_VARIABLE);

		init();
	}
}
