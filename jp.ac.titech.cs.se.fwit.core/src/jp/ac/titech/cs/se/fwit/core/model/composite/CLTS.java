package jp.ac.titech.cs.se.fwit.core.model.composite;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import jp.ac.titech.cs.se.fwit.core.model.SLTS;
import jp.ac.titech.cs.se.fwit.core.model.State;
import jp.ac.titech.cs.se.fwit.core.model.composite.visitor.ApplyCustomizationVisitor;
import jp.ac.titech.cs.se.fwit.core.model.fw.FrameworkTemplate;
import jp.ac.titech.cs.se.fwit.core.model.req.RState;
import jp.ac.titech.cs.se.fwit.core.model.req.Scenario;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class CLTS extends SLTS {

	public static Log logger = LogFactory.getLog(CLTS.class);

	private Set<CTransition> unadoptedTransitions = new HashSet<CTransition>();
	
	/**
	 * for usage detection // TODO refactor together with DetectUsageVisitor
	 * 
	 * @param transitions
	 */
	public void addUnadoptedTransitions(Set<CTransition> transitions) {
		this.unadoptedTransitions.addAll(transitions);
	}

	public Boolean canAdapt(CState source, CState target) {
		for (CTransition t : this.unadoptedTransitions) {
			if (source.isSame(t.getSource()) && target.isSame(t.getTarget())) {
				return false;
			}
		}
		return true;
	}

	public Boolean acceptAllScenario(Collection<Scenario> scenarios) {
		Set<RState> samples = new HashSet<RState>();
		for (Scenario scenario : scenarios) {
			samples.add((RState) scenario.getTerminationState());
		}

		for (State state : terminationStates) {
			RState rs = ((CState) state).getRState();
			if (samples.contains(rs)) {
				samples.remove(rs);
			}
		}
		return samples.isEmpty();
	}

	public Set<CTransition> getUnadoptedTransitions() {
		return unadoptedTransitions;
	}

	public FrameworkTemplate customizeFramework(FrameworkTemplate template) {
		ApplyCustomizationVisitor customizationVisitor = new ApplyCustomizationVisitor();
		customizationVisitor.setTemplate(template);
		return customizationVisitor.parse(this.initialState);
	}
}
