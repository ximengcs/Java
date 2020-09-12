package servlet;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletResponseWrapper;

public class MyServlet extends HttpServletResponseWrapper {

	public MyServlet(HttpServletResponse response) {
		super(response);
	}

}
