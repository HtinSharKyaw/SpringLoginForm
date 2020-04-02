package com.example.demo.Controller;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.example.demo.entities.Employee;

@Controller
public class RegisterController {
	@RequestMapping(value="/register",method = RequestMethod.GET)
	public String getRegistrationForm() {
		//return the form
		return "form-registration";
	}
	
	@RequestMapping(value="/register",method = RequestMethod.POST )
	public String showRegistrationForm(@ModelAttribute(name="registerForm") Employee employee,Model model) {
		model.addAttribute("employeeName", employee.getUserName());
		DateFormat dateFormat  = new SimpleDateFormat("yyyy-mm-dd");
		String startDate = dateFormat.format(employee.getStartDate());
		String endDate = dateFormat.format(employee.getEndDate());
		model.addAttribute("age", employee.getAge());
		model.addAttribute("department",employee.getDepartmentName());
		model.addAttribute("gender",employee.getGender());
		model.addAttribute("startDate",startDate);
		model.addAttribute("endDate",endDate);
		return "home";
	}
}
