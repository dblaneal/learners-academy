package com.learnersAcademy.servlet;

import java.io.IOException;
import java.util.Collections;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.learnersAcademy.bean.LAClassReportBean;
import com.learnersAcademy.service.LAClassReportService;


/**
 * Servlet implementation class LAClassReport
 */
@WebServlet("/class/report")
public class LAClassReport extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public LAClassReport() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		generateClassReport(request, response);
	}

	//Getting list of Class Report info
	/**
	 * 
	 * @param request
	 * @param response
	 * @throws ServletException
	 * @throws IOException
	 */
	private void generateClassReport(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		List <LAClassReportBean> listClassReport = new LAClassReportService().generateClassReport();
		Collections.sort(listClassReport);
		request.setAttribute("classReportInfo", listClassReport);
		RequestDispatcher rd = request.getRequestDispatcher("/classReport.jsp");
		rd.forward(request, response);

	}

}
