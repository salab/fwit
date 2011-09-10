package jp.ac.titech.cs.se.fwit.dsl.visitor;

import java.util.HashSet;

import java.util.Set;

import jp.ac.titech.cs.se.fwit.core.model.Domain;
import jp.ac.titech.cs.se.fwit.core.model.req.RLTS;
import jp.ac.titech.cs.se.fwit.core.model.req.action.VariableAction;
import jp.ac.titech.cs.se.fwit.core.model.req.action.VariableActionManager;
import jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.FieldDeclaration;
import jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.FunctionDeclaration;
import jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.FwitRequirementModel;
import jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.Include;
import jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.Module;
import jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.SystemDeclaration;
import jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.VariableDeclaration;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

public class FwitFileParser extends FwitRequirementsModelHookedSwitch<Set<RLTS>> {

    private final Set<RLTS> rltss = new HashSet<RLTS>();

    public static Log logger = LogFactory.getLog(FwitFileParser.class);

    private String systemName;

    private String moduleName;

    private VariableActionManager fieldBinding;

    private final DomainVariableRetriever domainVariableRetriever;

    private String framework;

    private final Domain domain;

    private final String currentDir;

    public FwitFileParser(Domain domain, String currentDir){
        this.currentDir = currentDir;
        this.domain = domain;
        this.domainVariableRetriever = new DomainVariableRetriever(domain);
    }

    @Override
    protected void preSwitch(EObject object){
        logger.debug(object);
    }

    @Override
    public Set<RLTS> caseFwitRequirementModel(FwitRequirementModel object) {
        if(this.systemName==null){
            this.doSwitch(object.getSystem());
        }
        for(final EObject e:object.getElements()){
            this.doSwitch(e);
        }
        return rltss;
    }

    @Override
    public Set<RLTS> caseInclude(Include object) {
        final ResourceSet rs = new ResourceSetImpl();
        final Resource resource = rs.getResource(URI.createURI(this.currentDir+object.getFile()), true);
        final EObject eobject = resource.getContents().get(0);
        this.doSwitch(eobject);
        return rltss;
    }

    @Override
    public Set<RLTS> caseSystemDeclaration(SystemDeclaration object) {
        this.systemName = object.getName();
        this.framework = object.getFramework().getValue();
        return null;
    }

    @Override
    public Set<RLTS> caseModule(Module object) {
        this.moduleName = object.getName();
        this.fieldBinding = new VariableActionManager();
        for (final FieldDeclaration field : object.getFields()) {
            this.doSwitch(field);
        }
        for (final FunctionDeclaration function : object.getFunctions()) {
            this.doSwitch(function);
        }
        return null;
    }

    @Override
    public Set<RLTS> caseFieldDeclaration(FieldDeclaration object) {

        String type = object.getType().getClassName();
        if(type==null){
            type = object.getType().getName();
        }

        for (final VariableDeclaration var : object.getVariables()) {
            final VariableAction action = this.fieldBinding.findOrCreateAction(var.getName(), type);
            action.addDomainVariableNames(domainVariableRetriever.doSwitch(object.getType()));
        }
        return null;
    }

    @Override
    public Set<RLTS> caseFunctionDeclaration(FunctionDeclaration object) {
        final RLTSBuilder builder = new RLTSBuilder(domain, moduleName, fieldBinding);
        this.rltss.add(builder.doSwitch(object));
        return null;
    }

    public Set<RLTS> getRLTSs(){
        return this.rltss;
    }

    public String getFramework() {
        return framework;
    }

}
