import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class CookieTest {
	@Override
	public void doGet( HttpServletRequest request, HttpServletResponse response )
	throws IOException, ServletException {
		
		// ������Ӧ���ĵ�����
		response.setContentType( "text/html" );
		// �õ������ύ���û���
		String name = request.getParameter( "username" );
		// ����һ��Cookie������û��� 
		Cookie cookie = new Cookie( "username", name );
		// ����cookie�Ĵ��ʱ��
		cookie.setMaxAge( 30*60 );
		// ����cookie����Ϊ��Ser-Cookie����Ӧ�ײ�
		
		// ����ת����JSP����
		RequestDispatcher view = request.getRequestDispatcher( "cookieresult.jsp" );
		view.forward( request, response );
	}
}