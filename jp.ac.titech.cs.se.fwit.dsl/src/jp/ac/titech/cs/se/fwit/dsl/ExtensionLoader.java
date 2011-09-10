package jp.ac.titech.cs.se.fwit.dsl;

import jp.ac.titech.cs.se.fwit.core.model.fw.Framework;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtension;
import org.eclipse.core.runtime.IExtensionPoint;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.Platform;

public class ExtensionLoader {
	public static final String EXTENSION_POINT_ID = "jp.ac.titech.cs.se.fwit.dsl.fwitFWModel";
	
	public static Framework loadFramework(String fwName){
		IExtensionRegistry registry = Platform.getExtensionRegistry();
		IExtensionPoint point = registry.getExtensionPoint(EXTENSION_POINT_ID);
		IExtension[] extensions = point.getExtensions();
		for(IExtension e:extensions){
			IConfigurationElement[] cfgElems = e.getConfigurationElements();
			for(IConfigurationElement cfg:cfgElems){
				if(!cfg.getName().equals("fw")){
					continue;
				}
				String className = cfg.getAttribute("class");
				if(className.equals(fwName)){
					try {
						return (Framework) cfg.createExecutableExtension("class");
					} catch (CoreException e1) {
						e1.printStackTrace();
					}
				}
			}
		}
		return null;
	}
}
