package jp.ac.titech.cs.se.fwit.core.model;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import jp.ac.titech.cs.se.fwit.core.model.req.RAction;
import jp.ac.titech.cs.se.fwit.core.model.req.Scenario;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * A support class for implementing DomainConcept
 * @author zenmyo
 *
 */
public class DomainConceptSupport implements DomainConcept {
    public static Log logger = LogFactory.getLog(DomainConceptSupport.class);

    @Override
    public Set<String> getDomainVariableNames() {
        return new HashSet<String>();
    }

    @Override
    public Set<String> getDomainVariableNamesReturnByMethod(String method) {
        return new HashSet<String>();
    }

    @Override
    public void updateDomainVariablesByMethod(Scenario scenario, String methodName,
            String receiver, List<RAction> arg) {
    }

}
