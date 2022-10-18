<%@ include file="jsp/header.jsp"%>

<div class="container col-md-5">
	<div class="card">
		<div class="card-body">
			<c:if test="${student != null}">
				<form action="update" method="post">
			</c:if>
			<c:if test="${student == null}">
				<form action="insert" method="post">
			</c:if>

			<caption>
				<h2>
					<c:if test="${student != null}">
                                    Edit student
                                </c:if>
					<c:if test="${student == null}">
                                    Add New student
                                </c:if>
				</h2>
			</caption>

			<c:if test="${student != null}">
				<input type="hidden" name="studentId"
					value="<c:out value='${student.studentId}' />" />
			</c:if>

			<fieldset class="form-group">
				<label>Student RollNumber</label> <input type="text"
					value="<c:out value='${student.studentRollNumber}' />"
					class="form-control" name="studentRollNumber" required="required">
			</fieldset>

			<fieldset class="form-group">
				<label>Student Name</label> <input type="text"
					value="<c:out value='${student.studentName}' />"
					class="form-control" name="studentName" required="required">
			</fieldset>

			<fieldset class="form-group">
				<label>Address</label> <input type="text"
					value="<c:out value='${student.address}' />" class="form-control"
					name="address">
			</fieldset>

			<fieldset class="form-group">
				<label>Email</label> <input type="text"
					value="<c:out value='${student.email}' />" class="form-control"
					name="email">
			</fieldset>

			<fieldset class="form-group">
				<label>Date of Birth</label> <input type="date"
					value="<c:out value='${student.DOB}' />" class="form-control"
					name="dbo">
			</fieldset>

			<fieldset class="form-group">
				<label>Phone</label> <input type="text"
					value="<c:out value='${student.phone}' />" class="form-control"
					name="phone">
			</fieldset>
			<%-- <fieldset class="form-group">
					<label>Enrolled Class</label> <input type="text"
						value="<c:out value='${student.classId}' />" class="form-control"
						name="enrolledClass">
				</fieldset> --%>



			<fieldset class="form-group">
				<label>Enroll Class</label> <br> <select id="classAvailable"
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
				<input type="text" id="selectedClassId"
					value="<c:out value='${student.classId}' />" class="form-control"
					name="selectedClass" hidden="true" />
			</fieldset>

			<fieldset class="form-group">
				<!-- <label>Assign Subject</label>  -->
				<span id="result"></span> &nbsp;&nbsp;<input id="buttonAddSubject"
					type="button" value="Add" /> <br> <br>

				<div id="subjectsTextBoxContainer">
					<!--Textboxes will be added here -->
				</div>
				<c:if test="${student != null}">
					<c:set var="myVar" value="${student.subject}" />

					<script>
						$(function() {

							var enrolledClassAndSubject = "<c:out value='${student.subject}' />"
									+ "/ "
									+ "<c:out value='${student.className}' />";

							appendTextbox(enrolledClassAndSubject);
						});
					</script>
				</c:if>
			</fieldset>


			<fieldset class="form-group">
				<label>Enrolled Date</label> <input type="date"
					value="<c:out value='${student.enrollmentDate}' />"
					class="form-control" name="enrollmentDate">
			</fieldset>
			<fieldset class="form-group">
				<label>PassedOut Date</label> <input type="date"
					value="<c:out value='${student.passoutDate}' />"
					class="form-control" name="passoutDate">
			</fieldset>
			<button type="submit" class="btn btn-success">Save</button>
			</form>
		</div>
	</div>
</div>
<%@ include file="jsp/footer.jsp"%>
</body>

</html>