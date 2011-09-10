package jp.ac.titech.cs.se.fwit.webapp.fwmodels.rails;

import java.io.File;

import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import jp.ac.titech.cs.se.fwit.core.model.fw.FrameworkTemplate;
import jp.ac.titech.cs.se.fwit.webapp.fwmodels.rails.elements.ActionController;
import jp.ac.titech.cs.se.fwit.webapp.fwmodels.util.freemarker.ClassElement;
import jp.ac.titech.cs.se.fwit.webapp.fwmodels.util.freemarker.FileElement;

import org.apache.commons.io.FileUtils;
import freemarker.template.Configuration;
import freemarker.template.DefaultObjectWrapper;
import freemarker.template.TemplateException;

public class RailsTemplate implements FrameworkTemplate{

    private static Set<String> metrics = new HashSet<String>();
    private static Configuration templateConfig = new Configuration();
    static {
        metrics.add("WMC");
        metrics.add("NOC");
        templateConfig.setClassForTemplateLoading(RailsTemplate.class,
        "/jp/ac/titech/cs/se/fwit/webapp/fwmodels/rails/templates");
        templateConfig.setObjectWrapper(new DefaultObjectWrapper());
    }

    private final Map<String, ActionController> controllers = new HashMap<String, ActionController>();
    private final Map<String, FileElement> views = new HashMap<String, FileElement>();

    @Override
    public void init() {
        for(final ActionController ctlr:controllers.values()){
            ctlr.init();
        }
        for(final FileElement view:views.values()){
            view.init();
        }
    }

    @Override
    public void reset() {
        controllers.clear();
        views.clear();
    }

    @Override
    public void printCustomizedTemplate(String projectDir) {

        final String ctlrDir = projectDir + "app/controllers/";
        final String viewDir = projectDir + "app/views/";

        try {
            FileUtils.forceMkdir(new File(ctlrDir));
            FileUtils.forceMkdir(new File(viewDir));
            printController(ctlrDir);
            printViews(viewDir);
        } catch (final IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (final TemplateException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    private void printViews(String dir) throws IOException,
    TemplateException {
        for (final FileElement view : this.views.values()) {
            view.printContent(templateConfig.getTemplate("view.ftl"), dir,
                    view.get("title") + ".html.erb");
        }
    }

    private void printController(String dir) throws IOException,
    TemplateException {
        for (final ActionController action : this.controllers.values()) {
            action.printContent(templateConfig.getTemplate("controller.ftl"), dir,
                    action.getFileName() + ".rb");
        }
    }

    public void setViewElement(FileElement view) {
        views.put((String) view.get("title"), view);
    }

    public FileElement getViewElement(String title) {
        if (views.containsKey(title)) {
            return views.get(title);
        }
        final FileElement view = new FileElement();
        view.put("title", title);
        return view;
    }

    public ActionController getController(String moduleName) {
        if (controllers.containsKey(moduleName)) {
            return controllers.get(moduleName);
        }
        return new ActionController(moduleName);
    }

    public void setController(ActionController controller) {
        controllers.put(controller.getModuleName(), controller);
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

        for (final ClassElement action : this.controllers.values()) {
            action.buildStatements();
            numStatements += action.getNumberOfStatements();
        }
        return numStatements / numClasses;
    }

    private Double getNOC() {
        return (double) this.controllers.size();
    }

}
