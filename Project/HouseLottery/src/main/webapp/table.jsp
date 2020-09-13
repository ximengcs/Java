<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>购房用户登录</title>
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
			var username = document.getElementById('PURCHASER_ID').value;
			var password = document.getElementById('PASSWORD').value;
			if (username == '') {
				document.getElementById('tip').innerHTML = "用户名不能为空";
				return false;
			}
			if (password == '') {
				document.getElementById('tip2').innerHTML = "密码不能为空";
				return false;
			}/*  else {
				window.open("/houselottery/StaffManage");
			} */
		}

		//检查密码
		function checkCode() {
			var Request = new UrlSearch(); //实例化
			if ('<%=request.getAttribute("id")%>' == 'false') {
				document.getElementById('tip2').innerHTML = "密码错误";
				Request.id = 0;
				<% request.setAttribute("id", "0"); %>
				return;
			}
		}
	</script>
</head>
<body onload="checkCode()">
	 <div align="center" style="">
    	<h1>购房用户登录</h1>
    	<br>
      <br>
      <hr>
      <br>
	<div style="width: 1300px;margin: 0 auto; ">
		<div style="width: 700px;height:240; background-color: #CDCDCD;border-radius: 20px;">
			
			<form action="PurchaserManage" method="post"  onsubmit="return check()">
			<input type="hidden" name="operate" value="infoLogin" />
			<table width="500px" height="200" border="0" align="center" style="margin: 0 0 0 100px ;">
			<tr>
				<td width="150">证件号码</td>    
				<td width="300"><input name="CARDCODE" type="text"id="PURCHASER_ID" size="20"><span id="tip" style="color: red;"></span></td>      
			</tr>
			 
			<tr>
				<td width="150">密码</td>    
				<td width="300"><input name="PASSWORD" type="password"id="PASSWORD" size="20"><span id="tip2" style="color: red;"></span></td>      
			</tr>
			
			<tr>
				<td ></td>
				<td width="300" ><input type="submit" value="登录" name="Submit"></td>
			</tr>
		</table>
		
	</form>

		</div>
	</div>
	</div>
</body>
</html>