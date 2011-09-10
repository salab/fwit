package jp.ac.titech.cs.se.fwit.core.model.composite.visitor;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

import jp.ac.titech.cs.se.fwit.core.model.State;
import jp.ac.titech.cs.se.fwit.core.model.Transition;
import jp.ac.titech.cs.se.fwit.core.model.composite.CLTS;
import jp.ac.titech.cs.se.fwit.core.model.composite.CState;
import jp.ac.titech.cs.se.fwit.core.model.composite.CTransition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * sanitize (remove invalid sequences)
 * @author zenmyo
 *
 */
public class SanitizeCompositeLTSVisitor extends CLTSElementsVisitorSupport<CLTS>{

    public static Log logger = LogFactory.getLog(SanitizeCompositeLTSVisitor.class);

    private final Stack<CState> stateStack = new Stack<CState>();

    private CState initialState;

    @Override
    protected void init(){
        this.stateStack.clear();
        this.initialState = null;
    }

    @Override
    protected Boolean visitCState(CState state) {
        if(initialState == null){
            initialState = new CState(state);
            this.result = new CLTS();
            this.result.setInitialState(initialState);
            this.stateStack.push(initialState);
        }

        if(!state.isTerminal()){
            return true;
        }
        if(state.getRState().isTerminal()){
            return true;
        }
        final CState target = this.stateStack.peek();
        target.setDirty(true);
        return true;
    }

    @Override
    public  void endVisit(State state){
        if(state.isTerminal()){
            return;
        }
        final CState source = this.stateStack.peek();
        final Set<Transition> transitions = new HashSet<Transition>(source.getOutgoings());
        for(final Transition t:transitions){
            final CState target = (CState) t.getTarget();
            if(target.isDirty()){
                source.removeOutgoing(t);
            }
        }
        source.setDirty(source.getOutgoings().isEmpty());
    }

    @Override
    protected Boolean visitCTransition(CTransition transition) {
        final CState source = this.stateStack.peek();
        final CState target = new CState((CState) transition.getTarget());
        final CTransition newTransition = transition.getUnconnectedCopy();
        newTransition.setSource(source);
        newTransition.setTarget(target);
        this.stateStack.push(target);
        return true;
    }

    @Override
    public void endVisit(Transition transition){
        this.stateStack.pop();
    }

    @Override
    protected CLTS getResult() {
        result.init();
        return result;
    }
}
