<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
	<head>
		<meta charset="UTF-8">
		<title>购房摇号系统后台</title>
		<link rel="stylesheet" href="/houselottery/UIback/css/main.css" type="text/css" />	
</head>
	<body>
		<div id="id_main">
	      <div id="header">
				<div id="id_info1">
					<p>超级管理员后台</p>
				    <hr  size="5" color="#0000FF"/>
				</div>
				<div id="id_info2">
					<p>声明</p>
					<h1>根据我市人民政府办公厅《关于进一步加强管理保持房地产市场持续平稳健康发展的若干意见》(市政发[2017]23号)、《关于调整我市住房交易政策有关问题的通知》(市政办发[2017]59号)、《关于进一步稳定住房市场发展有关问题的通知》(市政发[2017]51号)、《关于进一步规范商品住房交易秩序有关问题的通知》（市政办发[2018]61号）的相关要求,因意向购房登记人多于可售房源,故采用公证摇号排序选房方式出售房源。	
					</h1>
				</div>
			</div>
			<div id="center"> 
				<div id="id_info3">
					<ul>
						<li><a href="PurchaserManage?operate=personInfoManage">用户信息管理</a></li>
						<li><a href="/houselottery/UIback/restigerInformation.html">公告信息管理</a></li>
						<li><a href="StaffManage?operate=superHouseSourceInfo">房源信息管理</a></li>
						<li><a href="StaffManage?operate=staffList">员工信息管理</a></li>
						<li style="float: right;"><a href="http://www.baidu.com">退出登录</a></li>
						<li style="float: right;"><a href="/houselottery/update_password/xiugaimima/index.jsp">修改密码</a></li>
					</ul>
					<br />
					<br />
					<hr  size="2" color="#0000FF"/>
				</div>
				<div id="id_info4">
					<label>项目名称</label>
					<input type="text" size="50" />
					<input type="button"value="搜索"/>
					<label style="float: right; color: #cccccc;" >登记时间 8:00-18:00</label>
					<br />
					<br />
					<hr  size="2" color="#cccccc"/>
			</div>
	     </div>
	     <div id="id_info5"  style="overflow-y:scroll;width:1740px;">
	     	<table id="table_id" >
				<tr>
					<td id="PERCHASERID"><a href="#">交易编号</a></td>
					<td id="PEALNAME"><a href="#">真实姓名</a></td>
					<td id="CARDTYPE"><a href="#">证件类型</a></td>
					<td id="CARDCODE"><a href="#">证件号码</a></td>
					<td id="MOLIEPHONE"><a href="#">手机号码</a></td>
					<td id="PUCHASRTYPE"><a href="#">购置类型</a></td>
					<td id="PASSWORD"><a href="#">登录密码</a></td>
					<td id="CARDCODE"><a href="#">缴纳保证金</a></td>
					<td id="VERIFYSTATUS"><a href="#">审核状态</a></td>
					<td id="REQUESTSTATUS"><a href="#">请求状态</a></td>
					<td id="REGISTRTIONTIME"><a href="#">提交时间</a></td>
				</tr>
			</table>
	     </div>
	     <div id="id_info5"  style="overflow-y:scroll;height: 250px;width:1740px;">
	     	<table id="table_id" >
				
				<c:forEach items="${purchaserInfoList}" var="purchaserInfo">
				<tr>
					<td id="PERCHASERID"><a href="#">${purchaserInfo.PURCHASER_ID}</a></td>
					<td id="PEALNAME"><a href="#">${purchaserInfo.REALNAME}</a></td>
					<td id="CARDTYPE"><a href="#">${purchaserInfo.CARDTYPE}</a></td>
					<td id="CARDCODE"><a href="#">${purchaserInfo.CARDCODE}</a></td>
					<td id="MOLIEPHONE"><a href="#">${purchaserInfo.MOBILEPHONE}</a></td>
					<td id="PUCHASRTYPE"><a href="#">${purchaserInfo.PURCHASETYPE}</a></td>
					<td id="PASSWORD"><a href="#">${purchaserInfo.PASSWORD}</a></td>
					<td id="CARDCODE"><a href="#">${purchaserInfo.ISMARGIN}</a></td>
					<td id="VERIFYSTATUS"><a href="#">${purchaserInfo.VERIFYSTATUS}</a></td>
					<td id="REQUESTSTATUS"><a href="#">${purchaserInfo.REQUESTSTATUS}</a></td>
					<td id="REGISTRTIONTIME"><a href="#">${purchaserInfo.REGISTRATIONTIME}</a></td>
				</tr>
				</c:forEach>
				
			</table>
	     </div>
					
		</div>
	
	</body>  
</html>
