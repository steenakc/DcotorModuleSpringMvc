package com.faith.springdemo.entity;

import java.util.List;


import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class MedicineRoute {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int medicineRouteId;

@NotNull(message = "is required")
@Size(min = 1, max = 35)
private String medicineRouteStatus;

@OneToMany(fetch = FetchType.EAGER, mappedBy = "medicineRoute", cascade = CascadeType.ALL)
private List<Medicine> medicine;

// Default Constructor
public MedicineRoute() {
super();
}

// Getters and Setters
public int getMedicineRouteId() {
return medicineRouteId;
}

public void setMedicineRouteId(int medicineRouteId) {
this.medicineRouteId = medicineRouteId;
}

public String getMedicineRouteStatus() {
return medicineRouteStatus;
}

public void setMedicineRouteStatus(String medicineRouteStatus) {
this.medicineRouteStatus = medicineRouteStatus;
}

public List<Medicine> getMedicine() {
return medicine;
}

public void setMedicine(List<Medicine> medicine) {
this.medicine = medicine;
}

//Display
public String toString() {
return "MedicineRoute [medicineRouteId=" + medicineRouteId + ", medicineRouteStatus=" + medicineRouteStatus
+ ", medicine=" + "]";
}
}