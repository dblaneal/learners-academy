<%@ include file="jsp/header.jsp" %>

            <div class="row">
                <!-- <div class="alert alert-success" *ngIf='message'>{{message}}</div> -->

                <div class="container">
                    <h3 class="text-center">List of Available Class</h3>
                    <hr>
                    <div class="container text-left">

                        <a href="<%=request.getContextPath()%>/class/new" class="btn btn-success">Add
     New Class</a>
                    </div>
                    <br>
                    <table class="table table-bordered">
                        <thead>
                            <tr>
                                <th>ID</th>
                                <th>Class Name</th>
                                <th>Actions</th>
                            </tr>
                        </thead>
                        <tbody>
                            <!--   for (Todo todo: todos) {  -->
                            <c:forEach var="aClass" items="${listClass}">

                                <tr>
                                    <td>
                                        <c:out value="${aClass.classId}" />
                                    </td>
                                    <td>
                                        <c:out value="${aClass.className}" />
                                    </td>
                         
                                    <td><a href="edit?id=<c:out value='${aClass.classId}' />">Edit</a> &nbsp;&nbsp;&nbsp;&nbsp; <a href="delete?id=<c:out value='${aClass.classId}' />">Delete</a></td>
                                </tr>
                            </c:forEach>
                            <!-- } -->
                        </tbody>

                    </table>
                </div>
            </div>
        </body>

        </html>