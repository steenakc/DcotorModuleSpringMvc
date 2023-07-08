package com.faith.springdemo.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Service;

import com.faith.springdemo.entity.Appointment;
import com.faith.springdemo.entity.Doctor;
import com.faith.springdemo.entity.Dosage;
import com.faith.springdemo.entity.LabTest;
import com.faith.springdemo.entity.LabTestDetails;
import com.faith.springdemo.entity.Medicine;
import com.faith.springdemo.entity.PatientDiaganosis;
import com.faith.springdemo.entity.PatientLabTestDetails;
import com.faith.springdemo.entity.Prescription;

@Service
public interface IDoctorService {

	// list

	public List<Appointment> getTodaysAppointments(LocalDate date, int doctorId);

	// list diagnosis history
	public List<PatientDiaganosis> getDiagnosis(int patientId);

	// list medictation history
	public List<Prescription> getMedicationHistory(int patientId);

	// save or update
	public void saveDiagnosis(PatientDiaganosis thePatientDiaganosis);

	// print appointment
	public Appointment getPatientRecords(int appointmentId);

	// List diagnosis history

	public List<PatientDiaganosis> getDiagnosisHistory(int patientId);

	// list medicnes from medicne table in dropdown

	public List<Medicine> addMedicines();

	// list Dosages from dosage table in dropdown

	public List<Dosage> addosage();

	// list labtest from lab test table in dropdown

	public List<LabTest> getLabTestList();

	// lab test details from lab test details table in dropdown

	public List<LabTestDetails> getLabTestDetailsList();
	// save or update

	public void saveMedication(Medicine medication);

	public Doctor getDoctorDetailsFromStaffId(int staffId);

	public List<Prescription> getPreviousMedicationHistory(int patientId, int appointmentId);

	public List<Prescription> getCurrentMedicationHistory(int patientId, int appointmentId);

	public List<PatientLabTestDetails> getCurrentPatientLabTestDetails(int patientId, int appointmentId);

	public List<PatientLabTestDetails> getPreviousPatientLabTestDetails(int patientId, int appointmentId);

	public void saveMedication(int appointmentId, int medicationId, int dosageId, int noOfDays);

	public void saveLab(int appointmentId, int labTestId, int labTestDetailId);

	public void deleteMedicine(int appointmentId, int prescriptionId);

	public void deleteLab(int appointmentId, int patientLabTestDetailsId);

}
