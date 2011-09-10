package jp.ac.titech.cs.se.fwit.core.model.composite;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import jp.ac.titech.cs.se.fwit.core.model.State;
import jp.ac.titech.cs.se.fwit.core.model.fw.FState;
import jp.ac.titech.cs.se.fwit.core.model.req.RState;

public class CState extends State {
	
	public static Log logger = LogFactory.getLog(CState.class);
	
	// for sanitization
	private Boolean dirty;

	private RState rState;
	private FState fState;
	
	public CState(CState state) {
		this(state.getRState(),state.getFState());
	}
	
	public CState(RState reqState, FState fwState) {
		super(reqState.getName()+":"+fwState.getName());
		this.rState = reqState;
		this.fState = fwState;
		this.dirty = false;
	}
	
	public CState getInitialState(){
		if(this.isInitial()){
			return this;
		}else{
			return ((CState)this.getIncoming().getSource()).getInitialState();
		}
	}

	public RState getRState() {
		return rState;
	}

	public FState getFState() {
		return fState;
	}
	
	/**
	 * check the state consists of same RState and FState
	 * not override equals to avoid changing behavior of Set
	 * @param o
	 * @return
	 */
	public boolean isSame(Object o){
		if(o == null){
			return false;
		}
		if(!(o instanceof CState)){
			return false;
		}
		CState other = (CState)o;
		if(!other.getRState().equals(rState) || !other.getFState().equals(fState)){
			return false;
		}
		return true;
	}

	public Boolean isDirty() {
		return dirty;
	}

	public void setDirty(Boolean dirty) {
		this.dirty = dirty;
	}
}
