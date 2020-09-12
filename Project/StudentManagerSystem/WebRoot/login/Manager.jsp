<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ include file="/head/head.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<link rel="stylesheet" type="text/css" href="/StudentManagerSystem/css/botton.css"/>
<link rel="stylesheet" type="text/css" href="/StudentManagerSystem/css/all.css"/>

<title>管理员登录</title>
</head>
<body>
<center>
<span class="fonts">管理员登录</span>
<form method="post" action="/StudentManagerSystem/Controller.do">
	<input type="text" name="username"/><br/>
	<input type="password" name="password"/><br/>
	<input type="submit" value="登录" class="botton"/>
	<input type="reset" class="botton"/>
</form>
<span class="info">${ info }</span>
</center>
</body>
</html>