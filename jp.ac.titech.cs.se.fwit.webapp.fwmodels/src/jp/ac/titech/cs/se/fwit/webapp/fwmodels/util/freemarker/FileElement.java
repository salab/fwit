package jp.ac.titech.cs.se.fwit.webapp.fwmodels.util.freemarker;

import java.io.File;

import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import freemarker.template.Template;
import freemarker.template.TemplateException;

public class FileElement {

    protected Map<String, Object> data = new HashMap<String, Object>();

    public void init(){}

    public void printContent(Template template, String dir, String file)
    throws IOException, TemplateException {
        final FileWriter writer = new FileWriter((new File(dir + file)));
        template.process(data, writer);
        writer.flush();
        writer.close();
    }

    public void put(String key, Object value) {
        data.put(key, value);
    }

    public Object get(String key){
        return data.get(key);
    }

    public boolean containsKey(String key) {
        return data.containsKey(key);
    }

}