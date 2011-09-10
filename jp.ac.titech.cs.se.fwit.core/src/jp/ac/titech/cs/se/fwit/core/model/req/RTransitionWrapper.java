package jp.ac.titech.cs.se.fwit.core.model.req;

import java.util.HashSet;
import java.util.Set;

import jp.ac.titech.cs.se.fwit.core.model.req.action.AbstractStatementAction;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * a wrapper class which provides methods to access information needed in customization
 * @author zenmyo
 *
 */
public class RTransitionWrapper {
	public static Log logger = LogFactory.getLog(RTransitionWrapper.class);
	private RTransition transition;
	
	public RTransitionWrapper(RTransition transition){
		this.transition = transition;
	}
	
	public Set<String> getDomainVariableValues(String variableName){
		Set<String> values = new HashSet<String>();
		Set<Scenario> scenarios = ((RState)transition.getTarget()).getPassingScenarios();
		for (Scenario s:scenarios){
			values.add(s.getDomainVariable(variableName).getValue());
		}
		return values;
	}
	
	public String getSingletonDomainVariableValue(String variableName){
		Set<String> values = getDomainVariableValues(variableName);
		if (values.size() != 1) {
			logger.warn("multiple values in a function " + values);
		}
		return (String) values.toArray()[0];
	}
	
	public AbstractStatementAction getStatement(){
		assert(transition.getAction() instanceof AbstractStatementAction);
		return (AbstractStatementAction)transition.getAction();
	}
	
	public String getGuardExpression(){
		RGuard guard =transition.getRGuard();
		if(guard == null){
			return null;
		}
		return guard.getExpression();
	}
	
	public RTransition getTransition(){
		return this.transition;
	}
}
