package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Test1
 */
@WebServlet(
		name = "Test2", 
		description = "this is a parameter", 
		urlPatterns = { "/Test2.do" }, 
		initParams = { 
				@WebInitParam(name = "test1", value = "1", description = "this is a parameter")
		})
public class Test1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		// 获取所有表单中的input
		Enumeration<String> enumeration = request.getParameterNames();
		out.print( "<html><body>" );
		while(enumeration.hasMoreElements()) {
			String next = enumeration.nextElement();
			out.print( 
				next + 
				"<input type='text' disabled='disabled'"
				+ " value='"+ request.getParameterValues(next) + "'/>"
				+ "<br/>"
			);
		}
		out.print( "</body></html>" );
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
