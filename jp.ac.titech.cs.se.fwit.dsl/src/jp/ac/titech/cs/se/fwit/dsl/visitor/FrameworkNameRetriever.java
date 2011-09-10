package jp.ac.titech.cs.se.fwit.dsl.visitor;

import jp.ac.titech.cs.se.fwit.core.model.fw.Framework;
import jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.FwitRequirementModel;

import jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.SystemDeclaration;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

public class FrameworkNameRetriever extends
		FwitRequirementsModelHookedSwitch<String> {

	public static FrameworkNameRetriever instance = new FrameworkNameRetriever();

	public static String retrieveFrameworkName(String file) {
		ResourceSet rs = new ResourceSetImpl();
		Resource resource = rs.getResource(URI.createURI(file), true);
		EObject eobject = resource.getContents().get(0);
		return instance.doSwitch(eobject);
	}

	public static Framework retrieveFrameworkFromJar(String file) {
		String fwName = retrieveFrameworkName(file);
		try {
			return (Framework) Class.forName(fwName).newInstance();
		} catch (InstantiationException e) {
			System.err.println("fail to load framework model " + fwName);
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			System.err.println("fail to load framework model " + fwName);
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			System.err.println("fail to load framework model " + fwName);
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public String caseFwitRequirementModel(FwitRequirementModel object) {
		return this.doSwitch(object.getSystem());
	}

	@Override
	public String caseSystemDeclaration(SystemDeclaration object) {
		return object.getFramework().getValue();
	}

}
