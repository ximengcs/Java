<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>新闻列表</title>
<script language="javascript">
	function allCheck(input) {
		var array = document.getElementsByName("delete");
		for( i in array ) {
			array[i].checked = input.checked; // 将全选或全部选应用到全部
		}
	}
	function add() {
		location.href="addNews.jsp";
	}
	function changeForm() {
		document.getElementsByName("operate")[0].value = "psh";
		document.forms[0].submit();
	}
</script>
</head>
<body>
<form action="NewsServlet" method="post">
	<input type="button" value="发布新闻" onclick="add()"/>
	<input type="submit" value="批量删除"/>
	<input type="button" value="批量审核" onclick="changeForm()"/>
	<input type="hidden" name="operate" value="ps"/>
	<table border=1 width="1000px" cellpadding="0px" cellspacing="1px" style="border:1px solid grey;border-collapse:collapse;">
		<tr>
			<th><input type="checkbox" name="qx" onclick="allCheck(this)"/></th>
			<th>文章ID</th>
			<th>文章标题</th>
			<th>所属栏目</th>
			<th>创建时间</th>
			<th>是否审核</th>
			<th>操作</th>
		</tr>
		<c:forEach items="${newsList}" var="news">
			<tr >
				<td><input type="checkbox" name="delete" value="${news.newsId }"/></td>
				<td>${news.newsId}</td>
				<td>${news.newsTitle}</td>
				<td>${news.newsType}</td>
				<td>${news.createTime}</td>
				<td>${news.newsStatus }</td>
				<td><a href="update.jsp?id=${ news.newsId }&title=${ news.newsTitle }&content=${ news.newsContent }">编辑</a> | <a href="NewsServlet?operate=delete&value=${news.newsId }">删除</a></td>
			</tr>
		</c:forEach>
		<tr>
			<td colspan="7">
				<a href="NewsServlet?pageNumber=1">首页</a>
				<a href="NewsServlet?pageNumber=${pageNumber-1 }">上一页</a>
				<a href="NewsServlet?pageNumber=${pageNumber+1 }">下一页</a>
				<a href="NewsServlet?pageNumber=${pageCount }">尾页</a>
			</td>
		</tr>
	</table>
</form>
</body>
</html>