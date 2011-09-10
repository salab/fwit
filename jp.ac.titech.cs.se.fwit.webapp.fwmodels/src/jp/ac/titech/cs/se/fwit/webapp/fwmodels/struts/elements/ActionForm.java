package jp.ac.titech.cs.se.fwit.webapp.fwmodels.struts.elements;

import java.util.List;

import jp.ac.titech.cs.se.fwit.core.model.req.action.MethodInvocationAction;
import jp.ac.titech.cs.se.fwit.core.model.req.action.StatementAction;
import jp.ac.titech.cs.se.fwit.webapp.fwmodels.HTML;
import jp.ac.titech.cs.se.fwit.webapp.fwmodels.util.freemarker.JavaClassElement;

public class ActionForm extends JavaClassElement {

    public static final String VALIDATE_METHOD = "validate";

    public ActionForm(String name) {
        put("name", name);
        put("className", name.substring(0, 1).toUpperCase() + name.substring(1));
        methodTypes.put(VALIDATE_METHOD, "ActionErrors");
        methodArguments.put(VALIDATE_METHOD,
        "ActionMapping mapping, HttpServletRequest request");
    }

    @Override
    protected void postBuildStatements() {
        super.postBuildStatements();
        if (!methodStatements.containsKey(VALIDATE_METHOD)) {
            return;
        }
        final List<String> validateStatements = methodStatements.get(VALIDATE_METHOD);
        validateStatements.add(0,
        "ActionErrors errors = super.validate(mapping,request);");
        validateStatements.add("return errors;");

    }

    @Override
    protected String transformStatementAction(String method,
            StatementAction action) {

        final MethodInvocationAction methodAction = (MethodInvocationAction) action
        .getActions().get(0);
        if (HTML.messageMethods.contains(methodAction.getMethodName())) {
            final StringBuffer buf = new StringBuffer();
            buf.append("errors.add(\"form error\", new ActionMessage(\"");
            buf.append(methodAction.getArguments().get(0).getLabel());
            buf.append("\"))");
            return buf.toString();
        }
        return super.transformStatementAction(method, action);
    }
}
