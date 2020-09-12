<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>我的论坛</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	
	<link rel="stylesheet" type="text/css" href="css/style.css">
	
  </head>
  <body>
    
    <img src="" class="title"/> 
    <div class="menu">
     	<img src="image/icon_time.png" class="icon_time">
     	<span id="time"></span>
    	<table>
    	<tr>
    		<td>首　　页</td>
    		<td>登　　录</td>
    		<td>我的帖子</td>
    		<td>精华帖子</td>
    		<td>进入后台</td>
    		<td>注　　册</td>
    		<td>注　　销</td>
    	</tr>
    	</table>
    </div>
    
    <div class="shout"></div>
    
    <div class="state"></div>

  </body>
  
  <script language="javascript">
  	var time = document.getElementById( "time" );
  
  	function now() {
  		time.innerText = new Date().toLocaleString();
  	}
  	
  	setInterval( "now()", 1000 );
  </script>
</html>
