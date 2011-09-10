package jp.ac.titech.cs.se.fwit.core.model.fw;

import java.util.Map;
import java.util.Set;

/**
 * This class represents a template customized based on a derived usage
 * @author zenmyo
 *
 */
public interface FrameworkTemplate {
	
	public void init();
	
	public void reset();
	
	/**
	 * @return a set of metric name which evaluate usages of the framework
	 */
	public Set<String> getMetrics();
	
	/**
	 * (metric should be low-better)
	 * @return a map from metric name to metric value
	 */
	public Map<String,Double> getMetricValues();
	
	/**
	 * output the customized template
	 * @param projectDir the path to the directory where the codes are output
	 */
	public void printCustomizedTemplate(String projectDir);
}
