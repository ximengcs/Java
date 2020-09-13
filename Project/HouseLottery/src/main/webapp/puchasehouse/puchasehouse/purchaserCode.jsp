<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
	<meta charset="UTF-8">
	<title>你的密码</title>
	<script language="javascript">
		function submit() {
			location.href="SellInfoManage?operate=toHouseResourceInfo";
		}
	</script>

</head>
<body>
	<p style="font-size: 25px;margin-left: 600px;">登记成功</p>
	<hr style="height: 5px; background-color: #CDCDCD;margin-top: 50px;">
	<div style="border:1px solid #CDCDCD;width: 722px; height: 293px;margin:0 auto;border-radius: 20PX;background-color: #CDCDCD;">
		<p><font size="10" color=></font></p>
		<table width="300" height="200" border="0" align="center">
			<tr>
				<td style="color:red;font-size:20px"><span style="color: black;">你的随机密码为:</span><% out.print(request.getAttribute("password")); %></td>
			</tr>
			<tr>
				<th><input type="button" class="btn" onclick="submit()" style="width: 100px;font-size: 18px;"	 value="返回" name=""></th>
			</tr>
		</table>
	</div>


</body>
</html>