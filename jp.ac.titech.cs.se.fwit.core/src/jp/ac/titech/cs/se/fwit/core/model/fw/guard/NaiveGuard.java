package jp.ac.titech.cs.se.fwit.core.model.fw.guard;

import java.util.ArrayList;
import java.util.List;

import jp.ac.titech.cs.se.fwit.core.logic.Disjunction;
import jp.ac.titech.cs.se.fwit.core.model.DomainVariableSpace;
import jp.ac.titech.cs.se.fwit.core.model.fw.FGuard;
import jp.ac.titech.cs.se.fwit.core.model.req.Scenario;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class NaiveGuard extends FGuardSupport{
	
	public static Log logger = LogFactory.getLog(NaiveGuard.class);
	
	public NaiveGuard(String name) {
		super(name);
	}

	public FGuard copyWithoutAssignment() {
		FGuard newGuard = new NaiveGuard(name + numberOfCopies++);
		newGuard.addDomainVarialbeTypes(this.domainVariableTypes);
		newGuard.setOriginal(this);
		return newGuard;
	}
	
	@Override
	protected List<Disjunction> getSpecificConstraint(DomainVariableSpace domain) {
		return new ArrayList<Disjunction>();
	}

	@Override
	protected Boolean checkAssignment(Scenario scenario, Boolean value) {
		return true;
	}
}
