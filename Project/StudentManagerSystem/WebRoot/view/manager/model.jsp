<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ include file="/head/head.jsp" %>
<link rel="stylesheet" type="text/css" href="/StudentManagerSystem/css/all.css" />
<link rel="stylesheet" type="text/css" href="/StudentManagerSystem/view/manager/css/model.css" />
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<body>
<div class="name">欢迎管理员:<span class="user">${manager.username }</span></div>
<div class="state">
	<a href="/StudentManagerSystem/view/manager/homepage.jsp">首页</a>&nbsp;&nbsp;
	<a href="/StudentManagerSystem/view/manager/addStuInfo.jsp">添加学生信息</a> &nbsp;&nbsp;
	<a href="">学生信息维护</a> &nbsp;&nbsp;
	<a href="">修改密码</a> &nbsp;&nbsp;
	<a href="">退出系统</a>&nbsp;&nbsp;
</div>