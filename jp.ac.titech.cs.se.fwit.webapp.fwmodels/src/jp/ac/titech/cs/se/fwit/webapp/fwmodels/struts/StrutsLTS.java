package jp.ac.titech.cs.se.fwit.webapp.fwmodels.struts;

import jp.ac.titech.cs.se.fwit.core.model.fw.FGuard;
import jp.ac.titech.cs.se.fwit.core.model.fw.FLTS;
import jp.ac.titech.cs.se.fwit.core.model.fw.FState;
import jp.ac.titech.cs.se.fwit.core.model.fw.FTransition;
import jp.ac.titech.cs.se.fwit.core.model.fw.TauAction;
import jp.ac.titech.cs.se.fwit.core.model.fw.guard.NaiveGuard;
import jp.ac.titech.cs.se.fwit.core.model.fw.guard.UniqueValueSatisfyingGuard;
import jp.ac.titech.cs.se.fwit.webapp.fwmodels.WebApp;
import jp.ac.titech.cs.se.fwit.webapp.fwmodels.struts.actions.ExecuteAction;
import jp.ac.titech.cs.se.fwit.webapp.fwmodels.struts.actions.ResponseForwardAction;
import jp.ac.titech.cs.se.fwit.webapp.fwmodels.struts.actions.ResponseInputAction;
import jp.ac.titech.cs.se.fwit.webapp.fwmodels.struts.actions.StrutsReadFormAction;
import jp.ac.titech.cs.se.fwit.webapp.fwmodels.struts.actions.StrutsRequestAction;
import jp.ac.titech.cs.se.fwit.webapp.fwmodels.struts.actions.StrutsValidateAction;

public class StrutsLTS extends FLTS {

	public StrutsLTS() {
		this.setInitialState(new FState("a"));

		FState processValidate = new FState("b");
		FGuard route = new NaiveGuard("route");
		route.addDomainVarialbeType(WebApp.REQUEST_DOMAIN_VARIABLE);
		FTransition req = buildTransition((FState) initialState,
				processValidate, new StrutsRequestAction(), route);
		req.addPolymorphicKey(WebApp.REQUEST_DOMAIN_VARIABLE);

		FTransition validate = buildTransition(processValidate,processValidate, new StrutsValidateAction(), null);
		buildTransition(processValidate,processValidate, new StrutsReadFormAction(), null);

		FState processExecute = new FState("c");
		FGuard isValid = new NaiveGuard("isValid");
		isValid.addDomainVarialbeType(WebApp.FORM_DOMAIN_VARIABLE);

		buildTransition(processValidate, processExecute,new TauAction(), isValid);

		buildTransition(processExecute, processExecute,	new ExecuteAction(), null);
		buildTransition(processExecute,processExecute, new StrutsReadFormAction(), null);

		FState forward = new FState("d");
		UniqueValueSatisfyingGuard render = new UniqueValueSatisfyingGuard(
				"render");
		render.setUniqueValueVariableName(WebApp.RESPONSE_DOMAIN_VARIABLE);
		render.addDomainVarialbeType(WebApp.FORM_DOMAIN_VARIABLE);
		render.addDomainVarialbeType(WebApp.RESPONSE_DOMAIN_VARIABLE);

		FTransition res = buildTransition(processExecute, forward,
				new ResponseForwardAction(), render);
		res.addPolymorphicKey(WebApp.RESPONSE_DOMAIN_VARIABLE);

		FState configureInput = new FState("e");
		UniqueValueSatisfyingGuard notValid = new UniqueValueSatisfyingGuard(
				"notValid");
		notValid.setUniqueValueVariableName(WebApp.RESPONSE_DOMAIN_VARIABLE);
		notValid.setEvaluator(validate);
		notValid.addDomainVarialbeType(WebApp.FORM_DOMAIN_VARIABLE);
		notValid.addDomainVarialbeType(WebApp.RESPONSE_DOMAIN_VARIABLE);

		buildTransition(processValidate, configureInput,new ResponseInputAction(), notValid);

		init();
	}
}
