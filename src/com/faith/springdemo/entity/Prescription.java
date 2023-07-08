package com.faith.springdemo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;

@Entity
public class Prescription {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int prescriptionId;

	@JoinColumn(name = "medicineId")
	@ManyToOne
	private Medicine medicine;

	@ManyToOne
	@JoinColumn(name = "appointmentId")
	private Appointment appointment;

	@ManyToOne
	@JoinColumn(name = "dosageId")
	private Dosage dosage;

	private int noOfDays;

	private int count;

	@OneToOne(mappedBy = "prescription")
	private PatientBillMedicine patientBillMedicine;

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	private String isActive;

	@PrePersist
	@PreUpdate
	public void prePersist() {
		if (isActive == null)
			isActive = "yes";
	}

	private String pharmaStatus = "no";

	public Prescription() {
		super();
// TODO Auto-generated constructor stub
	}

	public int getPrescriptionId() {
		return prescriptionId;
	}

	public void setPrescriptionId(int prescriptionId) {
		this.prescriptionId = prescriptionId;
	}

	public Medicine getMedicine() {
		return medicine;
	}

	public void setMedicine(Medicine medicine) {
		this.medicine = medicine;
	}

	public Appointment getAppointment() {
		return appointment;
	}

	public void setAppointment(Appointment appointment) {
		this.appointment = appointment;
	}

	public Dosage getDosage() {
		return dosage;
	}

	public void setDosage(Dosage dosage) {
		this.dosage = dosage;
	}

	public int getNoOfDays() {
		return noOfDays;
	}

	public void setNoOfDays(int noOfDays) {
		this.noOfDays = noOfDays;
	}

	public PatientBillMedicine getPatientBillMedicine() {
		return patientBillMedicine;
	}

	public void setPatientBillMedicine(PatientBillMedicine patientBillMedicine) {
		this.patientBillMedicine = patientBillMedicine;
	}

	public String getPharmaStatus() {
		return pharmaStatus;
	}

	public void setPharmaStatus(String pharmaStatus) {
		this.pharmaStatus = pharmaStatus;
	}

	public String getIsActive() {
		return isActive;
	}

	public void setIsActive(String isActive) {
		this.isActive = isActive;
	}

}
