package com.task.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.task.entity.Employee;
import com.task.service.EmployeeServiceI;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeServiceI employeeService; //Association
	
	@GetMapping("/get")
	public List<Employee> getEmployees() {
		
		return this.employeeService.getEmployees();
		
	}
	
	@GetMapping("/get/{empId}")
	public Employee getEmployee(@PathVariable("empId") Integer id) {
		
		return this.employeeService.getEmployee(id);
		
	}
	
	@PostMapping("/post")
	public Employee insertEmployee(@RequestBody Employee employee) {
		
		return this.employeeService.insertEmployee(employee);
		
	}
	
	@DeleteMapping("/delete/{empId}")
	public String deleteEmployee(@PathVariable("empId") Integer id) {
		
		return this.employeeService.deleteEmployee(id);
		
	}
	
	@PutMapping("/update/{empId}")
	public Employee updateEmployee(@RequestBody Employee employee, @PathVariable("empId") Integer id) {
		employee.setEmpId(id);
		return this.employeeService.updateEmployee(employee);
	}
	
}
