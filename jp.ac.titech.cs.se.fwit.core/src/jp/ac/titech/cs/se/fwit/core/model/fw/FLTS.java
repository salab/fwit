package jp.ac.titech.cs.se.fwit.core.model.fw;

import jp.ac.titech.cs.se.fwit.core.model.SLTS;

public class FLTS extends SLTS{
	
	public FTransition buildTransition(FState initialState, FState dst, FAction action, FGuard guard){
		FTransition req = new FTransition();
		req.setAction(action);
		req.setGuard(guard);
		req.setSource(initialState);
		req.setTarget(dst);
		return req;
	}
}
