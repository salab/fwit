package jp.ac.titech.cs.se.fwit.core.derivation;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import jp.ac.titech.cs.se.fwit.core.logic.CNFCondition;
import jp.ac.titech.cs.se.fwit.core.model.SLTS;
import jp.ac.titech.cs.se.fwit.core.model.composite.CLTS;
import jp.ac.titech.cs.se.fwit.core.model.composite.visitor.DetectUsagesVisitor;
import jp.ac.titech.cs.se.fwit.core.model.composite.visitor.SanitizeCompositeLTSVisitor;
import jp.ac.titech.cs.se.fwit.core.model.fw.FLTS;
import jp.ac.titech.cs.se.fwit.core.model.fw.FState;
import jp.ac.titech.cs.se.fwit.core.model.fw.Framework;
import jp.ac.titech.cs.se.fwit.core.model.fw.FrameworkTemplate;
import jp.ac.titech.cs.se.fwit.core.model.fw.visitor.FLTSTransformationVisitor;
import jp.ac.titech.cs.se.fwit.core.model.fw.visitor.ResetFLTSVisitor;
import jp.ac.titech.cs.se.fwit.core.model.fw.visitor.ValidConditionSetupVisitor;
import jp.ac.titech.cs.se.fwit.core.model.req.RLTS;
import jp.ac.titech.cs.se.fwit.core.model.req.Scenario;
import jp.ac.titech.cs.se.fwit.core.model.req.visitor.BisimularLTSCompositionVisitor;
import jp.ac.titech.cs.se.fwit.core.util.RepeatedCombinationCounter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * UsageDeriver implements the main flow of the usage derivation algorithm
 * 
 * @author zenmyo
 * 
 */
public class UsageDeriver {

	public static Log logger = LogFactory.getLog(UsageDeriver.class);

	private Set<String> checkedAssumptionCodes = new HashSet<String>();

	// visitors
	private FLTSTransformationVisitor extractionVisitor = new FLTSTransformationVisitor();
	private ResetFLTSVisitor resetVisitor = new ResetFLTSVisitor();
	private ValidConditionSetupVisitor setupVisitor = new ValidConditionSetupVisitor();
	private BisimularLTSCompositionVisitor compositionVisitor = new BisimularLTSCompositionVisitor();
	private SanitizeCompositeLTSVisitor sanitizeVisitor = new SanitizeCompositeLTSVisitor();
	private DetectUsagesVisitor detectVisitor = new DetectUsagesVisitor();

	// for get statistics of derivation
	private int checked = 0;
	private int total = 0;
	private int consistent = 0;
	private int trivial = 0;
	private int redundant = 0;
	private int accepted = 0; // number of acceptable composition
	private int detected = 0;// number of detected usages from the acceptable compositions

	/**
	 * 
	 * @param req a requirements specification model in a set of RLTSs
	 * @param fw framework model to which the RLTSs are mapped
	 * @param metric metric name to select a usage when multiple usages are detected
	 * @return a template of the framework completion code for the requirements specification  
	 */
	public FrameworkTemplate getCustomizedTemplate(Collection<RLTS> req,
			Framework fw, String metric) {
		List<CLTS> usage = new ArrayList<CLTS>();
		for (RLTS rlts : req) {
			loggingScenarios("deriving usages for ", rlts.getScenarios());
			List<CLTS> usageCandidates = deriveUsages(rlts, fw);
			if (usageCandidates.isEmpty()) {
				logger.info("no usage is detected");
				return null;
			}
			usage.add(getPreferredUsage(usageCandidates, fw, metric));
		}

		FrameworkTemplate customizedFW = fw.buildTemplate();
		for (CLTS u : usage) {
			customizedFW = u.customizeFramework(customizedFW);
		}
		return customizedFW;
	}

