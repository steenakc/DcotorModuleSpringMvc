
package com.faith.springdemo.repository;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.faith.springdemo.entity.Appointment;
import com.faith.springdemo.entity.Doctor;
import com.faith.springdemo.entity.Dosage;
import com.faith.springdemo.entity.LabTest;
import com.faith.springdemo.entity.LabTestDetails;
import com.faith.springdemo.entity.Medicine;
import com.faith.springdemo.entity.PatientDiaganosis;
import com.faith.springdemo.entity.PatientLabTestDetails;
import com.faith.springdemo.entity.Prescription;

@Repository
public class DoctorDaoImplementation implements IDoctorDao {

	private SessionFactory sessionFactory;

	@Autowired
	public DoctorDaoImplementation(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;

	}

	@Transactional
	public List<Appointment> getTodaysAppointments(LocalDate date, int doctorId) {
		Session currentSession = sessionFactory.getCurrentSession();
		Query<Appointment> theQuery = currentSession.createQuery(
				"from Appointment a WHERE date(a.appointmentDateTime)= date(:date_) and a.doctor.doctorId=:doctorId_",
				Appointment.class);
		theQuery.setParameter("date_", date);
		theQuery.setParameter("doctorId_", doctorId);
		List<Appointment> theAppointments = theQuery.getResultList();
		return theAppointments;
	}

	@Transactional
	@Override
	public List<PatientDiaganosis> getDiagnosis(int patientId) {
		Session currentSession = sessionFactory.getCurrentSession();
		Query<PatientDiaganosis> theQuery = currentSession.createQuery(
				"SELECT t from PatientDiaganosis t JOIN t.appointment t2 WHERE t2.patients.patientId =:patientid_",
				PatientDiaganosis.class);
		theQuery.setParameter("patientid_", patientId);
		List<PatientDiaganosis> diagnosisList = theQuery.getResultList();
		return diagnosisList;
	}

