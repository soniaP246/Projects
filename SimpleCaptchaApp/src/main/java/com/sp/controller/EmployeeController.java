package com.sp.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sp.model.Employee;
import com.sp.service.IEmployeeService;
import com.sp.util.CaptchaUtil;

import cn.apiclub.captcha.Captcha;

@Controller
@RequestMapping("/employee")
public class EmployeeController {
	
	@Autowired
	private IEmployeeService service;
	private void setupCaptcha(Employee e) {
		Captcha captcha=CaptchaUtil.createCaptcha(250, 80);
	    e.setHidden(captcha.getAnswer());
	    e.setCaptcha("");
	    e.setImage(CaptchaUtil.encodeBase64(captcha));
	}
	
	@GetMapping("/register")
	public String showReg(Model model) {
		Employee e= new Employee();
		 setupCaptcha(e);
		model.addAttribute("employee",e);
		
		return "EmployeeRegister";
	}
	
	@PostMapping("/save")
	public String save(
		@ModelAttribute Employee employee, Model model) {
		
		if(employee.getCaptcha().equals(employee.getHidden())) {
			service.createEmployee(employee);
			model.addAttribute("message", "Employee created");
		}
		else {
			setupCaptcha(employee);
			model.addAttribute("employee",employee);
		}
			
		return "EmployeeRegister";
		
	}

}
