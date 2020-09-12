<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>用户管理</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  </head>
  
  <body style="width:300px;margin:10 auto;">
    <div style="background-color:#E8F2FE;height:60px;width:100px;float:left;margin-right:10px;">
    	<a href="login.jsp" style="font-size:40px;">登录</a>
    </div>
    <div style="background-color:#BAC9D8;height:60px;width:100px;float:left;">
    	<a href="create.jsp" style="font-size:40px;">注册</a>
    </div>
  </body>
</html>
