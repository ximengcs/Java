package login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entry.User;
import login.service.LoginService;

@WebServlet("/Login.do")
public class LoginUser extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String username = request.getParameter( "username" );
		String password = request.getParameter( "password" );
		
		LoginService login = new LoginService();
		User user = login.check( username, password );
		
		response.setContentType( "text/html" );
		response.setCharacterEncoding("utf-8");
		
		PrintWriter out = response.getWriter();
		
		out.print( "<html><body>" );
		if( user == null )
			out.print( "登录失败&nbsp;<a href='login'>点击返回</a>" );
		else {
			out.print( 
					"<table border=1>"
					+ "<tr><td>" + user.getUsername() + "</td></tr>"
					+ "<tr><td>" + user.getPassword() + "</td></tr>"
					+ "<tr><td>" + user.getQq() + "</td></tr>"
					+ "<tr><td>" + user.getPhone() + "</td></tr>"
					+ "</table><br/><a href='index.jsp'>点击返回</a>");
		}
		out.print( "</body></html>" );
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
