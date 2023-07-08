package com.faith.springdemo.entity;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Transient;

@Entity
public class Appointment {

// Instance Variables
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int appointmentId;

	@OneToOne
	@JoinColumn(name = "patientId")
	private Patient patients;

	@OneToMany(mappedBy = "appointment")
	private List<Prescription> prescription;

	@OneToMany(mappedBy = "appointment")
	private List<PatientDiaganosis> patientDiaganosis;

	@ManyToOne
	@JoinColumn(name = "doctorId")
	private Doctor doctor;

	private LocalDateTime appointmentDateTime;

	private String opToken;

	@OneToMany(mappedBy = "appointment")
	private List<PatientLabTestDetails> patientLabTestDetails;

	private String isActive;

	@Transient
	private String dateTimeFormatted;

	@Transient
	private boolean isAppointmentOfToday;

	@PrePersist
	@PreUpdate
	public void prePersist() {
		System.out.println("prePersist appointment");
		if (isActive == null) // We set default value in case if the value is not set yet
			isActive = "yes";
	}

	private String pharmaStatus = "no";

	private String doctorStatus = "no";

	private LocalTime attendedTime;

	private LocalDateTime appointmentDateValidity;

// Inorder to make this bidirectional
	@OneToOne(mappedBy = "appoint")
	private PatientBillAppointment patientBillAppointments;

// Default Constructor
	public Appointment() {
		super();

	}

// Getters and Setters
	public int getAppointmentId() {
		return appointmentId;
	}

	public void setAppointmentId(int appointmentId) {
		this.appointmentId = appointmentId;
	}

	public Patient getPatients() {
		return patients;
	}

	public void setPatients(Patient patients) {
		this.patients = patients;
	}

	public LocalDateTime getAppointmentDateTime() {
		return appointmentDateTime;
	}

	public void setAppointmentDateTime(LocalDateTime appointmentDateTime) {
		this.appointmentDateTime = appointmentDateTime;
	}

	public String getOpToken() {
		return opToken;
	}

	public void setOpToken(String opToken) {
		this.opToken = opToken;
	}

	public String getIsActive() {
		return isActive;
	}

	public void setIsActive(String isActive) {
		this.isActive = isActive;
	}

	public LocalTime getAttendedTime() {
		return attendedTime;
	}

	public void setAttendedTime(LocalTime attendedTime) {
		this.attendedTime = attendedTime;
	}

	public LocalDateTime getAppointmentDateValidity() {
		return appointmentDateValidity;
	}

	public void setAppointmentDateValidity(LocalDateTime appointmentDateValidity) {
		this.appointmentDateValidity = appointmentDateValidity;
	}

	public PatientBillAppointment getPatientBillAppointments() {
		return patientBillAppointments;
	}

	public void setPatientBillAppointments(PatientBillAppointment patientBillAppointments) {
		this.patientBillAppointments = patientBillAppointments;
	}

	public List<Prescription> getPrescription() {
		return prescription;
	}

	public void setPrescription(List<Prescription> prescription) {
		this.prescription = prescription;
	}

	public Doctor getDoctor() {
		return doctor;
	}

	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}

	public List<PatientDiaganosis> getPatientDiaganosis() {
		return patientDiaganosis;
	}

	public void setPatientDiaganosis(List<PatientDiaganosis> patientDiaganosis) {
		this.patientDiaganosis = patientDiaganosis;
	}

	public List<PatientLabTestDetails> getPatientLabTestDetails() {
		return patientLabTestDetails;
	}

	public void setPatientLabTestDetails(List<PatientLabTestDetails> patientLabTestDetails) {
		this.patientLabTestDetails = patientLabTestDetails;
	}

	public String getPharmaStatus() {
		return pharmaStatus;
	}

	public void setPharmaStatus(String pharmaStatus) {
		this.pharmaStatus = pharmaStatus;
	}

	public String getDoctorStatus() {
		return doctorStatus;
	}

	public void setDoctorStatus(String doctorStatus) {
		this.doctorStatus = doctorStatus;
	}

	public String getDateTimeFormatted() {
		return dateTimeFormatted;
	}

	public void setDateTimeFormatted(String dateTimeFormatted) {
		this.dateTimeFormatted = dateTimeFormatted;
	}

	public boolean isAppointmentOfToday() {
		return isAppointmentOfToday;
	}

	public void setAppointmentOfToday(boolean isAppointmentOfToday) {
		this.isAppointmentOfToday = isAppointmentOfToday;
	}
// Display

}