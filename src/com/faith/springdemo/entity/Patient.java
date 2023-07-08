package com.faith.springdemo.entity;

import java.time.LocalDate;
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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Patient {

// Instance Variables
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int patientId;

// Inorder to make this bidirectional
@OneToOne(mappedBy = "patients")
private Appointment appoint;

private int registerationNo;


@NotNull(message = "is required")
@Size(min = 1, max = 35)
private String patientName;

@DateTimeFormat(pattern = "dd/MM/yyyy")
private LocalDate dateOfBirth;

private String address;

@ManyToOne
@JoinColumn(name = "genderId")
private Gender gender;

private String phoneNumber;
private String emailId;

@ManyToOne
@JoinColumn(name = "bloodGroupId")
private BloodGroup bloodGroup;

private int pincode;

private String isActive;

// PrePersist PosPersist
@PrePersist
@PreUpdate
public void prePersist() {
if (isActive == null) { // We set default value in case if the value is not set yet
isActive = "yes";
}

if (isActive.equals("yes")) {
isActive = "no";
}
}

// Bi directional
@OneToMany(mappedBy = "patients")
private List<PatientBill> patientBills;

// Default Constructor
public Patient() {
super();

}

// Getters and Setters
public int getPatientId() {
return patientId;
}

public void setPatientId(int patientId) {
this.patientId = patientId;
}

public int getRegisterationNo() {
return registerationNo;
}

public void setRegisterationNo(int registerationNo) {
this.registerationNo = registerationNo;
}

public String getPatientName() {
return patientName;
}

public void setPatientName(String patientName) {
this.patientName = patientName;
}

public LocalDate getDateOfBirth() {
return dateOfBirth;
}

public void setDateOfBirth(LocalDate dateOfBirth) {
this.dateOfBirth = dateOfBirth;
}

public String getAddress() {
return address;
}

public void setAddress(String address) {
this.address = address;
}

public Gender getGender() {
return gender;
}

public void setGender(Gender gender) {
this.gender = gender;
}

public String getPhoneNumber() {
return phoneNumber;
}

public void setPhoneNumber(String phoneNumber) {
this.phoneNumber = phoneNumber;
}

public String getEmailId() {
return emailId;
}

public void setEmailId(String emailId) {
this.emailId = emailId;
}

public BloodGroup getBloodGroup() {
return bloodGroup;
}

public void setBloodGroup(BloodGroup bloodGroup) {
this.bloodGroup = bloodGroup;
}

public int getPincode() {
return pincode;
}

public void setPincode(int pincode) {
this.pincode = pincode;
}

public String getIsActive() {
return isActive;
}

public void setIsActive(String isActive) {
this.isActive = isActive;
}

public Appointment getAppoint() {
return appoint;
}

public void setAppoint(Appointment appoint) {
this.appoint = appoint;
}

public List<PatientBill> getPatientBills() {
return patientBills;
}

public void setPatientBills(List<PatientBill> patientBills) {
this.patientBills = patientBills;
}

// Display
public String toString() {
return "Patient [patientId=" + patientId + ", registerationNo=" + registerationNo + ", patientName="
+ patientName + ", dateOfBirth=" + dateOfBirth + ", address=" + address + ",  phoneNumber="
+ phoneNumber + ", emailId=" + emailId + ", pincode=" + pincode + ", isActive=" + isActive + "]";
}

}
