package jp.ac.titech.cs.se.fwit.core.model.fw;

import jp.ac.titech.cs.se.fwit.core.model.Action;
import jp.ac.titech.cs.se.fwit.core.model.composite.CTransition;
import jp.ac.titech.cs.se.fwit.core.model.req.RAction;

public interface FAction extends Action {

	/**
	 * check whether the action can be mapped from an specified action in a RLTS
	 * @param reqAction
	 * @return
	 */
	public Boolean match(RAction reqAction);

	/**
	 * apply customize operations associated with this action
	 * @param fw framework template to which the customize operation is applied 
	 * @param transition mapping between transitions of a RLTS and a FLTS which determine content of the customize operation
	 * @return a framework template to which the customize operation applied. 
	 */
	public FrameworkTemplate applyCustomizeOperation(FrameworkTemplate fw, CTransition transition);
}


