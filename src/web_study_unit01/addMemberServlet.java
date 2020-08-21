package web_study_unit01;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/addMemberServlet")
public class addMemberServlet extends HttpServlet {
	
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		result(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		result(request, response);
	}
	

	private void result(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//request.setCharacterEncoding("UTF-8");
		
		/*
		 * String name = request.getParameter("name"); String id =
		 * request.getParameter("userId"); String nickName =
		 * request.getParameter("nickName"); String pwd = request.getParameter("pwd");
		 * String email = request.getParameter("email"); String phone =
		 * request.getParameter("phone");
		 * 
		 * request.setAttribute("name", name); request.setAttribute("id", id);
		 * request.setAttribute("nickName", nickName); request.setAttribute("pwd", pwd);
		 * request.setAttribute("email", email); request.setAttribute("phone", phone);
		 */
		RequestDispatcher dp = request.getRequestDispatcher("03_addMember.jsp");
		dp.forward(request, response);
		
		
		
	}

}
