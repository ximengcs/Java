<%@page import="entry.Purchaser"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>购房用户信息表</title>
</head>
<body>
	<div align="center" style="">
    	<h1>个人信息</h1>
    	<br>
      <br>
      <hr>
      <br>
    	<div style="border-radius: 20px;background-color: #CDCDCD;width:600px;height:360px;margin:0 auto; padding-left: 100px;padding-top: 40px;">
      
	<%
		Purchaser purchaser = (Purchaser) request.getSession().getAttribute("object");
	%>
	<table border="0" width="500px" height="300px"  cellspacing="0px" cellpadding="0px">
		<tr>
			<td width="133">购房用户ID</td>    
			<td width="198"><%=purchaser.getPURCHASER_ID()%></td>      
		</tr>
		<tr>
			<td width="133">抽奖序号</td>    
			<td width="198">
			<% 
				if(purchaser.getROCKNUMBER() == 0) {
					out.print("无");
				} else {
					out.print(purchaser.getROCKNUMBER());
				}
			%>
			</td>  
		</tr>
		<tr>
			<td width="133">真实姓名</td>    
			<td width="198"><%=purchaser.getREALNAME()%></td>      
		</tr>
		<tr>
			<td width="133">证件类型</td>    
			<td width="198"><%=purchaser.getCARDTYPE()%></td>  
		</tr>
		<tr>
			<td width="133">手机号码</td>    
			<td width="198"><%=purchaser.getMOBILEPHONE()%></td>      
		</tr>
		<tr>
			<td width="133">购置类型</td>    
			<td width="198"><%=purchaser.getPURCHASETYPE()%></td>  
		</tr>
		<tr>
			<td width="133">是否缴纳保证金</td>    
			<td width="198">
				<%
					if (purchaser.getISMARGIN() == 1)
						out.print("是");
					else
						out.print("否");
				%>
			</td>      
		</tr>
		<tr>
			<td width="133">审核状态</td>    
			<td width="198"><%=purchaser.getVERIFYSTATUS()%></td>  
		</tr>
		<tr>
			<td width="133">请求状态</td>    
			<td width="198"><%=purchaser.getREQUESTSTATUS()%></td>      
		</tr>
		<tr>
			<td width="133">楼盘ID</td>    
			<td width="198">
			<% 
				if(purchaser.getESTATE_ID() == 0) {
					out.print("无");
				} else {
					out.print(purchaser.getESTATE_ID());
				}
			%></td>  
		</tr>

		<tr>
			<td width="133">提交时间</td>    
			<td width="198"><%=purchaser.getREGISTRATIONTIME()%></td>  
		</tr>
		<tr>
			<td width="133">选房结果</td>    
			<td width="198">
			<% 
				if(purchaser.getSELECT_HOUSE_RESULT().equals("0")) {
					out.print("无");
				} else {
					out.print(purchaser.getSELECT_HOUSE_RESULT());
				}
			%></td>  
		</tr>
	</table>
	</div>
	</div>
<body>
</body>
</html>
