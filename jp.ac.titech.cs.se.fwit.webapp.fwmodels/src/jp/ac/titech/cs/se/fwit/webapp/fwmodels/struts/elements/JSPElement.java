package jp.ac.titech.cs.se.fwit.webapp.fwmodels.struts.elements;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jp.ac.titech.cs.se.fwit.webapp.fwmodels.util.freemarker.FileElement;

public class JSPElement extends FileElement {
	public static final String FORMS = "forms";
	
	public static final String TEXT_FIELD ="text";
	public static final String PASSWORD_FIELD ="password";

	// form name to a list of form fields
	protected Map<String, List<String>> forms = new HashMap<String, List<String>>();

	public JSPElement(String title) {
		put("title", title);
	}
	
	public void init(){
		data.put(FORMS, forms);
	}
	
	public void addForm(String form){
		if(!forms.containsKey(form)){
			forms.put(form, new ArrayList<String>());
		}
	}

	public void addFormField(String form, String fieldName, String fieldType){
		List<String> fields;
		if(forms.containsKey(form)){
			fields = forms.get(form);
		}else{
			fields = new ArrayList<String>();
		}
		String field = null;
		if(TEXT_FIELD.equals(fieldType)){
			StringBuffer buf = new StringBuffer();
			buf.append("<html:text property=\"");
			buf.append(fieldName);
			buf.append("\" />");
			field = buf.toString();
		}else if(PASSWORD_FIELD.equals(fieldType)){
			StringBuffer buf = new StringBuffer();
			buf.append("<html:password property=\"");
			buf.append(fieldName);
			buf.append("\" />");
			field = buf.toString();
			
		}
		fields.add(field);
		forms.put(form, fields);
	}
}
