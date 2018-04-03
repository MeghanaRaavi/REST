package com.javainuse.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.javainuse.model.Employee;

@RestController
public class TestController {
	
	@RequestMapping("/text")
	public String Welcome()
	{
		return "Welcome";
	}

	@RequestMapping(value = "/employee", method = RequestMethod.GET,
			produces = { "application/json", "application/xml" })
	public Employee firstPage() {

		Employee emp = new Employee();
		emp.setName("Meghana");
		emp.setDesignation("CEO");
		emp.setEmpId("1");
		emp.setSalary(6000000);

		return emp;
	}

}