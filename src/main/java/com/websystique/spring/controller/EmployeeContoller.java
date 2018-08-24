package com.websystique.spring.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.websystique.spring.model.Employee;
import com.websystique.spring.service.EmployeeService;

@Controller(value= "com.websystique.spring.controller.EmployeeContoller")
public class EmployeeContoller {

	@Autowired
	EmployeeService employeeService;
	
	@RequestMapping(value = "/employees/", method = RequestMethod.POST)
	String getEmployee(ModelMap model,@RequestParam("username") String username,@RequestParam("password") String password){
		if (!username.equals("vishal") && !password.equals("londhe")) {
			model.addAttribute("error", "Authentication Failed!!!");
			return "index";
		}
		List<Employee> list = new ArrayList();

		list = employeeService.findAllEmployees();
		if (!list.isEmpty())
			model.addAttribute("empList", list);
		model.addAttribute("test", "vishal");
		
		return "list";
	
	}
	@RequestMapping(value = "/employees/{id}", method = RequestMethod.GET)
	String deleteEmployee(ModelMap model,@PathVariable(value = "id") int id){
		if(id!=0) {
			employeeService.deleteEmployeeById(id);
		}
		List<Employee> list = new ArrayList();
		list = employeeService.findAllEmployees();
		if (!list.isEmpty())
			model.addAttribute("empList", list);
		
		return "list";
	}
}
