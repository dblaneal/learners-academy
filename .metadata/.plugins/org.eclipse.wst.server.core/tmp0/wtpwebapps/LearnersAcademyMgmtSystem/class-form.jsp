<%@ include file="jsp/header.jsp" %>

	<div class="container col-md-5">
		<div class="card">
			<div class="card-body">
				<c:if test="${aClass != null}">
					<form action="update" method="post">
				</c:if>
				<c:if test="${aClass == null}">
					<form action="insert" method="post">
				</c:if>

				<caption>
					<h2>
						<c:if test="${aClass != null}">
                                    Edit Class
                                </c:if>
						<c:if test="${aClass == null}">
                                    Add New Class
                                </c:if>
					</h2>
				</caption>
				
				<fieldset class="form-group">
					<label>Class ID</label> <input type="text"
						value="<c:out value='${aClass.classId}' />" class="form-control"
						name="id" required="required">
				</fieldset>

				<fieldset class="form-group">
					<label>Class Name</label> <input type="text"
						value="<c:out value='${aClass.className}' />" class="form-control"
						name="className" required="required">
				</fieldset>

				<button type="submit" class="btn btn-success">Save</button>
				</form>
			</div>
		</div>
	</div>
</body>

</html>