package com.learnersAcademy.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import com.google.gson.Gson;
import com.learnersAcademy.bean.LASubjectBean;
import com.learnersAcademy.service.LASubjectService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LAAjaxServlet
 */
@WebServlet("/ajax")
public class LAAjaxServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public LAAjaxServlet() {
        super();
    }
    //Receive ajax request for listAllSubjectByClassID and response json
    /**
     * 
     */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String id = request.getParameter("id");
		Gson gson = new Gson();
		List<LASubjectBean> subjectList = new LASubjectService().listAllSubjectByClassID(id);
		PrintWriter out = response.getWriter();
		out.print(gson.toJson(subjectList));
		out.flush();
		out.close();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
