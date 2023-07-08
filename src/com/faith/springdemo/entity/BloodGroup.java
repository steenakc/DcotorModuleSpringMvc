package com.faith.springdemo.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;


@Entity
public class BloodGroup {

// Instance Variables
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int bloodGroupId;

private String bloodGroup;

// Bi directional
@OneToMany(mappedBy = "bloodGroup")
private List<Patient> patients;

@OneToOne(mappedBy="bloodGroup")
private Staff staff;

//Default Constructor
public BloodGroup() {
super();

}

//Getters and Setters
public int getBloodGroupId() {
return bloodGroupId;
}

public void setBloodGroupId(int bloodGroupId) {
this.bloodGroupId = bloodGroupId;
}

public String getBloodGroup() {
return bloodGroup;
}

public void setBloodGroup(String bloodGroup) {
this.bloodGroup = bloodGroup;
}

public List<Patient> getPatients() {
return patients;
}

public void setPatients(List<Patient> patients) {
this.patients = patients;
}

public Staff getStaff() {
return staff;
}

public void setStaff(Staff staff) {
this.staff = staff;
}

//Display
public String toString() {
return "BloodGroup [bloodGroupId=" + bloodGroupId + ", bloodGroup=" + bloodGroup + "]";
}

}
