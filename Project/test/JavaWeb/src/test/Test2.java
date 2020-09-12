package test;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class Test2 implements ServletContextListener {

	@Override
	public void contextInitialized(ServletContextEvent sce) {
		System.out.println("servlet容器正在初始化..");
		ServletContext context = sce.getServletContext();
		String company = context.getInitParameter("company");
		context.setAttribute( "company", company );
	}
	
	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		System.out.println("servlet容器正在销毁");
	}
}
