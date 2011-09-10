<%@ page language="java" contentType="text/html; charset=utf-8" %>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>

<html:html>
<head>
<title>${title}</title>
</head>
<body>
<html:errors/>
<#list forms?keys as form>
<html:form action="/${form}" method="post">
 <#list forms[form] as field >
 	${field}
 </#list>
 <html:submit value="submit"/>
</html:form>
</#list>

</body>
</html:html>
