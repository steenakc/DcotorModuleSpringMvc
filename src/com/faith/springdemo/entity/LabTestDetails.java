package com.faith.springdemo.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class LabTestDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int labTestDetailsId;

	@ManyToOne
	@JoinColumn(name = "labTestId")
	private LabTest labtest;

	private String testDetails;

	@OneToMany(mappedBy = "labtestdetails")
	private List<PatientLabTestDetails> patientLabTestDetails;

	public LabTestDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getLabTestDetailsId() {
		return labTestDetailsId;
	}

	public void setLabTestDetailsId(int labTestDetailsId) {
		this.labTestDetailsId = labTestDetailsId;
	}

	public LabTest getLabtest() {
		return labtest;
	}

	public void setLabtest(LabTest labtest) {
		this.labtest = labtest;
	}

	public String getTestDetails() {
		return testDetails;
	}

	public void setTestDetails(String testDetails) {
		this.testDetails = testDetails;
	}

	public List<PatientLabTestDetails> getPatientLabTestDetails() {
		return patientLabTestDetails;
	}

	public void setPatientLabTestDetails(List<PatientLabTestDetails> patientLabTestDetails) {
		this.patientLabTestDetails = patientLabTestDetails;
	}

	@Override
	public String toString() {
		return "LabTestDetails [labTestDetailsId=" + labTestDetailsId + ", testDetails=" + testDetails + "]";
	}

}
