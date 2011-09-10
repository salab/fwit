package jp.ac.titech.cs.se.fwit.dsl.ui.actions;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.jface.dialogs.IMessageProvider;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.jface.window.Window;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.dialogs.ElementTreeSelectionDialog;
import org.eclipse.ui.model.WorkbenchContentProvider;
import org.eclipse.ui.model.WorkbenchLabelProvider;


public class ReqFileSelectPage extends WizardPage {

	private Text reqFileName;
	
	private IFile reqFile;
	
	private TextUpdateListener listener = new TextUpdateListener() {
		@Override
		public void handleTextUpdate(Event e) {
			doValidate();
		}
	};

	public ReqFileSelectPage(String string) {
		super(string);
		this.setTitle("Set a requirements specification file");
	}

	public void createControl(Composite parent) {
		try {
			Composite composite = new Composite(parent, SWT.NULL);
			composite.setLayout(new GridLayout(3, false));

			// output directory
			Label label = new Label(composite, SWT.NULL);
			label.setText("req. spec. file");
			reqFileName = new Text(composite, SWT.NULL);
			reqFileName.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
			reqFileName.setEditable(false); // only allow selection from dialog
			listener.registerToWidghet(reqFileName);

			Button button = new Button(composite, SWT.NULL);
			button.setText("browse");
			button.addSelectionListener(new FileBrowseAdapter());

			setControl(composite);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	protected void doValidate() {
		if (reqFile == null){
			setMessage("any requirements specification file is not specified",
					IMessageProvider.WARNING);
			setPageComplete(false);
			return;
		}
		setPageComplete(true);
		return;
	}
	
	public IFile getReqFile() {
		return reqFile;
	}
	
	class FileBrowseAdapter extends SelectionAdapter {
		
		private ViewerFilter filter = new ViewerFilter(){
			@Override
			public boolean select(Viewer viewer, Object parent, Object element) {
				IResource res = (IResource)element;
				if((res.getType() & (IResource.ROOT|IResource.PROJECT|IResource.FOLDER)) > 0 ){
					return true;
				}
				if(res.getFileExtension() != null){
					return res.getFileExtension().equals("fwit");
				}
				return false;
			}
			
		};
		
		@Override
		public void widgetSelected(SelectionEvent e) {
			ElementTreeSelectionDialog dialog = new ElementTreeSelectionDialog(reqFileName.getShell(),new WorkbenchLabelProvider(), new WorkbenchContentProvider());
			dialog.addFilter(filter);

	        dialog.setTitle("Select a requirements specification model");
	        dialog.setMessage("Select a requirements specification model");
	        dialog.setAllowMultiple(false);
	        dialog.setInput(ResourcesPlugin.getWorkspace().getRoot());

	        if (dialog.open() == Window.OK) {
	            reqFile = (IFile) dialog.getFirstResult();
	            reqFileName.setText(reqFile.getFullPath().toString());
	        	doValidate();
	        }
		}
	}
}