	/**
	 * Derive usages (relation between a framework and a requirements
	 * specification)
	 * 
	 * @param req
	 *            a use case of a given requirements specification
	 * @param fw
	 *            a framework model to be used
	 * @return a recommended framework in CLTS
	 */
	public List<CLTS> deriveUsages(RLTS req, Framework fw) {
		reset();
		logger.info("requirement" + req);

		// transform branches with indefinite numbers of choices
		extractionVisitor.setRLTS(req);
		FLTS extFlts = extractionVisitor.parse(fw.getFLTS().getInitialState());

		// initialize assumption (relation between termination states)
		Integer scenarioSize = req.getTerminationStates().size();
		Integer numOfFWTermStates = extFlts.getTerminationStates().size();

		RepeatedCombinationCounter counter = new RepeatedCombinationCounter(
				numOfFWTermStates, scenarioSize);

		List<Scenario> scenarios = req.getScenarios();
		List<CLTS> customizations = new ArrayList<CLTS>();

		setupVisitor.setDomainVariableSpace(req.getDomainVariableSpace());
		while (counter.hasNext()) {
			Integer[] assumption = counter.next();
			total++;

			// reset previous assumptions
			resetVisitor.parse(extFlts.getInitialState());

			// making assumption
			for (int i = 0; i < scenarioSize; i++) {
				FState fTermState = (FState) extFlts.getTerminationStates()
						.get(assumption[i]);
				fTermState.addAssumedScenario(scenarios.get(i));
			}
			loggingSLTS("assumption ", extFlts);

			if (!checkControlStructureConsistentcy(req, extFlts)) {
				continue;
			}
			loggingSLTS("valid assumption", extFlts);

			CLTS clts = composeLTSs(req, extFlts);
			loggingSLTS("sanitizing ", clts);

			CLTS sanitizedClts = sanitizeVisitor.parse(clts.getInitialState());
			loggingSLTS("sanitized to ", sanitizedClts);

			if (!sanitizedClts.acceptAllScenario(scenarios)) {
				continue;
			}
			accepted++;

			List<CLTS> usages = detectVisitor.parse(sanitizedClts
					.getInitialState());

			for (CLTS usage : usages) {
				loggingSLTS("sanitizing detected ", usage);

				CLTS sanitizedUsage = sanitizeVisitor.parse(usage
						.getInitialState());

				if (sanitizedUsage.acceptAllScenario(scenarios)) {
					detected++;
					customizations.add(sanitizedUsage);
				}
			}
		}
		logger.info("total = " + total + ", trivial = " + trivial
				+ ", redundant = " + redundant + ", checked = " + checked
				+ ", consistent = " + consistent + ", accepted = " + accepted
				+ ", detected = " + detected);
		return customizations;
	}

	private Boolean checkControlStructureConsistentcy(RLTS req, FLTS fw) {
		CNFCondition condition = setupVisitor.parse(fw.getInitialState());
		if (condition == null) {
			logger.debug("trivial contradiction found");
			trivial++;
			return false;
		}
		String treeCode = ((FState) fw.getInitialState()).getSubtreeCode();
		if (checkedAssumptionCodes.contains(treeCode)) {
			logger.debug("assumption is already checked");
			redundant++;
			return false;
		}

		checkedAssumptionCodes.add(treeCode);
		checked++;
		if (condition.isConsistent()) {
			consistent++;
			return true;
		}
		return false;
	}

	private CLTS composeLTSs(RLTS req, FLTS extFlts) {
		compositionVisitor.setFLTS(extFlts);
		return compositionVisitor.parse(req.getInitialState());
	}

	public void reset() {
		checked = 0;
		total = 0;
		consistent = 0;
		trivial = 0;
		redundant = 0;
		accepted = 0;
		detected = 0;
		checkedAssumptionCodes.clear();
	}

	public static CLTS getPreferredUsage(List<CLTS> usageCandidates,
			Framework fw, String metric) {
		CLTS preferredUsage = null;
		Map<String, Double> preferredUsageValues = null;
		Double minValue = null;

		FrameworkTemplate customization = fw.buildTemplate();
		for (CLTS usage : usageCandidates) {
			customization.reset();
			Map<String, Double> metricValues = usage.customizeFramework(
					customization).getMetricValues();
			Double value = metricValues.get(metric);
			if (minValue == null || value < minValue) {
				preferredUsage = usage;
				preferredUsageValues = metricValues;
				minValue = value;
			}
			if (logger.isDebugEnabled()) {
				logger.debug(metricValues + " , prefered "
						+ preferredUsageValues);
				logger.debug(usage);
			}
		}
		return preferredUsage;
	}

	private void loggingScenarios(String message, Collection<Scenario> scenarios) {
		if (logger.isDebugEnabled()) {
			logger.debug(message);
			for (Scenario s : scenarios) {
				logger.debug(s);
			}
		}
	}

	private void loggingSLTS(String message, SLTS slts) {
		if (logger.isDebugEnabled()) {
			logger.debug(message);
			logger.debug(slts);
		}
	}
}
