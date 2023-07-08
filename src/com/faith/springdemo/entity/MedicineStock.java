package com.faith.springdemo.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;

import org.springframework.format.annotation.DateTimeFormat;
@Entity

public class MedicineStock {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private int medicineStockId;
private int noOfBoxes;
private int UnitPerBox;
private int purchasedCount;

@DateTimeFormat(pattern = "dd/MM/yyyy")
private LocalDate stockAddedDate;

@DateTimeFormat(pattern = "dd/MM/yyyy")
private LocalDate expiryDate;

private double pricePerUnit;

private String isActive;
public double getPricePerUnit() {
return pricePerUnit;
}
public void setPricePerUnit(double pricePerUnit) {
this.pricePerUnit = pricePerUnit;
}
@PrePersist
@PreUpdate
public void prePersist() {
if(isActive == null)
isActive ="yes";
}

@ManyToOne
@JoinColumn(name="medicineId")
private Medicine medicine;


@ManyToOne
@JoinColumn(name="medicineCompanyId")
private MedicineCompany medicineCompany;

//Default Constructor
public MedicineStock() {
super();

}

//Getters and Setters
public int getMedicineStockId() {
return medicineStockId;
}
public void setMedicineStockId(int medicineStockId) {
this.medicineStockId = medicineStockId;
}
public int getNoOfBoxes() {
return noOfBoxes;
}
public void setNoOfBoxes(int noOfBoxes) {
this.noOfBoxes = noOfBoxes;
}
public int getUnitPerBox() {
return UnitPerBox;
}
public void setUnitPerBox(int unitPerBox) {
UnitPerBox = unitPerBox;
}
public int getPurchasedCount() {
return purchasedCount;
}
public void setPurchasedCount(int purchasedCount) {
this.purchasedCount = purchasedCount;
}
public LocalDate getStockAddedDate() {
return stockAddedDate;
}
public void setStockAddedDate(LocalDate stockAddedDate) {
this.stockAddedDate = stockAddedDate;
}
public LocalDate getExpiryDate() {
return expiryDate;
}
public void setExpiryDate(LocalDate expiryDate) {
this.expiryDate = expiryDate;
}
public String getIsActive() {
return isActive;
}
public void setIsActive(String isActive) {
this.isActive = isActive;
}
public Medicine getMedicine() {
return medicine;
}
public void setMedicine(Medicine medicine) {
this.medicine = medicine;
}
public MedicineCompany getMedicineCompany() {
return medicineCompany;
}
public void setMedicineCompany(MedicineCompany medicineCompany) {
this.medicineCompany = medicineCompany;
}

//Display
public String toString() {
return "MedicineStock [medicineStockId=" + medicineStockId + ", noOfBoxes=" + noOfBoxes + ", UnitPerBox="
+ UnitPerBox + ", purchasedCount=" + purchasedCount + ", stockAddedDate=" + stockAddedDate
+ ", expiryDate=" + expiryDate + ", isActive=" + isActive + ", medicine=" + medicine
+ ", medicineCompany=" + medicineCompany + "]";
}

}

