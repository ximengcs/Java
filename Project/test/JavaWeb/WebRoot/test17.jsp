<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="x" uri="http://simon.com" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<x:simple/>

<hr>

<x:simple2>
	there are some body content.
</x:simple2>

<hr/>

<x:simple3>
	${message }
</x:simple3>

<hr>
context:${pageScope.message }<br/>
all:${message }

<hr><hr>
<table border=1>
<x:simple4>
	<tr><td>${tmp}</td></tr>
</x:simple4>
</table>

</body>
</html>