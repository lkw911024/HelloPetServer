package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONObject;

import VO.MemberVO;
import controller.MemberController;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet({ "/login.do", "/logout.do", "/join.do", "/leave.do" })
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		doPost(request,response);
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		
		
		String uri = request.getRequestURI();
		int lastIndex = uri.lastIndexOf("/");
		String action = uri.substring(lastIndex+1);
		
		if (action.equals("login.do")) {
			login(request, response);
		} else {
			//logout(request, response);
		}
	}
	
	protected void login (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");
        
        PrintWriter out = response.getWriter();
        
		JSONObject result = new JSONObject();
		result.clear();
		
		String userId = request.getParameter("user-id");
		String userPwd = request.getParameter("user-pwd");

		// 
		MemberController loginController = new MemberController();
		MemberVO userData = loginController.checkLogin(userId, userPwd);
		
		if(userData != null)
		{
			result.put("memberInfo", userData);
		}


        out.print(result.toString());
        out.flush();
	}
}
