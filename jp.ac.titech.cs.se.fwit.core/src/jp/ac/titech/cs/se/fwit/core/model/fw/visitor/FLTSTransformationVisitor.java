package jp.ac.titech.cs.se.fwit.core.model.fw.visitor;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

import jp.ac.titech.cs.se.fwit.core.FatalFwitterException;
import jp.ac.titech.cs.se.fwit.core.model.Transition;
import jp.ac.titech.cs.se.fwit.core.model.fw.FAction;
import jp.ac.titech.cs.se.fwit.core.model.fw.FGuard;
import jp.ac.titech.cs.se.fwit.core.model.fw.FLTS;
import jp.ac.titech.cs.se.fwit.core.model.fw.FState;
import jp.ac.titech.cs.se.fwit.core.model.fw.FTransition;
import jp.ac.titech.cs.se.fwit.core.model.req.RLTS;

/**
 * fix the number of branches of FLTS
 * @author zenmyo
 *
 */
public class FLTSTransformationVisitor extends FLTSElementsVisitorSupport<FLTS> {

    private RLTS rlts;

    private Stack<Set<FState>> statesStack;

    private FState initialState;

    public void setRLTS(RLTS requirement) {
        this.rlts = requirement;
    }

    @Override
    protected void init() {
        this.statesStack = new Stack<Set<FState>>();
        this.initialState = null;
    }

    @Override
    protected Boolean visitFState(FState state) {
        if(initialState == null){
            initialState = new FState(state.getName());
            result = new FLTS();
            result.setInitialState(initialState);
            final Set<FState> states = new HashSet<FState>();
            states.add(initialState);
            statesStack.push(states);
        }
        return true;
    }

    @Override
    protected Boolean visitFTransition(FTransition transition) {
        final Set<FState> sources = statesStack.pop();
        final Set<FState> targets = new HashSet<FState>();
        final FGuard originalGuard = (FGuard) transition.getGuard();

        final Integer size = this.getPolymorphicSize(transition);
        int suffix = 0;
        for (final FState source : sources) {
            if (transition.isPolymorphic()) {
                for (int i = 0; i < size; i++) {
                    final FTransition newTransition = transition
                    .getUnconnectedCopy();
                    newTransition.setSource(source);
                    newTransition.setGuardEvaluator(getEvaluator(originalGuard,source));
                    final FState target = new FState(transition.getTarget().getName()
                            + suffix++);
                    newTransition.setTarget(target);
                    targets.add(target);
                }
            } else {
                final FTransition newTransition = transition.getUnconnectedCopy();
                newTransition.setGuardEvaluator(getEvaluator(originalGuard,source));
                newTransition.setSource(source);
                if (transition.isSelfLoop()) {
                    newTransition.setTarget(source);
                } else {
                    final FState target = new FState(transition.getTarget().getName()+suffix++);
                    newTransition.setTarget(target);
                    targets.add(target);
                }
            }
        }
        statesStack.push(sources);
        statesStack.push(targets);
        return true;
    }

    private Integer getPolymorphicSize(FTransition transition) {
        final Set<String> keys = transition.getPolymorphicKey();
        final Map<String, Integer> variableSizes = rlts.getDomainVariableSpace().sizes();
        Integer size = 1;
        for (final String key : keys) {
            size = size * variableSizes.get(key);
        }
        return size;
    }

    private FTransition getEvaluator(FGuard originalGuard, FState preEvaluation){
        if(originalGuard == null || originalGuard.getEvaluator() == null){
            return null;
        }
        FState pastState = preEvaluation;
        while(pastState != null){
            final List<Transition> outgoings = pastState.getOutgoings();
            for(final Transition t:outgoings){
                final FTransition transition = (FTransition)t;
                final FAction pastAction = transition.getFAction();
                if(pastAction != null){
                    if(originalGuard.getEvaluator().getFAction().equals(pastAction)){
                        return transition;
                    }
                }
            }
            if(pastState.getIncoming()!=null){
                pastState = (FState) pastState.getIncoming().getSource();
            }else{
                pastState = null;
            }
        }
        throw new FatalFwitterException("evaluator transition not found");
    }

    @Override
    public void endVisit(Transition transition) {
        statesStack.pop();
    }

    @Override
    protected FLTS getResult() {
        result.init();
        return result;
    }
}
