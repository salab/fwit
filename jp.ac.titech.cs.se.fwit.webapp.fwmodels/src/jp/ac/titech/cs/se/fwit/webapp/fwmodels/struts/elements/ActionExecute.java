package jp.ac.titech.cs.se.fwit.webapp.fwmodels.struts.elements;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jp.ac.titech.cs.se.fwit.core.model.req.RGuard;
import jp.ac.titech.cs.se.fwit.core.model.req.action.MethodInvocationAction;
import jp.ac.titech.cs.se.fwit.core.model.req.action.StatementAction;
import jp.ac.titech.cs.se.fwit.webapp.fwmodels.HTML;
import jp.ac.titech.cs.se.fwit.webapp.fwmodels.struts.ActionToServletExpressionVisitor;
import jp.ac.titech.cs.se.fwit.webapp.fwmodels.util.freemarker.JavaClassElement;
import freemarker.template.utility.StringUtil;

public class ActionExecute extends JavaClassElement {

    public static final String EXECUTE_METHOD = "execute";

    private final Map<String, String> formVariables = new HashMap<String, String>();

    private final String formType;

    private final ActionToServletExpressionVisitor transformer = new ActionToServletExpressionVisitor();

    public ActionExecute(String className) {
        put("className", className);
        formType = className.substring(0, className.lastIndexOf("Action"))
        + "Form";
    }

    public void addFormVariable(String name, String type) {
        formVariables.put(name, type);
    }

    @Override
    protected void postBuildStatements() {
        if (!methodStatements.containsKey(EXECUTE_METHOD)) {
            return;
        }
        final List<String> executeStatements = methodStatements.get(EXECUTE_METHOD);
        for (final String var : formVariables.keySet()) {
            final StringBuffer buf = new StringBuffer();
            buf.append(formVariables.get(var));
            buf.append(" ");
            buf.append(var);
            buf.append(" = formData.get");
            buf.append(StringUtil.capitalize(var));
            buf.append("();");
            executeStatements.add(0, buf.toString());
        }
        executeStatements.add(0, formType + " formData = (" + formType
                + ")form;");

    }

    @Override
    protected String transformStatementAction(String method,
            StatementAction action) {
        if (action.getActions().get(0) instanceof MethodInvocationAction) {
            final MethodInvocationAction invocation = (MethodInvocationAction) action
            .getActions().get(0);
            if (HTML.class.getName().equals(invocation.getReceiverType())) {
                if (HTML.outputMethods.contains(invocation.getMethodName())) {
                    return "return mapping.findForward(\""
                    + invocation.getReceiverName() + "\")";
                }
                if (HTML.messageMethods.contains(invocation.getMethodName())) {
                    return "request.setAttribute(\"messege\", \""
                    + invocation.getArguments().get(0).getLabel()
                    + "\")";
                }
            }
        }
        return transformer.visit(action);
    }

    @Override
    protected String transformGuardExpression(String method, RGuard guard) {
        //return super.transformGuardExpression(method, guard);
        return transformer.visit(guard.getAction());
    }

}
