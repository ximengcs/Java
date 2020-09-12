package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Test9
 */
@WebServlet("/Test9")
public class Test9 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute( "param1", "1" );
		request.getServletContext().setAttribute( "param2", "2" );
		request.getSession().setAttribute( "param3", "3" );
		
		request.setAttribute( "code", "requestcode" );
		request.getServletContext().setAttribute( "code", "applicationcode" );
		request.getSession().setAttribute( "code", "sessioncode" );
		
		request.getRequestDispatcher( "test9.jsp" ).forward( request, response );
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
