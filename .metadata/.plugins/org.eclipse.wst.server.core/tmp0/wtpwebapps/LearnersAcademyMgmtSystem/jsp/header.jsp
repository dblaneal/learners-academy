<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>

<head>
<title>Learner's Academy Management Application</title>

<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"
	integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh"
	crossorigin="anonymous">

<script src="https://code.jquery.com/jquery-3.1.1.min.js">
	<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous">
</script>

<script
	src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"
	integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6"
	crossorigin="anonymous"></script>
<link rel="stylesheet" type="text/css" href="../css/local.css"/>

</head>


<body>

	<header>
		<nav class="navbar navbar-expand-md navbar-dark"
			style="background-color: rgb(9, 165, 154);">
			<div>
				<a href="https://www.simplilearn.com/" class="navbar-brand">
					Learner's Academy </a>
			</div>

			<%--  <ul class="navbar-nav">
                        <li><a href="<%=request.getContextPath()%>/list" class="nav-link">Users</a></li>
                    </ul> --%>
			<div class="dropdown show">
				<a class="btn btn-secondary dropdown-toggle" href="#" role="button"
					id="dropdownMenuLink" data-toggle="dropdown" aria-haspopup="true"
					aria-expanded="false"> Manage </a>

				<div class="dropdown-menu" aria-labelledby="dropdownMenuLink">
					<a class="dropdown-item"
						href="<%=request.getContextPath()%>/student/list">Student</a> <a
						class="dropdown-item"
						href="<%=request.getContextPath()%>/teacher/list">Teacher</a> <a
						class="dropdown-item"
						href="<%=request.getContextPath()%>/class/list">Class</a><a
						class="dropdown-item"
						href="<%=request.getContextPath()%>/subject/list">Subject</a>
					<%-- <a
						class="dropdown-item"
						href="<%=request.getContextPath()%>/user/list">User</a> --%>
					<a class="dropdown-item"
						href="<%=request.getContextPath()%>/class/report">Class Report</a>
					<form action="<%=request.getContextPath()%>/login" method="get">
						<input type="submit" class="logoutLink" value="Log out">
					</form>
				</div>
			</div>

		</nav>
	</header>
	<br>
	<%
		if(session.getAttribute("userName")==null){
			request.getRequestDispatcher("login.jsp").forward(request, response);
			
		}
	%>