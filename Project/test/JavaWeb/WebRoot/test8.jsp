<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>测试Java Bean</title>
</head>
<body>
<jsp:useBean id="person" class="servlet.entry.Person" scope="request"></jsp:useBean>
名字是:<jsp:getProperty property="name" name="person"/>
年龄是:<jsp:getProperty property="sex" name="person"/>
<jsp:useBean id="mygirl" class="servlet.entry.Person" scope="page">
	<jsp:setProperty property="name" name="mygirl" value="nvshen"/>
	<jsp:setProperty property="sex" name="mygirl" value="19" />
</jsp:useBean>
<br/>
名字是:<jsp:getProperty property="name" name="mygirl" />
年龄是:<jsp:getProperty property="sex" name="mygirl" />

</body>
</html>