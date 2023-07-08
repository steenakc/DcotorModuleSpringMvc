package com.faith.springdemo.entity;

import java.time.LocalDateTime;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;

@Entity
public class PatientBill {

// Instance Variables
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int patientBillId;

private String billNumber;
private LocalDateTime billGeneratedTime;

@ManyToOne
@JoinColumn(name = "patientId")
private Patient patients;

private String isPaid;

// PrePersist PosPersist
@PrePersist
@PreUpdate
public void prePersist() {
if (isPaid == null) // We set default value in case if the value is not set yet
isPaid = "no";
}

// Bi directional
@OneToMany(mappedBy = "patientBills")
private List<PatientBillRegistration> patientBillRegisterations;

// Bi directional
@OneToMany(mappedBy = "patientBills")
private List<PatientBillAppointment> patientBillAppointments;

// Default Constructor
public PatientBill() {
super();

}

// Getters and Setters
public int getPatientBillId() {
return patientBillId;
}

public void setPatientBillId(int patientBillId) {
this.patientBillId = patientBillId;
}

public String getBillNumber() {
return billNumber;
}

public void setBillNumber(String billNumber) {
this.billNumber = billNumber;
}

public LocalDateTime getBillGeneratedTime() {
return billGeneratedTime;
}

public void setBillGeneratedTime(LocalDateTime billGeneratedTime) {
this.billGeneratedTime = billGeneratedTime;
}

public Patient getPatients() {
return patients;
}

public void setPatients(Patient patients) {
this.patients = patients;
}

public String getIsPaid() {
return isPaid;
}

public void setIsPaid(String isPaid) {
this.isPaid = isPaid;
}

public List<PatientBillRegistration> getPatientBillRegisterations() {
return patientBillRegisterations;
}

public void setPatientBillRegisterations(List<PatientBillRegistration> patientBillRegisterations) {
this.patientBillRegisterations = patientBillRegisterations;
}

// Display
public String toString() {
return "PatientBill [patientBillId=" + patientBillId + ", billNumber=" + billNumber + ", billGeneratedTime="
+ billGeneratedTime + ", patients=" + patients + ", isPaid=" + isPaid + "]";
}
}