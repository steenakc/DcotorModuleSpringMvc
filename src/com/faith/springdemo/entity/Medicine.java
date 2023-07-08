package com.faith.springdemo.entity;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Medicine {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int medicineId;

@NotNull(message = "is required")
@Size(min = 1, max = 35)
private String medicineName;

private String isActive;

@PrePersist
@PreUpdate
public void prePersist() {
if (isActive == null)
isActive = "yes";
}

@ManyToOne
@JoinColumn(name = "medicineRouteId")
private MedicineRoute medicineRoute;

@OneToMany(mappedBy = "medicine", cascade = CascadeType.ALL)
private List<MedicineStock> medicineStock;

@OneToMany(mappedBy = "medicine")
private List<Prescription> prescription;

//Default Constructor
public Medicine() {
super();

}

//Getters and Setters
public int getMedicineId() {
return medicineId;
}

public void setMedicineId(int medicineId) {
this.medicineId = medicineId;
}

public String getMedicineName() {
return medicineName;
}

public void setMedicineName(String medicineName) {
this.medicineName = medicineName;
}

public String getIsActive() {
return isActive;
}

public void setIsActive(String isActive) {
this.isActive = isActive;
}

public MedicineRoute getMedicineRoute() {
return medicineRoute;
}

public void setMedicineRoute(MedicineRoute medicineRoute) {
this.medicineRoute = medicineRoute;
}

public List<MedicineStock> getMedicineStock() {
return medicineStock;
}

public void setMedicineStock(List<MedicineStock> medicineStock) {
this.medicineStock = medicineStock;
}

public List<Prescription> getPrescription() {
return prescription;
}

public void setPrescription(List<Prescription> prescription) {
this.prescription = prescription;
}

//Display
public String toString() {
return "Medicine [medicineId=" + medicineId + ", medicineName=" + medicineName + ", isActive=" + isActive
+ ", medicineRoute=" + medicineRoute + ", medicineStock=" + medicineStock + ", prescription="
+ prescription + "]";
}

}

