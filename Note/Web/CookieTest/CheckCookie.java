import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class CheckCookie {
	@Override
	public void doGet( HttpServletRequest request, HttpServletResponse response )
	throws IOException, ServletException {
		response.setContentType( "text/html" );
		PrintWriter out = response.getWriter();
		
		// 从请求得到cookie
		Cookie[] cookies = request.getCookies();
		
		if( cookies != null ) {
			for( int i = 0; i < cookie.length; i++ ) {
				Cookie cookie = cookies[i];
				// 查找一个名为username的cookie,如果有这样一个cookie，得到它的值，并打印
				if( cookie.getName().equals( "username" ) ) {
					String username = cookie.getValue();
					out.println( "Hello " + username );
					break;
				}
			}
		}
	}
}