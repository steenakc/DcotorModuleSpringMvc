package com.faith.springdemo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;

@Entity
public class Department {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int departmentId;

@NotNull(message = "is required")
private String departmentName;

@OneToOne(mappedBy="depart")
private Doctor doctor;

//Default Constructor
public Department() {
super();

}

//Getters and Setters
public int getDepartmentId() {
return departmentId;
}

public void setDepartmentId(int departmentId) {
this.departmentId = departmentId;
}

public String getDepartmentName() {
return departmentName;
}

public void setDepartmentName(String departmentName) {
this.departmentName = departmentName;
}

public Doctor getDoctor() {
return doctor;
}

public void setDoctor(Doctor doctor) {
this.doctor = doctor;
}

//Display
public String toString() {
return "Department [departmentId=" + departmentId + ", departmentName=" + departmentName + "]";
}

}
