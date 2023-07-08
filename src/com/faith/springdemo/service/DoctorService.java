package com.faith.springdemo.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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
import com.faith.springdemo.repository.IDoctorDao;

@Service
public class DoctorService implements IDoctorService {
	@Autowired
	private IDoctorDao doctorDao;

	@Override
	public List<Appointment> getTodaysAppointments(LocalDate date, int doctorId) {

		return doctorDao.getTodaysAppointments(date, doctorId);
	}

	@Override
	public List<PatientDiaganosis> getDiagnosis(int patientId) {
		return doctorDao.getDiagnosis(patientId);
	}

	@Override
	public void saveDiagnosis(PatientDiaganosis thePatientDiaganosis) {
		doctorDao.saveDiagnosis(thePatientDiaganosis);

	}

	@Override
	public Appointment getPatientRecords(int appointmentId) {
		return doctorDao.getPatientRecords(appointmentId);
	}

	@Override
	public List<PatientDiaganosis> getDiagnosisHistory(int patientId) {
		return doctorDao.getDiagnosisHistory(patientId);
	}

	@Override
	public List<Prescription> getMedicationHistory(int patientId) {

		return doctorDao.getMedicationHistory(patientId);
	}

	@Override
	public List<Medicine> addMedicines() {
		return doctorDao.addMedicines();
	}

	@Override
	public List<Dosage> addosage() {

		return doctorDao.addosage();
	}

	@Override
	public List<LabTest> getLabTestList() {
		return doctorDao.getLabTestList();
	}

	@Override
	public List<LabTestDetails> getLabTestDetailsList() {

		return doctorDao.getLabTestDetailsList();
	}

	@Override
	public void saveMedication(Medicine medication) {
		doctorDao.saveMedication(medication);

	}

	@Override
	public Doctor getDoctorDetailsFromStaffId(int staffId) {
		return doctorDao.getDoctorDetailsFromStaffId(staffId);
	}

	@Override
	public List<Prescription> getPreviousMedicationHistory(int patientId, int appointmentId) {
		return doctorDao.getPreviousMedicationHistory(patientId, appointmentId);
	}

	@Override
	public List<Prescription> getCurrentMedicationHistory(int patientId, int appointmentId) {
		return doctorDao.getCurrentMedicationHistory(patientId, appointmentId);

	}

	@Override
	public List<PatientLabTestDetails> getCurrentPatientLabTestDetails(int patientId, int appointmentId) {
		return doctorDao.getCurrentPatientLabTestDetails(patientId, appointmentId);
	}

	@Override
	public List<PatientLabTestDetails> getPreviousPatientLabTestDetails(int patientId, int appointmentId) {
		return doctorDao.getPreviousPatientLabTestDetails(patientId, appointmentId);
	}

	@Override
	public void saveMedication(int appointmentId, int medicationId, int dosageId, int noOfDays) {
		doctorDao.saveMedication(appointmentId, medicationId, dosageId, noOfDays);
	}

	@Override
	public void saveLab(int appointmentId, int labTestId, int labTestDetailId) {
		doctorDao.saveLab(appointmentId, labTestId, labTestDetailId);

	}

	@Override
	public void deleteMedicine(int appointmentId, int prescriptionId) {
		doctorDao.deleteMedicine(appointmentId, prescriptionId);

	}

	@Override
	public void deleteLab(int appointmentId, int patientLabTestDetailsId) {
		doctorDao.deleteLab(appointmentId, patientLabTestDetailsId);

	}

}
