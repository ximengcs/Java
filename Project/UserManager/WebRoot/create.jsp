<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>注册用户</title>
</head>
<body>
	<center>
		<form action="Create.do" method="post">
		<table>
		<tr><td>
			昵称<input type="text" name="username" style="width:200px;margin-bottom:2px;" /><br/>
			密码<input type="password" name="password" style="width:200px;margin-bottom:2px;" /><br/>
			Q&nbsp;&nbsp;Q<input type="text" name="qq" style="width:200px;margin-bottom:2px;" /><br/>
			手机<input type="text" name="phone" style="width:200px;margin-bottom:5px;" /><br/>
		</td></tr>
		</table>
			<input type="reset" /><br/>
			<input type="submit" value="注册" />
		</form>
	</center>
</body>
</html>