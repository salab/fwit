package jp.ac.titech.cs.se.fwit.webapp.fwmodels.util.freemarker;


public class RubyClassElement extends ClassElement {

	@Override
	protected String toCloseBlockLine(String indent) {
		return indent+"end";
	}

	@Override
	protected String toElseIfStatementLine(String indent, String guardExpression) {
		return indent + "elsif " + guardExpression;
	}

	@Override
	protected String toIfStatementLine(String indent, String guardExpression) {
		return indent + "if " + guardExpression;
	}

	
}