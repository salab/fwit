package jp.ac.titech.cs.se.fwit.core.model.fw;

import jp.ac.titech.cs.se.fwit.core.model.DomainConcept;

public class FrameworkSupport {

	public FrameworkSupport() {
		super();
	}

	/**
	 * 
	 * @param className name of a class representing a domain concept
	 * @return instance of a domain concept
	 */
	public DomainConcept getDomainConcept(String className) {
		if (className == null || "void".equals(className)) {
			return null;
		}
		try {
			Class cls = Class.forName(className,true, getClass().getClassLoader());
			Object obj = cls.newInstance();
			if (obj instanceof DomainConcept) {
				return (DomainConcept) obj;
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}