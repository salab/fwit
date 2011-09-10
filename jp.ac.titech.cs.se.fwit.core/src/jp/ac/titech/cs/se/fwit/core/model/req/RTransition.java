package jp.ac.titech.cs.se.fwit.core.model.req;

import jp.ac.titech.cs.se.fwit.core.FatalFwitterException;
import jp.ac.titech.cs.se.fwit.core.model.State;
import jp.ac.titech.cs.se.fwit.core.model.Transition;
import jp.ac.titech.cs.se.fwit.core.model.req.action.AbstractStatementAction;
import jp.ac.titech.cs.se.fwit.core.model.req.guard.AndGuard;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class RTransition extends Transition {
	public static Log logger = LogFactory.getLog(RTransition.class);

	public RTransition(RState source, RState target, RGuard guard, RAction action) {
		this.setSource(source);
		this.setTarget(target);
		this.setGuard(guard);
		this.setAction(action);
	}

	public void addGuard(RGuard guard) {
		if (guard == null) {
			return;
		}
		this.guard = new AndGuard((RGuard) this.guard, guard);
	}

	public void setSupplemental(boolean b) {
		this.supplemental = true;
	}

	public Boolean isSupplemental() {
		return this.supplemental;
	}

	public void destroySequence() {
		RTransition t = this;
		Boolean deletable = this.supplemental;
		while (t != null) {
			if (!deletable) {
				if (logger.isErrorEnabled()) {
					StringBuffer buf = new StringBuffer();
					buf.append("inconsistent control structure around ");
					buf.append(this);
					logger.error(buf.toString());
					throw new FatalFwitterException(buf.toString());
				}
			}
			State src = t.getSource();
			if (src.getOutgoings().size() > 1) {
				src.removeOutgoing(t);
				return;
			}
			t = (RTransition) src.getIncoming();
			deletable = t.isSupplemental();
		}
	}

	public AbstractStatementAction getRAction() {
		return (AbstractStatementAction) action;
	}

	public RGuard getRGuard() {
		return (RGuard) guard;
	}
}
