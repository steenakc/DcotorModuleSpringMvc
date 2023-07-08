package com.faith.springdemo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class PatientBillAppointment {

// Instance Variables
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int patientBillAppointmentId;

@ManyToOne
@JoinColumn(name = "patientBillId")
private PatientBill patientBills;

@OneToOne
@JoinColumn(name = "appointmentId")
private Appointment appoint;

private double amount;

// Default Constructor
public PatientBillAppointment() {
super();

}

// Getters and Setters
public int getPatientBillAppointmentId() {
return patientBillAppointmentId;
}

public void setPatientBillAppointmentId(int patientBillAppointmentId) {
this.patientBillAppointmentId = patientBillAppointmentId;
}

public PatientBill getPatientBills() {
return patientBills;
}

public void setPatientBills(PatientBill patientBills) {
this.patientBills = patientBills;
}

public Appointment getAppoint() {
return appoint;
}

public void setAppoint(Appointment appoint) {
this.appoint = appoint;
}

public double getAmount() {
return amount;
}

public void setAmount(double amount) {
this.amount = amount;
}

// Display
public String toString() {
return "PatientBillAppointment [patientBillAppointmentId=" + patientBillAppointmentId + ", patientBills="
+ patientBills + ", appoint=" + appoint + ", amount=" + amount + "]";
}

}
