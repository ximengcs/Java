package com.newsmanager.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.newsmanager.dao.NewsDao;
import com.newsmanager.entity.News;

/**
 * Servlet implementation class NewsServlet
 */
public class NewsServlet extends HttpServlet {

	private NewsDao newsDao;

	@Override
	public void init() throws ServletException {
		newsDao = new NewsDao();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 设置请求文本编码
		request.setCharacterEncoding("utf-8");
		String operate = request.getParameter("operate");
		// 如果该次请求是添加新闻
		if ("addNews".equals(operate)) {
			String newstitle = request.getParameter("newstitle");
			String newstype = request.getParameter("newstype");
			String newscontent = request.getParameter("newscontent");
			int row = newsDao.addNews(newstitle, newstype, newscontent);
			// 重定向
			response.sendRedirect("NewsServlet");
		} else if ("delete".equals(operate)) {
			newsDao.deleteNews(Integer.valueOf(request.getParameter("value")));
			// 删除完成后重定向
			response.sendRedirect("NewsServlet");
		} else if ("psh".equals(operate)) {
			for (String str : request.getParameterValues("delete"))
				newsDao.shenheNews(Integer.valueOf(str));
			// 审核后重定向
			response.sendRedirect("NewsServlet");
		} else if ("ps".equals(operate)) {
			String[] arr = request.getParameterValues("delete");
			if (arr != null)
				for (String str : arr)
					newsDao.deleteNews(Integer.valueOf(str));
			// 完成批量删除后重定向
			response.sendRedirect("NewsServlet");
		} else if ("update".equals(operate)) {
			
		} else {
			Integer pageNumber = 1;
			String pn = request.getParameter("pageNumber");
			if (pn != null)
				pageNumber = Integer.valueOf(pn);

			Integer pageSize = 9;
			String ps = request.getParameter("pageSize");
			if (ps != null)
				pageSize = Integer.valueOf(ps);

			if (pageNumber <= 1)
				pageNumber = 1;
			int count = newsDao.getCount();
			int pageCount = count % (pageSize + 1);
			if (pageSize == 0) {
				// 该页末尾
				pageCount = count / (pageSize + 1);
			} else {
				pageCount = count / (pageSize + 1) + 1;
			}
			// 当 当前页面超出最大页面时将当前页面改为最大页面
			if (pageNumber > pageCount) {
				pageNumber = pageCount;
			}

			// 调用查询新闻集合的方法
			List<News> newsList = newsDao.getNewsList(pageNumber, pageSize);
			// 添加到request作用域中
			request.setAttribute("newsList", newsList);
			// 将属性存储到属性中
			request.setAttribute("pageNumber", pageNumber);
			request.setAttribute("pageCount", pageCount);
			// 转发到newsList.jsp页面
			request.getRequestDispatcher("newsList.jsp").forward(request, response);
		}

	}
}
