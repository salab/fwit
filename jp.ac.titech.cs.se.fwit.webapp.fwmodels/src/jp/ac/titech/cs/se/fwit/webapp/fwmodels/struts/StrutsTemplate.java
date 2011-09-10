package jp.ac.titech.cs.se.fwit.webapp.fwmodels.struts;

import java.io.File;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import jp.ac.titech.cs.se.fwit.core.model.fw.FrameworkTemplate;
import jp.ac.titech.cs.se.fwit.webapp.fwmodels.struts.elements.ActionElement;
import jp.ac.titech.cs.se.fwit.webapp.fwmodels.struts.elements.ActionExecute;
import jp.ac.titech.cs.se.fwit.webapp.fwmodels.struts.elements.ActionForm;
import jp.ac.titech.cs.se.fwit.webapp.fwmodels.struts.elements.JSPElement;
import jp.ac.titech.cs.se.fwit.webapp.fwmodels.util.freemarker.ClassElement;
import jp.ac.titech.cs.se.fwit.webapp.fwmodels.util.freemarker.FileElement;
import jp.ac.titech.cs.se.fwit.webapp.fwmodels.util.freemarker.JavaClassElement;

import org.apache.commons.io.FileUtils;

import freemarker.template.Configuration;
import freemarker.template.DefaultObjectWrapper;
import freemarker.template.TemplateException;

public class StrutsTemplate implements FrameworkTemplate{

    public static final String REQUEST ="request";
    public static final String SESSION ="request.getSession()";
    public static final String CONTEXT ="request.getSession().getServletContext()";

    private static Set<String> metrics = new HashSet<String>();
    private static Configuration templateConfig = new Configuration();
    static {
        metrics.add("WMC");
        metrics.add("NOC");
        templateConfig.setClassForTemplateLoading(StrutsTemplate.class,
        "/jp/ac/titech/cs/se/fwit/webapp/fwmodels/struts/templates");
        templateConfig.setObjectWrapper(new DefaultObjectWrapper());
    }

    private final Map<String, ActionElement> actionElements = new HashMap<String, ActionElement>();
    private final Map<String, ActionForm> actionForms = new HashMap<String, ActionForm>();
    private final Map<String, ActionExecute> actionClasses = new HashMap<String, ActionExecute>();
    private final Map<String, JSPElement> jsps = new HashMap<String, JSPElement>();

    @Override
    public void init(){
        for(final ActionForm form:actionForms.values()){
            form.init();
        }
        for(final ActionExecute action:actionClasses.values()){
            action.init();
        }
        for(final JSPElement jsp:jsps.values()){
            jsp.init();
        }
    }

    @Override
    public void reset(){
        actionElements.clear();
        actionForms.clear();
        actionClasses.clear();
        jsps.clear();
    }

    @Override
    public void printCustomizedTemplate(String projectDir) {

        final String webinfDir = projectDir + "WEB-INF/";

        try {
            FileUtils.forceMkdir(new File(webinfDir));
            printStrutsConfig(webinfDir);
            FileUtils.forceMkdir(new File(webinfDir + "src/"));
            printActionClasses(webinfDir+"src/");
            printActionForms(webinfDir+"src/");
            printJSPs(projectDir);
        } catch (final IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (final TemplateException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    private void printStrutsConfig(String dir) throws IOException,
    TemplateException {
        final FileElement strutsConfig = new FileElement();
        strutsConfig.put("actions", new ArrayList<ActionElement>(this.actionElements.values()));
        strutsConfig.put("forms", new ArrayList<ActionForm>(this.actionForms.values()));
        strutsConfig.printContent(
                templateConfig.getTemplate("struts-config.ftl"), dir,
        "struts-config.xml");
    }

    private void printJSPs(String dir) throws IOException,
    TemplateException {

        for (final FileElement jsp : this.jsps.values()) {
            jsp.printContent(templateConfig.getTemplate("StrutsJSP.ftl"), dir,
                    jsp.get("title") + ".jsp");
        }
    }

    private void printActionForms(String dir) throws IOException,
    TemplateException {
        for (final JavaClassElement form : this.actionForms.values()) {
            form.printContent(templateConfig.getTemplate("ActionForm.ftl"),
                    dir, form.getClassName() + ".java");
        }
    }

    private void printActionClasses(String dir) throws IOException,
    TemplateException {
        for (final ClassElement action : this.actionClasses.values()) {
            action.printContent(templateConfig.getTemplate("Action.ftl"), dir,
                    action.getClassName() + ".java");
        }
    }

    public void setActionElement(ActionElement action) {
        actionElements.put(action.getPath(), action);
    }

    public ActionElement getActionElement(String path) {
        if (actionElements.containsKey(path)) {
            return actionElements.get(path);
        }
        return new ActionElement(path);
    }

    public void setJSPElement(JSPElement jsp) {
        jsps.put((String) jsp.get("title"), jsp);
    }

    public JSPElement getJSPElement(String title) {
        if (jsps.containsKey(title)) {
            return jsps.get(title);
        }
        final JSPElement jsp = new JSPElement(title);

        return jsp;
    }

    public ActionForm getActionForm(String formName) {
        if (actionForms.containsKey(formName)) {
            return actionForms.get(formName);
        }
        return new ActionForm(formName);
    }

    public void setActionForm(ActionForm form) {
        actionForms.put((String) form.get("className"), form);
    }

    public ActionExecute getActionExecute(String actionType) {
        if (actionClasses.containsKey(actionType)) {
            return actionClasses.get(actionType);
        }
        return new ActionExecute(actionType);
    }

    public void setActionExecute(ActionExecute action) {
        actionClasses.put((String) action.get("className"), action);
    }

    @Override
    public Set<String> getMetrics() {
        return metrics;
    }

    @Override
    public Map<String, Double> getMetricValues() {
        final Map<String, Double> values = new HashMap<String, Double>();
        values.put("WMC", getWMC());
        values.put("NOC", getNOC());
        return values;
    }

    private Double getWMC() {
        final double numClasses = this.getNOC();
        double numStatements = 0;
        for (final JavaClassElement form : this.actionForms.values()) {
            form.buildStatements();
            numStatements += form.getNumberOfStatements();
        }
        for (final ClassElement action : this.actionClasses.values()) {
            action.buildStatements();
            numStatements += action.getNumberOfStatements();
        }
        return numStatements / numClasses;
    }

    private Double getNOC() {
        return (double) this.actionClasses.size() + this.actionForms.size();
    }

}
