package jp.ac.titech.cs.se.fwit.webapp.fwmodels.struts.elements;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ActionElement extends HashMap<String, Object> {

    public ActionElement(String path) {
        put("path",path);
        final String classPrefix = path.substring(0,1).toUpperCase()+path.substring(1);
        put("type", classPrefix+"Action");
        put("name",classPrefix+"Form");
    }

    public String getPath() {
        return (String) get("path");
    }

    public String getType() {
        return (String) get("type");
    }


    public void setType(String type) {
        put("type",type);
    }

    public String getName() {
        return (String) get("name");
    }



    public void setName(String name) {
        put("name", name);
    }

    public void setInput(String input) {
        put("input", input);
    }

    public void setValidate(String validate) {
        put("validate", validate);
    }

    public void addForwards(String name, String path) {
        if (!this.containsKey("forwards")) {
            put("forwards", new ArrayList<Map>());
        }
        final Map<String, String> newForward = new HashMap<String, String>();
        newForward.put("name", name);
        newForward.put("path", path);

        @SuppressWarnings("unchecked")
        final List<Map<String,String>> forwards = (List<Map<String,String>>) get("forwards");
        if(!forwards.contains(newForward)){
            forwards.add(newForward);
        }
        put("forwards", forwards);
    }


}
