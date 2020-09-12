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
list:<br/>
<c:forEach var="tmp" items="${list}">
	${tmp}&nbsp;&nbsp;
</c:forEach><br/>
array:<br/>
<c:forEach var="tmp" items="${requestScope.strings}">
	${tmp}&nbsp;&nbsp;
</c:forEach><br/>
hashMap:<br/>
<c:forEach var="tmp" items="${map}">
	${tmp.value}&nbsp;&nbsp;
</c:forEach><br/>
star:<br/>
<c:forEach var="i" begin="1" end="10" step="1">
	<c:forEach var="j" begin="1" end="${i}" step="1">
		*
	</c:forEach>
	<br/>
</c:forEach><br/>
<c:forEach var="i" begin="1" end="19" step="1" >
	<c:forEach var="j" begin="1" end="19" step="1" >
		${ (i<=10) ? (j > (10-i) && j < (10+i) ? "*" : "&nbsp;&nbsp;")
		: (j <= (i mod 10) || j >= (20 - (i mod 10)) ? "&nbsp;&nbsp;" : "*" ) }
	</c:forEach>
	<br/>
</c:forEach><br/><br/>

<c:forTokens var="tmp" items="m.y.e.c.l.i.p.s.e" delims=".">
	${tmp}&nbsp;&nbsp;
</c:forTokens>1.85.61.146

<c:forEach var="i" begin="1" end="10" step="2">
	i&nbsp;
</c:forEach>
<c:forTokens var="split" items="w.o.r.d.s" delims=".">
	${split}&nbsp;
</c:forTokens>
</body>
</html>