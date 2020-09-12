<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
param1:${param1}
param2:${param2}
param3:${param3}<br/>

request:${requestScope.code }
application:${applicationScope.code }
session:${sessionScope.code }

<jsp:useBean id="test" class="servlet.entry.Person" scope="page">
	<jsp:setProperty name="test" property="name" value="982599829"/>
</jsp:useBean>

<jsp:getProperty name="test" property="name" />
</body>
</html>