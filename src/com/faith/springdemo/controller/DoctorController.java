package com.faith.springdemo.controller;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.faith.springdemo.entity.Appointment;
import com.faith.springdemo.entity.Doctor;
import com.faith.springdemo.entity.Dosage;
import com.faith.springdemo.entity.LabTest;
import com.faith.springdemo.entity.LabTestDetails;
import com.faith.springdemo.entity.Medicine;
import com.faith.springdemo.entity.PatientDiaganosis;
import com.faith.springdemo.entity.PatientLabTestDetails;
import com.faith.springdemo.entity.Prescription;
import com.faith.springdemo.service.IDoctorService;

@Controller
@RequestMapping("/doctor")
public class DoctorController {

	@Autowired
	private IDoctorService doctorService;

	@GetMapping("/home")
	private String listTodaysAppointments(Model theModel, HttpServletRequest request, HttpServletResponse response,
			@RequestParam(value = "searchDate", required = false, defaultValue = "") String dateString) {
		System.out.println("dateString : " + dateString);
		/*
		 * 
		 */
		int staffId = 0;
		String staffName = "";
		try {
			HttpSession session = request.getSession(true);
			System.out.println("sessionId : " + session.getId());
			staffId = Integer.valueOf(session.getAttribute("staffId").toString());
			staffName = session.getAttribute("staffName").toString();
			if (staffId == 0) {
				throw new Exception();
			}
		} catch (Exception e) {
			return "error";
		}
		System.out.println("staffName : " + staffName);
		theModel.addAttribute("staffName", staffName);

		/*
		 * 
		 */

		/*
		 * 
		 */

		LocalDate date = null;
		if (dateString != null && !dateString.isEmpty()) {
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
			date = LocalDate.parse(dateString, formatter);
		} else {
			date = LocalDate.now();
		}
		Doctor doctor = doctorService.getDoctorDetailsFromStaffId(staffId);
		System.out.println("doctor : " + doctor.toString());
		List<Appointment> appointmentlist = doctorService.getTodaysAppointments(date, doctor.getDoctorId());
		/*
		 */
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm a");
		for (Appointment app : appointmentlist) {
			try {
				app.setDateTimeFormatted(app.getAppointmentDateTime().format(formatter));
				app.setAppointmentOfToday(LocalDate.now().equals(app.getAppointmentDateTime().toLocalDate()));
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		/*
		 */
		theModel.addAttribute("appointments", appointmentlist);
		return "doctor-home";
	}

	@GetMapping("/view-appointment")
	private String listPatientDetails(Model model, @RequestParam("appointmentId") int appointmentId) {

		Appointment appointment = doctorService.getPatientRecords(appointmentId);
		int patientId = 0;
		if (appointment == null) {
			appointment = new Appointment();
		} else {
			patientId = appointment.getPatients().getPatientId();
		}
		model.addAttribute("appointment", appointment);

		/*
		 * list of patient diagnosis list of medicatin history list of lab history
		 * 
		 */
//		if(patientId==0)
//		{
//			PatientDiaganosis theDiaganosis = new PatientDiaganosis();
//			model.addAttribute("diaganos", theDiaganosis);	
//			
//		}
		// pass patientId and return list of patientDiaganosis

		final List<PatientDiaganosis> diaganosisList = doctorService.getDiagnosis(patientId);
		System.out.println(diaganosisList.size());
		System.out.println(diaganosisList);
		model.addAttribute("diaganosisList", diaganosisList);
//		diaganosisList.get(0).getAppointment().getPatientDiaganosis().get(0).getAppointment().getPatientDiaganosis()

//		Patient patient=new Patient();
//		patient.getGender().getPatients().get(0).getGender().getPatients().get(0).getGender();
//		
		/*
		 */
		/*
		 */
		List<Prescription> medicationList = doctorService.getMedicationHistory(patientId);

		model.addAttribute("medicationHistory", medicationList);

		return "doctor-diagnosis";

	}

	@PostMapping("/saveDiagnosis")
	public String saveDiagnosis(@RequestParam("diaganosis") String diaganosis,
			@RequestParam("appointmentId") int appointmentId) {
		PatientDiaganosis patientDiaganosis = new PatientDiaganosis();
		patientDiaganosis.setDiaganosis(diaganosis);
		Appointment appointment = new Appointment();
		appointment.setAppointmentId(appointmentId);
		patientDiaganosis.setAppointment(appointment);
		doctorService.saveDiagnosis(patientDiaganosis);
		System.out.println(diaganosis);
		return "redirect:/doctor/addMedicationAndLab?appointmentId=" + appointmentId;
	}

	public static String getDetails(int a) {
		return "success : " + a;

	}

	@GetMapping("/addMedicationAndLab")
	public String addMedicationAndLab(Model model, @RequestParam("appointmentId") int appointmentId) {
		Appointment appointments = doctorService.getPatientRecords(appointmentId);
		int patientId = 0;
		if (appointments == null) {
			appointments = new Appointment();
		} else {
			patientId = appointments.getPatients().getPatientId();
		}
		/*
		 * medicine tables
		 */
		model.addAttribute("appointment", appointments);

		List<Medicine> medicineList = doctorService.addMedicines();
		model.addAttribute("medicineList", medicineList);

		List<Dosage> dosageList = doctorService.addosage();
		model.addAttribute("dosageList", dosageList);
		/*
		 * labtest table
		 */
		List<LabTest> labTestList = doctorService.getLabTestList();
		model.addAttribute("labTestList", labTestList);

		List<LabTestDetails> labTestDetailsList = doctorService.getLabTestDetailsList();
		model.addAttribute("labTestDetailsList", labTestDetailsList);

		/*
		 * medication history of previous appointment
		 */
		List<Prescription> previousMedicationHistory = doctorService.getPreviousMedicationHistory(patientId,
				appointmentId);
		System.out.println(previousMedicationHistory.size() + " asf a");
		model.addAttribute("previousMedicationHistory", previousMedicationHistory);
		
		 // medication history of current appointment

		List<Prescription> currentMedicationHistory = doctorService.getCurrentMedicationHistory(patientId,
				appointmentId);
		model.addAttribute("currentMedicationHistory", currentMedicationHistory);
		/*
		 * current Patient LabTestDetails
		 */
		List<PatientLabTestDetails> currentPatientLabTestDetails = doctorService
				.getCurrentPatientLabTestDetails(patientId, appointmentId);
		model.addAttribute("currentPatientLabTestDetails", currentPatientLabTestDetails);
		/*
		 * previous Patient LabTestDetails
		 */
		List<PatientLabTestDetails> previousPatientLabTestDetails = doctorService
				.getPreviousPatientLabTestDetails(patientId, appointmentId);
		model.addAttribute("previousPatientLabTestDetails", previousPatientLabTestDetails);

		return "doctor-med-lab";

	}

	@PostMapping("/saveMedication")
	public String saveMedication(@RequestParam("appointmentId") int appointmentId,
			@RequestParam("medicationId") int medicationId, @RequestParam("dosageId") int dosageId,
			@RequestParam("noOfDays") int noOfDays) {
		System.out.println("appointmentId : " + appointmentId);
		System.out.println("medicationId : " + medicationId);
		System.out.println("dosageId : " + dosageId);
		System.out.println("noOfDays : " + noOfDays);

		doctorService.saveMedication(appointmentId, medicationId, dosageId, noOfDays);

		return "redirect:/doctor/addMedicationAndLab?appointmentId=" + appointmentId;
	}

	@PostMapping("/saveLab")
	public String saveLab(@RequestParam("appointmentId") int appointmentId, @RequestParam("labTestId") int labTestId,
			@RequestParam("labTestDetailId") int labTestDetailId) {
		System.out.println("appointmentId : " + appointmentId);
		System.out.println("labTestId : " + labTestId);
		System.out.println("labTestDetailId : " + labTestDetailId);

		doctorService.saveLab(appointmentId, labTestId, labTestDetailId);

		return "redirect:/doctor/addMedicationAndLab?appointmentId=" + appointmentId;
	}

	@PostMapping("/deleteMedicine")
	public String deleteMedicine(@RequestParam("appointmentId") int appointmentId,
			@RequestParam("prescriptionId") int prescriptionId) {
		System.out.println("appointmentId : " + appointmentId);
		System.out.println("prescriptionId : " + prescriptionId);
		doctorService.deleteMedicine(appointmentId, prescriptionId);

		return "redirect:/doctor/addMedicationAndLab?appointmentId=" + appointmentId;
	}

	@PostMapping("/deleteLab")
	public String deleteLab(@RequestParam("appointmentId") int appointmentId,
			@RequestParam("patientLabTestDetailsId") int patientLabTestDetailsId) {
		System.out.println("appointmentId : " + appointmentId);
		System.out.println("patientLabTestDetailsId : " + patientLabTestDetailsId);
		doctorService.deleteLab(appointmentId, patientLabTestDetailsId);

		return "redirect:/doctor/addMedicationAndLab?appointmentId=" + appointmentId;
	}

	@PostMapping("/logout")
	public String logOut(Model model, HttpServletRequest request, HttpServletResponse response) {
		HttpSession session = request.getSession(true);
		try {
			session.removeAttribute("staffId");
			session.invalidate();
		} catch (Exception e) {
		}
		model.addAttribute("loginStatusMsg", "");
		return "redirect:/login/login-page";
	}
}
