package jp.ac.titech.cs.se.fwit.core.model.composite.visitor;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Stack;

import jp.ac.titech.cs.se.fwit.core.model.Transition;
import jp.ac.titech.cs.se.fwit.core.model.composite.CLTS;
import jp.ac.titech.cs.se.fwit.core.model.composite.CState;
import jp.ac.titech.cs.se.fwit.core.model.composite.CTransition;
import jp.ac.titech.cs.se.fwit.core.model.req.RTransition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Detect usages from a CLTS by separating branches with tau transitions.
 * @author zenmyo
 *
 */
public class DetectUsagesVisitor extends CLTSElementsVisitorSupport<List<CLTS>> {

    public static Log logger = LogFactory.getLog(DetectUsagesVisitor.class);

    private final CopyCLTSVisitor copyVisitor = new CopyCLTSVisitor();

    private final FindSameStateVisitor findVisitor = new FindSameStateVisitor();

    private final Stack<Set<CState>> stateStack = new Stack<Set<CState>>();

    @Override
    protected void init() {
        result = new ArrayList<CLTS>();
        stateStack.clear();
    }

    @Override
    protected Boolean visitCState(CState state) {
        if (result.isEmpty()) {
            final CLTS clts = new CLTS();
            final CState initial = new CState(state);
            clts.setInitialState(initial);
            result.add(clts);
            final Set<CState> initialSet = new HashSet<CState>();
            initialSet.add(initial);
            stateStack.push(initialSet);
        }
        return true;
    }

    @Override
    protected Boolean visitCTransition(CTransition transition) {
        Set<CState> sources = this.stateStack.peek();
        final Set<CTransition> otherChoices = getOtherChoices(transition);

        if (!otherChoices.isEmpty()) {
            final Set<CState> alternateSources = new HashSet<CState>();
            for (final CState source : sources) {
                copyVisitor.parse(source.getInitialState());
                final CLTS clts = copyVisitor.getResult();
                result.add(clts);

                findVisitor.setGoal(source);
                final CState alternateSource = findVisitor.parse(clts
                        .getInitialState());
                clts.addUnadoptedTransitions(otherChoices);

                // if null the copy is inconsistent of this choice
                if (alternateSource != null) {
                    alternateSources.add(alternateSource);
                }
            }
            sources = alternateSources;
        }
        final Set<CState> targets = new HashSet<CState>();
        for (final CState source : sources) {
            if (source.isSame(transition.getSource())) {
                final CState target = new CState((CState) transition.getTarget());
                final CLTS lts = (CLTS) source.getLts();
                if (lts.canAdapt(source, target)) {
                    final CTransition newTransition = transition.getUnconnectedCopy();
                    newTransition.setSource(source);
                    newTransition.setTarget(target);
                    targets.add(target);
                }
            }
        }
        this.stateStack.push(targets);
        return true;
    }

    @Override
    public void endVisit(Transition transition) {
        final CTransition ct = (CTransition) transition;
        if (!getOtherChoices(ct).isEmpty()) {
            final Set<CState> alternateTargets = this.stateStack.pop();
            final Set<CState> alternateSources = new HashSet<CState>();
            for (final CState target : alternateTargets) {
                alternateSources.add((CState) target.getIncoming().getSource());
            }
            alternateSources.addAll(this.stateStack.pop());
            this.stateStack.push(alternateSources);
        } else {
            this.stateStack.pop();
        }
    }

    private Set<CTransition> getOtherChoices(CTransition transition) {
        final RTransition rt = transition.getReqTransition();
        final List<Transition> brothers = transition.getSource().getOutgoings();
        final Set<CTransition> otherChoices = new HashSet<CTransition>();
        for (final Transition brother : brothers) {
            if (brother.equals(transition)) {
                continue;
            }
            final CTransition ct = (CTransition) brother;
            if (rt.equals(ct.getReqTransition())) {
                otherChoices.add(ct);
            }
        }
        return otherChoices;
    }
}
