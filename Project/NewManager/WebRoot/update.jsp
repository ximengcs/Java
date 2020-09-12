<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>update</title>
</head>
<body>
<center><h1>Update</h1></center>
<form method="post" action="NewsServlet?operate=update&id=${ param.id }">
	Title<input type="text" value="${ param.title }" />
	Content<textarea rows="8" cols="80" placeholder="${ param.content }" ></textarea> 
	<input type="submit" />
</form>
</body>
</html>