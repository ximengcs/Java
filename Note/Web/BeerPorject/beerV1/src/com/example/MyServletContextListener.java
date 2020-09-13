package com.example;

import javax.servlet.*;

public class MyServletContextListener implements ServletContextListener {
	@Override
	public void contextInitialized( ServletContextEvent event ) {
		ServletContext sc = event.getServletContext();  // 由事件得到ServletContext
		String dogBreed = sc.getInitParameter( "breed" ); // 得到初始化参数
		Dog d = new Dog( dogBreed );
		sc.setAttribute( "dog", d );   
	}
	
	public void contextDestoryed( ServletContextEvent event ) {
		// 
	}
}