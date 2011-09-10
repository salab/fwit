package jp.ac.titech.cs.se.fwit.core.model.composite.visitor;

import java.util.List;

import jp.ac.titech.cs.se.fwit.core.model.composite.CTransition;
import jp.ac.titech.cs.se.fwit.core.model.fw.FTransition;
import jp.ac.titech.cs.se.fwit.core.model.fw.FrameworkTemplate;

/**
 * ApplyCustomizationVisitor applies customize operations to framework templates.
 * @author zenmyo
 *
 */
public class ApplyCustomizationVisitor extends
		CLTSElementsVisitorSupport<FrameworkTemplate> {

	public void setTemplate(FrameworkTemplate fw) {
		this.result = fw;
	}

	@Override
	protected Boolean visitCTransition(CTransition transition) {
		List<FTransition> fTransitions = transition.getFwTransitions();
		for (FTransition ft : fTransitions) {
			result = ft.getFAction()
					.applyCustomizeOperation(result, transition);
		}
		return true;
	}
	
	@Override
	public FrameworkTemplate getResult(){
		this.result.init();
		return this.result;
	}
}
