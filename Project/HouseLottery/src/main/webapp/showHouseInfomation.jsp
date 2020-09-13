<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
	<meta charset="UTF-8">
	<link rel="stylesheet" href="css/showHouseInfo.css" type="text/css" />
	<script type="text/javascript" src="js/prototype.js" ></script>
    <script type="text/javascript" src="js/test.js"></script>
	<title>房源信息</title>
	
</head>
<body>
	<div class="head">
		<div class="h_info">
				<h1>房源信息</h1> 
		</div>
		<div class="h_link">		
			<ul>
				<%
					String user = (String)session.getAttribute("user");
					if(user==null) {
						out.print("<li><a href=\"table.jsp\">登录</a></li>" + 
								"<li><a href=\"puchasehouse/puchasehouse/puchasehouse.html\">登记</a></li>");
					}else{
						out.print("<li><a href=\"PurchaserManage?operate=purchaserQuit\">退出登录</a></li>" + 
								"<li><a href=\"#\">" + (String)session.getAttribute("realname") + "</a></li>");
					}
				%>
			</ul>
		</div>
	</div>
	<div class="logo">
		<ul>
			<li> <a href="index.html">首页</a></li>
			<li> <a href="SellInfoManage?operate=toHouseResourceInfo">房源信息显示</a></li>
			<li> <a href="showPronouncementInfo.html">公告信息</a></li>
		</ul>
	</div>
	<div class="main">
		<div class="main_content">
			<table cellpadding="0px" cellspacing="0px">
				<tr style="color: #999999; font-weight: bold; background-color: #F2F2F2;"> 
		            <td style="width: 52px;" id="EATATE_ID">楼盘序号</td>
		            <td style="width: 108px;" id="EATATE_NAME">楼盘名称</td>
		            <td style="width: 100px" id="ENTERPRISE_NAME">开发企业</td>
		            <td style="width: 92px;" id="PHONE">电话</td>
		            <td style="width: 92px;" id="BUILDING_NO">预(现)售楼栋号</td>
		            <td style="width: 105px;" id="RECEIVE_METERIAL_TIME">现场接受资料时间</td>
		            <td style="width: 105px;" id="PURPOSE_REGISTER_START_TIME">意向登记开始时间</td>
		            <td style="width: 105px;" id="PURPOSE_REGISTER_END_TIME">意向登记结束时间</td>
		            <td style="width: 90px;" id="IDENTIFICATION_ID">预（现）售证号</td>
		            <td style="width: 117px;" id="RECEIVE_METERIAL_ADDRESS">现场接受资料地点</td> 
		            <td style="width: 85px;" id="LOTIERY_START_TIME">摇号开始时间</td>
		            <td style="width: 85px;" id="LOTIERY_END_TIME">摇号结束时间</td>
		            <td style="width: 85px;" id="SELECT_HOUSE_START_TIME">选房开始时间</td>
		            <td style="width: 85px;" id="SELECT_ HOUSE_END_ TIME">选房结束时间</td>    
				</tr>
				<c:forEach items="${houseList}" var="houseInfo">
				<tr style="color: #999999; font-weight: bold; "> 
		            <td style="width: 52px;" id="EATATE_ID">${houseInfo.EATATE_ID}</td>
		            <td style="width: 108px;" id="EATATE_NAME">${houseInfo.EATATE_NAME}</td>
		            <td style="width: 112px" id="ENTERPRISE_NAME">${houseInfo.ENTERPRISE_NAME}</td>
		            <td style="width: 92px;" id="PHONE">${houseInfo.PHONE}</td>
		            <td style="width: 92px;" id="BUILDING_NO">${houseInfo.BUILDING_NO}</td>
		            <td style="width: 105px;" id="RECEIVE_METERIAL_TIME">${houseInfo.RECEIVE_METERIAL_TIME}</td>
		            <td style="width: 105px;" id="PURPOSE_REGISTER_START_TIME">${houseInfo.PURPOSE_REGISTER_START_TIME}</td>
		            <td style="width: 105px;" id="PURPOSE_REGISTER_END_TIME">${houseInfo.PURPOSE_REGISTER_END_TIME}</td>
		            <td style="width: 90px;" id="IDENTIFICATION_ID">${houseInfo.IDENTIFICATION_ID}</td>
		            <td style="width: 105px;" id="RECEIVE_METERIAL_ADDRESS">${houseInfo.RECEIVE_METERIAL_ADDRESS}</td> 
		            <td style="width: 85px;" id="LOTIERY_START_TIME">${houseInfo.LOTIERY_START_TIME}</td>
		            <td style="width: 85px;" id="LOTIERY_END_TIME">${houseInfo.LOTIERY_END_TIME}</td>
		            <td style="width: 85px;" id="SELECT_HOUSE_START_TIME">${houseInfo.SELECT_HOUSE_START_TIME}</td>
		            <td style="width: 85px;" id="SELECT_ HOUSE_END_TIME">${houseInfo.SELECT_HOUSE_END_TIME}</td>    
				</tr>	
				</c:forEach>
	       		<tr style="color: #999999;  "> 
			        
	       		</tr>
			</table>
		</div>	
		<!-- <div class="qingchufudong"></div> -->
	</div>
	<div class="footer">
		<!--<font color="#c5c5c5" size="h10"><center>西安工业大学七月实训@版权所有</center></font>-->
		<font color="#c5c5c5" size="h10"><center>西安工业大学七月实训xatu03@版权所有©&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;陕ICP备020442号&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;地址：陕西省西安市未央大学园区学府中路2号</center></font>
		<!--<font color="#c5c5c5" size="h10"><center>地址：陕西省西安市未央大学园区学府中路2号</center></font>-->
		<font color="#c5c5c5" size="h10"><center>邮编：710021&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;电话：029-86173074</center></font>
		<font color="#c5c5c5" size="h10"><center>实训基地：西安市长安区协同创新港产业园</center></font>
		<!--<font color="#c5c5c5" size="h10"><center>电话：029-86173074</center></font>-->
	</div>
</body>
</html>