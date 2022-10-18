<%@ include file="jsp/header.jsp" %>

	<div class="row">
		<!-- <div class="alert alert-success" *ngIf='message'>{{message}}</div> -->

		<div class="container">
			<h3 class="text-center">List of Student</h3>
			<hr>
			<div class="container text-left">

				<a href="<%=request.getContextPath()%>/student/new"
					class="btn btn-success">Add New Student</a>
			</div>
			<br>
			<table class="table table-bordered">
				<thead>
					<tr>
						<th>ID</th>
						<th>Name</th>
						<th>Email</th>
						<th>Address</th>
						<th>Actions</th>
					</tr>
				</thead>
				<tbody>
					<!--   for (Todo todo: todos) {  -->
					<c:forEach var="student" items="${listStudent}">

						<tr>
							<td><c:out value="${student.studentId}" /></td>
							<td><c:out value="${student.studentName}" /></td>
							<td><c:out value="${student.email}" /></td>
							<td><c:out value="${student.address}" /></td>
							<td><a href="edit?id=<c:out value='${student.studentId}' />">Edit</a>
								&nbsp;&nbsp;&nbsp;&nbsp; <a
								href="delete?id=<c:out value='${student.studentId}' />">Delete</a></td>
						</tr>
					</c:forEach>
					<!-- } -->
				</tbody>

			</table>
		</div>
	</div>
</body>

</html>