package jp.ac.titech.cs.se.fwit.core.model.fw.visitor;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import jp.ac.titech.cs.se.fwit.core.model.Transition;
import jp.ac.titech.cs.se.fwit.core.model.composite.CState;
import jp.ac.titech.cs.se.fwit.core.model.composite.CTransition;
import jp.ac.titech.cs.se.fwit.core.model.fw.FAction;
import jp.ac.titech.cs.se.fwit.core.model.fw.FGuard;
import jp.ac.titech.cs.se.fwit.core.model.fw.FState;
import jp.ac.titech.cs.se.fwit.core.model.fw.FTransition;
import jp.ac.titech.cs.se.fwit.core.model.req.RState;
import jp.ac.titech.cs.se.fwit.core.model.req.RTransition;
import jp.ac.titech.cs.se.fwit.core.model.req.Scenario;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * find transitions bisimular to a specified transitions and return their compositions.
 * @author zenmyo
 *
 */
public class BisimularTransitionCompositionVisitor extends
FLTSElementsVisitorSupport<Set<CState>> {

    public static Log logger = LogFactory.getLog(BisimularTransitionCompositionVisitor.class);

    private RTransition reqTransition;

    private RState rTarget;

    private final List<FTransition> fwTransitions = new ArrayList<FTransition>();

    private CState source;

    public void setSource(CState source){
        this.source = source;
    }

    public void setReqTransition(RTransition reqTransition) {
        this.reqTransition = reqTransition;
    }

    @Override
    protected void init() {
        this.rTarget = (RState) reqTransition.getTarget();
        this.fwTransitions.clear();
        this.result = new HashSet<CState>();
    }

    @Override
    protected Boolean visitFTransition(FTransition transition) {

        if (!transition.isTransible(rTarget.getPassingScenarios())) {
            return false;
        }

        if (!checkEvaluators(transition)) {
            return false;
        }

        if (transition.isTau()) {
            fwTransitions.add(transition);
            return true;
        }

        if (((FAction) transition.getAction())
                .match(reqTransition.getRAction())) {
            final CTransition newTransition = new CTransition(reqTransition);
            newTransition.setSource(source);
            for (final FTransition ft : fwTransitions) {
                newTransition.addFTransition(ft);
            }
            newTransition.addFTransition(transition);
            final CState target = new CState((RState) reqTransition.getTarget(),
                    (FState) transition.getTarget());
            newTransition.setTarget(target);
            result.add(target);
        }else{
            if(logger.isDebugEnabled()){
                logger.debug(transition.getAction() + " and " + reqTransition.getAction() +" don't match");
            }
        }

        if(logger.isDebugEnabled()){
            logger.debug(transition.getAction() + " does not match with "
                    + reqTransition.getAction().getClass() + " : " + reqTransition);
        }
        return false;
    }

    private boolean checkEvaluators(FTransition transition) {
        final Set<FGuard> fGuards = transition.getEvaluatedGuards();
        if (fGuards.isEmpty()) {
            return true;
        }

        for (final FGuard fg : fGuards) {
            final Set<Scenario> scenarios = fg.getAssignments().keySet();
            for (final Scenario s : scenarios) {
                if (fg.getAssignment(s)) {
                    final List<RTransition> ts = s.getTransitions();
                    for (final Transition t : ts) {
                        if (t.getAction().equals(reqTransition.getAction())) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override
    public void endVisit(Transition transition) {
        this.fwTransitions.remove(transition);
    }
}
