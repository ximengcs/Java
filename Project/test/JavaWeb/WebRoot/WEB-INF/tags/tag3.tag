<%@ tag language="java" pageEncoding="ISO-8859-1"%>

<%
	getJspContext().setAttribute("msg", "infomation",PageContext.REQUEST_SCOPE);
	getJspBody().invoke(null);
%>