package com.learnersAcademy.servlet;

import java.io.IOException;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.learnersAcademy.bean.*;
import com.learnersAcademy.service.*;
import com.learnersAcademy.util.LAHelper;

/**
 * Servlet implementation class LAStudentServlet
 */
@WebServlet(urlPatterns = {"/student/list", "/student/new", "/student/edit", "/student/delete", "/student/insert", "/student/update"})
public class LAStudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public LAStudentServlet() {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String action = request.getServletPath();

		try {
			switch (action) {
			case "/student/new":
				showNewForm(request, response);
				break;

			case "/student/insert":
				insertStudent(request, response);
				break;

			case "/student/edit":
				showEditForm(request, response);
				break;

			case "/student/update":
				updateStudent(request, response);
				break;

			case "/student/delete":
				deleteStudent(request, response);
				break;

			default:
				listStudent(request, response);
				break;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}



	}
	//lists all enrolled students
	private void listStudent(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		List <LAStudentBean> listStudent = new LAStudentService().listAllStudent();
		request.setAttribute("listStudent", listStudent);
		RequestDispatcher rd = request.getRequestDispatcher("/student-list.jsp");
		rd.forward(request, response);
	}
	
	// show new student form
	private void showNewForm(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		//Get all available classes
		List <LAClassBean> listClass = new LAClassService().listAllClass();
		request.setAttribute("availableClasses", listClass);

		RequestDispatcher rd = request.getRequestDispatcher("/student-form.jsp");
		rd.forward(request, response);
	}
	
	// insert operation
	private void insertStudent(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

		LAStudentBean bean = new LAStudentBean();
		bean.setStudentRollNumber(request.getParameter("studentRollNumber"));
		bean.setStudentName(request.getParameter("studentName"));
		bean.setAddress(request.getParameter("address"));
		bean.setDOB(request.getParameter("dbo"));
		bean.setEmail(request.getParameter("email"));
		bean.setPhone(request.getParameter("phone"));
		bean.setClassId(request.getParameter("selectedClass"));
		bean.setEnrollmentDate(request.getParameter("enrollmentDate"));
		bean.setPassoutDate(request.getParameter("passoutDate"));

		// lists for adding assigned classes and subjects for teacher
		LAStudentBean studentBean = LAStudentServlet.getAllAssignedClassAndSubject(request, bean);

		new LAStudentService().insertStudent(studentBean);

		response.sendRedirect("list");
	}

	//update operation
	private void updateStudent(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

		LAStudentBean bean = new LAStudentBean();
		bean.setStudentId(Integer.parseInt(request.getParameter("studentId")));
		bean.setStudentRollNumber(request.getParameter("studentRollNumber"));
		bean.setStudentName(request.getParameter("studentName"));
		bean.setAddress(request.getParameter("address"));
		bean.setDOB(request.getParameter("dbo"));
		bean.setEmail(request.getParameter("email"));
		bean.setPhone(request.getParameter("phone"));
		bean.setClassId(request.getParameter("selectedClass"));
		bean.setEnrollmentDate(request.getParameter("enrollmentDate"));
		bean.setPassoutDate(request.getParameter("passoutDate"));
		
		LAStudentBean studentBean = LAStudentServlet.getAllAssignedClassAndSubject(request, bean);

		new LAStudentService().updateStudent(studentBean);
		response.sendRedirect("list");
	}
 
	// show edit form
	private void showEditForm(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

		//Get all available classes
		List <LAClassBean> listClass = new LAClassService().listAllClass();
		request.setAttribute("availableClasses", listClass);

		int id = Integer.parseInt(request.getParameter("id"));
		LAStudentBean student = new LAStudentService().selectStudentById(id);
		request.setAttribute("student", student);
		RequestDispatcher rd = request.getRequestDispatcher("/student-form.jsp");
		rd.forward(request, response);
	}

	// delete operation
	private void deleteStudent(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

		int id = Integer.parseInt(request.getParameter("id"));
		new LAStudentService().deleteStudent(id);
		response.sendRedirect("list");
	}

	private static LAStudentBean getAllAssignedClassAndSubject(HttpServletRequest request, LAStudentBean studentBean ){
		// lists for adding assigned classes and subjects for student

		//getting values from all added classes and subjects
		// FOR EX- the value we get in format is "Economics/ GRADE-11", so we have to slip in two parts.

		String subjectClass[]=request.getParameterValues("subjectNameTextbox");


		if (subjectClass != null) {
			for(String value : subjectClass) {

				studentBean.setClassName(value);;
				String[] values = LAHelper.splitString(value);
				studentBean.setSubject(values[0]);
				studentBean.setClassName(values[1]);
			}
		}

		return studentBean;
	}

}
