package com.faith.springdemo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Doctor {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int doctorId;

// Bi directional
//@OneToMany(mappedBy = "doctor")
//private List<Appointment> appointment;

	@OneToOne
	@JoinColumn(name = "staffId")
	private Staff staff;

	@OneToOne
	@JoinColumn(name = "departmentId")
	private Department depart;

	@NotNull(message = "is required")
	@Size(min = 1, max = 45)
	private String designation;

	@NotNull(message = "is required")
	private Double consultationFee;

	@NotNull(message = "is required")
	private int maxOpVisits;

//Default Constructor
	public Doctor() {
		super();
	}

//Getters and Setters
	public int getDoctorId() {
		return doctorId;
	}

	public void setDoctorId(int doctorId) {
		this.doctorId = doctorId;
	}

	public Staff getStaff() {
		return staff;
	}

	public void setStaff(Staff staff) {
		this.staff = staff;
	}

	public Department getDepart() {
		return depart;
	}

	public void setDepart(Department depart) {
		this.depart = depart;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public Double getConsultationFee() {
		return consultationFee;
	}

	public void setConsultationFee(Double consultationFee) {
		this.consultationFee = consultationFee;
	}

	public int getMaxOpVisits() {
		return maxOpVisits;
	}

	public void setMaxOpVisits(int maxOpVisits) {
		this.maxOpVisits = maxOpVisits;
	}

//	public List<Appointment> getAppointment() {
//		return appointment;
//	}
//
//	public void setAppointment(List<Appointment> appointment) {
//		this.appointment = appointment;
//	}

// Display
	public String toString() {
		return "Doctor [doctorId=" + doctorId + ", staff=" + staff + ", depart=" + depart + ", designation="
				+ designation + ", consultationFee=" + consultationFee + ", maxOpVisits=" + maxOpVisits + "]";
	}

}
