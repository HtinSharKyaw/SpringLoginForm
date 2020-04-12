package com.example.demo.Controller;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.entities.Employee;
import com.example.demo.repositories.EmployeeRespository;

@Controller
public class RegisterController {
	@Autowired
	private EmployeeRespository employeeRespository;

	@RequestMapping(path = "/register", method = RequestMethod.GET)
	public String getRegistrationForm() {
		// return the form
		return "form-registration";
	}

	@RequestMapping(path = "/register", method = RequestMethod.POST)
	public String showRegistrationForm(@ModelAttribute(name = "registerForm") Employee employee, Model model) {
		employeeRespository.save(employee);
		String endDate;
		model.addAttribute("employeeName", employee.getUserName());
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		String startDate = dateFormat.format(employee.getStartDate());
		if (null == employee.getEndDate()) {
			endDate = "";
		} else {
			endDate = dateFormat.format(employee.getEndDate());
		}
		model.addAttribute("age", employee.getAge());
		model.addAttribute("department", employee.getDepartmentName());
		model.addAttribute("gender", employee.getGender());
		model.addAttribute("startDate", startDate);
		model.addAttribute("endDate", endDate);
		return "home";
	}

	@GetMapping(path = "/all")
	public @ResponseBody Iterable<Employee> getAllEmployee() {
		return employeeRespository.findAll();
	}
}
