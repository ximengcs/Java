<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>超级管理员登录</title>
</head>
<body>

	<div id="content"  style="margin:0 auto; width:1000px; height:500px; position:relative;">
		<form action="../StaffManage" method="post">
			<input type="hidden" name="operate" value="superManage" />
			<table width="341" height="460" border="0" align="center">
				<div class="login"
					style="position: absolute; top: 196px; left: 503px; margin-top: -70px; margin-left: -200px; background: #90F; width: 400px; height: 200px; border-radius: 10px; background-color: #D3E5CB;">
					     
					<div style=" margin-left:11px;margin-top:40px">
						       
						<p style="display: inline">超级管理员:</p>
						          <input type="text" value="" name="username" />  
					</div>
					     
					<div style="margin-left:45px;margin-top:30px">
						       
						<p style="display: inline">密&nbsp;码:</p>
						            <input type="password" value="" name="pwd" />  

					</div>
					     
					<div style=" text-align:center;margin-top:30px">
						        <input type="submit" name="Submit" value="登录"
							style="margin-right: 10px; padding: 5px 15px; background: #F9C; border-radius: 3px; border: #F0C 1px solid;" />
						            <input class="button" type="button" value="重置"
							style="padding: 5px 15px; background: #F9C; border-radius: 3px; border: #F0C 1px solid;" /> 
					</div>
				</div>
			</table>
		</form>
	</div>
	      

</body>
 
</html>
