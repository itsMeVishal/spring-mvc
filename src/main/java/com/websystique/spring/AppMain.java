package com.websystique.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.websystique.spring.dao.EmployeeDao;
import com.websystique.spring.service.EmployeeService;

@Controller
public class AppMain {

	@Autowired
	EmployeeService employeeService;
	@Autowired
	EmployeeDao emp;

	@RequestMapping(value = "/")
	public String showIndex() {
		
		return "index";
	}

	/*private void createEmp(Employee e) {
		
		emp.saveEmployee(e);
		System.out.println("emp created***");
	}
	@RequestMapping(value = "/success", method = RequestMethod.GET)
	public String show(ModelMap model, @RequestParam("username") String username,
			@RequestParam("password") String password) {
		
		if (!username.equals("vishal") && !password.equals("londhe")) {
			model.addAttribute("error", "Authentication Failed!!!");
			return "index";
		}
		List<Employee> list = new ArrayList();

		list = employeeService.findAllEmployees();
		if (!list.isEmpty())
			model.addAttribute("empList", list);
		model.addAttribute("test", "vishal");
		System.out.println("List:" + list);
		return "list";
	}
	@RequestMapping(value="/delete-person" ,method = RequestMethod.GET)
	public String delete(ModelMap model,@RequestParam("id") String id) {
		System.out.println("***id:"+id);
		if(id!=null) {
			employeeService.deleteEmployeeBySsn(id);
			
		}
		List<Employee> list = new ArrayList();
		list = employeeService.findAllEmployees();
		model.addAttribute("empList", list);
		return "list";
	}*/
	
}