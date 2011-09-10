package jp.ac.titech.cs.se.fwit.core.model;

import jp.ac.titech.cs.se.fwit.core.model.visitors.SLTSElementsVisitor;

public interface SLTSElement {

	/**
	 * @param visitor
	 */
	public void accept(SLTSElementsVisitor visitor);
}
