package jp.ac.titech.cs.se.fwit.webapp.fwmodels;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import jp.ac.titech.cs.se.fwit.core.model.DomainConceptSupport;
import jp.ac.titech.cs.se.fwit.core.model.req.RAction;
import jp.ac.titech.cs.se.fwit.core.model.req.Scenario;

public class HTML extends DomainConceptSupport {

	public static Set<String> inputMethods = new HashSet<String>();
	public static Set<String> outputMethods = new HashSet<String>();
	public static Set<String> readMethods = new HashSet<String>();
	public static Set<String> messageMethods = new HashSet<String>();
	static {
		inputMethods.add("get");
		inputMethods.add("post");
		inputMethods.add("put");
		inputMethods.add("delete");

		outputMethods.add("render");

		readMethods.add("read");

		messageMethods.add("setMsg");
		messageMethods.add("setData");
	}

	public Object read() {
		return null;
	}

	public void get(String url) {
	};

	public void post(String url) {
	};

	public void put(String url) {
	};

	public void delete(String url) {
	};

	public void render() {
	};

	public void setMsg(String msg) {
	}

	public void setData(Object data) {
	}

	public Set<String> getDomainVariableNamesReturnByMethod(String method) {
		if (readMethods.contains(method)) {
			return FormData.DOMAIN_VARIABLES;
		}
		return null;
	}

	@Override
	public void updateDomainVariablesByMethod(Scenario scenario, String methodName,
			String receiver, List<RAction> arg) {
		if (receiver == null) {
			return;
		}
		if (inputMethods.contains(methodName)) {
			scenario.setDomainVariableValue(WebApp.REFERRER_DOMAIN_VARIABLE, receiver);
			scenario.setDomainVariableValue(WebApp.REQUEST_DOMAIN_VARIABLE, arg.get(0).getLabel());
		} else if (outputMethods.contains(methodName)) {
			scenario.setDomainVariableValue(WebApp.RESPONSE_DOMAIN_VARIABLE, receiver);
		}
	}
}
