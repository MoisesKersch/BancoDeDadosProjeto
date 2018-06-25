<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html lang="pt">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>My Crud</title>
<link rel="stylesheet" type="text/css" media="screen"
	href="<c:url value="/resources/css/bootstrap.min.css" />">
<script src="<c:url value="/resources/js/jquery-3.3.1.min.js" />"></script>
<script src="<c:url value="/resources/js/register.js" />"></script>
</head>
<body>
	<div class="container">
		<div class="row">
			<div class="row">
				<div class="col-sm-8">
					 <form action = "register" method = "GET">
						<h4 class="page-header">Register</h4>
							<button name="choice" value="Nurse" type="submit" class="btn btn-primary">Register a nurse</button>
							<button name="choice" value="Patient" type="submit" class="btn btn-secondary">Register a patient</button>
					</form>
				</div>
			</div>
		</div>
	</div>
</body>
</html>