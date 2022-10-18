<%@ include file="jsp/header.jsp" %>

            <div class="row">
                <!-- <div class="alert alert-success" *ngIf='message'>{{message}}</div> -->

                <div class="container">
                    <h3 class="text-center">List of Teacher</h3>
                    <hr>
                    <div class="container text-left">

                        <a href="<%=request.getContextPath()%>/teacher/new" class="btn btn-success">Add
     New Teacher</a>
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
                            <c:forEach var="teacher" items="${listTeacher}">

                                <tr>
                                    <td>
                                        <c:out value="${teacher.teacherId}" />
                                    </td>
                                    <td>
                                        <c:out value="${teacher.teacherName}" />
                                    </td>
                                    <td>
                                        <c:out value="${teacher.email}" />
                                    </td>
                                    <td>
                                        <c:out value="${teacher.address}" />
                                    </td>
                                    <td><a href="edit?id=<c:out value='${teacher.teacherId}' />">Edit</a> &nbsp;&nbsp;&nbsp;&nbsp; <a href="delete?id=<c:out value='${teacher.teacherId}' />">Delete</a></td>
                                </tr>
                            </c:forEach>
                            <!-- } -->
                        </tbody>

                    </table>
                </div>
            </div>
            
        </body>
		<%@ include file="jsp/footer.jsp" %>
        </html>