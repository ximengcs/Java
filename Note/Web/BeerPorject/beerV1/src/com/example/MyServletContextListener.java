package com.example;

import javax.servlet.*;

public class MyServletContextListener implements ServletContextListener {
	@Override
	public void contextInitialized( ServletContextEvent event ) {
		ServletContext sc = event.getServletContext();  // ���¼��õ�ServletContext
		String dogBreed = sc.getInitParameter( "breed" ); // �õ���ʼ������
		Dog d = new Dog( dogBreed );
		sc.setAttribute( "dog", d );   
	}
	
	public void contextDestoryed( ServletContextEvent event ) {
		// 
	}
}