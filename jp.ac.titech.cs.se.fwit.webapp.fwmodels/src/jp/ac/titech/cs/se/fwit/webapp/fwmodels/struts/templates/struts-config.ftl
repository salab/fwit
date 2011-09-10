<?xml version="1.0" encoding="iso-8859-1"?>
<!DOCTYPE struts-config PUBLIC
        "-//Apache Software Foundation//DTD Struts Configuration 1.3//EN"
        "http://struts.apache.org/dtds/struts-config_1_3.dtd">

<struts-config>
    <form-beans type="org.apache.struts.webapp.examples.CustomFormBean">
    	<#list forms as form >
        <form-bean name="${form.name}"  type="${form.className}" />
        </#list>
    </form-beans>
    <action-mappings>        
	<#list actions as action >
        <action path="${action.path}"
                type="${action.type}"
                name="${action.name}" 
                <#if action.input??> input="${action.input}"</#if> >
  		  		<#list action.forwards as forward >
                    <forward name="${forward.name}" path="${forward.path}" />
  		  		</#list>
        </action>
	</#list>
    </action-mappings>
</struts-config>
