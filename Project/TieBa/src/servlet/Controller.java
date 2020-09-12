package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.BaDao;

/**
 * Servlet implementation class Controller
 */
@WebServlet("/Controller")
public class Controller extends HttpServlet {

	/**
	 * 数据库连接
	 */
	private BaDao ba = null;

	@Override
	public void init() {
		ba = new BaDao();
	}

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 设置正文编码格式
		//request.setCharacterEncoding("UTF-8");

		/*
		 * 如果请求是首页
		 */
		if (request.getParameter("operate").equals("firstPage")) {
			// 将吧信息设置到请求
			request.setAttribute("ba", ba.getAllBa());

			// 转发请求到首页
			request.getRequestDispatcher("firstPage.jsp").forward(request, response);
		}
	}
}
