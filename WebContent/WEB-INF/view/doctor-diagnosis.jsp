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
	function toggleDiaganosisHistory() {
		var diaganosisHistory = document.getElementById("diaganosisHistory");
		var diaganosisBtn = document.getElementById("diaganosisBtn");
		if (diaganosisHistory.classList.contains("hidden")) {
			diaganosisHistory.classList.remove("hidden");
			diaganosisBtn.innerHTML = "Hide Diagnosis History";
		} else {
			diaganosisHistory.classList.add("hidden");
			diaganosisBtn.innerHTML = "View Diagnosis History";
		}
	}
</script>
<style>
.hidden {
	display: none
}
</style>
</head>
<body>
	<!-- Topbar Start -->
	<div class="container-fluid py-2 border-bottom d-none d-lg-block">
		<div class="container">
			<div class="row">
				<div class="col-md-6 text-center text-lg-start mb-2 mb-lg-0">
					<div class="d-inline-flex align-items-center">
						<a class="text-decoration-none text-body pe-3" href=""><i
							class="bi bi-telephone me-2"></i>+91 9947349466</a> <span
							class="text-body">|</span> <a
							class="text-decoration-none text-body px-3" href=""><i
							class="bi bi-envelope me-2"></i>royal@melboure.com</a>
					</div>
				</div>
				<div class="col-md-6 text-center text-lg-end">
					<div class="d-inline-flex align-items-center">
						<a class="text-body px-2" href=""> <i
							class="fab fa-facebook-f"></i>
						</a> <a class="text-body px-2" href=""> <i class="fab fa-twitter"></i>
						</a> <a class="text-body px-2" href=""> <i
							class="fab fa-linkedin-in"></i>
						</a> <a class="text-body px-2" href=""> <i
							class="fab fa-instagram"></i>
						</a> <a class="text-body ps-2" href=""> <i class="fab fa-youtube"></i>
						</a>
					</div>
				</div>
			</div>
		</div>
	</div>
	<!-- Topbar End -->


	<!-- Navbar Start -->
	<div class="container-fluid sticky-top bg-white shadow-sm">
		<div class="container">
			<nav
				class="navbar navbar-expand-lg bg-white navbar-light py-3 py-lg-0">
				<a style="display: flex;" href="index.html" class="navbar-brand">
					<img src='<c:url value="/resources/img/logo.png" />'
					style="height: 50px; width: 50px; margin-right: 5px">
					<h1 class="m-0 text-uppercase text-primary">The Royal Melboure
					</h1>
				</a>
				<button class="navbar-toggler" type="button"
					data-bs-toggle="collapse" data-bs-target="#navbarCollapse">
					<span class="navbar-toggler-icon"></span>
				</button>
				<div class="collapse navbar-collapse" id="navbarCollapse">
					<div class="navbar-nav ms-auto py-0">
						<a href="/Management/" class="nav-item nav-link active">Home</a> <a href=""
							class="nav-item nav-link">About</a> <a href=""
							class="nav-item nav-link">Service</a> <a href=""
							class="nav-item nav-link">Contact</a> <a>
							<button
								style="padding-left: 10px; padding-top: 3px; padding-right: 10px; padding-bottom: 3px; position: relative; top: 30%;"
								class=" nav-item nav-link btn btn-primary"
								onclick="history.back()">back</button>
						</a>
					</div>
				</div>
			</nav>
		</div>
	</div>
	<!-- Navbar End -->

	<div class="container-fluid">
		<div class="row flex-nowrap" style="margin-top: 10px;">
			<div class="col-auto col-md-3 col-xl-2 px-sm-2 px-0 bg-dark"
				style="background-color: #d0e9ec !important;">
				<div
					class="d-flex flex-column align-items-center align-items-sm-start px-3 pt-2 text-white min-vh-100">
					<div class="dropdown">
						<a href="#"
							class="d-flex align-items-center text-decoration-none dropdown-toggle"
							id="dropdownUser1" data-bs-toggle="dropdown"
							aria-expanded="false"> <img
							src='<c:url value="/resources/img/logo.png" />' alt="hugenerd"
							width="30" height="30" class="rounded-circle"> <span
							class="d-none d-sm-inline mx-1"
							style="color: maroon; font-size: 18px;">Steena K C</span>
						</a>
						<ul class="dropdown-menu dropdown-menu-dark text-small shadow">
							<li><a class=" dropdown-item" href="login.html">Log out</a></li>
						</ul>
					</div>
					<ul
						class="nav nav-pills flex-column mb-sm-auto mb-0 align-items-center align-items-sm-start"
						id="menu">
						<li class="nav-item"><a href="/Management/"
							class="nav-link align-middle px-0" style="color: #060633;"> <i
								class="fs-4 bi-house"></i> <span class="ms-1 d-none d-sm-inline">Home</span>
						</a></li>
						<li><a href="#submenu1" data-bs-toggle="collapse"
							class="nav-link px-0 align-middle" style="color: #060633;"> <i
								class="fs-4 bi-speedometer2"></i> <span
								class="ms-1 d-none d-sm-inline">Dashboard</span>
						</a>
							<ul class="collapse show nav flex-column ms-1" id="submenu1"
								data-bs-parent="#menu">
								<li class="w-100"><a href="/Management/doctor/home"
									class="nav-link px-0" style="color: #060633;"> <span
										class="d-none d-sm-inline">Today's </span> Appointments
								</a></li>

							</ul></li>
						<li><a href="#" class="nav-link px-0 align-middle"
							style="color: #060633;"> <i class="fs-4 bi-people"></i> <span
								class="ms-1 d-none d-sm-inline">Settings</span>
						</a></li>
					</ul>
					<hr>
				</div>
			</div>
			<div class="col-md-9 col-xl-10 px-sm-10">

				<div class="card"
					style="margin-top: 10px; background-color: whitesmoke;">
					<div style="margin-bottom: 10px;">
						<img src='<c:url value="/resources/img/logo.png" />' alt=""
							width="30" height="24" class="d-inline-block align-text-top"
							style="height: 90%; width: 7%;">
					</div>
					<div style="margin-top: -5%; margin-left: 9%;">
						<h1 style="color: rgb(16, 16, 161); font-family: emoji;">THE
							ROYAL MELBOURE HOSPITAL</h1>
						<hr style="margin-left: -10%;">
					</div>
					<div style="margin-left: 2%;">
						<div class="card"
							style="width: 95%; margin-left: 4%; padding-left: 2%;">
							<table>
								<tr>
									<th>Patient's Name</th>
									<td>:</td>
									<td>${appointment.patients.patientName}</td>

								</tr>



								<th>Date Of Birth</th>
								<td>:</td>
								<td>${appointment.patients.dateOfBirth}</td>

								<tr>
									<th>gender</th>
									<td>:</td>

									<td>${appointment.patients.gender.gender}</td>
								</tr>

								<tr>
									<th>Blood Group</th>
									<td>:</td>
									<td>${appointment.patients.bloodGroup.bloodGroup}</td>
								</tr>
								<tr>
									<th>Date</th>
									<td>:</td>
									<td><%@ page import="java.util.Date"%>
										<%@ page import="java.text.SimpleDateFormat"%>

										<%
											// Create a Date object representing the current date and time
											Date today = new Date();

											// Define the desired date format
											String dateFormat = "dd-MM-YYYY"; // Example format: "YYYY-MM-DD"

											// Create a SimpleDateFormat object with the desired format
											SimpleDateFormat sdf = new SimpleDateFormat(dateFormat);

											// Format the date as a string
											String formattedDate = sdf.format(today);
										%> <%=formattedDate%></td>
								</tr>
								<tr>
									<th>Doctor Name</th>
									<td>:</td>
									<td>${appointment.doctor.staff.staffName}</td>
								</tr>

								<tr>
									<th></th>
								</tr>
								<tr>
									<th></th>
								</tr>
							</table>

						</div>
						<br>
						<div>
							<div class="row">
								<div class="col"></div>
								<div class="col">
									<h5>PRIMARY DIAGNOSIS</h5>
								</div>

								<div class="col">
									<button id="diaganosisBtn"
										style="margin-bottom: 12px; color: rgb(240, 243, 243); background-color: rgb(38, 6, 110);"
										onclick="toggleDiaganosisHistory()">View Diagnosis
										History</button>
								</div>

							</div>
							<div id="diaganosisHistory" class="row hidden">
								<div class="col">
									<div class="card" style="margin: 10px; padding: 10px;"
										hidden" modelAttribute="diaganosisList">

										<div style="margin-left: 35%;">
											<h5>Diagnosis History</h5>
											<table>
												<tr>
													<th>Date</th>
													<th>&nbsp</th>
													<th>Diaganosis</th>
													<th>&nbsp&nbsp</th>
													<th>Prescribed By</th>
												</tr>
												<c:forEach var="diagan" items="${diaganosisList}">
													<tr>
														<td>${diagan.appointment.appointmentDateTime}</td>
														<td>&nbsp&nbsp&nbsp</td>
														<td>${diagan.diaganosis}</td>
														<td>&nbsp&nbsp&nbsp</td>
														<td>${diagan.appointment.doctor.staff.staffName}</td>
													</tr>
												</c:forEach>
											</table>
										</div>
									</div>
								</div>
							</div>
						</div>


						<f:form
							action="saveDiagnosis?appointmentId=${appointment.appointmentId}"
							method="post">
							<table>
								<tbody>
									<tr>
										<div class="card" style="width: 95%; margin-left: 2%;">
											<textarea rows="5" cols="20"
												placeholder="Enter primary diagnosis here..."
												name="diaganosis"></textarea>
										</div>
									</tr>

									<tr>
										<div style="margin-bottom: 10px;">
											<td><input
												style="position: relative; left: 50%; background-color: blue; color: white; border: none; padding: 5px 10px; cursor: pointer;"
												type="submit" value="Submit" class="save" /></td>
										</div>
									</tr>
								</tbody>
							</table>
						</f:form>

						<br>

					</div>
				</div>
				<br>

			</div>
		</div>
	</div>
	</div>





	<div
		class="container-fluid bg-dark text-light border-top border-secondary py-4">
		<div class="container">
			<div class="row g-5">
				<div class="col-md-6 text-center text-md-start">
					<p class="mb-md-0">
						&copy; <a class="text-primary" href="#">Your Site Name</a>. All
						Rights Reserved.
					</p>
				</div>
				<div class="col-md-6 text-center text-md-end">
					<p class="mb-0">
						Designed by <a class="text-primary" href="#">Team Exceptionx</a>
					</p>
				</div>
			</div>
		</div>
	</div>
	<!-- Footer End -->


	<!-- Back to Top -->
	<a href="#" class="btn btn-lg btn-primary btn-lg-square back-to-top"><i
		class="bi bi-arrow-up"></i></a>



</body>


</html>