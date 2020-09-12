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
<c:forEach var="i" begin="1" end="10" step="2">
	${i}
	<c:if test="${i>3}">
		i > 3
	</c:if>
	<br/>
</c:forEach><br/><br/>

<c:forEach var="i" begin="1" end="100" step="1">
	i&nbsp;=&nbsp;${i}&nbsp;
	<c:choose>
		<c:when test="${i>30}">i>30</c:when>
		<c:otherwise>default</c:otherwise>
	</c:choose>
	<br/>
</c:forEach>

</body>
</html>