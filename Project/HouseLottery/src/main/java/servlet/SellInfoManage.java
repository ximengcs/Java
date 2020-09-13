package servlet;

import java.io.IOException;
import java.sql.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.fabric.Response;

import dao.HouseSourceDao;
import dao.HouseSourceDaoImplement;
import dao.IssueTimeDaoImplement;
import entry.HouseSource;
import util.Transform;

/**
 * 销售公告管理 Servlet implementation class SellInfoManage
 */
public class SellInfoManage extends HttpServlet {
	private static final long serialVersionUID = 1L;
	HouseSourceDao houseSourceDao = new HouseSourceDaoImplement();
	IssueTimeDaoImplement issueTimeDaoImplement = new IssueTimeDaoImplement();

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public SellInfoManage() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 设置请求文本编码
		request.setCharacterEncoding("utf-8");
		String operate = request.getParameter("operate");
		/*
		 * 销售公告提交操作issueSelectHouseTime
		 */
		if (operate.equals("Salesannouncement")) {
			Salesannouncement(request, response);
		} else if (operate.equals("toHouseResourceInfo")) {
			houseInfoDisplay(request, response);
		} else if (operate.equals("issueRockTime")) {
			issueRockTime(request, response);
		} else if (operate.equals("issueSelectHouseTime")) {
			issueSelectHouseTime(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

	/**
	 * 销售公告发布后台
	 */
	public void Salesannouncement(HttpServletRequest request, HttpServletResponse response) {
		boolean effect = false;
		effect = houseSourceDao.addInfo(
				/* Integer.parseInt(request.getParameter("EATATE_ID")), */
				request.getParameter("EATATE_NAME"), request.getParameter("ENTERPRISE_NAME"),
				request.getParameter("PHONE"), request.getParameter("BUILDING_NO"),
				Transform.StringToDate(request.getParameter("RECEIVE_METERIAL_TIME")),
				Transform.StringToDate(request.getParameter("PURPOSE_REGISTER_START_TIME")),
				Transform.StringToDate(request.getParameter("PURPOSE_REGISTER_END_TIME")),
				Integer.parseInt(request.getParameter("IDENTIFICATION_ID")),
				request.getParameter("RECEIVE_METERIAL_ADDRESS"),
				Transform.StringToDate(request.getParameter("LOTIERY_START_TIME")),
				Transform.StringToDate(request.getParameter("LOTIERY_END_TIME")),
				Transform.StringToDate(request.getParameter("SELECT_HOUSE_START_TIME")),
				Transform.StringToDate(request.getParameter("SELECT_HOUSE_END_TIME")));
		if (!effect) {
			try {
				request.getRequestDispatcher("/houtai/houtai_page2/sale_admin/success.html").forward(request, response);
			} catch (ServletException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} else {
			try {
				request.getRequestDispatcher("/houtai/houtai_page2/sale_admin/failure.html").forward(request, response);
			} catch (ServletException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	/**
	 * 房源信息显示
	 */
	public void houseInfoDisplay(HttpServletRequest request, HttpServletResponse response) {
		// 调入信息

		// 传入jsp
		// 调用查的方法
		List<HouseSource> houseList = houseSourceDao.selectInfoAll();
		// 添加到request作用域中
		request.setAttribute("houseList", houseList);
		// 将属性存储到属性中
		// request.setAttribute("pageNumber", pageNumber);
		// request.setAttribute("pageCount", pageCount);
		// 转发到newsList.jsp页面
		try {
			request.getRequestDispatcher("showHouseInfomation.jsp").forward(request, response);
		} catch (ServletException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * 销售公告审核
	 */
	public void sellInfoVerify() {

	}

	/**
	 * 摇号分组方式
	 */
	public void groupMethod() {

	}

	/**
	 * 摇号分组方式审核
	 */
	public void groupMethodVerify() {

	}

	/**
	 * 发布摇号时间
	 */
	public void issueRockTime(HttpServletRequest request, HttpServletResponse response) {
		Date date = Transform.StringToDate(request.getParameter("yaohao_time"));
		issueTimeDaoImplement.verifyRockTime(date);
		try {
			request.getRequestDispatcher("/houtai/houtai_page2/sale_admin/sale.html").forward(request, response);
		} catch (ServletException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * 摇号时间审核
	 */
	public void rockTime(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("xuan_house_time" + request.getParameter("xuan_house_time"));
	}

	/**
	 * 发布选房时间
	 */
	public void issueSelectHouseTime(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("xuan_house_time" + request.getParameter("xuan_house_time"));
		Date date = Transform.StringToDate(request.getParameter("xuan_house_time"));
		issueTimeDaoImplement.verifySelectHouseTime(date);
		try {
			request.getRequestDispatcher("houtai/houtai_page2/sale_admin/sale.html").forward(request, response);
		} catch (ServletException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * 选房时间审核
	 */
	public void selectTimeVerify() {

	}
}
