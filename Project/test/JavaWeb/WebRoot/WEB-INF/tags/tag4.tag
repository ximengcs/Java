<%@ tag language="java" pageEncoding="ISO-8859-1"%>
<%@ attribute name="lists" required="true" type="java.util.List" %>

<%
	for( Object str : lists )
		out.println( str + "<br/>" );
%>