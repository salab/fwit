package jp.ac.titech.cs.se.fwit.webapp.fwmodels.struts;

import jp.ac.titech.cs.se.fwit.core.model.fw.FLTS;
import jp.ac.titech.cs.se.fwit.core.model.fw.FrameworkTemplate;
import jp.ac.titech.cs.se.fwit.webapp.fwmodels.WebApp;

public class Struts extends WebApp {

    @Override
    public FrameworkTemplate buildTemplate() {
        return new StrutsTemplate();
    }

    @Override
    public FLTS getFLTS() {
        return new StrutsLTS();
    }

    @Override
    public String recommendedMetric() {
        return "WMC";
    }

}