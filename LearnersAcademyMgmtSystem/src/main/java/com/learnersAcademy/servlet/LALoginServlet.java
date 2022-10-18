package com.learnersAcademy.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.learnersAcademy.bean.LAUserBean;
import com.learnersAcademy.service.LAUserService;

/**
 * Servlet implementation class Login
 */
@WebServlet(urlPatterns = {"/login", "/login/out" })
public class LALoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public LALoginServlet() {}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		LAUserBean userBean= new LAUserBean();
		String userName = request.getParameter("userName");
		userBean.setUserName(userName);
		userBean.setPassword(request.getParameter("password"));
		
		// checking user is valid or not
		// if yes then save user in session and redirect to home page else login page
		if(new LAUserService().loginAuthentication(userBean)) {

			HttpSession httpSession = request.getSession();
			httpSession.setAttribute("userName", userName);


			RequestDispatcher rd = request.getRequestDispatcher("/");
			rd.forward(request, response);

		}else {
			request.setAttribute("error", "Wrong user name or password.");
			RequestDispatcher rd = request.getRequestDispatcher("/login.html");
			rd.forward(request, response);
		}
	}


	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		// hit this method while user click on log out link
		HttpSession session = req.getSession();
		session.removeAttribute("userName");
		session.invalidate();

		RequestDispatcher rd = req.getRequestDispatcher("/login.jsp");
		rd.forward(req, resp);

	}

}
