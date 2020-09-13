<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<script type="text/javascript" src="jquery-1.8.3.min.js"/>
<title>超级管理员登录</title>
<script type="text/javascript">
	$(document).ready(function(){
		$("#btn_reset").click(function(){
			alert("adfasd");
			$("#text").val(' ');
			$("#password").val(' ');
		})
	})
</script>

</head>
<body onload="checkCode()">
	<script type="text/javascript">
		
		
		
		function UrlSearch() {
			var name, value;
			var str = location.href; //取得整个地址栏
			var num = str.indexOf("?")
			str = str.substr(num + 1); //取得所有参数   stringvar.substr(start [, length ]

			var arr = str.split("&"); //各个参数放到数组里
			for (var i = 0; i < arr.length; i++) {
				num = arr[i].indexOf("=");
				if (num > 0) {
					name = arr[i].substring(0, num);
					value = arr[i].substr(num + 1);
					this[name] = value;
				}
			}
		}
		function check() {
			var username = document.getElementById('text').value;
			var password = document.getElementById('password').value;
			if (username == '') {
				document.getElementById('tip').innerHTML = "用户名不能为空";
				return false;
			}
			if (password == '') {
				document.getElementById('tip').innerHTML = "密码不能为空";
				return false;
			}/*  else {
				window.open("/houselottery/StaffManage");
			} */
		}

		//检查密码
		function checkCode() {
			var Request = new UrlSearch(); //实例化
			if ('<%=request.getAttribute("id")%>' == 'false') {
				document.getElementById('tip').innerHTML = "密码错误";
				Request.id = 0;
				<% request.setAttribute("id", "0"); %>
				return;
			}
		}
		
		
	</script>
	   
	<div id="content"
		style="margin: 0 auto; width: 1000px; height: 500px; position: relative;">
		 <form id="form1" action="/houselottery/StaffManage" method="post" onsubmit="return check()">
			<input type="hidden" name="operate" value="superManage" />
		<div class="login"
			style="position: absolute; top: 196px; left: 503px; margin-top: -80px; margin-left: -200px; background: #90F; width: 400px; height: 200px; border-radius: 10px; background-color: #CDCDCD;">
			     
			<div style="margin-left: 5px; margin-top: 40px">
				       
				<p style="display: inline">超级管理员:</p>
				        <input type="text" id="text" value="" />  
			</div>
			     
			<div style="margin-left: 45px; margin-top: 30px">
				       
				<p style="display: inline">密&nbsp;码:</p>
				        <input type="password" id="password" value="" name="pwd" />      
			</div>
			<div align="center">
				<span id="tip" style="color: red;"></span>
			</div>
			     
			<div style="text-align: center; margin-top: 30px">
				        <input type="submit" value="登录"
					style="margin-right: 10px; padding: 5px 15px; background: #F9C; border-radius: 3px; border: #F0C 1px solid;" />
				            <input class="button" id="btn_reset" type="button" value="重置"
					style="padding: 5px 15px; background: #F9C; border-radius: 3px; border: #F0C 1px solid;" />   
			</div>
			     
		</div>
		   </form>
	</div>
	     

</body>
</html>