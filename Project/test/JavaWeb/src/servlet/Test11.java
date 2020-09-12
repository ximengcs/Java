package servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Test11
 */
@WebServlet("/Test11")
public class Test11 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 数组
		String[] strings = { "str1", "str2", "str3" };
		
		// List
		ArrayList<String> list = new ArrayList<String>();
		list.add( "list1" );
		list.add( "list2" );
		list.add( "list3" );
		
		// Map
		Map<String, String> map = new HashMap<String, String>();
		map.put( "map1", "mapvalue1" );
		map.put( "map2", "mapvalue2" );
		map.put( "map3", "mapvalue3" );
		
		request.setAttribute( "strings", strings );
		request.setAttribute( "list", list );
		request.setAttribute( "map", map );
		
		request.getRequestDispatcher( "test11.jsp" ).forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
