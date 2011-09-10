
package jp.ac.titech.cs.se.fwit.dsl;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class FwitRequirementsModelStandaloneSetup extends FwitRequirementsModelStandaloneSetupGenerated{

	public static void doSetup() {
		new FwitRequirementsModelStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

