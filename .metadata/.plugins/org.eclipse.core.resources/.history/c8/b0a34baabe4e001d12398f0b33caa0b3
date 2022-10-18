package com.learnersAcademy.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LAHomeServlet
 */
@WebServlet("/")
public class LAHomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public LAHomeServlet() {
		super();
	}

	//checks whether user is already logged in or not. 
	//if yes then redirect to home page else login page.
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		boolean isLoggedIn = (request.getSession().getAttribute("userName")!= null);

		if (!isLoggedIn) {   //checking whether the session exists
			RequestDispatcher rd = request.getRequestDispatcher("/login.jsp");
			rd.include(request, response);

		}else {

			request.getRequestDispatcher("/student/list").forward(request, response);
		}
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
