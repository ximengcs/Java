<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center><form action="Test2.do" method="post">
	<input type="text" name="text" placeholder="请输入TEXT" /><br/>
	<input type="password" name="password" placeholder="请输入密码"/><br/>
	<input type="radio" name="radio" value="1" checked/>1
	<input type="radio" name="radio" value="2" />2
	<input type="radio" name="radio" value="3" />3<br/>
	<input type="checkbox" name="checkbox" value="1" />1
	<input type="checkbox" name="checkbox" value="2" />2
	<input type="checkbox" name="checkbox" value="3" />3<br/>
	<textarea cols="6" rows="2" name="textarea">
	</textarea><br/>
	<input type="reset" /><br/>
	<input type="submit" value="提交"/><br/>
	<select name="select">
		<option value="1">1</option>
		<option value="2">2</option>
		<option value="3">3</option>
	</select><br/>
</form>
</center>
</body>
</html>