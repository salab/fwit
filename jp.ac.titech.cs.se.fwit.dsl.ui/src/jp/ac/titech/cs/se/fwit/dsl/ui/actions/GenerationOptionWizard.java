package jp.ac.titech.cs.se.fwit.dsl.ui.actions;

import org.eclipse.core.resources.IFile;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.IWorkbench;

public class GenerationOptionWizard extends Wizard {

	private OutDirSelectPage outputPage;

	private ReqFileSelectPage reqFilePage;

	private IFile reqFile;

	private String outDir;

	public void init(IWorkbench workbench, IStructuredSelection selection) {
	}

	public void addPages() {
		reqFilePage = new ReqFileSelectPage("requirements specification");
		addPage(reqFilePage);
		outputPage = new OutDirSelectPage("output usage");
		addPage(outputPage);
		outputPage.setPageComplete(false);
	}

	public boolean canFinish() {
		return outputPage.isPageComplete();
	}

	public String getOutDir() {
		return outDir;
	}

	public IFile getReqFile() {
		return reqFile;
	}

	@Override
	public boolean performFinish() {
		reqFile = reqFilePage.getReqFile();
		outDir = outputPage.getOutDir();
		return true;
	}

}