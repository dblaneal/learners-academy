<%@ include file="jsp/header.jsp" %>

	<div class="row">
		<!-- <div class="alert alert-success" *ngIf='message'>{{message}}</div> -->

		<div class="container">
			<h3 class="text-center">Class Report</h3>
			<hr>
			<br>
			<table class="table table-bordered">
				<thead>
					<tr>
						<th>Class</th>
						<th>Student</th>
						<th>Subject</th>
						<th>Teacher</th>
					</tr>
				</thead>
				<tbody>
					<!--   for (Todo todo: todos) {  -->
					<c:forEach var="info" items="${classReportInfo}">

						<tr>
							<td><c:out value="${info.className}" /></td>
							<td><c:out value="${info.studentName}" /></td>
							<td><c:out value="${info.subject}" /></td>
							<td><c:out value="${info.teacherName}" /></td>
							
						</tr>
					</c:forEach>
					<!-- } -->
				</tbody>

			</table>
		</div>
	</div>
</body>

</html>