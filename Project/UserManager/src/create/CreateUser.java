package create;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entry.User;

import create.service.*;

@WebServlet("/Create.do")
public class CreateUser extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		User user = new User( request.getParameter("username"), 
				request.getParameter("password"), 
				Integer.valueOf(request.getParameter("qq")), 
						Integer.valueOf(request.getParameter("phone")) ) ;
		
		CreateService dao = new CreateService();
		
		dao.create( user );
		
		response.setContentType( "text/html" );
		response.setCharacterEncoding("utf-8");
		
		PrintWriter out = response.getWriter();
		
		out.print( "<html><body>" );
		out.print( "创建成功&nbsp;<a href='index.jsp'>点击返回首页</a>" );
		out.print( "</body></html>" );
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
