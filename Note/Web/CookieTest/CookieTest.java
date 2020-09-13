import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class CookieTest {
	@Override
	public void doGet( HttpServletRequest request, HttpServletResponse response )
	throws IOException, ServletException {
		
		// 设置响应的文档类型
		response.setContentType( "text/html" );
		// 得到表单中提交的用户名
		String name = request.getParameter( "username" );
		// 建立一个Cookie来存放用户名 
		Cookie cookie = new Cookie( "username", name );
		// 设置cookie的存活时间
		cookie.setMaxAge( 30*60 );
		// 将此cookie增加为“Ser-Cookie”响应首部
		
		// 请求转发给JSP处理
		RequestDispatcher view = request.getRequestDispatcher( "cookieresult.jsp" );
		view.forward( request, response );
	}
}