<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<table border=1>
		<tr>
			<td>strings</td>
			<td>${ strings["0"] }</td>
			<td>${ strings[1] }</td>
			<td>${ strings[2] }</td>
		</tr>
		<tr>
			<td>list</td>
			<td>${ list[0] }</td>
			<td>${ list[1] }</td>
			<td>${ list[2] }</td>
		</tr>
		<tr>
			<td>map</td>
			<td>${ map["map1"] }</td>
			<td>${ map["map2"] }</td>
			<td>${ map["map3"] }</td>
		</tr>
	</table>
</body>
</html>