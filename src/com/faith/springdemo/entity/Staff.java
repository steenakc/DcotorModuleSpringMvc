package com.faith.springdemo.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Staff {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int staffId;

	@NotNull(message = "is required")
	@Size(min = 1, max = 35)
	private String staffName;

	@NotNull(message = "is required")
	@Size(min = 1, max = 35)
	private String employeeId;

	@OneToOne
	@JoinColumn(name = "genderId")
	private Gender gender;

	@NotNull(message = "is required")
	@Size(min = 1, max = 45)
	private String emailId;

	@NotNull(message = "is required")
	private String phoneNo;

	private LocalDate dateOfJoining;

	@OneToOne
	@JoinColumn(name = "bloodGroupId")
	private BloodGroup bloodGroup;

	private Double salary;

	@NotNull(message = "is required")
	@Size(min = 6, max = 10)
	private String passWord;

	private String address;

	private String pincode;

	@OneToOne
	@JoinColumn(name = "roleId")
	private Role role;

	private String isActive;

//	@OneToOne(mappedBy = "staff")
//	private Doctor doctor;

// PrePersist PosPersist
	@PrePersist
	@PreUpdate
	public void prePersist() {
		if (isActive == null) // We set default value in case if the value is not set yet
			isActive = "yes";
	}

	public Staff() {
		super();
	}

	public int getStaffId() {
		return staffId;
	}

	public void setStaffId(int staffId) {
		this.staffId = staffId;
	}

	public String getStaffName() {
		return staffName;
	}

	public void setStaffName(String staffName) {
		this.staffName = staffName;
	}

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public LocalDate getDateOfJoining() {
		return dateOfJoining;
	}

	public void setDateOfJoining(LocalDate dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}

	public BloodGroup getBloodGroup() {
		return bloodGroup;
	}

	public void setBloodGroup(BloodGroup bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

//	public Doctor getDoctor() {
//		return doctor;
//	}
//
//	public void setDoctor(Doctor doctor) {
//		this.doctor = doctor;
//	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public String getIsActive() {
		return isActive;
	}

	public void setIsActive(String isActive) {
		this.isActive = isActive;
	}

// Display
	public String toString() {
		return "Staff [staffId=" + staffId + ", staffName=" + staffName + ", employeeId=" + employeeId + ", gender="
				+ gender + ", emailId=" + emailId + ", phoneNo=" + phoneNo + ", dateOfJoining=" + dateOfJoining
				+ ", bloodGroup=" + bloodGroup + ", salary=" + salary + ", passWord=" + passWord + ", address="
				+ address + ", pincode=" + pincode + ", role=" + role + ", isActive=" + isActive + ", doctor=" + "]";
	}
}