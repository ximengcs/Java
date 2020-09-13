<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
	<head>
		<meta charset="utf-8" />
		<title>超级管理员密码修改</title>
<!-- 		<link rel="stylesheet" type="text/css" href="logintest.css"> -->
		<script src="jquery-1.8.3.min.js"></script>
		<script type="text/javascript" src="update.js"></script>
	</head>
	<body>
		<h1 style="text-align: center;">超级管理员密码修改</h1>
		<hr style="border:1px solid blue">
	  <div id="mima">
	 	<form action="/houselottery/StaffManage" method="post">
		<input type="hidden" name="operate" value="superPasswordRevise"/>
		<table id="table_id" align="center" style="margin-top: 40px;">
			<tr style="height: 40px;">
				<td>旧&nbsp;&nbsp;密&nbsp;&nbsp;码:</td>
				<td><input type="text" class="old_psw" name="old_psw"></td>
			</tr>
			<tr style="height: 40px;">
				<td>新&nbsp;&nbsp;密&nbsp;&nbsp;码:</td>
				<td><input type="text" class="new_psw" name="new_psw"></td>
			</tr>
			<tr style="height: 40px;">
				<td>确&nbsp;&nbsp;认&nbsp;&nbsp;密&nbsp;&nbsp;码:</td>
				<td><input type="text" class="ok_psw" name="ok_psw"></td>
			</tr>
			<tr style="height: 50px;">
				<td>
					
				</td>
				<td>
					<button type="button" class="btn_reset">重置</button>&nbsp;&nbsp;
					<button type="submit" class="btn_submit">提交</button>
				</td>
				
		</table>
		</form>
	</div>
	 </body>
</html>
