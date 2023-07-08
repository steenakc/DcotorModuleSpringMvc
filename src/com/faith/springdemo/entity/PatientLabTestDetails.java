package com.faith.springdemo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class PatientLabTestDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int patientLabTestDetailsId;

	@ManyToOne
	@JoinColumn(name = "labTestDetailsId")
	private LabTestDetails labtestdetails;

	@ManyToOne
	@JoinColumn(name = "appointmentId")
	private Appointment appointment;

	public int getPatientLabTestDetailsId() {
		return patientLabTestDetailsId;
	}

	public void setPatientLabTestDetailsId(int patientLabTestDetailsId) {
		this.patientLabTestDetailsId = patientLabTestDetailsId;
	}

	public LabTestDetails getLabtestdetails() {
		return labtestdetails;
	}

	public void setLabtestdetails(LabTestDetails labtestdetails) {
		this.labtestdetails = labtestdetails;
	}

	public Appointment getAppointment() {
		return appointment;
	}

	public void setAppointment(Appointment appointment) {
		this.appointment = appointment;
	}

}
