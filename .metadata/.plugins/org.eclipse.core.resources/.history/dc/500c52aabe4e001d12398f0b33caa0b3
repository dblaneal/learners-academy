package com.learnersAcademy.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.learnersAcademy.bean.LAClassBean;
import com.learnersAcademy.bean.LATeacherBean;
import com.learnersAcademy.bean.LATeacherClassBean;
import com.learnersAcademy.service.LAClassService;
import com.learnersAcademy.service.LATeacherClassService;
import com.learnersAcademy.service.LATeacherService;
import com.learnersAcademy.util.LAHelper;

/**
 * Servlet implementation class LATeacherServlet
 */
@WebServlet(urlPatterns = {"/teacher/list", "/teacher/edit", "/teacher/new", "/teacher/insert", "/teacher/update", "/teacher/delete" })
public class LATeacherServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public LATeacherServlet() {
		super();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String action = request.getServletPath();

		try {
			switch (action) {
			case "/teacher/new":
				showNewForm(request, response);
				break;

			case "/teacher/insert":
				insertTeacher(request, response);
				break;

			case "/teacher/edit":
				showEditForm(request, response);
				break;

			case "/teacher/update":
				updateTeacher(request, response);
				break;

			case "/teacher/delete":
				deleteTeacher(request, response);
				break;

			default:
				listTeacher(request, response);
				break;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	//get list of teacher
	private void listTeacher(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<LATeacherBean> listTeacher = new LATeacherService().selectAllTeacher();
		request.setAttribute("listTeacher", listTeacher);

		RequestDispatcher rd = request.getRequestDispatcher("/teacher-list.jsp");
		rd.forward(request, response);

	}

	//delete operation
	private void deleteTeacher(HttpServletRequest request, HttpServletResponse response) throws IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		new LATeacherService().deleteTeacher(id);
		response.sendRedirect("list");
	}

	//update operation
	private void updateTeacher(HttpServletRequest request, HttpServletResponse response) throws IOException {

		LATeacherBean bean = new LATeacherBean();
		int id = Integer.parseInt(request.getParameter("teacherId"));
		bean.setTeacherId(id);
		bean.setTeacherName(request.getParameter("teacherName"));
		bean.setAddress(request.getParameter("address"));
		bean.setDOB(request.getParameter("dbo"));
		bean.setEmail(request.getParameter("email"));
		bean.setPhone(request.getParameter("phone"));

		new LATeacherService().updateTeacher(bean);


		// lists for adding assigned classes and subjects for teacher
		List<LATeacherClassBean> listBean = LATeacherServlet.getAllAssignedClassAndSubject(request, id);
		new LATeacherClassService().updateTeacherClass(listBean);


		response.sendRedirect("list");

	}

	//show edit form
	private void showEditForm(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		//Get all available classes
		List <LAClassBean> listClass = new LAClassService().listAllClass();
		request.setAttribute("availableClasses", listClass);

		int id = Integer.parseInt(request.getParameter("id")) ;
		LATeacherBean teacherBean = new LATeacherService().selectTeacherById(id);
		request.setAttribute("teacher", teacherBean);

		RequestDispatcher rd = request.getRequestDispatcher("/teacher-form.jsp");
		rd.forward(request, response);

	}

	//This method is used for inserting records into Teacher and Teacher_Class table	
	/**
	 * 
	 * @param request
	 * @param response
	 * @throws IOException 
	 */
	private void insertTeacher(HttpServletRequest request, HttpServletResponse response) throws IOException {

		LATeacherBean teacherBean = new LATeacherBean();
		teacherBean.setTeacherName(request.getParameter("teacherName"));
		teacherBean.setAddress(request.getParameter("address"));
		teacherBean.setDOB(request.getParameter("dbo"));
		teacherBean.setEmail(request.getParameter("email"));
		teacherBean.setPhone(request.getParameter("phone"));

		LATeacherService service = new LATeacherService();
		int id = service.insertTeacher(teacherBean);


		// lists for adding assigned classes and subjects for teacher
		List<LATeacherClassBean> listBean = LATeacherServlet.getAllAssignedClassAndSubject(request, id);
		if (listBean != null) {
			//inserting records in DB teacher_class in batch.
			LATeacherClassService tcService = new LATeacherClassService();
			tcService.insertTeacherClassBatch(listBean);
		}

		response.sendRedirect("list");

	}
	//show new form to add teacher info
	private void showNewForm(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		//Get all available classes
		List <LAClassBean> listClass = new LAClassService().listAllClass();
		request.setAttribute("availableClasses", listClass);

		RequestDispatcher rd = request.getRequestDispatcher("/teacher-form.jsp");
		rd.forward(request, response);
	}
	
	//get all detail info about assigned class and subject of teacher
	
	private static List<LATeacherClassBean> getAllAssignedClassAndSubject(HttpServletRequest request, int id){
		// lists for adding assigned classes and subjects for teacher
		List<LATeacherClassBean> listBean = new ArrayList<LATeacherClassBean>();

		//getting values from all added classes and subjects
		String subjects[]=request.getParameterValues("subjectNameTextbox");
		if (subjects != null) {
			for(String value : subjects) {
				LATeacherClassBean newBean = new LATeacherClassBean();
				newBean.setTeacherId(id);
				String[] values = LAHelper.splitString(value);
				newBean.setSubjectName(values[0]);
				newBean.setClassName(values[1]);

				listBean.add(newBean);
			}
		}

		return listBean;
	}
}
