package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.simon.dao.impl.ManagerOperate;
import com.simon.dao.impl.StudentOperate;
import com.simon.model.Manager;
import com.simon.model.Student;

@WebServlet("/Controller.do")
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setCharacterEncoding("utf-8");
		
		// 创建管理员操作类
		ManagerOperate dao = null;

		// 获取会话状态
		HttpSession ses = request.getSession();

		System.out.println(ses.getId());
		
		// 如果是新客户
		//if (ses.isNew()) {
			// 新客户登录
			dao = new ManagerOperate();
			Manager manager = dao.login(request.getParameter("username"), request.getParameter("password"));
			
			if( manager == null && request.getAttribute("manager") != null ) {
				request.setAttribute("info","用户名或密码错误");
				request.getRequestDispatcher( "login/Manager.jsp" ).forward(request,response);
			}
			
			if( manager != null )
				ses.setAttribute("manager", manager);
			System.out.println(manager);
		//}
		System.out.println("不是新"+ses.getAttribute("manager"));
		if ("addStuInfo".equals(request.getParameter("operate"))) {
			Student student = new Student(request.getParameter("No"),request.getParameter("name"),request.getParameter("age"),request.getParameter("sex"),request.getParameter("dept"),request.getParameter("tel"));
			System.out.println(student.getSex());
			StudentOperate stuOpe = new StudentOperate();
			request.setAttribute( "flag", stuOpe.add(student) );
			request.getRequestDispatcher("view/manager/homepage.jsp").forward(request, response);
		} else {
			request.getRequestDispatcher("view/manager/homepage.jsp").forward(request, response);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
