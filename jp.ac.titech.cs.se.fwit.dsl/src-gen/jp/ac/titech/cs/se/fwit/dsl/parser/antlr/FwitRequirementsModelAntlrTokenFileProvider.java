/*
* generated by Xtext
*/
package jp.ac.titech.cs.se.fwit.dsl.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class FwitRequirementsModelAntlrTokenFileProvider implements IAntlrTokenFileProvider {
	
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
    	return classLoader.getResourceAsStream("jp/ac/titech/cs/se/fwit/dsl/parser/antlr/internal/InternalFwitRequirementsModel.tokens");
	}
}
