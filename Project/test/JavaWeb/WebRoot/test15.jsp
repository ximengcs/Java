<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<c:set var="bean" value="<%= new java.util.HashMap() %>" scope="request" />
<c:set target="${bean}" property="property1" value="core1" />
<c:set target="${bean}" property="property2">
	<c:out value="inner2" />
	innerHTML
</c:set>
<br/>

${bean.property1}&nbsp;${bean.property2}<br/><br/>

<c:remove var="bean" />

${bean.property1}&nbsp;${bean.property2}
</body>
</html>