import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class CheckCookie {
	@Override
	public void doGet( HttpServletRequest request, HttpServletResponse response )
	throws IOException, ServletException {
		response.setContentType( "text/html" );
		PrintWriter out = response.getWriter();
		
		// ������õ�cookie
		Cookie[] cookies = request.getCookies();
		
		if( cookies != null ) {
			for( int i = 0; i < cookie.length; i++ ) {
				Cookie cookie = cookies[i];
				// ����һ����Ϊusername��cookie,���������һ��cookie���õ�����ֵ������ӡ
				if( cookie.getName().equals( "username" ) ) {
					String username = cookie.getValue();
					out.println( "Hello " + username );
					break;
				}
			}
		}
	}
}