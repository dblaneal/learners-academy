<%@ include file="jsp/header.jsp"%>

<div class="container col-md-5">
	<div class="card">
		<div class="card-body">
			<c:if test="${teacher != null}">
				<form action="update" method="post">
			</c:if>
			<c:if test="${teacher == null}">
				<form action="insert" method="post">
			</c:if>

			<caption>
				<h2>
					<c:if test="${teacher != null}">
                                    Edit teacher
                                </c:if>
					<c:if test="${teacher == null}">
                                    Add New teacher
                                </c:if>
				</h2>
			</caption>

			<c:if test="${teacher != null}">
				<input type="hidden" name="teacherId"
					value="<c:out value='${teacher.teacherId}' />" />
			</c:if>

			<fieldset class="form-group">
				<label>Teacher Name</label> <input type="text"
					value="<c:out value='${teacher.teacherName}' />"
					class="form-control" name="teacherName" required="required">
			</fieldset>

			<fieldset class="form-group">
				<label>Address</label> <input type="text"
					value="<c:out value='${teacher.address}' />" class="form-control"
					name="address">
			</fieldset>
			<fieldset class="form-group">
				<label>Date of Birth</label> <input type="text"
					value="<c:out value='${teacher.DOB}' />" class="form-control"
					name="dbo">
			</fieldset>
			<fieldset class="form-group">
				<label>Email</label> <input type="text"
					value="<c:out value='${teacher.email}' />" class="form-control"
					name="email">
			</fieldset>



			<fieldset class="form-group">
				<label>Phone</label> <input type="text"
					value="<c:out value='${teacher.phone}' />" class="form-control"
					name="phone">
			</fieldset>
			<fieldset class="form-group">
				<label>Assign Class</label> <br> <select id="classAvailable"
					name="course-class">

					<c:forEach var="aClass" items="${ availableClasses}">

						<option value="${aClass.classId}"><c:out
								value="${aClass.className}" /></option>

					</c:forEach>

				</select> &nbsp;&nbsp;
				<!-- <input id="buttonAddClass" type="button" value="Add" /> -->
				<br> <br>

				<div id="TextBoxContainer">
					<!--Textboxes will be added here -->
				</div>

			</fieldset>

			<fieldset class="form-group">
				<!-- <label>Assign Subject</label>  -->
				<span id="result"></span> &nbsp;&nbsp;<input
					id="buttonAddSubjectForTeacher" type="button" value="Add" /> <br>
				<br>
				<div id="subjectsTextBoxContainer">
					<!--Textboxes will be added here -->
				</div>
			</fieldset>

			<button type="submit" class="btn btn-success">Save</button>
			</form>
		</div>
	</div>
</div>
<%@ include file="jsp/footer.jsp"%>
</body>

</html>