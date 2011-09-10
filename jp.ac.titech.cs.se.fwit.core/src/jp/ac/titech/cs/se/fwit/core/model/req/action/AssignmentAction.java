package jp.ac.titech.cs.se.fwit.core.model.req.action;

import java.util.HashSet;
import java.util.Set;

import jp.ac.titech.cs.se.fwit.core.model.Domain;
import jp.ac.titech.cs.se.fwit.core.model.req.RAction;

public class AssignmentAction extends RActionSupport {

    private final String operator;
    private final VariableAction assignee;
    private final RAction assignedAction;

    public AssignmentAction(String operator,  VariableAction assignee, RAction assignedAction){
        this.operator = operator.toString();
        this.assignee = assignee;
        this.assignedAction = assignedAction;
        this.assignee.addDomainVariableNames(assignedAction.getDomainVariableNames());
    }

    @Override
    public String getLabel(){
        return this.assignee.toString()+this.operator+this.assignedAction.getLabel();
    }

    public String getOperator() {
        return operator;
    }

    public VariableAction getAssignee(){
        return assignee;
    }

    public RAction getAssignedAction() {
        return assignedAction;
    }

    @Override
    public String getType() {
        return RAction.VOID_TYPE;
    }

    @Override
    public Set<String> getDomainVariableNames() {
        return new HashSet<String>();
    }

    @Override
    protected void initDomainVariableNames(Domain domain) {
        domainVariables.addAll(assignedAction.getDomainVariableNames());
    }
}
