package test;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Test7")
public class Test7 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute( "foo", 1 ); // 请求域设置参数
		request.getSession().setAttribute( "foo", 2 ); // 会话作用域设置参数
		request.getServletContext().setAttribute( "foo", 2 );
		getServletContext().setAttribute( "foo", 4 );
		getServletConfig().getServletContext().setAttribute( "foo", 3 );
		
		request.getRequestDispatcher( "test7.jsp" ).forward( request, response );
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
