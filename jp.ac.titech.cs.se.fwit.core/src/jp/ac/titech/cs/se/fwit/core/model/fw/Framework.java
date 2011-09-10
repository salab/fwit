package jp.ac.titech.cs.se.fwit.core.model.fw;

import jp.ac.titech.cs.se.fwit.core.model.Domain;

public interface Framework extends Domain {
	
	/**
	 * 
	 * @return framework template before customization
	 */
	public FrameworkTemplate buildTemplate();
	
	/**
	 * @return the behavioral model of the framework
	 */
	public FLTS getFLTS();
	
	/**
	 * @return the default metric name 
	 */
	public String recommendedMetric();


}
