<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isElIgnored="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
Request foo:<%= request.getAttribute( "foo" ) %><br/>
Session foo:<%= session.getAttribute( "foo" ) %><br/>
Context foo:<%= application.getAttribute( "foo" ) %><br/>

<% pageContext.setAttribute("foo", 4); %>
PageContext foo:<%= pageContext.getAttribute( "foo" ) %><br/>

PageContext find foo:<%= pageContext.findAttribute("foo") %><br/>

PageContext find foo in Session:<%= pageContext.getAttribute("foo",PageContext.SESSION_SCOPE) %><br/>

PageContext SESSION:<%= PageContext.SESSION %><br/>
PageContext SESSION_SCOPE:<%= PageContext.SESSION_SCOPE %><br/>

PageContext:
</body>
</html>