<%@ include file="jsp/header.jsp"%>

<div class="row">
	<!-- <div class="alert alert-success" *ngIf='message'>{{message}}</div> -->

	<div class="container">
		<h3 class="text-center">List of Available Subject</h3>
		<hr>
		<div class="container text-left">

			<a href="<%=request.getContextPath()%>/subject/new"
				class="btn btn-success">Add New Subject</a>
		</div>
		<br>
		<table class="table table-bordered">
			<thead>
				<tr>
					<th>ID</th>
					<th>Subject Name</th>
					<th>Class Name</th>
					<th>Action</th>
				</tr>
			</thead>
			<tbody>
				<!--   for (Todo todo: todos) {  -->
				<c:forEach var="aSubject" items="${listSubject}">

					<tr>
						<td><c:out value="${aSubject.subjectId}" /></td>
						<td><c:out value="${aSubject.subjectName}" /></td>
						<td><c:out value="${aSubject.className}" /></td>

						<td><a href="edit?id=<c:out value='${aSubject.subjectId}' />">Edit</a>
							&nbsp;&nbsp;&nbsp;&nbsp; <a
							href="delete?id=<c:out value='${aSubject.subjectId}' />">Delete</a></td>
					</tr>
				</c:forEach>
				<!-- } -->
			</tbody>

		</table>
	</div>
</div>
</body>

</html>