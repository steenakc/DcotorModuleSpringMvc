package com.faith.springdemo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;

@Entity
public class PatientBillMedicine {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int patientBillMedicineId;
@OneToOne
@JoinColumn(name = "prescriptionId")
private Prescription prescription;

private String isActive;

@PrePersist
@PreUpdate
public void prePersist() {
if (isActive == null)
isActive = "yes";
}

//Default Constructor
public PatientBillMedicine() {
super();

}

//Getters and Setters
public int getPatientBillMedicineId() {
return patientBillMedicineId;
}

public void setPatientBillMedicineId(int patientBillMedicineId) {
this.patientBillMedicineId = patientBillMedicineId;
}

public Prescription getPrescription() {
return prescription;
}

public void setPrescription(Prescription prescription) {
this.prescription = prescription;
}

public String getIsActive() {
return isActive;
}

public void setIsActive(String isActive) {
this.isActive = isActive;
}

}
