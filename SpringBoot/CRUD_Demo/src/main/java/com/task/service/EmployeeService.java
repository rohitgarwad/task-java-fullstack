package com.task.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.task.dao.EmployeeDaoI;
import com.task.entity.Employee;

@Service
public class EmployeeService implements EmployeeServiceI {

	@Autowired
	private EmployeeDaoI employeeDao;
	
	@Override
	public List<Employee> getEmployees() {

		return this.employeeDao.findAll();
		
	}

	@Override
	public Employee insertEmployee(Employee employee) {
		
		return this.employeeDao.save(employee);
	}

	@Override
	public String deleteEmployee(Integer id) {

		this.employeeDao.deleteById(id);
		return "Deleted Successfully";
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		
		Employee existingEmployee = employeeDao.findById(employee.getEmpId()).get();
		existingEmployee.setEmpName(employee.getEmpName());
		existingEmployee.setEmpAddress(employee.getEmpAddress());

		return this.employeeDao.save(existingEmployee);
	}

	@Override
	public Employee getEmployee(Integer id) {
		
		Optional<Employee> optionalEmployee = this.employeeDao.findById(id);
		
		return optionalEmployee.get();
	}

}
