package com.learnersAcademy.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.learnersAcademy.bean.LAClassBean;
import com.learnersAcademy.service.LAClassService;


/**
 * Servlet implementation class LAClassServlet
 */
@WebServlet(urlPatterns = {"/class/list", "/class/new", "/class/edit", "/class/delete", "/class/insert", "/class/update"})
public class LAClassServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public LAClassServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String action = request.getServletPath();

		try {
			switch (action) {
			case "/class/new":
				showNewForm(request, response);
				break;

			case "/class/insert":
				insertClass(request, response);
				break;

			case "/class/edit":
				showEditForm(request, response);
				break;

			case "/class/update":
				updateClass(request, response);
				break;

			case "/class/delete":
				deleteClass(request, response);
				break;

			default:
				listAvailableClass(request, response);
				break;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//Getting list of all available class
	/**
	 * 
	 * @param request
	 * @param response
	 * @throws ServletException
	 * @throws IOException
	 */
	private void listAvailableClass(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		List <LAClassBean> listClass = new LAClassService().listAllClass();
		request.setAttribute("listClass", listClass);
		RequestDispatcher rd = request.getRequestDispatcher("/class-list.jsp");
		rd.forward(request, response);

	}
	//Deleting operation
	/**
	 * 
	 * @param request
	 * @param response
	 * @throws IOException
	 */
	private void deleteClass(HttpServletRequest request, HttpServletResponse response) throws IOException {

		String id = request.getParameter("id");
		new LAClassService().deleteClass(id);
		response.sendRedirect("list");

	}
	//update operation
	/**
	 * 
	 * @param request
	 * @param response
	 * @throws IOException
	 */
	private void updateClass(HttpServletRequest request, HttpServletResponse response) throws IOException {

		LAClassBean bean = new LAClassBean();
		bean.setClassId(request.getParameter("id"));
		bean.setClassName(request.getParameter("className"));
		System.out.println(request.getParameter("id"));
		System.out.println(request.getParameter("className"));
		new LAClassService().updateClass(bean);
		response.sendRedirect("list");
	}
	
	// Responsible for getting data and show edit form
	/**
	 * 
	 * @param request
	 * @param response
	 * @throws ServletException
	 * @throws IOException
	 */
	private void showEditForm(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String id = request.getParameter("id");
		LAClassBean beanClass = new LAClassService().selecClassById(id);
		request.setAttribute("aClass", beanClass);
		RequestDispatcher rd = request.getRequestDispatcher("/class-form.jsp");
		rd.forward(request, response);

	}
	//insert operation
	/**
	 * 
	 * @param request
	 * @param response
	 * @throws IOException
	 */
	private void insertClass(HttpServletRequest request, HttpServletResponse response) throws IOException {
		LAClassBean bean = new LAClassBean();
		bean.setClassId(request.getParameter("id"));
		bean.setClassName(request.getParameter("className"));

		new LAClassService().insertClass(bean);
		response.sendRedirect("list");
	}
	//lunch new form for add new class
	/**
	 * 
	 * @param request
	 * @param response
	 * @throws ServletException
	 * @throws IOException
	 */
	private void showNewForm(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		RequestDispatcher rd = request.getRequestDispatcher("/class-form.jsp");
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
