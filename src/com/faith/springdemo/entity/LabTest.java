package com.faith.springdemo.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;

@Entity
public class LabTest {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int labTestId;
	
	@NotNull(message = "is required")
	private String labTestName;
	
	@OneToMany(mappedBy ="labtest")
	private List<LabTestDetails> labtestdetails;

	public LabTest() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getLabTestId() {
		return labTestId;
	}

	public void setLabTestId(int labTestId) {
		this.labTestId = labTestId;
	}

	public String getLabTestName() {
		return labTestName;
	}

	public void setLabTestName(String labTestName) {
		this.labTestName = labTestName;
	}
	

	public List<LabTestDetails> getLabtestdetails() {
		return labtestdetails;
	}

	public void setLabtestdetails(List<LabTestDetails> labtestdetails) {
		this.labtestdetails = labtestdetails;
	}

	@Override
	public String toString() {
		return "LabTest [labTestId=" + labTestId + ", labTestName=" + labTestName + "]";
	}
	
	

}
