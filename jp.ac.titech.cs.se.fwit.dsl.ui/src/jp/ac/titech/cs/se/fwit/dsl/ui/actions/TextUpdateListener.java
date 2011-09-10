package jp.ac.titech.cs.se.fwit.dsl.ui.actions;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;

public abstract class TextUpdateListener implements Listener{

	public void handleEvent(Event event) {
		if(event.type == SWT.KeyDown && event.character != SWT.CR){
			return ;
		}
		handleTextUpdate(event);
	}
	
	public void registerToWidghet(Control widget){
		widget.addListener(SWT.KeyDown,this);
		widget.addListener(SWT.FocusOut,this);
	}
	
	public void unregisterToWidghet(Control widget){
		widget.removeListener(SWT.KeyDown, this);
		widget.removeListener(SWT.FocusOut, this);
	}
	
	abstract public void handleTextUpdate(Event e);
	
}
