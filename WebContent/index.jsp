<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

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
				<a href="" class="navbar-brand">
					<h1 class="m-0 text-uppercase text-primary">
						<i class="fa fa-clinic-medical me-2"></i>The Royal Melboure
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
							class="nav-item nav-link">Contact</a>
					</div>
				</div>
			</nav>
		</div>
	</div>
	<!-- Navbar End -->


	<!-- Hero Start -->
	<div class="container-fluid bg-primary py-5 mb-5 hero-header">
		<div class="container py-5">
			<div class="row justify-content-start">
				<div class="col-lg-8 text-center text-lg-start">
					<h5
						class="d-inline-block text-primary text-uppercase border-bottom border-5"
						style="border-color: rgba(256, 256, 256, .3) !important;">Welcome
						To The Royal Melboure</h5>
					<h1 class="display-1 text-white mb-md-4">Best Healthcare
						Solution In Your City</h1>
					<div class="pt-2">
						<a href="/Management/login/login-page"
							class="btn btn-light
							rounded-pill py-md-3 px-md-5 mx-2">Lets
							Get Started</a>
					</div>
				</div>
			</div>
		</div>
	</div>
	<!-- Hero End -->


	<!-- About Start -->
	<div class="container-fluid py-5">
		<div class="container">
			<div class="row gx-5">
				<div class="col-lg-5 mb-5 mb-lg-0" style="min-height: 500px;">
					<div class="position-relative h-100">
						<img class="position-absolute w-100 h-100 rounded"
							src='<c:url value="/resources/img/about.jpg" />'
							style="object-fit: cover;">
					</div>
				</div>
				<div class="col-lg-7">
					<div class="mb-4">
						<h5
							class="d-inline-block text-primary text-uppercase border-bottom border-5">About
							Us</h5>
						<h1 class="display-4">Best Medical Care For Yourself and Your
							Family</h1>
					</div>
					<p>It was time for the vines to settle down. Let the pain be
						long, and let it be settled in time. Some of them have a lot of
						work to do. Clita was the very thing, but it was not a work. Saint
						Clita two just and time will be settled takimata thus, the pains
						takimata will be settled they envy great pains some pains with
						pain. It was fun and great</p>
					<div class="row g-3 pt-3">
						<div class="col-sm-3 col-6">
							<div class="bg-light text-center rounded-circle py-4">
								<i class="fa fa-3x fa-user-md text-primary mb-3"></i>
								<h6 class="mb-0">
									Qualified<small class="d-block text-primary">Doctors</small>
								</h6>
							</div>
						</div>
						<div class="col-sm-3 col-6">
							<div class="bg-light text-center rounded-circle py-4">
								<i class="fa fa-3x fa-procedures text-primary mb-3"></i>
								<h6 class="mb-0">
									Emergency<small class="d-block text-primary">Services</small>
								</h6>
							</div>
						</div>
						<div class="col-sm-3 col-6">
							<div class="bg-light text-center rounded-circle py-4">
								<i class="fa fa-3x fa-microscope text-primary mb-3"></i>
								<h6 class="mb-0">
									Accurate<small class="d-block text-primary">Testing</small>
								</h6>
							</div>
						</div>
						<div class="col-sm-3 col-6">
							<div class="bg-light text-center rounded-circle py-4">
								<i class="fa fa-3x fa-ambulance text-primary mb-3"></i>
								<h6 class="mb-0">
									Free<small class="d-block text-primary">Ambulance</small>
								</h6>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<!-- About End -->


	<!-- Services Start -->
	<div class="container-fluid py-5">
		<div class="container">
			<div class="text-center mx-auto mb-5" style="max-width: 500px;">
				<h5
					class="d-inline-block text-primary text-uppercase border-bottom border-5">Services</h5>
				<h1 class="display-4">Excellent Medical Services</h1>
			</div>
			<div class="row g-5">
				<div class="col-lg-4 col-md-6">
					<div
						class="service-item bg-light rounded d-flex flex-column align-items-center justify-content-center text-center">
						<div class="service-icon mb-4">
							<i class="fa fa-2x fa-user-md text-white"></i>
						</div>
						<h4 class="mb-3">Emergency Care</h4>
						<p class="m-0">Kasd dolor no lorem nonumy sit labore tempor at
							justo rebum rebum stet, justo elitr dolor amet sitKasd dolor no
							lorem nonumy sit labore tempor at justo rebum rebum stet, justo
							elitr dolor amet sit</p>
						<a class="btn btn-lg btn-primary rounded-pill" href=""> <i
							class="bi bi-arrow-right"></i>
						</a>
					</div>
				</div>
				<div class="col-lg-4 col-md-6">
					<div
						class="service-item bg-light rounded d-flex flex-column align-items-center justify-content-center text-center">
						<div class="service-icon mb-4">
							<i class="fa fa-2x fa-procedures text-white"></i>
						</div>
						<h4 class="mb-3">Operation & Surgery</h4>
						<p class="m-0">Kasd dolor no lorem nonumy sit labore tempor at
							justo rebum rebum stet, justo elitr dolor amet sit</p>
						<a class="btn btn-lg btn-primary rounded-pill" href=""> <i
							class="bi bi-arrow-right"></i>
						</a>
					</div>
				</div>
				<div class="col-lg-4 col-md-6">
					<div
						class="service-item bg-light rounded d-flex flex-column align-items-center justify-content-center text-center">
						<div class="service-icon mb-4">
							<i class="fa fa-2x fa-stethoscope text-white"></i>
						</div>
						<h4 class="mb-3">Outdoor Checkup</h4>
						<p class="m-0">Kasd dolor no lorem nonumy sit labore tempor at
							justo rebum rebum stet, justo elitr dolor amet sit</p>
						<a class="btn btn-lg btn-primary rounded-pill" href=""> <i
							class="bi bi-arrow-right"></i>
						</a>
					</div>
				</div>
				<div class="col-lg-4 col-md-6">
					<div
						class="service-item bg-light rounded d-flex flex-column align-items-center justify-content-center text-center">
						<div class="service-icon mb-4">
							<i class="fa fa-2x fa-ambulance text-white"></i>
						</div>
						<h4 class="mb-3">Ambulance Service</h4>
						<p class="m-0">Kasd dolor no lorem nonumy sit labore tempor at
							justo rebum rebum stet, justo elitr dolor amet sit</p>
						<a class="btn btn-lg btn-primary rounded-pill" href=""> <i
							class="bi bi-arrow-right"></i>
						</a>
					</div>
				</div>
				<div class="col-lg-4 col-md-6">
					<div
						class="service-item bg-light rounded d-flex flex-column align-items-center justify-content-center text-center">
						<div class="service-icon mb-4">
							<i class="fa fa-2x fa-pills text-white"></i>
						</div>
						<h4 class="mb-3">Medicine & Pharmacy</h4>
						<p class="m-0">Kasd dolor no lorem nonumy sit labore tempor at
							justo rebum rebum stet, justo elitr dolor amet sit</p>
						<a class="btn btn-lg btn-primary rounded-pill" href=""> <i
							class="bi bi-arrow-right"></i>
						</a>
					</div>
				</div>
				<div class="col-lg-4 col-md-6">
					<div
						class="service-item bg-light rounded d-flex flex-column align-items-center justify-content-center text-center">
						<div class="service-icon mb-4">
							<i class="fa fa-2x fa-microscope text-white"></i>
						</div>
						<h4 class="mb-3">Blood Testing</h4>
						<p class="m-0">Kasd dolor no lorem nonumy sit labore tempor at
							justo rebum rebum stet, justo elitr dolor amet sit</p>
						<a class="btn btn-lg btn-primary rounded-pill" href=""> <i
							class="bi bi-arrow-right"></i>
						</a>
					</div>
				</div>
			</div>
		</div>
	</div>
	<!-- Services End -->




	<!-- Team Start -->
	<div class="container-fluid py-5">
		<div class="container">
			<div class="text-center mx-auto mb-5" style="max-width: 500px;">
				<h5
					class="d-inline-block text-primary text-uppercase border-bottom border-5">Our
					Doctors</h5>
				<h1 class="display-4">Qualified Healthcare Professionals</h1>
			</div>
			<div class="owl-carousel team-carousel position-relative">
				<div class="team-item">
					<div class="row g-0 bg-light rounded overflow-hidden">
						<div class="col-12 col-sm-5 h-100">
							<img class="img-fluid h-100"
								src='<c:url value="/resources/img/team-1.jpg" />'
								style="object-fit: cover;">
						</div>
						<div class="col-12 col-sm-7 h-100 d-flex flex-column">
							<div class="mt-auto p-4">
								<h3>Doctor Name</h3>
								<h6 class="fw-normal fst-italic text-primary mb-4">Cardiology
									Specialist</h6>
								<p class="m-0">Dolor lorem eos dolor duo eirmod sea. Dolor
									sit magna rebum clita rebum dolor</p>
							</div>
							<div class="d-flex mt-auto border-top p-4">
								<a
									class="btn btn-lg btn-primary btn-lg-square rounded-circle me-3"
									href="#"><i class="fab fa-twitter"></i></a> <a
									class="btn btn-lg btn-primary btn-lg-square rounded-circle me-3"
									href="#"><i class="fab fa-facebook-f"></i></a> <a
									class="btn btn-lg btn-primary btn-lg-square rounded-circle"
									href="#"><i class="fab fa-linkedin-in"></i></a>
							</div>
						</div>
					</div>
				</div>
				<div class="team-item">
					<div class="row g-0 bg-light rounded overflow-hidden">
						<div class="col-12 col-sm-5 h-100">
							<img class="img-fluid h-100" src='<c:url value="/resources/img/team-2.jpg" />' 
								style="object-fit: cover;">
						</div>
						<div class="col-12 col-sm-7 h-100 d-flex flex-column">
							<div class="mt-auto p-4">
								<h3>Doctor Name</h3>
								<h6 class="fw-normal fst-italic text-primary mb-4">Cardiology
									Specialist</h6>
								<p class="m-0">Dolor lorem eos dolor duo eirmod sea. Dolor
									sit magna rebum clita rebum dolor</p>
							</div>
							<div class="d-flex mt-auto border-top p-4">
								<a
									class="btn btn-lg btn-primary btn-lg-square rounded-circle me-3"
									href="#"><i class="fab fa-twitter"></i></a> <a
									class="btn btn-lg btn-primary btn-lg-square rounded-circle me-3"
									href="#"><i class="fab fa-facebook-f"></i></a> <a
									class="btn btn-lg btn-primary btn-lg-square rounded-circle"
									href="#"><i class="fab fa-linkedin-in"></i></a>
							</div>
						</div>
					</div>
				</div>
				<div class="team-item">
					<div class="row g-0 bg-light rounded overflow-hidden">
						<div class="col-12 col-sm-5 h-100">
							<img class="img-fluid h-100" src='<c:url value="/resources/img/team-3.jpg" />'
								style="object-fit: cover;">
						</div>
						<div class="col-12 col-sm-7 h-100 d-flex flex-column">
							<div class="mt-auto p-4">
								<h3>Doctor Name</h3>
								<h6 class="fw-normal fst-italic text-primary mb-4">Cardiology
									Specialist</h6>
								<p class="m-0">Dolor lorem eos dolor duo eirmod sea. Dolor
									sit magna rebum clita rebum dolor</p>
							</div>
							<div class="d-flex mt-auto border-top p-4">
								<a
									class="btn btn-lg btn-primary btn-lg-square rounded-circle me-3"
									href="#"><i class="fab fa-twitter"></i></a> <a
									class="btn btn-lg btn-primary btn-lg-square rounded-circle me-3"
									href="#"><i class="fab fa-facebook-f"></i></a> <a
									class="btn btn-lg btn-primary btn-lg-square rounded-circle"
									href="#"><i class="fab fa-linkedin-in"></i></a>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<!-- Team End -->


	<!-- Search Start -->
	<div class="container-fluid bg-primary my-5 py-5">
		<div class="container py-5">
			<div class="text-center mx-auto mb-5" style="max-width: 500px;">
				<h5
					class="d-inline-block text-white text-uppercase border-bottom border-5">Find
					A Doctor</h5>
				<h1 class="display-4 mb-4">Find A Healthcare Professionals</h1>
				<h5 class="text-white fw-normal">Duo ipsum erat stet dolor sea
					ut nonumy tempor. Tempor duo lorem eos sit sed ipsum takimata ipsum
					sit est. Ipsum ea voluptua ipsum sit justo</h5>
			</div>
			<div class="mx-auto" style="width: 100%; max-width: 600px;">
				<div class="input-group">
					<select class="form-select border-primary w-25"
						style="height: 60px;">
						<option selected>Department</option>
						<option value="1">Department 1</option>
						<option value="2">Department 2</option>
						<option value="3">Department 3</option>
					</select> <input type="text" class="form-control border-primary w-50"
						placeholder="Keyword">
					<button class="btn btn-dark border-0 w-25">Search</button>
				</div>
			</div>
		</div>
	</div>
	<!-- Search End -->


	<!-- Testimonial Start -->
	<div class="container-fluid py-5">
		<div class="container">
			<div class="text-center mx-auto mb-5" style="max-width: 500px;">
				<h5
					class="d-inline-block text-primary text-uppercase border-bottom border-5">Testimonial</h5>
				<h1 class="display-4">Patients Say About Our Services</h1>
			</div>
			<div class="row justify-content-center">
				<div class="col-lg-8">
					<div class="owl-carousel testimonial-carousel">
						<div class="testimonial-item text-center">
							<div class="position-relative mb-5">
								<img class="img-fluid rounded-circle mx-auto"
									src='<c:url value="/resources/img/testimonial-1.jpg" />' alt="">
								<div
									class="position-absolute top-100 start-50 translate-middle d-flex align-items-center justify-content-center bg-white rounded-circle"
									style="width: 60px; height: 60px;">
									<i class="fa fa-quote-left fa-2x text-primary"></i>
								</div>
							</div>
							<p class="fs-4 fw-normal">Dolores sed duo clita tempor justo
								dolor et stet lorem kasd labore dolore lorem ipsum. At lorem
								lorem magna ut et, nonumy et labore et tempor diam tempor erat.
								Erat dolor rebum sit ipsum.</p>
							<hr class="w-25 mx-auto">
							<h3>Patient Name</h3>
							<h6 class="fw-normal text-primary mb-3">Profession</h6>
						</div>
						<div class="testimonial-item text-center">
							<div class="position-relative mb-5">
								<img class="img-fluid rounded-circle mx-auto"
									src='<c:url value="/resources/img/testimonial-2.jpg" />' alt="">
								<div
									class="position-absolute top-100 start-50 translate-middle d-flex align-items-center justify-content-center bg-white rounded-circle"
									style="width: 60px; height: 60px;">
									<i class="fa fa-quote-left fa-2x text-primary"></i>
								</div>
							</div>
							<p class="fs-4 fw-normal">Dolores sed duo clita tempor justo
								dolor et stet lorem kasd labore dolore lorem ipsum. At lorem
								lorem magna ut et, nonumy et labore et tempor diam tempor erat.
								Erat dolor rebum sit ipsum.</p>
							<hr class="w-25 mx-auto">
							<h3>Patient Name</h3>
							<h6 class="fw-normal text-primary mb-3">Profession</h6>
						</div>
						<div class="testimonial-item text-center">
							<div class="position-relative mb-5">
								<img class="img-fluid rounded-circle mx-auto"
									src='<c:url value="/resources/img/testimonial-3.jpg" />' alt="">
								<div
									class="position-absolute top-100 start-50 translate-middle d-flex align-items-center justify-content-center bg-white rounded-circle"
									style="width: 60px; height: 60px;">
									<i class="fa fa-quote-left fa-2x text-primary"></i>
								</div>
							</div>
							<p class="fs-4 fw-normal">Dolores sed duo clita tempor justo
								dolor et stet lorem kasd labore dolore lorem ipsum. At lorem
								lorem magna ut et, nonumy et labore et tempor diam tempor erat.
								Erat dolor rebum sit ipsum.</p>
							<hr class="w-25 mx-auto">
							<h3>Patient Name</h3>
							<h6 class="fw-normal text-primary mb-3">Profession</h6>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<!-- Testimonial End -->


	<!-- Blog Start -->
	<div class="container-fluid py-5">
		<div class="container">
			<div class="text-center mx-auto mb-5" style="max-width: 500px;">
				<h5
					class="d-inline-block text-primary text-uppercase border-bottom border-5">Blog
					Post</h5>
				<h1 class="display-4">Our Latest Medical Blog Posts</h1>
			</div>
			<div class="row g-5">
				<div class="col-xl-4 col-lg-6">
					<div class="bg-light rounded overflow-hidden">
						<img class="img-fluid w-100" src='<c:url value="/resources/img/blog-1.jpg" />'alt="">
						<div class="p-4">
							<a class="h3 d-block mb-3" href="">Dolor clita vero elitr sea
								stet dolor justo diam</a>
							<p class="m-0">Dolor lorem eos dolor duo et eirmod sea. Dolor
								sit magna rebum clita rebum dolor stet amet justo</p>
						</div>
						<div class="d-flex justify-content-between border-top p-4">
							<div class="d-flex align-items-center">
								<img class="rounded-circle me-2" src='<c:url value="/resources/img/user.jpg" />' width="25"
									height="25" alt=""> <small>John Doe</small>
							</div>
							<div class="d-flex align-items-center">
								<small class="ms-3"><i
									class="far fa-eye text-primary me-1"></i>12345</small> <small
									class="ms-3"><i
									class="far fa-comment text-primary me-1"></i>123</small>
							</div>
						</div>
					</div>
				</div>
				<div class="col-xl-4 col-lg-6">
					<div class="bg-light rounded overflow-hidden">
						<img class="img-fluid w-100" src='<c:url value="/resources/img/blog-2.jpg" />' alt="">
						<div class="p-4">
							<a class="h3 d-block mb-3" href="">Dolor clita vero elitr sea
								stet dolor justo diam</a>
							<p class="m-0">Dolor lorem eos dolor duo et eirmod sea. Dolor
								sit magna rebum clita rebum dolor stet amet justo</p>
						</div>
						<div class="d-flex justify-content-between border-top p-4">
							<div class="d-flex align-items-center">
								<img class="rounded-circle me-2" src='<c:url value="/resources/img/user.jpg" />' width="25"
									height="25" alt=""> <small>John Doe</small>
							</div>
							<div class="d-flex align-items-center">
								<small class="ms-3"><i
									class="far fa-eye text-primary me-1"></i>12345</small> <small
									class="ms-3"><i
									class="far fa-comment text-primary me-1"></i>123</small>
							</div>
						</div>
					</div>
				</div>
				<div class="col-xl-4 col-lg-6">
					<div class="bg-light rounded overflow-hidden">
						<img class="img-fluid w-100"
							src='<c:url value="/resources/img/blog-3.jpg" />' alt="">
						<div class="p-4">
							<a class="h3 d-block mb-3" href="">Dolor clita vero elitr sea
								stet dolor justo diam</a>
							<p class="m-0">Dolor lorem eos dolor duo et eirmod sea. Dolor
								sit magna rebum clita rebum dolor stet amet justo</p>
						</div>
						<div class="d-flex justify-content-between border-top p-4">
							<div class="d-flex align-items-center">
								<img class="rounded-circle me-2" src='<c:url value="/resources/img/user.jpg" />' width="25"
									height="25" alt=""> <small>John Doe</small>
							</div>
							<div class="d-flex align-items-center">
								<small class="ms-3"><i
									class="far fa-eye text-primary me-1"></i>12345</small> <small
									class="ms-3"><i
									class="far fa-comment text-primary me-1"></i>123</small>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<!-- Blog End -->


	<!-- Footer Start -->
	<div class="container-fluid bg-dark text-light mt-5 py-5">
		<div class="container py-5">
			<div class="row g-5">
				<div class="col-lg-3 col-md-6">
					<h4
						class="d-inline-block text-primary text-uppercase border-bottom border-5 border-secondary mb-4">Get
						In Touch</h4>
					<p class="mb-4">No dolore ipsum accusam no lorem. Invidunt sed
						clita kasd clita et et dolor sed dolor</p>
					<p class="mb-2">
						<i class="fa fa-map-marker-alt text-primary me-3"></i>123 Street
						Thalassery ,Kerala
					</p>
					<p class="mb-2">
						<i class="fa fa-envelope text-primary me-3"></i>royal@melboure.com
					</p>
					<p class="mb-0">
						<i class="fa fa-phone-alt text-primary me-3"></i>+91 99473494660
					</p>
				</div>
				<div class="col-lg-3 col-md-6">
					<h4
						class="d-inline-block text-primary text-uppercase border-bottom border-5 border-secondary mb-4">Quick
						Links</h4>
					<div class="d-flex flex-column justify-content-start">
						<a class="text-light mb-2" href="#"><i
							class="fa fa-angle-right me-2"></i>Home</a> <a
							class="text-light mb-2" href="#"><i
							class="fa fa-angle-right me-2"></i>About Us</a> <a
							class="text-light mb-2" href="#"><i
							class="fa fa-angle-right me-2"></i>Our Services</a> <a
							class="text-light mb-2" href="#"><i
							class="fa fa-angle-right me-2"></i>Meet The Team</a> <a
							class="text-light mb-2" href="#"><i
							class="fa fa-angle-right me-2"></i>Latest Blog</a> <a
							class="text-light" href="#"><i class="fa fa-angle-right me-2"></i>Contact
							Us</a>
					</div>
				</div>
				<div class="col-lg-3 col-md-6">
					<h4
						class="d-inline-block text-primary text-uppercase border-bottom border-5 border-secondary mb-4">Popular
						Links</h4>
					<div class="d-flex flex-column justify-content-start">
						<a class="text-light mb-2" href="#"><i
							class="fa fa-angle-right me-2"></i>Home</a> <a
							class="text-light mb-2" href="#"><i
							class="fa fa-angle-right me-2"></i>About Us</a> <a
							class="text-light mb-2" href="#"><i
							class="fa fa-angle-right me-2"></i>Our Services</a> <a
							class="text-light mb-2" href="#"><i
							class="fa fa-angle-right me-2"></i>Meet The Team</a> <a
							class="text-light mb-2" href="#"><i
							class="fa fa-angle-right me-2"></i>Latest Blog</a> <a
							class="text-light" href="#"><i class="fa fa-angle-right me-2"></i>Contact
							Us</a>
					</div>
				</div>
				<div class="col-lg-3 col-md-6">
					<h4
						class="d-inline-block text-primary text-uppercase border-bottom border-5 border-secondary mb-4">Newsletter</h4>
					<form action="">
						<div class="input-group">
							<input type="text" class="form-control p-3 border-0"
								placeholder="Your Email Address">
							<button class="btn btn-primary">Sign Up</button>
						</div>
					</form>
					<h6 class="text-primary text-uppercase mt-4 mb-3">Follow Us</h6>
					<div class="d-flex">
						<a
							class="btn btn-lg btn-primary btn-lg-square rounded-circle me-2"
							href="#"><i class="fab fa-twitter"></i></a> <a
							class="btn btn-lg btn-primary btn-lg-square rounded-circle me-2"
							href="#"><i class="fab fa-facebook-f"></i></a> <a
							class="btn btn-lg btn-primary btn-lg-square rounded-circle me-2"
							href="#"><i class="fab fa-linkedin-in"></i></a> <a
							class="btn btn-lg btn-primary btn-lg-square rounded-circle"
							href="#"><i class="fab fa-instagram"></i></a>
					</div>
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