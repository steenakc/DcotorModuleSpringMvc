package com.faith.springdemo.entity;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Dosage {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int dosageId;

private String dosageStatus;
private int dose;

@OneToMany(mappedBy = "dosage")
private List<Prescription> prescription;

//Default Constructor
public Dosage() {
super();

}

//Getters and Setters
public int getDosageId() {
return dosageId;
}

public void setDosageId(int dosageId) {
this.dosageId = dosageId;
}

public String getDosageStatus() {
return dosageStatus;
}

public void setDosageStatus(String dosageStatus) {
this.dosageStatus = dosageStatus;
}

public int getDose() {
return dose;
}

public void setDose(int dose) {
this.dose = dose;
}

public List<Prescription> getPrescription() {
return prescription;
}

public void setPrescription(List<Prescription> prescription) {
this.prescription = prescription;
}

//Display
public String toString() {
return "Dosage [dosageId=" + dosageId + ", dosageStatus=" + dosageStatus + ", dose=" + dose + ", prescription="
+ prescription + "]";
}

}
