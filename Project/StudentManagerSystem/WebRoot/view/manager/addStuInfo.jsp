<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ include file="/view/manager/model.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css" href="/StudentManagerSystem/view/manager/css/addStuInfo.css" />
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>添加学生信息</title>
</head>
<body>
<div class="content">
	<div class="inner">
		<center>
		<form method="post" action="/StudentManagerSystem/Controller.do?operate=addStuInfo">
			学号：<input type="text" name="No" /><br/>
			姓名：<input type="text" name="name" /><br/>
			男<input type="radio" name="sex" value="男"/>
			&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;女<input type="radio" name="sex" value="女"/><br/>
			年龄：<input type="text" name="age" /><br/>
			电话：<input type="text" name="tel" /><br/>
			系部：<input type="text" name="dept" /><br/>
			<input type="submit" value="提交" />
		</form>
		</center>
	</div>
</div>
</body>
</html>