	@Transactional
	@Override
	public void saveDiagnosis(PatientDiaganosis thePatientDiaganosis) {
		try {
			Session currentSession = sessionFactory.getCurrentSession();
			currentSession.saveOrUpdate(thePatientDiaganosis);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Transactional
	@Override
	public Appointment getPatientRecords(int appointmentId) {
		Session currentSession = sessionFactory.getCurrentSession();
		try {

			Query<Appointment> theQuery = currentSession
					.createQuery("from Appointment where appointmentId= :appointmentId_ ", Appointment.class);
			theQuery.setParameter("appointmentId_", appointmentId);
			Appointment appointment = theQuery.getResultList().get(0);
			return appointment;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;

	}

	@Transactional
	@Override
	public List<PatientDiaganosis> getDiagnosisHistory(int patientId) {
//		Session currentSession = sessionFactory.getCurrentSession();
//		Query<PatientDiaganosis> theQuery = currentSession
//				.createQuery("from PatientDiaganosis where patientId= :patientId ", PatientDiaganosis.class);
//		theQuery.setParameter("patientId", patientId);
//		List<PatientDiaganosis> patientDiaganosis = theQuery.getResultList();
//
		return null;
	}

	// @Override
	// public List<Medicine> getMedicineName() {
	// TODO Auto-generated method stub
	// return null;
	// }
	@Transactional
	@Override
	public List<Prescription> getMedicationHistory(int patientId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Transactional
	@Override
	public List<Medicine> addMedicines() {
		Session currentSession = sessionFactory.getCurrentSession();
		Query<Medicine> medicineListQuery = currentSession.createQuery("from Medicine order by medicineName",
				Medicine.class);
		// execute query and get result set
		List<Medicine> medicineList = medicineListQuery.getResultList();
		return medicineList;
	}

	@Transactional
	@Override
	public List<Dosage> addosage() {
		Session currentSession = sessionFactory.getCurrentSession();
		Query<Dosage> dosageListQuery = currentSession.createQuery("from Dosage order by dosageStatus", Dosage.class);
		List<Dosage> dosageList = dosageListQuery.getResultList();

		return dosageList;
	}

	@Transactional
	@Override
	public List<LabTest> getLabTestList() {
		Session currentSession = sessionFactory.getCurrentSession();
		Query<LabTest> labTestListQuery = currentSession.createQuery("from LabTest order by labTestName",
				LabTest.class);
		List<LabTest> labTestList = labTestListQuery.getResultList();
		return labTestList;
	}

	@Transactional
	@Override
	public List<LabTestDetails> getLabTestDetailsList() {
		Session currentSession = sessionFactory.getCurrentSession();
		Query<LabTestDetails> labTestDetailsListQuery = currentSession
				.createQuery("from LabTestDetails order by testDetails", LabTestDetails.class);
		List<LabTestDetails> LabTestDetailsList = labTestDetailsListQuery.getResultList();

		return LabTestDetailsList;
	}

	@Transactional
	@Override
	public void saveMedication(Medicine medication) {
		try {
			Session currentSession = sessionFactory.getCurrentSession();
			currentSession.saveOrUpdate(medication);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Transactional
	@Override
	public Doctor getDoctorDetailsFromStaffId(int staffId) {
		try {
			Session currentSession = sessionFactory.getCurrentSession();
			Query<Doctor> theQuery = currentSession.createQuery("from Doctor d WHERE d.staff.staffId=:staffId_",
					Doctor.class);
			theQuery.setParameter("staffId_", staffId);
			Doctor doctor = theQuery.getResultList().get(0);
			return doctor;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Transactional
	@Override
	public List<Prescription> getPreviousMedicationHistory(int patientId, int appointmentId) {
		try {
			Session currentSession = sessionFactory.getCurrentSession();
			Query<Prescription> theQuery = currentSession.createQuery("from Prescription p"
					+ " WHERE p.appointment.appointmentId!=:appointmentId_ and p.appointment.patients.patientId=:patientId_",
					Prescription.class);
			theQuery.setParameter("patientId_", patientId);
			theQuery.setParameter("appointmentId_", appointmentId);
			List<Prescription> prescriptionList = theQuery.getResultList();
			return prescriptionList;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new ArrayList<Prescription>();
	}

	@Transactional
	@Override
	public List<Prescription> getCurrentMedicationHistory(int patientId, int appointmentId) {
		try {
			Session currentSession = sessionFactory.getCurrentSession();
			Query<Prescription> theQuery = currentSession.createQuery("from Prescription p"
					+ " WHERE p.appointment.appointmentId=:appointmentId_ and p.appointment.patients.patientId=:patientId_",
					Prescription.class);
			theQuery.setParameter("patientId_", patientId);
			theQuery.setParameter("appointmentId_", appointmentId);
			List<Prescription> prescriptionList = theQuery.getResultList();
			return prescriptionList;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new ArrayList<Prescription>();
	}

	@Transactional
	@Override
	public List<PatientLabTestDetails> getCurrentPatientLabTestDetails(int patientId, int appointmentId) {
		try {
			Session currentSession = sessionFactory.getCurrentSession();
			Query<PatientLabTestDetails> theQuery = currentSession.createQuery("from PatientLabTestDetails p"
					+ " WHERE p.appointment.appointmentId=:appointmentId_ and p.appointment.patients.patientId=:patientId_",
					PatientLabTestDetails.class);
			theQuery.setParameter("patientId_", patientId);
			theQuery.setParameter("appointmentId_", appointmentId);
			List<PatientLabTestDetails> prescriptionList = theQuery.getResultList();
			return prescriptionList;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new ArrayList<PatientLabTestDetails>();
	}

	@Transactional
	@Override
	public List<PatientLabTestDetails> getPreviousPatientLabTestDetails(int patientId, int appointmentId) {
		try {
			Session currentSession = sessionFactory.getCurrentSession();
			Query<PatientLabTestDetails> theQuery = currentSession.createQuery("from PatientLabTestDetails p"
					+ " WHERE p.appointment.appointmentId!=:appointmentId_ and p.appointment.patients.patientId=:patientId_",
					PatientLabTestDetails.class);
			theQuery.setParameter("patientId_", patientId);
			theQuery.setParameter("appointmentId_", appointmentId);
			List<PatientLabTestDetails> prescriptionList = theQuery.getResultList();
			return prescriptionList;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new ArrayList<PatientLabTestDetails>();
	}

	@Transactional
	@Override
	public void saveMedication(int appointmentId, int medicationId, int dosageId, int noOfDays) {
		try {
			Appointment appointment = getPatientRecords(appointmentId);
			Medicine medicine = getMedicine(medicationId);
			Dosage dosage = getDosage(dosageId);

			/*
			 */
			String dosageName = dosage.getDosageStatus();
			int medicineCountPerDay = 0;

			for (int i = 0; i < dosageName.length(); i++) {
				if (dosageName.charAt(i) == '1') {
					medicineCountPerDay++;
				}
			}
			int medicineCountTotal = medicineCountPerDay * noOfDays;
			/*
			 */
			Prescription prescription = new Prescription();
			prescription.setCount(medicineCountTotal);
			prescription.setDosage(dosage);
			prescription.setAppointment(appointment);
			prescription.setMedicine(medicine);
			prescription.setNoOfDays(noOfDays);
			Session currentSession = sessionFactory.getCurrentSession();
			currentSession.saveOrUpdate(prescription);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Transactional
	public Medicine getMedicine(int medicineId) {
		Session currentSession = sessionFactory.getCurrentSession();
		Query<Medicine> medicineListQuery = currentSession.createQuery("from Medicine where medicineId=:medicineId_",
				Medicine.class);
		medicineListQuery.setParameter("medicineId_", medicineId);
		Medicine medicineList = medicineListQuery.getResultList().get(0);
		return medicineList;
	}

	@Transactional

	public Dosage getDosage(int dosageId) {
		Session currentSession = sessionFactory.getCurrentSession();
		Query<Dosage> dosageListQuery = currentSession.createQuery("from Dosage where dosageId=:dosageId_",
				Dosage.class);
		dosageListQuery.setParameter("dosageId_", dosageId);
		Dosage dosageList = dosageListQuery.getResultList().get(0);
		return dosageList;
	}

	@Transactional
	@Override
	public void saveLab(int appointmentId, int labTestId, int labTestDetailId) {
		try {
			Appointment appointment = getPatientRecords(appointmentId);
			PatientLabTestDetails patientLabTestDetails = new PatientLabTestDetails();
			LabTestDetails labTestDetails = getLabTestDetail(labTestDetailId);
			patientLabTestDetails.setLabtestdetails(labTestDetails);
			patientLabTestDetails.setAppointment(appointment);
			Session currentSession = sessionFactory.getCurrentSession();
			currentSession.saveOrUpdate(patientLabTestDetails);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Transactional
	public LabTestDetails getLabTestDetail(int labTestDetailId) {
		Session currentSession = sessionFactory.getCurrentSession();
		Query<LabTestDetails> labTestDetailsQuery = currentSession
				.createQuery("from LabTestDetails where labTestDetailsId=:labTestDetailsId_", LabTestDetails.class);
		labTestDetailsQuery.setParameter("labTestDetailsId_", labTestDetailId);
		LabTestDetails LabTestDetails = labTestDetailsQuery.getResultList().get(0);
		return LabTestDetails;
	}

	@Transactional
	@Override
	public void deleteMedicine(int appointmentId, int prescriptionId) {
		try {
			Prescription prescription = getPrescription(prescriptionId);
			Session currentSession = sessionFactory.getCurrentSession();
			currentSession.delete(prescription);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Transactional
	public Prescription getPrescription(int prescriptionId) {
		Session currentSession = sessionFactory.getCurrentSession();
		Query<Prescription> labTestDetailsQuery = currentSession
				.createQuery("from Prescription where prescriptionId=:prescriptionId_", Prescription.class);
		labTestDetailsQuery.setParameter("prescriptionId_", prescriptionId);
		Prescription LabTestDetails = labTestDetailsQuery.getResultList().get(0);
		return LabTestDetails;
	}

	@Transactional
	public PatientLabTestDetails getPatientLabTestDetails(int patientLabTestDetailsId) {
		Session currentSession = sessionFactory.getCurrentSession();
		Query<PatientLabTestDetails> labTestDetailsQuery = currentSession.createQuery(
				"from PatientLabTestDetails where patientLabTestDetailsId=:patientLabTestDetailsId_",
				PatientLabTestDetails.class);
		labTestDetailsQuery.setParameter("patientLabTestDetailsId_", patientLabTestDetailsId);
		PatientLabTestDetails LabTestDetails = labTestDetailsQuery.getResultList().get(0);
		return LabTestDetails;
	}

	@Override
	@Transactional
	public void deleteLab(int appointmentId, int patientLabTestDetailsId) {
		try {
			PatientLabTestDetails patientLabTestDetails = getPatientLabTestDetails(patientLabTestDetailsId);
			Session currentSession = sessionFactory.getCurrentSession();
			currentSession.delete(patientLabTestDetails);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
