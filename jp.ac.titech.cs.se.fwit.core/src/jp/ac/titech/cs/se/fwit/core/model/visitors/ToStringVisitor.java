package jp.ac.titech.cs.se.fwit.core.model.visitors;

import jp.ac.titech.cs.se.fwit.core.model.Transition;

public class ToStringVisitor extends SLTSElementsVisitorSupport<String> {
	
	private StringBuffer buf;
	
	private int indent;
	
	protected void init(){
		buf = new StringBuffer();
		buf.append(System.getProperty("line.separator"));
		indent = 0;
	}

	@Override
	protected Boolean visitTransition(Transition transition) {
		for(int i=0;i<indent;i++){
			buf.append(" ");
		}
		buf.append(transition.toString());
		buf.append(System.getProperty("line.separator"));
		indent++;
		return true;
	}
	
	@Override
	public void endVisit(Transition transition){
		indent--;
	}

	@Override
	protected String getResult(){
		return buf.toString();
	}


}
