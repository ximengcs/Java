package servlet;

import java.awt.SecondaryLoop;
import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.HouseSourceDao;
import dao.HouseSourceDaoImplement;
import dao.StaffDao;
import dao.StaffDaoImplement;
import entry.HouseSource;
import entry.Staff;

/**
 * 员工管理 Servlet implementation class StaffManage
 */
public class StaffManage extends HttpServlet {
	private static final long serialVersionUID = 1L;
	StaffDao staffDao = new StaffDaoImplement();
	HouseSourceDao houseSourceDao = new HouseSourceDaoImplement();

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public StaffManage() {
		super();
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
		 * 销售公告提交操作
		 */
		if (operate.equals("staffLogin")) {
			staffLogin(request, response);
		} else if (operate.equals("superManage")) {
			superManager(request, response);
		} else if (operate.equals("superHouseSourceInfo")) {
			superHouseSourceInfo(request, response);
		} else if (operate.equals("staffList")) {
			staffList(request, response);
		} else if (operate.equals("superPasswordRevise")) {
			superPasswordRevise(request, response);
		} else if (operate.equals("staffAdd")) {
			staffAdd(request, response);
		} else if (operate.equals("staffPasswordRevise")) {
			staffPasswordRevise(request, response);
		} else if (operate.equals("superManagerQuit")) {
			superManagerQuit(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

	/**
	 * 超级管理员登录
	 */
	public void superManager(HttpServletRequest request, HttpServletResponse response) {
		// 查询数据库查看员工是否在数据库中
		Staff superManage = staffDao.selectInfo(0);
		String password = request.getParameter("pwd");
		// 如果密码正确
		if (password.equals(superManage.getEMPLOYEE_PASSWORD())) {

			// 查询成功则建立一个session
			HttpSession session = request.getSession(true);
			session.setAttribute("user", "super");
			session.setAttribute("username", "super");
			session.setAttribute("password", "123456");
			try {// 密码验证成功
				response.sendRedirect("PurchaserManage?operate=personInfoManage");
			} catch (IOException e) {
				e.printStackTrace();
			}
		} else { // 如果密码错误
			try {
				request.setAttribute("id", "false");
				request.getRequestDispatcher("superlogin.jsp").forward(request, response);
			} catch (ServletException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	/**
	 * 超级管理员房源信息管理
	 */
	public void superHouseSourceInfo(HttpServletRequest request, HttpServletResponse response) {
		//
		List<HouseSource> houseList = houseSourceDao.selectInfoAll();
		// 添加到request作用域中
		request.setAttribute("houseList", houseList);
		// 将属性存储到属性中
		// request.setAttribute("pageNumber", pageNumber);
		// request.setAttribute("pageCount", pageCount);
		// 转发到newsList.jsp页面
		try {
			request.getRequestDispatcher("/UIback/houseresoure1.jsp").forward(request, response);
		} catch (ServletException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * 超级管理员密码修改
	 */
	public void superPasswordRevise(HttpServletRequest request, HttpServletResponse response) {
		String old_psw = request.getParameter("old_psw");
		String new_psw = request.getParameter("new_psw");
		String ok_psw = request.getParameter("ok_psw");
		
		String data_psw = staffDao.selectInfo(0).getEMPLOYEE_PASSWORD();
		if(old_psw.equals(data_psw)) { //旧密码输入正确
			if(new_psw.equals(ok_psw)) {//两次新密码输入相同
				staffDao.verifyInfo(0, "super", new_psw, 0);
				
				try {
					request.getRequestDispatcher("/UIback/main.jsp").forward(request, response);
				} catch (ServletException | IOException e) {
					e.printStackTrace();
				}
			}
		} else { //旧密码输入错误
			try {
				request.getRequestDispatcher("/update_password/xiugaimima/index.jsp").forward(request, response);
			} catch (ServletException | IOException e) {
				e.printStackTrace();
			}
		}
	}

	/**
	 * 超级管理员退出登录
	 */
	public void superManagerQuit(HttpServletRequest request, HttpServletResponse response) {
		HttpSession session = request.getSession();
		//如果是超级管理员
		if(session.getAttribute("user").equals("super")) {
			
		}
	}
	
	/**
	 * 员工列表
	 */
	public void staffList(HttpServletRequest request, HttpServletResponse response) {
		// 调用查询新闻集合的方法
		List<Staff> staffList = staffDao.selectAllInfo();
		// 添加到request作用域中
		request.setAttribute("staffList", staffList);
		// 将属性存储到属性中
		// request.setAttribute("pageNumber", pageNumber);
		// request.setAttribute("pageCount", pageCount);
		// 转发到newsList.jsp页面
		System.out.println("test");
		try {
			request.getRequestDispatcher("/UIback/person1.jsp").forward(request, response);
		} catch (ServletException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * 用户添加
	 */
	public void staffAdd(HttpServletRequest request, HttpServletResponse response) {

		int verify = 1;

		if(request.getParameter("chaxun")!=null&&request.getParameter("chaxun").equals("chaxun")) {
			verify = 1;
		}
		if(request.getParameter("xiugai")!=null && request.getParameter("xiugai").equals("xiugai")) {
			verify += 2;
		}
		if(request.getParameter("shenhe")!=null&&request.getParameter("shenhe").equals("shenhe")) {
			verify += 4;
		}
		if(request.getParameter("fanshenhe")!=null&&request.getParameter("fanshenhe").equals("fanshenhe")) {
			verify += 8;
		}
		
		staffDao.addInfo(
				Integer.parseInt(request.getParameter("EMPLOYEE_ID")), 
				request.getParameter("EMPLOYEE_NAME"), 
				request.getParameter("EMPLOYEE_PASSWORD"), 
				verify);
		String username = (String) request.getSession().getAttribute("username");
		try {
			if( username != null ) {
				if(username.equals("super")) {
					request.getRequestDispatcher("StaffManage?operate=staffList").forward(request, response);
				} else {
					request.getRequestDispatcher("Web_tianjia/success.html").forward(request, response);
				} 
			}
		} catch (ServletException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * 用户密码修改(未完成)
	 */
	public void staffPasswordRevise(HttpServletRequest request, HttpServletResponse response) {
		String old_psw = request.getParameter("old_psw");
		String new_psw = request.getParameter("new_psw");
		String ok_psw = request.getParameter("ok_psw");
		
		HttpSession session = request.getSession();
		
		if(!session.isNew() ) {
			System.out.println("old");
			Object username= session.getAttribute("username");
			if(new_psw.equals(ok_psw)) {//两次新密码输入相同
				staffDao.verifyInfo(0, "super", new_psw, 0);
				try {
					request.getRequestDispatcher("/UIback/main.jsp").forward(request, response);
				} catch (ServletException | IOException e) {
					e.printStackTrace();
				}
			}
		}

		/*String data_psw = staffDao.selectInfo(Integer.parseInt(username)).getEMPLOYEE_PASSWORD();
		String realname = staffDao.selectInfo(Integer.parseInt(username)).getEMPLOYEE_NAME();

		System.out.println("psw" + data_psw + " realname" + realname);

		if(old_psw.equals(data_psw)) { //旧密码输入正确
			if(new_psw.equals(ok_psw)) {//两次新密码输入相同
				staffDao.verifyInfo(Integer.parseInt(username), realname, new_psw, 3);
				try {
					request.getRequestDispatcher("/houselottery/src/main/webapp/houtai_page/xiugaimima/index.html").forward(request, response);
				} catch (ServletException | IOException e) {
					e.printStackTrace();
				}
			}
		} else { //旧密码输入错误
			try {
				request.getRequestDispatcher("/houselottery/src/main/webapp/houtai_page/xiugaimima/index.htmls").forward(request, response);
			} catch (ServletException | IOException e) {
				e.printStackTrace();
			}
		}*/
	}

	/**
	 * 售楼方员工登录
	 */
	public boolean staffLogin(HttpServletRequest request, HttpServletResponse response) {
		boolean effect = false;
		// 查询数据库查看员工是否在数据库中
		String username_ = request.getParameter("username");
		Staff staff = null;
		if(!username_.equals("")) {
			staff = staffDao.selectInfo(Integer.parseInt(username_));
		}
		String password = request.getParameter("pwd");

		//如果用户名或密码有一个为空
		if(username_.equals("") || password.equals("")) {
			try {
				request.getRequestDispatcher("/employeelogin.jsp").forward(request, response);
			}catch (IOException e) {
				e.printStackTrace();
			} catch (ServletException e) {
				e.printStackTrace();
			}
			return false;
		}
		
		// 如果密码正确
		if (staff!=null&&password.equals(staff.getEMPLOYEE_PASSWORD())) {
			// 查询成功则建立一个session
			HttpSession session = request.getSession();
			session.setAttribute("username", request.getParameter("username"));
			session.setAttribute("pwd", request.getParameter("pwd"));
			try {
				request.getRequestDispatcher("/houtai/houtai_page2/index.html").forward(request, response);
			} catch (ServletException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} else { // 如果密码错误
			try {
				request.setAttribute("id", "false");
				request.getRequestDispatcher("/employeelogin.jsp").forward(request, response);
			} catch (ServletException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		return effect;
	}
}