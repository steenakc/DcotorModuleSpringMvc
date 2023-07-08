package com.faith.springdemo.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class MedicineCompany {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int medicineCompanyId;

@NotNull(message = "is required")
@Size(min = 1, max = 35)
private String companyName;

private String companyAddress;
private String contactNumber;

private String isActive;

@PrePersist
@PreUpdate
public void prePersist() {
if (isActive == null)
isActive = "yes";
}

@OneToMany(mappedBy = "medicineCompany", cascade = CascadeType.ALL)
private List<MedicineStock> medicineStock;

//Default Constructor
public MedicineCompany() {
super();

}

//Getters and Setters
public int getMedicineCompanyId() {
return medicineCompanyId;
}

public void setMedicineCompanyId(int medicineCompanyId) {
this.medicineCompanyId = medicineCompanyId;
}

public String getCompanyName() {
return companyName;
}

public void setCompanyName(String companyName) {
this.companyName = companyName;
}

public String getCompanyAddress() {
return companyAddress;
}

public void setCompanyAddress(String companyAddress) {
this.companyAddress = companyAddress;
}

public String getContactNumber() {
return contactNumber;
}

public void setContactNumber(String contactNumber) {
this.contactNumber = contactNumber;
}

public String getIsActive() {
return isActive;
}

public void setIsActive(String isActive) {
this.isActive = isActive;
}

public List<MedicineStock> getMedicineStock() {
return medicineStock;
}

public void setMedicineStock(List<MedicineStock> medicineStock) {
this.medicineStock = medicineStock;
}

//Display
public String toString() {
return "MedicineCompany [medicineCompanyId=" + medicineCompanyId + ", companyName=" + companyName
+ ", companyAddress=" + companyAddress + ", contactNumber=" + contactNumber + ", isActive=" + isActive
+ "]";
}
}
