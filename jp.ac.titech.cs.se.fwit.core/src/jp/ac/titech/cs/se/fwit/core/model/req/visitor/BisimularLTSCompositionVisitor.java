package jp.ac.titech.cs.se.fwit.core.model.req.visitor;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

import jp.ac.titech.cs.se.fwit.core.model.Transition;
import jp.ac.titech.cs.se.fwit.core.model.composite.CLTS;
import jp.ac.titech.cs.se.fwit.core.model.composite.CState;
import jp.ac.titech.cs.se.fwit.core.model.fw.FLTS;
import jp.ac.titech.cs.se.fwit.core.model.fw.FState;
import jp.ac.titech.cs.se.fwit.core.model.fw.visitor.BisimularTransitionCompositionVisitor;
import jp.ac.titech.cs.se.fwit.core.model.req.RState;
import jp.ac.titech.cs.se.fwit.core.model.req.RTransition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class BisimularLTSCompositionVisitor extends
RLTSElementsVisitorSupport<CLTS> {

    public static Log logger = LogFactory
    .getLog(BisimularLTSCompositionVisitor.class);

    private FLTS flts;

    private CState initialState;

    private final Stack<Set<CState>> sourceStateStack = new Stack<Set<CState>>();

    private final BisimularTransitionCompositionVisitor visitor = new BisimularTransitionCompositionVisitor();

    public void setFLTS(FLTS flts) {
        this.flts = flts;
    }

    @Override
    protected void init() {
        this.sourceStateStack.clear();
        this.initialState = null;
    }

    @Override
    protected Boolean visitRState(RState state) {
        if (this.initialState == null) {
            initialState = new CState(state,
                    (FState) flts.getInitialState());
            this.result = new CLTS();
            this.result.setInitialState(initialState);
            final Set<CState> source = new HashSet<CState>();
            source.add(initialState);
            this.sourceStateStack.push(source);
        }
        return true;
    }

    @Override
    protected Boolean visitRTransition(RTransition transition) {
        final Set<CState> sources = this.sourceStateStack.peek();
        final Set<CState> targets = new HashSet<CState>();

        for (final CState source : sources) {
            visitor.setSource(source);
            visitor.setReqTransition(transition);
            targets.addAll(visitor.parse(source.getFState()));
        }
        if (targets.isEmpty()) {
            return false;
        }
        this.sourceStateStack.push(targets);
        return true;
    }

    @Override
    public void endVisit(Transition transition) {
        this.sourceStateStack.pop();
    }
}
