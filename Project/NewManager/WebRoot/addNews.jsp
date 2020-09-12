<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>添加新闻</title>
</head>
<body>
	<form action="NewsServlet" method="post">
		<input type="hidden" name="operate" value="addNews"/>
		<input type="text" name="newstitle" placeholder="请输入标题"/><br/>
		新闻栏目
		<select name="newstype">
			<option value="html">html</option>
			<option value="javascript">javascript</option>
			<option value="oracle">oracle</option>
		</select><br/>
		<textarea id="content" name="newscontent" rows="8" cols="80"></textarea><br/>
		<input type="submit" value="添加 "/>
	</form>
</body>
</html>