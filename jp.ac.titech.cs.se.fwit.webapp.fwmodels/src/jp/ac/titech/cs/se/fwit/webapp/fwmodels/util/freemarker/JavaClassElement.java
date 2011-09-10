package jp.ac.titech.cs.se.fwit.webapp.fwmodels.util.freemarker;

import java.util.ArrayList;
import java.util.List;

import freemarker.template.utility.StringUtil;

public class JavaClassElement extends ClassElement {

	@Override
	protected void postBuildStatements() {
		for (String var : fields.keySet()) {
			List<String> statements = new ArrayList<String>();
			statements.add("return "+var+";");
			methodStatements.put(configureGetter(var, fields.get(var)), statements);
			statements = new ArrayList<String>();
			statements.add("this."+var +" = " + var+";");
			methodStatements.put(configureSetter(var, fields.get(var)), statements);
		}
	}

	private String configureGetter(String var, String type) {
		String methodName = "get"+StringUtil.capitalize(var);
		methodTypes.put(methodName, type);
		methodArguments.put(methodName, "");
		return methodName;
	}

	private String configureSetter(String var, String type) {
		String methodName = "set"+StringUtil.capitalize(var);
		methodTypes.put(methodName, "void");
		methodArguments.put(methodName, type+" "+var);
		return methodName;
	}

	@Override
	protected String toCloseBlockLine(String indent) {
		return indent+"}";
	}

	@Override
	protected String toElseIfStatementLine(String indent, String guardExpression) {
		return indent + "} else if(" + guardExpression+ "){";
	}

	@Override
	protected String toIfStatementLine(String indent, String guardExpression) {
		return indent + "if(" + guardExpression + "){";
	}

	
}