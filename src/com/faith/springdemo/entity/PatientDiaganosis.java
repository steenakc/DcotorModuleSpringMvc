package com.faith.springdemo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class PatientDiaganosis {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int patientDiaganosisId;

	@ManyToOne
	@JoinColumn(name = "appointmentId")
	private Appointment appointment;

	private String diaganosis;

	public PatientDiaganosis() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getPatientDiaganosisId() {
		return patientDiaganosisId;
	}

	public void setPatientDiaganosisId(int patientDiaganosisId) {
		this.patientDiaganosisId = patientDiaganosisId;
	}

	public Appointment getAppointment() {
		return appointment;
	}

	public void setAppointment(Appointment appointment) {
		this.appointment = appointment;
	}

	public String getDiaganosis() {
		return diaganosis;
	}

	public void setDiaganosis(String diaganosis) {
		this.diaganosis = diaganosis;
	}

}
