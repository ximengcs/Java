package com.example.web;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;
import com.example.model.*;

public class BeerSelect extends HttpServlet {
// v1.0
	// request 为请求   response响应
	/*public void doPost( HttpServletRequest request, HttpServletResponse response )
		throws IOException, ServletException {
		response.setContentType( "text/html" );  	// 设置响应的文件类型
													// 为保证正确性，必须在响应提交
													// 到输出之前调用这个方法
		// 返回的对象记录了响应的实体
		PrintWriter out = response.getWriter();  
		out.println( "Beer Selection Advice<br>" );  // 输出
		String c = request.getParameter( "color" );	 // 获取指定参数(name)的值
		out.println( "<br>Got beer colo " + c );	  
	}*/
	
// v2.0
	/*public void doPost( HttpServletRequest request, HttpServletResponse response ) 
		throws IOException, ServletException {
			String c = request.getParameter( "color" );
			BeerExpert be = new BeerExpert();  // "专家"实例
			List result = be.getBrands( c );
			
			response.setContentType( "text/html" );  // 设置正确的响应文件
			PrintWriter out = response.getWriter();
			out.println( "Beer Selection Advice<br>" );
			
			Iterator it = result.iterator();
			while( it.hasNext() ) {
				out.print( "<br/>try : " + it.next() );
			}
		}*/
// v3.0
	public void doPost( HttpServletRequest request, HttpServletResponse response )
		throws IOException, ServletException {
			
			String c = request.getParameter( "color" );  // 得到属性
			BeerExpert be = new BeerExpert();   // 模型对象
			List result = be.getBrands( c );    // 把模型返回的回答增加到请求对象
			
			request.setAttribute( "styles", result ); // 为请求对象增加一个属性,供jsp使用
			
			// 为JSP实例化一个请求分派器
			RequestDispatcher view = request.getRequestDispatcher( "result.jsp" );
			
			// 使用请求分派器要求容器准备好JSP，并向JSP发送请求和响应
			view.forward(  request, response );
		}
}