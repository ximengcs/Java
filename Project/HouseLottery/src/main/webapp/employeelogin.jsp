<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>购房员工登录</title>
<script type="text/javascript" src="jquery-1.8.3.min.js"></script>
<script type="text/javascript">
	var flag = false;
	$(document)
			.ready(
					function() {
						//获取sapn 标签
						var gong_id = document.getElementById("gong_id");
						var psw = document.getElementById("psw");
						var psw_error = document.getElementById("psw_error");
						gong_id.style.visibility = "hidden";
						psw.style.visibility = "hidden";
						psw_error.style.visibility = "hidden";
						$("#PURCHASER_ID")
								.blur(
										function() {
											//获取员工工号
											var PURCHASER_ID = $(
													"#PURCHASER_ID").val();
											if (PURCHASER_ID == null
													|| PURCHASER_ID == "") {
												document
														.getElementById("gong_id").style.visibility = "visible";
												return false;
											} else {
												document
														.getElementById("gong_id").style.visibility = "hidden";
											}
										})
						$("#PASSWORD").blur(function() {
							//获取密码
							var PASSWORD = $("#PASSWORD").val();
							if (PASSWORD == null || PASSWORD == "") {
								psw.style.visibility = "visible";
								return false;
							} else {
								psw.style.visibility = "hidden";

							}

						})

						flag = true;
						
						
						
						//点击登录按钮
						$("#btn_denglu").click(function() {
							window.open("Salesannouncement.html");
						})

					})
	//检查密码
	function checkCode() {
		if ('<%=request.getAttribute("id")%>' == 'false') {
			document.getElementById('psw_error').style.visibility = "visible";
			<% request.setAttribute("id", "0"); %>
			return;
		}
	}
	
	//
	function check() {
		var username = document.getElementById('PURCHASER_ID').value;
		var password = document.getElementById('PASSWORD').value;
		if (username == '') {
			return false;
		}
		if (password == '') {
			return false;
		}
	}
</script>
</head>
<body onload="checkCode()">
	<div align="center" style="">
		<h1>售楼方员工登录</h1>
		<br> <br>
		<hr>
		<br>
		<div style="width: 1300px; margin: 0 auto;">
			<div
				style="width: 800px; height: 240; background-color: #CDCDCD; border-radius: 20px;">

				<form action="/houselottery/StaffManage" method="post" onsubmit="return check()">
					<input type="hidden" name="operate" value="staffLogin" />
					<table width="600px" height="200" border="0" align="center"
						style="margin: 0 0 0 100px;">
						<tr>
							<th width="150">员&nbsp;工&nbsp;工&nbsp;号：</th>    
							<td width="300"><input name="username" type="text"
								id="PURCHASER_ID" size="20"><span id="gong_id"
								style="color: red">工号不能为空！</span></td>      
						</tr>
						 
						<tr>
							<th width="150">密&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;码：</th>
							   
							<td width="300"><input name="pwd" type="password"
								id="PASSWORD" size="20"> <span id="psw"
								style="color: red">密码不能为空！</span> <span id="psw_error"
								style="color: red">密码错误！</span></td>      
						</tr>
						<tr>
							<td></td>
							<td width="300"><input
								style="width: 90px; background-color: #CDCDCD; cursor: pointer;"
								type="submit" value="登录" name="Submit"></td>
						</tr>
					</table>
				</form>

			</div>
		</div>
	</div>
</body>
</html>