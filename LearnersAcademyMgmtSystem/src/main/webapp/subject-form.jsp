<%@ include file="jsp/header.jsp" %>

	<div class="container col-md-5">
		<div class="card">
			<div class="card-body">
				<c:if test="${aSubject != null}">
					<form action="update" method="post">
				</c:if>
				<c:if test="${aClass == null}">
					<form action="insert" method="post">
				</c:if>

				<caption>
					<h2>
						<c:if test="${aSubject != null}">
                                    Edit Subject
                                </c:if>
						<c:if test="${aSubject == null}">
                                    Add New Subject
                                </c:if>
					</h2>
				</caption>
				
				<fieldset class="form-group">
					<label>Subject ID</label> <input type="text"
						value="<c:out value='${aSubject.subjectId}' />" class="form-control"
						name="id" required="required">
				</fieldset>

				<fieldset class="form-group">
					<label>Subject Name</label> <input type="text"
						value="<c:out value='${aSubject.subjectName}' />" class="form-control"
						name="subjectName" required="required">
				</fieldset>
				
				<fieldset class="form-group">
					<label>Assign Subject For Class</label> <br> <select id="classAvailable"
						name="course-class">

						<c:forEach var="aClass" items="${ availableClasses}">

							<option value="${aClass.classId}"><c:out
									value="${aClass.className}" /></option>

						</c:forEach>

					</select>
				</fieldset>

				<button type="submit" class="btn btn-success">Save</button>
				</form>
			</div>
		</div>
	</div>
</body>

</html>