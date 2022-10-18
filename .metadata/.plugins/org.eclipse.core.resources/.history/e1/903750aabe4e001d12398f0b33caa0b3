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
import com.learnersAcademy.bean.LASubjectBean;
import com.learnersAcademy.service.LAClassService;
import com.learnersAcademy.service.LASubjectService;

/**
 * Servlet implementation class LASubjectServlet
 */
@WebServlet(urlPatterns = {"/subject/list", "/subject/new", "/subject/insert", "/subject/edit","/subject/update", "/subject/delete" })
public class LASubjectServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public LASubjectServlet() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String action = request.getServletPath();

		try {
			switch (action) {
			case "/subject/new":
				showNewForm(request, response);
				break;

			case "/subject/insert":
				insertSubject(request, response);
				break;

			case "/subject/edit":
				showEditForm(request, response);
				break;

			case "/subject/update":
				updateSubject(request, response);
				break;

			case "/subject/delete":
				deleteSubject(request, response);
				break;

			default:
				listAvailableSubject(request, response);
				break;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//list all available subjects
	private void listAvailableSubject(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		List <LASubjectBean> listSubject = new LASubjectService().listAllSubjectAndClass();
		request.setAttribute("listSubject", listSubject);

		RequestDispatcher rd = request.getRequestDispatcher("/subject-list.jsp");
		rd.forward(request, response);

	}
	//update operation
	private void updateSubject(HttpServletRequest request, HttpServletResponse response) throws IOException {

		LASubjectBean bean = new LASubjectBean();
		bean.setSubjectId(request.getParameter("id"));
		bean.setSubjectName(request.getParameter("subjectName"));
		bean.setClassId(request.getParameter("course-class"));

		new LASubjectService().updateSubject(bean);
		response.sendRedirect("list");

	}
	
	//insert operation
	private void insertSubject(HttpServletRequest request, HttpServletResponse response) throws IOException {

		LASubjectBean bean = new LASubjectBean();
		bean.setSubjectId(request.getParameter("id"));
		bean.setSubjectName(request.getParameter("subjectName"));
		bean.setClassId(request.getParameter("course-class"));

		new LASubjectService().insertSubject(bean);
		response.sendRedirect("list");
	}
	
	//delete operation
	private void deleteSubject(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String id = request.getParameter("id");
		new LASubjectService().deleteSubject(id);
		response.sendRedirect("list");

	}
	
	//show new form
	private void showNewForm(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		//Get all available classes
		List <LAClassBean> listClass = new LAClassService().listAllClass();
		request.setAttribute("availableClasses", listClass);

		RequestDispatcher rd = request.getRequestDispatcher("/subject-form.jsp");
		rd.forward(request, response);

	}
	
	// show edit form
	private void showEditForm(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		//Get all available classes
		List <LAClassBean> listClass = new LAClassService().listAllClass();
		request.setAttribute("availableClasses", listClass);

		String id = request.getParameter("id");
		LASubjectBean beanClass = new LASubjectService().selecSubjectById(id);
		request.setAttribute("aSubject", beanClass);
		RequestDispatcher rd = request.getRequestDispatcher("/subject-form.jsp");
		rd.forward(request, response);
	}
}
