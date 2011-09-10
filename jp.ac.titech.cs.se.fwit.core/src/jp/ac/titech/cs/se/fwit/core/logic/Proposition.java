package jp.ac.titech.cs.se.fwit.core.logic;

public interface Proposition {

	/**
	 * @return proposition name without prefix (!)
	 */
	public abstract String getBaseName();

	/**
	 * 
	 * @return value of this proposition
	 */
	public abstract Boolean getValue();

}