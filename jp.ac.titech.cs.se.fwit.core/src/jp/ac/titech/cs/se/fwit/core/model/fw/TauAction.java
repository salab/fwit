package jp.ac.titech.cs.se.fwit.core.model.fw;

import jp.ac.titech.cs.se.fwit.core.model.req.RAction;

public class TauAction extends FActionSupport {
	
	public TauAction(){
		this.label = "tau";
	}

	@Override
	public Boolean match(RAction reqAction) {
		return false;
	}

}
