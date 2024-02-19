package com.task.service;

import java.util.List;
import java.util.Optional;

import com.task.entity.Employee;

public interface EmployeeServiceI {

	public List<Employee> getEmployees();

	public Employee insertEmployee(Employee employee);

	public String deleteEmployee(Integer id);

	public Employee updateEmployee(Employee employee);

	public Employee getEmployee(Integer id);
	
}
