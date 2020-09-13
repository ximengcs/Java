package com.example.web;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;
import com.example.model.*;

public class BeerSelect extends HttpServlet {
// v1.0
	// request Ϊ����   response��Ӧ
	/*public void doPost( HttpServletRequest request, HttpServletResponse response )
		throws IOException, ServletException {
		response.setContentType( "text/html" );  	// ������Ӧ���ļ�����
													// Ϊ��֤��ȷ�ԣ���������Ӧ�ύ
													// �����֮ǰ�����������
		// ���صĶ����¼����Ӧ��ʵ��
		PrintWriter out = response.getWriter();  
		out.println( "Beer Selection Advice<br>" );  // ���
		String c = request.getParameter( "color" );	 // ��ȡָ������(name)��ֵ
		out.println( "<br>Got beer colo " + c );	  
	}*/
	
// v2.0
	/*public void doPost( HttpServletRequest request, HttpServletResponse response ) 
		throws IOException, ServletException {
			String c = request.getParameter( "color" );
			BeerExpert be = new BeerExpert();  // "ר��"ʵ��
			List result = be.getBrands( c );
			
			response.setContentType( "text/html" );  // ������ȷ����Ӧ�ļ�
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
			
			String c = request.getParameter( "color" );  // �õ�����
			BeerExpert be = new BeerExpert();   // ģ�Ͷ���
			List result = be.getBrands( c );    // ��ģ�ͷ��صĻش����ӵ��������
			
			request.setAttribute( "styles", result ); // Ϊ�����������һ������,��jspʹ��
			
			// ΪJSPʵ����һ�����������
			RequestDispatcher view = request.getRequestDispatcher( "result.jsp" );
			
			// ʹ�����������Ҫ������׼����JSP������JSP�����������Ӧ
			view.forward(  request, response );
		}
}