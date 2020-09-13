package servlet;

import java.io.IOException;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.PurchaserDao;
import dao.PurchaserDaoImplement;
import entry.Purchaser;
import entry.Staff;
import util.Test;

/**
 * 购房用户管理 Servlet implementation class PurchaserManage
 */
public class PurchaserManage extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private PurchaserDao purchaserDao = new PurchaserDaoImplement();

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public PurchaserManage() {
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
		if (operate.equals("personInfoManage")) {
			personInfoManage(request, response);
		} else if (operate.equals("registerInfo")) {
			registerInfo(request, response);
		} else if (operate.equals("infoLogin")) {
			infoLogin(request, response);
		} else if (operate.equals("purchaserQuit")) {
			purchaserQuit(request, response);
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
	 * 购房信息登记接口
	 */
	public void registerInfo(HttpServletRequest request, HttpServletResponse response) {
		// 获取表单信息

		// 用户姓名
		String REALNAME = request.getParameter("REALNAME");
		// 手机号码
		String MOBILEPHONE = request.getParameter("MOBILEPHONE");
		// 身份证号
		String CARDCODE = request.getParameter("CARDCODE");

		// 证件类型
		String CARDTYPE = request.getParameter("CARDTYPE");

		// 购置类型
		String PURCHASETYPE = request.getParameter("PURCHASETYPE");

		String ISMARGIN = request.getParameter("ISMARGIN");
		
		//如果有数据不合法
		if(REALNAME.equals("") || MOBILEPHONE.equals("") || CARDCODE.equals("") 
			|| CARDTYPE.equals("") || PURCHASETYPE.equals("") || ISMARGIN.equals("") ) {
				try {
					request.getRequestDispatcher("/puchasehouse/puchasehouse/puchasehouse.html").forward(request, response);
				} catch (ServletException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}
				return;
			}
		
		int password = new Random().nextInt(100000000);

		purchaserDao.addInfo(0, REALNAME, CARDTYPE, CARDCODE, MOBILEPHONE, PURCHASETYPE, String.valueOf(password),
				ISMARGIN == "gangxu" ? 0 : 1, "未审核", "正常", 0, new Date(System.currentTimeMillis()), "0");

		request.setAttribute("password", password);
		try {
			request.getRequestDispatcher("/puchasehouse/puchasehouse/purchaserCode.jsp").forward(request, response);
		} catch (ServletException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/*
	 * 判断登记信息是否合法
	 */
//	public void checkPurchaserInfo(String )
	
	/**
	 * 购房信息登录接口
	 */
	public void infoLogin(HttpServletRequest request, HttpServletResponse response) {
		// 查询数据库查看员工是否在数据库中
		Purchaser purchaser = null;
		String cardcode = request.getParameter("CARDCODE");
		if(cardcode!=null&&!cardcode.equals("")) {
			purchaser = purchaserDao.selectInfo(cardcode);
		}
		String password = request.getParameter("PASSWORD");
		// 如果密码正确
		if (password!=null&&purchaser!=null&&password.equals(purchaser.getPASSWORD())) {
			// 查询成功则建立一个session
			HttpSession session = request.getSession(true);
			session.setAttribute("realname", purchaser.getREALNAME());
			session.setAttribute("user", purchaser.getCARDCODE());
			session.setAttribute("password", purchaser.getPASSWORD());
			try {// 密码验证成功

				request.getRequestDispatcher("/houtai/houtai_page/index.html").forward(request, response);

			} catch (IOException e) {
				e.printStackTrace();
			} catch (ServletException e) {
				e.printStackTrace();
			}
		} else { // 如果密码错误
			try {
				request.setAttribute("id", "false");
				request.getRequestDispatcher("/table.jsp").forward(request, response);
			} catch (ServletException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	/**
	 * 用户退出登录
	 */
	public void purchaserQuit(HttpServletRequest request, HttpServletResponse response) {
		HttpSession session = request.getSession();
		
		//销毁session
		if(session!=null) {
			session.invalidate();
		}
		
		try {
			request.getRequestDispatcher("/index.jsp").forward(request, response);
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ServletException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 购房信息审核
	 */
	public void verify() {

	}

	/**
	 * 个人注册信息管理
	 */
	public void personInfoManage(HttpServletRequest request, HttpServletResponse response) {
		// 查询信息
		String CARDCODE = (String)request.getSession().getAttribute("user");
		if((CARDCODE!=null && !CARDCODE.equals("super")) || (request.getParameter("user")!=null && request.getParameter("user").equals("person"))) {
			Purchaser purchaser = purchaserDao.selectInfo(CARDCODE);

			request.getSession().setAttribute("object", purchaser);
		} else if(CARDCODE.equals("super")) {
			List<Purchaser> purchaserInfoList = new ArrayList<Purchaser>();
			purchaserInfoList = purchaserDao.selectAllInfo();
			request.getSession().setAttribute("purchaserInfoList", purchaserInfoList);
		}
		// 如果是个人用户信息查看
		if (request.getSession().getAttribute("user").equals("person")||(request.getParameter("user")!=null&&request.getParameter("user").equals("person"))) {
			// 转发到personinfo.jsp
			try {
				System.out.println(request.getSession().getAttribute("object"));
				request.getRequestDispatcher("/houtai/houtai_page/personinfo.jsp").forward(request, response);
			} catch (ServletException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} else {

			// 转发到main.jsp
			try {
				request.getRequestDispatcher("/UIback/main.jsp").forward(request, response);
			} catch (ServletException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	/**
	 * 购房申请撤销
	 */
	public void callOut() {

	}

	/**
	 * 用户密码修改
	 */
	public void passwordRevise() {

	}

	/**
	 * 登记用户信息管理
	 */
	public void registerIngoManage(HttpServletRequest request, HttpServletResponse response) {
	
	}

	/**
	 * 登记用户信息的查询
	 */
	public void selectInfo() {

	}

	/**
	 * 登记用户信息的筛选
	 */
	public void filterInfo() {

	}

	/**
	 * 放弃选房资格
	 */
	public void abandonQualify() {

	}
}
