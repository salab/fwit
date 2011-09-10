package jp.ac.titech.cs.se.fwit.core.model.composite;

import java.util.ArrayList;
import java.util.List;

import jp.ac.titech.cs.se.fwit.core.model.Transition;
import jp.ac.titech.cs.se.fwit.core.model.fw.FTransition;
import jp.ac.titech.cs.se.fwit.core.model.req.RTransition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class CTransition extends Transition {
    public static Log logger = LogFactory.getLog(CTransition.class);

    private final RTransition reqTransition;
    private final List<FTransition> fwTransitions; // a set of transitions including tau
    private FTransition fwTransition; // a transtion other than tau (should be one)

    public CTransition(RTransition rTransition){
        this.reqTransition = rTransition;
        this.fwTransitions = new ArrayList<FTransition>();
        this.fwTransition = null;
    }

    public String getRTransitionLabel(){
        return reqTransition.getRAction().getLabel();
    }

    public void addFTransition(FTransition fTransition){
        this.fwTransitions.add(fTransition);
        if(fTransition.isTau()){
            return;
        }
        if(this.fwTransition!=null){
            logger.warn("multiple un-tau transitions in one composite transition");
        }
        this.fwTransition = fTransition;
    }

    /**
     * get copy of this transition without the source, target, and the truth
     * assignment of the guard condition)
     */
    public CTransition getUnconnectedCopy() {
        final CTransition newTransition = new CTransition(reqTransition);
        for(final FTransition ft:this.fwTransitions){
            newTransition.addFTransition(ft);
        }
        return newTransition;
    }


    public RTransition getReqTransition() {
        return reqTransition;
    }

    public List<FTransition> getFwTransitions() {
        return fwTransitions;
    }

    public FTransition getFwTransition() {
        return fwTransition;
    }

    @Override
    public String toString() {
        final StringBuffer buf = new StringBuffer();
        buf.append(source.toString());
        buf.append("--");
        if(this.reqTransition.getGuard()!=null){
            buf.append("[");
            buf.append(this.reqTransition.getGuard().toString());
            buf.append("]");
        }

        buf.append(reqTransition.getAction().toString());
        buf.append("->");
        buf.append(target.toString());
        return buf.toString();
    }


}
