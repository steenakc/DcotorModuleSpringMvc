package com.faith.springdemo.entity;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;


@Entity
public class Gender {

// Instance Variables
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int genderId;

private String gender;

// Bi directional
@OneToMany(mappedBy = "gender")
private List<Patient> patients;

@OneToOne(mappedBy="gender")
private Staff staff;

// Default Constructor
public Gender() {
super();

}

// Getters and Setters
public int getGenderId() {
return genderId;
}

public void setGenderId(int genderId) {
this.genderId = genderId;
}

public String getGender() {
return gender;
}

public void setGender(String gender) {
this.gender = gender;
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

// Display
public String toString() {
return "Gender [genderId=" + genderId + ", gender=" + gender + "]";
}

}