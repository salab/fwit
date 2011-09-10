package jp.ac.titech.cs.se.fwit.core.model.fw.guard;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import jp.ac.titech.cs.se.fwit.core.logic.Disjunction;
import jp.ac.titech.cs.se.fwit.core.model.DomainVariable;
import jp.ac.titech.cs.se.fwit.core.model.DomainVariableSpace;
import jp.ac.titech.cs.se.fwit.core.model.fw.FGuard;
import jp.ac.titech.cs.se.fwit.core.model.req.Scenario;

/**
 * represents guards which be true for only one value
 * @author zenmyo
 *
 */
public class UniqueValueSatisfyingGuard extends NaiveGuard {

	private String uniqueValueVariableName = null;

	public static final String UNIQUENESS_GUARD_SUFFIX = "_uniquenss_of";

	public UniqueValueSatisfyingGuard(String name) {
		super(name);
	}

	@Override
	protected List<Disjunction> getSpecificConstraint(DomainVariableSpace domain) {
		// the constraints built by buildSpecificConstraint() can be checked by
		// checkAssignemnt(), and therefore, ignored for efficiency
		// return this.buildSpecificConstraint(domain);
		List<Disjunction> disjunctions = new ArrayList<Disjunction>();
		return disjunctions;
	}

	@Override
	protected Boolean checkAssignment(Scenario scenario, Boolean value) {
		if (!value) {
			return true;
		}
		DomainVariable newValue = scenario
				.getDomainVariable(this.uniqueValueVariableName);
		Set<Scenario> otherScenarios = this.assignments.keySet();
		for (Scenario otherScenario : otherScenarios) {
			if (this.assignments.get(otherScenario)) {
				DomainVariable otherValue = otherScenario
						.getDomainVariable(this.uniqueValueVariableName);
				if (!otherValue.equals(newValue)) {
					return false;
				}
			}
		}
		return true;
	}

	@Override
	public FGuard copyWithoutAssignment() {
		UniqueValueSatisfyingGuard newGuard = new UniqueValueSatisfyingGuard(
				name + numberOfCopies++);
		newGuard.addDomainVarialbeTypes(this.domainVariableTypes);
		newGuard.setUniqueValueVariableName(this.uniqueValueVariableName);
		newGuard.setOriginal(this);
		return newGuard;
	}

	public void setUniqueValueVariableName(String variable) {
		this.uniqueValueVariableName = variable;
	}
}
