package jp.ac.titech.cs.se.fwit.core.model.req;

import java.util.Set;

import jp.ac.titech.cs.se.fwit.core.model.Action;
import jp.ac.titech.cs.se.fwit.core.model.Domain;

public interface RAction extends Action {
	
	public static final String VOID_TYPE = "void";
	public static final String BOOLEAN_TYPE = "boolean";
	public static final String NULL_TYPE = "null";
	public static final String STRING_TYPE = "string";
	public static final String NUMBER_TYPE = "number";
	
	public Set<String> getDomainVariableNames();
	
	public void init(Domain domain);

}
