package jp.ac.titech.cs.se.fwit.dsl.ui.actions;

import java.io.File;

import jp.ac.titech.cs.se.fwit.dsl.FwitDSLProcessor;

import org.eclipse.core.resources.IFile;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.IWorkbenchWindowActionDelegate;

public class GenerationAction implements IWorkbenchWindowActionDelegate {

	private IWorkbenchWindow window;

	public void run(IAction action) {
		try {
			GenerationOptionWizard selectWizard = new GenerationOptionWizard();
			WizardDialog wizard = new WizardDialog(window.getShell(),
					selectWizard);
			wizard = new WizardDialog(window.getShell(), selectWizard);
			wizard.open();

			IFile reqFile = selectWizard.getReqFile();
			String fileName = reqFile.getFullPath().toString();
			
			String outDir = selectWizard.getOutDir();
			if(!new File(outDir).isAbsolute()){
				outDir = reqFile.getProject().getLocation()+System.getProperty("file.separator") + outDir;
			}

			FwitDSLProcessor.processInPlugin(fileName,outDir, null);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void selectionChanged(IAction action, ISelection selection) {
	}

	public void dispose() {
	}

	public void init(IWorkbenchWindow window) {
		this.window = window;
	}
}