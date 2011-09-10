package jp.ac.titech.cs.se.fwit.core.model.req.action;

import java.util.List;
import java.util.Set;

import jp.ac.titech.cs.se.fwit.core.model.Domain;
import jp.ac.titech.cs.se.fwit.core.model.DomainConcept;
import jp.ac.titech.cs.se.fwit.core.model.req.RAction;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class MethodInvocationAction extends RActionSupport {

	public static Log logger = LogFactory.getLog(MethodInvocationAction.class);

	private NameAction receiver;

	private String methodName;

	private List<RAction> arguments;

	public MethodInvocationAction(NameAction receiver, String methodName,
			List<RAction> arguments) {
		this.receiver = receiver;
		this.methodName = methodName;
		this.arguments = arguments;
	}

	public String getLabel() {
		StringBuffer buf = new StringBuffer();
		if (this.receiver != null) {
			buf.append(this.receiver.getLabel());
			buf.append(":");
			buf.append(this.receiver.getType());
			buf.append(".");
		}

		buf.append(methodName);
		buf.append("(");

		for (RAction o : this.arguments) {
			if (this.arguments.indexOf(o) > 0) {
				buf.append(", ");
			}
			buf.append(o.getLabel());
		}

		buf.append(")");
		return buf.toString();
	}

	@Override
	protected void initDomainVariableNames(Domain domain) {
		if (receiver == null) {
			return;
		}

		DomainConcept concept = domain.getDomainConcept(receiver.getType());
		if (concept != null) {
			Set<String> vars = concept
					.getDomainVariableNamesReturnByMethod(methodName);
			if (vars != null) {
				domainVariables.addAll(vars);
			}
		}

		for (RAction action : arguments) {
			domainVariables.addAll(action.getDomainVariableNames());
		}
		if (receiver != null) {
			domainVariables.addAll(receiver.getDomainVariableNames());
		}
		return;
	}

	public String getMethodName() {
		return methodName;
	}

	public List<RAction> getArguments() {
		return arguments;
	}

	public String getReceiverName() {
		if (receiver == null) {
			return null;
		}
		return receiver.getLabel();
	}

	public String getReceiverType() {
		if (receiver == null) {
			return null;
		}
		return receiver.getType();
	}
}
