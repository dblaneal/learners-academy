<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">

<title>Learners Academy</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-BmbxuPwQa2lc/FVzBcNJ7UAyJxM6wuqIj61tLrc4wSX0szH/Ev+nYRRuWlolflfl"
	crossorigin="anonymous">
</head>

<body>
	<section class="h-100">
		<div class="container h-100">
			<div class="row justify-content-sm-center h-100">
				<div class="col-xxl-4 col-xl-5 col-lg-5 col-md-7 col-sm-9">
					<div class="text-center my-5">
						
						<h1 class="fs-4 card-title fw-bold mb-4">Learners Academy</h1>
					</div>
					<div class="card shadow-lg">
						<div class="card-body p-5">
							<h4 class="fs-4 card-title mb-4">Login</h4>
							
							<form method="POST" class="needs-validation" novalidate=""
								autocomplete="off" action="<%=request.getContextPath()%>/login">
								<div class="mb-3">
									<label class="mb-2 text-muted" for="email">User Name</label> <input id="userName" type="text" class="form-control"
										name="userName" value="" required autofocus>
									<div class="invalid-feedback">User name is required</div>
								</div>

								<div class="mb-3">
									<div class="mb-2 w-100">
										<label class="text-muted" for="password">Password</label> <!-- <a
											href="forgot.html" class="float-end"> Forgot Password? </a> -->
									</div>
									<input id="password" type="password" class="form-control"
										name="password" required>
									<div class="invalid-feedback">Password is required</div>
								</div>

								<div class="d-flex align-items-center">
									
									<button type="submit" class="btn btn-primary ms-auto">
										Login</button>
								</div>
								<div><p style="color: red;">${requestScope.error}</p></div>
							</form>
						</div>
					</div>
					<div class="text-center mt-5 text-muted">Copyright &copy;
						2021-2022 &mdash; Learners Academy</div>
				</div>
			</div>
		</div>
	</section>

	<script src="js/login.js"></script>
</body>
</html>