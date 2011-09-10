package jp.ac.titech.cs.se.fwit.dsl.ui.actions;

import org.eclipse.jface.dialogs.IMessageProvider;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.FocusAdapter;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.DirectoryDialog;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

public class OutDirSelectPage extends WizardPage {

	private Text outDir;

	private TextUpdateListener listener = new TextUpdateListener() {
		@Override
		public void handleTextUpdate(Event e) {
			doValidate();
		}
	};

	public OutDirSelectPage(String string) {
		super(string);
		this.setTitle("Set an output dirctory");
	}

	public void createControl(Composite parent) {
		try {
			Composite composite = new Composite(parent, SWT.NULL);
			composite.setLayout(new GridLayout(3, false));

			// output directory
			Label label = new Label(composite, SWT.NULL);
			label.setText("output dir");
			outDir = new Text(composite, SWT.NULL);
			outDir.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
			listener.registerToWidghet(outDir);
			outDir.addFocusListener(new FocusAdapter() {
				public void focusGained(FocusEvent e) {
					setPageComplete(false);
				}
			});
			
			Button button = new Button(composite, SWT.NULL);
			button.setText("browse");

			button.addSelectionListener(new DirectoryBrowseAdapter());

			setControl(composite);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	protected void doValidate() {
		if (outDir.getText().length() == 0) {
			setMessage("an output directory  is not specified",
					IMessageProvider.WARNING);
			setPageComplete(false);
			return;
		}
		setPageComplete(true);
		return;
	}
	
	public String getOutDir() {
		return outDir.getText();
	}
	
	class DirectoryBrowseAdapter extends SelectionAdapter {
		@Override
		public void widgetSelected(SelectionEvent e) {
			DirectoryDialog dialog = new DirectoryDialog(outDir.getShell(), SWT.OPEN);
			outDir.setText(dialog.open());
			doValidate();
		}
	}

}
