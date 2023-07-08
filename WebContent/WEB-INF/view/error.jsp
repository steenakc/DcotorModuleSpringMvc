<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Clinical Management System</title>
<meta content="width=device-width, initial-scale=1.0" name="viewport">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">

<link rel="preconnect" href="https://fonts.gstatic.com">
<link
	href="https://fonts.googleapis.com/css2?family=Roboto+Condensed:wght@400;700&family=Roboto:wght@400;700&display=swap"
	rel="stylesheet">
<link
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.0/css/all.min.css"
	rel="stylesheet">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.4.1/font/bootstrap-icons.css"
	rel="stylesheet">
<link href="<c:url value="/resources/css/style.css" />" rel="stylesheet">
<link href="<c:url value="/resources/css/doctor.css" />"
	rel="stylesheet">

<script src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0/dist/js/bootstrap.bundle.min.js"></script>
<script
	src="<c:url value="/resources/lib_style/easing/easing.min.js" />"></script>
<script
	src="<c:url value="/resources/lib_style/waypoints/waypoints.min.js" />"></script>
<script
	src="<c:url value="/resources/lib_style/owlcarousel/owl.carousel.min.js" />"></script>
<script
	src="<c:url value="/resources/lib_style/tempusdominus/js/moment.min.js" />"></script>
<script
	src="<c:url value="/resources/lib_style/tempusdominus/js/moment-timezone.min.js" />"></script>
<script
	src="<c:url value="/resources/lib_style/tempusdominus/js/tempusdominus-bootstrap-4.min.js" />"></script>
<script>
	
</script>

</head>
<body>

	<div style="margin-top: 50px; margin-left: 50px" class="row">
		<div class="pt-2">
			<a href="/Management/login/login-page"
				class="btn btn-light
							rounded-pill py-md-3 px-md-5 mx-2">Session
				Expired. Login to Continue</a>
		</div>
	</div>
</body>


</html>