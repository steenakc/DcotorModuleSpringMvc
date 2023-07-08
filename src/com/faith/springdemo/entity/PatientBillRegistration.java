package com.faith.springdemo.entity;

import java.time.LocalDateTime;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class PatientBillRegistration {

// Instance Variables
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int patientBillRegisterationId;

@ManyToOne
@JoinColumn(name = "patientBillId")
private PatientBill patientBills;

private LocalDateTime dateTime;
private double amount;
private LocalDateTime billTimeValidity;

// Default Constructor
public PatientBillRegistration() {
super();

}

// Getters and Setters
public int getPatientBillRegisterationId() {
return patientBillRegisterationId;
}

public void setPatientBillRegisterationId(int patientBillRegisterationId) {
this.patientBillRegisterationId = patientBillRegisterationId;
}

public PatientBill getPatientBills() {
return patientBills;
}

public void setPatientBills(PatientBill patientBills) {
this.patientBills = patientBills;
}

public LocalDateTime getDateTime() {
return dateTime;
}

public void setDateTime(LocalDateTime dateTime) {
this.dateTime = dateTime;
}

public double getAmount() {
return amount;
}

public void setAmount(double amount) {
this.amount = amount;
}

public LocalDateTime getBillTimeValidity() {
return billTimeValidity;
}

public void setBillTimeValidity(LocalDateTime billTimeValidity) {
this.billTimeValidity = billTimeValidity;
}

// Display
public String toString() {
return "PatientBillRegistration [patientBillRegisterationId=" + patientBillRegisterationId + ", patientBills="
+ patientBills + ", dateTime=" + dateTime + ", amount=" + amount + ", billTimeValidity="
+ billTimeValidity + "]";
}

}