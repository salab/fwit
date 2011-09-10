package jp.ac.titech.cs.se.fwit.core.model.composite.visitor;

import java.util.Stack;

import jp.ac.titech.cs.se.fwit.core.model.Transition;
import jp.ac.titech.cs.se.fwit.core.model.composite.CLTS;
import jp.ac.titech.cs.se.fwit.core.model.composite.CState;
import jp.ac.titech.cs.se.fwit.core.model.composite.CTransition;

/**
 * Build a copy of a parsed CLTS
 * @author zenmyo
 *
 */
public class CopyCLTSVisitor extends CLTSElementsVisitorSupport<CLTS> {

    private final Stack<CState> stateStack = new Stack<CState>();

    private CState initialState;

    @Override
    protected void init(){
        this.initialState = null;
        this.stateStack.clear();
    }

    @Override
    protected Boolean visitCState(CState state) {
        if(initialState == null){
            initialState = new CState(state);
            this.result = new CLTS();
            this.result.setInitialState(initialState);
            this.result.addUnadoptedTransitions(((CLTS)state.getLts()).getUnadoptedTransitions());
            this.stateStack.push(initialState);
        }
        return true;
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
