<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>




<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>diagnosis</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">

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
<style>
.hidden {
	display: none
}

.showing {
	display: block;
}
</style>

<script>
	function preventBack() {
		window.history.forward();
	}

	setTimeout("preventBack()", 0);
	window.onunload = function() {
		null
	};

	function onLabTestChange() {
		console.log(document.getElementById("labTestDropDown").value);
		var labtestValueSelected = document.getElementById("labTestDropDown").value;

		var labTestDetailsDropDownOptions = document
				.getElementById("labTestDetailSelect").options;
		for (let i = 0; i < labTestDetailsDropDownOptions.length; i++) {
			var opt = labTestDetailsDropDownOptions[i];
			if (labtestValueSelected == opt.getAttribute("labTestId")) {
				opt.classList.remove("hidden");
			} else {
				opt.classList.add("hidden");
			}
			console.log(opt);
		}
	}
</script>

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
				<a style="display: flex;" href="" class="navbar-brand"> <img
					src='<c:url value="/resources/img/logo.png" />'
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
						<a href="" class="nav-item nav-link active">Home</a> <a href=""
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
		<div class="row flex-nowrap"
			style="margin-top: 10px; margin-bottom: 50px;">
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
						<li class="nav-item"><a href="#"
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
					style="margin-top: 10px; background-color: whitesmoke; padding: 1%;">
					<table>
						<tr>
							<th>Patient's Name</th>
							<td>:</td>
							<td>${appointment.patients.patientName}</td>


							<th>Date Of Birth</th>
							<td>:</td>
							<td>${appointment.patients.dateOfBirth}</td>
						</tr>
						<tr>
							<th>gender</th>
							<td>:</td>
							<td>${appointment.patients.gender.gender}</td>
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

							<th>Doctor Name</th>
							<td>:</td>
							<td>${appointment.doctor.staff.staffName}</td>
						</tr>
					</table>

				</div>

				<div class="card"
					style="margin-top: 10px; background-color: whitesmoke; padding: 1%;">
					<h5 style="align-self: center; margin-top: 10px;">Medicine
						History</h5>

					<table>
						<tr>
							<th>Doctor</th>
							<th>Appointment Date</th>
							<th>Medicine</th>
							<th>Dose</th>
							<th>No of Days</th>
							<c:forEach items="${previousMedicationHistory}"
								var="previousMedication">
           <tr>
									<td>${previousMedication.appointment.doctor.staff.staffName}</td>
									<td>${previousMedication.appointment.appointmentDateTime}</td>
									<td>${previousMedication.medicine.medicineName}</td>
									<td>${previousMedication.dosage.dosageStatus}</td>
									<td>${previousMedication.noOfDays}</td>
								</tr>
        </c:forEach>
					</table>

				</div>



				<div class="card"
					style="margin-top: 10px; background-color: whitesmoke;">
					<!-- ########################################################################### -->
					<!-- ########################################################################### -->


					<h5 style="align-self: center; margin-top: 10px;">Medicine
						Prescriptions</h5>
					<br>
					<form
						action="saveMedication?appointmentId=${appointment.appointmentId}"
						method="POST">
						<div class="row table-row">
							<div class="col">
								<select class="drop-down-item" id="medicneSelect"
									onchange="onMedicineChange()" name="medicationId">
									<option hidden="true" value="0">Select Medicine</option>
									<c:forEach items="${medicineList}" var="medicine">
            <option value="${medicine.medicineId}">${medicine.medicineName}</option>
        </c:forEach>
								</select>
							</div>
							<div class="col">
								<select class="drop-down-item" id="dosageSelect"
									onchange="onDoseChanged()" name="dosageId">
									<option hidden="true" value="0">Select Dosage</option>
									<c:forEach items="${dosageList}" var="dosage">
            <option dosagesid="${dosage.dosageId}"
											value="${dosage.dosageId}">${dosage.dosageStatus}</option>
				 </c:forEach>
								</select>
							</div>
							<div class="col">
								<input id="days" type="number" placeholder="Enter no of days"
									name="noOfDays" />
							</div>
							<div class="col">
								<button type="submit" class="btn btn-primary">Add</button>
							</div>
						</div>
					</form>


					<c:forEach items="${currentMedicationHistory}"
						var="currentMedication">
						<form
							action="deleteMedicine?appointmentId=${appointment.appointmentId}&prescriptionId=${currentMedication.prescriptionId}"
							method="POST">
							<div class="row table-row">
								<div class="col">
									<p>${currentMedication.medicine.medicineName}</p>
								</div>
								<div class="col">
									<p>${currentMedication.dosage.dosageStatus}</p>
								</div>
								<div class="col">
									<p>${currentMedication.noOfDays}</p>
								</div>
								<div class="col">
									<button class="btn">Delete</button>
								</div>
							</div>
						</form>
					</c:forEach>

				</div>



				<!-- ########################################################################### -->
				<!-- ########################################################################### -->
				<div class="card"
					style="margin-top: 10px; background-color: whitesmoke; padding: 1%;">
					<h5 style="align-self: center; margin-top: 10px;">Lab History</h5>
					<table>
						<tr>
							<th>Doctor</th>
							<th>Appointment Date</th>
							<th>Lab Test</th>
							<th>Test Details</th>
							<th>Result</th>
							<c:forEach items="${previousPatientLabTestDetails}"
								var="previousLabTest">
           <tr>
									<td>${previousLabTest.appointment.doctor.staff.staffName}</td>
									<td>${previousLabTest.appointment.appointmentDateTime}</td>
									<td>${previousLabTest.labtestdetails.labtest.labTestName}</td>
									<td>${previousLabTest.labtestdetails.testDetails}</td>
									<td></td>
								</tr>
        </c:forEach>
					</table>

				</div>



				<div class="card"
					style="margin-top: 10px; background-color: whitesmoke;">
					<!-- ########################################################################### -->
					<!-- ########################################################################### -->


					<h5 style="align-self: center; margin-top: 10px;">Lab Test
						Details</h5>
					<br>
					<form action="saveLab?appointmentId=${appointment.appointmentId}"
						method="POST">
						<div class="row table-row">
							<div class="col">

								<select class="drop-down-item" id="labTestDropDown"
									name="labTestId" onchange="onLabTestChange()">
									<option hidden="true" value="0">Select Lab Test</option>
									<c:forEach items="${labTestList}" var="labTest">
            <option value="${labTest.labTestId}">${labTest.labTestName}</option>
        </c:forEach>
								</select>
							</div>
							<div class="col">
								<select class="drop-down-item" id="labTestDetailSelect"
									onchange="onMedicineChange()" name="labTestDetailId">
									<option hidden="true" value="0">Select Test Details</option>
									<c:forEach items="${labTestDetailsList}" var="labTestDetail">
            <option labTestId="${labTestDetail.labtest.labTestId}"
											value="${labTestDetail.labTestDetailsId}">${labTestDetail.testDetails}</option>
        </c:forEach>
								</select>
							</div>
							<div class="col">
								<button type="submit" class="btn btn-primary">Add</button>
							</div>

						</div>
					</form>


					<c:forEach items="${currentPatientLabTestDetails}"
						var="currentLabTest">
						<form
							action="deleteLab?appointmentId=${appointment.appointmentId}&patientLabTestDetailsId=${currentLabTest.patientLabTestDetailsId}"
							method="POST">
							<div class="row table-row">
								<div class="col">
									<p>${currentLabTest.labtestdetails.labtest.labTestName}</p>
								</div>
								<div class="col">
									<p>${currentLabTest.labtestdetails.testDetails}</p>
								</div>
								<div class="col">
									<button class="btn">Delete</button>
								</div>
							</div>
						</form>
					</c:forEach>
				</div>

			</div>
		</div>
		<!-- ----------------------------------------------- -->
		<br>
	</div>

</body>
</html>