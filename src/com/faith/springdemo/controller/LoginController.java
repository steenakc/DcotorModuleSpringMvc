package com.faith.springdemo.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.faith.springdemo.constants.ClinicalConstants;
import com.faith.springdemo.constants.JsonUtils;
import com.faith.springdemo.entity.Appointment;
import com.faith.springdemo.entity.PatientDiaganosis;
import com.faith.springdemo.entity.Staff;
import com.faith.springdemo.service.LoginService;

@Controller
@RequestMapping("/login")
public class LoginController {

	@Autowired
	LoginService loginService;

	@GetMapping("login-page")
	public String getLoginPage(Model model) {
		model.addAttribute("loginStatusMsg", "");
		return "login-page";
	}

	@PostMapping("/staff-login")
	public String processForm(@RequestParam("username") String user, @RequestParam("password") String pass, Model model,
			HttpServletRequest request, HttpServletResponse response) {
		System.out.println("username : " + user);
		System.out.println("password : " + pass);
		Staff staff = loginService.getStaff(user, pass);
		System.out.println(JsonUtils.toJson(staff));
		if (staff == null) {
			model.addAttribute("loginStatusMsg", "Login Failed");
			return "login-page";
		}
		/*
		 * 
		 */
		HttpSession session = request.getSession(true);
		System.out.println("sessionId : " + session.getId());
		session.setAttribute("staffId", staff.getStaffId());
		session.setAttribute("staffName", staff.getStaffName());
		/*
		 * 
		 */
		switch (staff.getRole().getRoleId()) {
		case ClinicalConstants.STAFF_ROLE_DOCTOR:
			return "redirect:/doctor/home";
		case ClinicalConstants.STAFF_ROLE_ADMIN:
			return "admin-home";
		case ClinicalConstants.STAFF_ROLE_PHARMACIST:
			return "pharmacist-home";
		case ClinicalConstants.STAFF_ROLE_RECEPTIONIST:
			return "receptionsit-home";
		default:
			model.addAttribute("loginStatusMsg", "Something went wrong. please try later");
			return "login-page";
		}

	}

}
