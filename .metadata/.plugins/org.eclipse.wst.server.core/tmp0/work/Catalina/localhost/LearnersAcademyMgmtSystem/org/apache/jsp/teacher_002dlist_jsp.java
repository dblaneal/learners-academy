/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.65
 * Generated at: 2022-10-18 08:50:16 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class teacher_002dlist_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(4);
    _jspx_dependants.put("/jsp/header.jsp", Long.valueOf(1666082620000L));
    _jspx_dependants.put("/jsp/footer.jsp", Long.valueOf(1666082620000L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1666080837000L));
    _jspx_dependants.put("jar:file:/Users/anildhaubhadel/eclipse-workspace4/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/LearnersAcademyMgmtSystem/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153349082000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
    _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("<title>Learner's Academy Management Application</title>\n");
      out.write("\n");
      out.write("<link rel=\"stylesheet\"\n");
      out.write("	href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css\"\n");
      out.write("	integrity=\"sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh\"\n");
      out.write("	crossorigin=\"anonymous\">\n");
      out.write("\n");
      out.write("<script src=\"https://code.jquery.com/jquery-3.1.1.min.js\">\n");
      out.write("	<script src=\"https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js\" integrity=\"sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo\" crossorigin=\"anonymous\">\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("<script\n");
      out.write("	src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js\"\n");
      out.write("	integrity=\"sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6\"\n");
      out.write("	crossorigin=\"anonymous\"></script>\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"../css/local.css\"/>\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("	<header>\n");
      out.write("		<nav class=\"navbar navbar-expand-md navbar-dark\"\n");
      out.write("			style=\"background-color: rgb(9, 165, 154);\">\n");
      out.write("			<div>\n");
      out.write("				<a href=\"https://www.simplilearn.com/\" class=\"navbar-brand\">\n");
      out.write("					Learner's Academy </a>\n");
      out.write("			</div>\n");
      out.write("\n");
      out.write("			");
      out.write("\n");
      out.write("			<div class=\"dropdown show\">\n");
      out.write("				<a class=\"btn btn-secondary dropdown-toggle\" href=\"#\" role=\"button\"\n");
      out.write("					id=\"dropdownMenuLink\" data-toggle=\"dropdown\" aria-haspopup=\"true\"\n");
      out.write("					aria-expanded=\"false\"> Manage </a>\n");
      out.write("\n");
      out.write("				<div class=\"dropdown-menu\" aria-labelledby=\"dropdownMenuLink\">\n");
      out.write("					<a class=\"dropdown-item\"\n");
      out.write("						href=\"");
      out.print(request.getContextPath());
      out.write("/student/list\">Student</a> <a\n");
      out.write("						class=\"dropdown-item\"\n");
      out.write("						href=\"");
      out.print(request.getContextPath());
      out.write("/teacher/list\">Teacher</a> <a\n");
      out.write("						class=\"dropdown-item\"\n");
      out.write("						href=\"");
      out.print(request.getContextPath());
      out.write("/class/list\">Class</a><a\n");
      out.write("						class=\"dropdown-item\"\n");
      out.write("						href=\"");
      out.print(request.getContextPath());
      out.write("/subject/list\">Subject</a>\n");
      out.write("					");
      out.write("\n");
      out.write("					<a class=\"dropdown-item\"\n");
      out.write("						href=\"");
      out.print(request.getContextPath());
      out.write("/class/report\">Class Report</a>\n");
      out.write("					<form action=\"");
      out.print(request.getContextPath());
      out.write("/login\" method=\"get\">\n");
      out.write("						<input type=\"submit\" class=\"logoutLink\" value=\"Log out\">\n");
      out.write("					</form>\n");
      out.write("				</div>\n");
      out.write("			</div>\n");
      out.write("\n");
      out.write("		</nav>\n");
      out.write("	</header>\n");
      out.write("	<br>\n");
      out.write("	");

		if(session.getAttribute("userName")==null){
			request.getRequestDispatcher("login.jsp").forward(request, response);
			
		}
	
      out.write("\n");
      out.write("\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <!-- <div class=\"alert alert-success\" *ngIf='message'>{{message}}</div> -->\n");
      out.write("\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <h3 class=\"text-center\">List of Teacher</h3>\n");
      out.write("                    <hr>\n");
      out.write("                    <div class=\"container text-left\">\n");
      out.write("\n");
      out.write("                        <a href=\"");
      out.print(request.getContextPath());
      out.write("/teacher/new\" class=\"btn btn-success\">Add\n");
      out.write("     New Teacher</a>\n");
      out.write("                    </div>\n");
      out.write("                    <br>\n");
      out.write("                    <table class=\"table table-bordered\">\n");
      out.write("                        <thead>\n");
      out.write("                            <tr>\n");
      out.write("                                <th>ID</th>\n");
      out.write("                                <th>Name</th>\n");
      out.write("                                <th>Email</th>\n");
      out.write("                                <th>Address</th>\n");
      out.write("                                <th>Actions</th>\n");
      out.write("                            </tr>\n");
      out.write("                        </thead>\n");
      out.write("                        <tbody>\n");
      out.write("                            <!--   for (Todo todo: todos) {  -->\n");
      out.write("                            ");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                            <!-- } -->\n");
      out.write("                        </tbody>\n");
      out.write("\n");
      out.write("                    </table>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("        </body>\n");
      out.write("		");
      out.write("\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("/**\n");
      out.write(" * This js file is responsible for \n");
      out.write(" *	-sending ajax request and getting all related subject as per selected class.\n");
      out.write(" * 	-generate drop down and show all subject info in it.\n");
      out.write(" *	-dynamically generate text box and remove button  when user click on add button \n");
      out.write(" *		and display user selected class & subject on it\n");
      out.write(" *  -removes generated textbox when user click on remove button.\n");
      out.write(" */ \n");
      out.write(" \n");
      out.write(" $(function () {  \n");
      out.write("   \n");
      out.write("    // remove the textfield from the page\n");
      out.write("    $(\"body\").on(\"click\", \".remove\", function () {  \n");
      out.write("        $(this).closest(\"div\").remove();  \n");
      out.write("        $('#selectedClassId').val(\"\");\n");
      out.write("    });  \n");
      out.write("    \n");
      out.write("    // adding class and subject for student\n");
      out.write("	$(\"#buttonAddSubject\").bind(\"click\", function () {  \n");
      out.write("		var textString = $('#selectedClassId').val().trim();\n");
      out.write("		var classValue = $( \"#classAvailable option:selected\" ).val();\n");
      out.write("	\n");
      out.write("		if (textString == \"\"){ // prevent student to enroll only in one class & subject.\n");
      out.write("			$('#selectedClassId').val($('#classAvailable option:selected').val());\n");
      out.write("	        var div = $(\"<div />\"); \n");
      out.write("	        var valueForTextbox =  $( \"#avbl-class option:selected\" ).text()+\"/ \"+$( \"#classAvailable option:selected\" ).text();\n");
      out.write("	        div.html(generateTextbox(\"subjectNameTextbox\", valueForTextbox));  \n");
      out.write("	        $(\"#subjectsTextBoxContainer\").append(div);  \n");
      out.write("		}else{\n");
      out.write("			alert(\"Each student is only allowed to assign in single class\");\n");
      out.write("		}\n");
      out.write("		\n");
      out.write("    });  \n");
      out.write("	\n");
      out.write("    //assigining classes and subjects for teacher\n");
      out.write("	$(\"#buttonAddSubjectForTeacher\").bind(\"click\", function () {  \n");
      out.write("		var div = $(\"<div />\"); \n");
      out.write("        var valueForTextbox =  $( \"#avbl-class option:selected\" ).text()+\"/ \"+$( \"#classAvailable option:selected\" ).text();\n");
      out.write("        div.html(generateTextbox(\"subjectNameTextbox\", valueForTextbox));  \n");
      out.write("        $(\"#subjectsTextBoxContainer\").append(div);  \n");
      out.write("    }); \n");
      out.write("	\n");
      out.write("	//adds available subjects drop down	\n");
      out.write("	$('#classAvailable').change(function(){\n");
      out.write("         var selectedClass = $('#classAvailable').val();\n");
      out.write("		$.ajax({\n");
      out.write("			type : 'GET',\n");
      out.write("			headers : {\n");
      out.write("				Accept : \"application/json; charset=utf-8\",\n");
      out.write("					\"Content-Type\" : \"application/json; charset=utf-8\"\n");
      out.write("				},\n");
      out.write("				url : '../ajax?id='+selectedClass,\n");
      out.write("				success : function(result) {\n");
      out.write("					var subjects = $.parseJSON(result);\n");
      out.write("					generateDropdown(subjects);\n");
      out.write("				}\n");
      out.write("			});\n");
      out.write("     }).change();\n");
      out.write("     \n");
      out.write("    \n");
      out.write("});  \n");
      out.write("// send request for getting info about all assigned classes and subjects of teacher.\n");
      out.write("// on result generate and display text box dianamically.\n");
      out.write(" $(document).ready(function(){\n");
      out.write("		\n");
      out.write("		var baseUrl = $(location).attr(\"href\") \n");
      out.write("		var action = baseUrl.split('/').pop().split('?')[0];\n");
      out.write("		var id = baseUrl.substring(baseUrl.lastIndexOf('=') + 1);\n");
      out.write("		\n");
      out.write("		if (action == 'edit'){\n");
      out.write("			$.ajax({\n");
      out.write("			type : 'GET',\n");
      out.write("			headers : {\n");
      out.write("				Accept : \"application/json; charset=utf-8\",\n");
      out.write("					\"Content-Type\" : \"application/json; charset=utf-8\"\n");
      out.write("				},\n");
      out.write("				url : '../ajaxTeacherClass?id='+id,\n");
      out.write("				success : function(result) {\n");
      out.write("					var subjects = $.parseJSON(result);\n");
      out.write("					if (!jQuery.isEmptyObject(subjects)){\n");
      out.write("						for (const val of subjects){\n");
      out.write("							 var valueForTextbox =  val.subjectName +\"/ \" + val.className;\n");
      out.write("							 appendTextbox(valueForTextbox);\n");
      out.write("       					 }\n");
      out.write("					}\n");
      out.write("				}\n");
      out.write("			});\n");
      out.write("		}\n");
      out.write("	});\n");
      out.write("function generateTextbox(textboxName, value) {  \n");
      out.write("    return '<input name = \"' + textboxName + '\" type=\"text\" value = \"' + value + '\" readonly/> ' +  \n");
      out.write("            '<input type=\"button\" value=\"Remove\" class=\"remove\" />'  \n");
      out.write("}  \n");
      out.write("\n");
      out.write("function appendTextbox(valueForTextbox){\n");
      out.write("	var div = $(\"<div />\"); \n");
      out.write("		 div.html(generateTextbox(\"subjectNameTextbox\", valueForTextbox));  \n");
      out.write("		 $(\"#subjectsTextBoxContainer\").append(div);  \n");
      out.write("}\n");
      out.write("\n");
      out.write("// generating dropdown\n");
      out.write("function generateDropdown(values){\n");
      out.write("	var select = document.createElement(\"select\");\n");
      out.write("	select.name = \"avbl-class\";\n");
      out.write("	select.id = \"avbl-class\";\n");
      out.write("	\n");
      out.write("	for (const val of values)\n");
      out.write("    {\n");
      out.write("        var option = document.createElement(\"option\");\n");
      out.write("        option.value = val.subjectId;\n");
      out.write("        var sName = val.subjectName\n");
      out.write("        option.text = sName.charAt(0).toUpperCase() + sName.slice(1);\n");
      out.write("        select.appendChild(option);\n");
      out.write("    }\n");
      out.write("    \n");
      out.write("    var label = document.createElement(\"label\");\n");
      out.write("    label.innerHTML = \"Available Subjects\";\n");
      out.write("    label.htmlFor = \"avbl-class\";\n");
      out.write("    \n");
      out.write("    $('#result').empty().append(label).append(\"<br>\").append(select);\n");
      out.write("}\n");
      out.write(" \n");
      out.write("\n");
      out.write("</script>");
      out.write("\n");
      out.write("        </html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_005fforEach_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    boolean _jspx_th_c_005fforEach_005f0_reused = false;
    try {
      _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fforEach_005f0.setParent(null);
      // /teacher-list.jsp(27,28) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setVar("teacher");
      // /teacher-list.jsp(27,28) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/teacher-list.jsp(27,28) '${listTeacher}'",_jsp_getExpressionFactory().createValueExpression(_jspx_page_context.getELContext(),"${listTeacher}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
      int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
      try {
        int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
        if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\n");
            out.write("\n");
            out.write("                                <tr>\n");
            out.write("                                    <td>\n");
            out.write("                                        ");
            if (_jspx_meth_c_005fout_005f0(_jspx_th_c_005fforEach_005f0, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f0))
              return true;
            out.write("\n");
            out.write("                                    </td>\n");
            out.write("                                    <td>\n");
            out.write("                                        ");
            if (_jspx_meth_c_005fout_005f1(_jspx_th_c_005fforEach_005f0, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f0))
              return true;
            out.write("\n");
            out.write("                                    </td>\n");
            out.write("                                    <td>\n");
            out.write("                                        ");
            if (_jspx_meth_c_005fout_005f2(_jspx_th_c_005fforEach_005f0, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f0))
              return true;
            out.write("\n");
            out.write("                                    </td>\n");
            out.write("                                    <td>\n");
            out.write("                                        ");
            if (_jspx_meth_c_005fout_005f3(_jspx_th_c_005fforEach_005f0, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f0))
              return true;
            out.write("\n");
            out.write("                                    </td>\n");
            out.write("                                    <td><a href=\"edit?id=");
            if (_jspx_meth_c_005fout_005f4(_jspx_th_c_005fforEach_005f0, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f0))
              return true;
            out.write("\">Edit</a> &nbsp;&nbsp;&nbsp;&nbsp; <a href=\"delete?id=");
            if (_jspx_meth_c_005fout_005f5(_jspx_th_c_005fforEach_005f0, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f0))
              return true;
            out.write("\">Delete</a></td>\n");
            out.write("                                </tr>\n");
            out.write("                            ");
            int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return true;
        }
      } catch (java.lang.Throwable _jspx_exception) {
        while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
      } finally {
        _jspx_th_c_005fforEach_005f0.doFinally();
      }
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
      _jspx_th_c_005fforEach_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fforEach_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fforEach_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f0, javax.servlet.jsp.PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f0)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f0 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    boolean _jspx_th_c_005fout_005f0_reused = false;
    try {
      _jspx_th_c_005fout_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fout_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f0);
      // /teacher-list.jsp(31,40) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fout_005f0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${teacher.teacherId}", java.lang.Object.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      int _jspx_eval_c_005fout_005f0 = _jspx_th_c_005fout_005f0.doStartTag();
      if (_jspx_th_c_005fout_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f0);
      _jspx_th_c_005fout_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fout_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fout_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f0, javax.servlet.jsp.PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f0)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f1 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    boolean _jspx_th_c_005fout_005f1_reused = false;
    try {
      _jspx_th_c_005fout_005f1.setPageContext(_jspx_page_context);
      _jspx_th_c_005fout_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f0);
      // /teacher-list.jsp(34,40) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fout_005f1.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${teacher.teacherName}", java.lang.Object.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      int _jspx_eval_c_005fout_005f1 = _jspx_th_c_005fout_005f1.doStartTag();
      if (_jspx_th_c_005fout_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f1);
      _jspx_th_c_005fout_005f1_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fout_005f1, _jsp_getInstanceManager(), _jspx_th_c_005fout_005f1_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f0, javax.servlet.jsp.PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f0)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f2 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    boolean _jspx_th_c_005fout_005f2_reused = false;
    try {
      _jspx_th_c_005fout_005f2.setPageContext(_jspx_page_context);
      _jspx_th_c_005fout_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f0);
      // /teacher-list.jsp(37,40) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fout_005f2.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${teacher.email}", java.lang.Object.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      int _jspx_eval_c_005fout_005f2 = _jspx_th_c_005fout_005f2.doStartTag();
      if (_jspx_th_c_005fout_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f2);
      _jspx_th_c_005fout_005f2_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fout_005f2, _jsp_getInstanceManager(), _jspx_th_c_005fout_005f2_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f0, javax.servlet.jsp.PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f0)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f3 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    boolean _jspx_th_c_005fout_005f3_reused = false;
    try {
      _jspx_th_c_005fout_005f3.setPageContext(_jspx_page_context);
      _jspx_th_c_005fout_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f0);
      // /teacher-list.jsp(40,40) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fout_005f3.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${teacher.address}", java.lang.Object.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      int _jspx_eval_c_005fout_005f3 = _jspx_th_c_005fout_005f3.doStartTag();
      if (_jspx_th_c_005fout_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f3);
      _jspx_th_c_005fout_005f3_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fout_005f3, _jsp_getInstanceManager(), _jspx_th_c_005fout_005f3_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f4(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f0, javax.servlet.jsp.PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f0)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f4 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    boolean _jspx_th_c_005fout_005f4_reused = false;
    try {
      _jspx_th_c_005fout_005f4.setPageContext(_jspx_page_context);
      _jspx_th_c_005fout_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f0);
      // /teacher-list.jsp(42,57) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fout_005f4.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${teacher.teacherId}", java.lang.Object.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      int _jspx_eval_c_005fout_005f4 = _jspx_th_c_005fout_005f4.doStartTag();
      if (_jspx_th_c_005fout_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f4);
      _jspx_th_c_005fout_005f4_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fout_005f4, _jsp_getInstanceManager(), _jspx_th_c_005fout_005f4_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f5(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f0, javax.servlet.jsp.PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f0)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f5 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    boolean _jspx_th_c_005fout_005f5_reused = false;
    try {
      _jspx_th_c_005fout_005f5.setPageContext(_jspx_page_context);
      _jspx_th_c_005fout_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f0);
      // /teacher-list.jsp(42,150) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fout_005f5.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${teacher.teacherId}", java.lang.Object.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      int _jspx_eval_c_005fout_005f5 = _jspx_th_c_005fout_005f5.doStartTag();
      if (_jspx_th_c_005fout_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f5);
      _jspx_th_c_005fout_005f5_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fout_005f5, _jsp_getInstanceManager(), _jspx_th_c_005fout_005f5_reused);
    }
    return false;
  }
}
