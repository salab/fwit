package jp.ac.titech.cs.se.fwit.webapp.fwmodels.rails;

import jp.ac.titech.cs.se.fwit.core.model.fw.FLTS;
import jp.ac.titech.cs.se.fwit.core.model.fw.FrameworkTemplate;
import jp.ac.titech.cs.se.fwit.webapp.fwmodels.WebApp;

public class Rails extends WebApp {

    @Override
    public FrameworkTemplate buildTemplate() {
        return new RailsTemplate();
    }

    @Override
    public FLTS getFLTS() {
        return new RailsLTS();
    }

    @Override
    public String recommendedMetric() {
        return "WMC";
    }

}