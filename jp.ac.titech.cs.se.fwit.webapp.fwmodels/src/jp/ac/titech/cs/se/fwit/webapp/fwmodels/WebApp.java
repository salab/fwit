package jp.ac.titech.cs.se.fwit.webapp.fwmodels;

import jp.ac.titech.cs.se.fwit.core.model.fw.Framework;
import jp.ac.titech.cs.se.fwit.core.model.fw.FrameworkSupport;

public abstract class WebApp extends FrameworkSupport implements Framework{

    public static final String FORM_DOMAIN_VARIABLE = "FORM";
    public static final String HTML_DOMAIN_VARIABLE = "HTML";
    public static final String DB_DOMAIN_VARIABLE = "DB";
    public static final String REFERRER_DOMAIN_VARIABLE = "REFERRER";
    public static final String REQUEST_DOMAIN_VARIABLE = "REQUEST";
    public static final String RESPONSE_DOMAIN_VARIABLE = "RESPONSE";

    public static final String WEBAPP_SYSTEM_DOMAIN_VARIABLE = "WA_SYSTEM";
    public static final String WEBAPP_SESSION_DOMAIN_VARIABLE = "WA_SESSION";

}
