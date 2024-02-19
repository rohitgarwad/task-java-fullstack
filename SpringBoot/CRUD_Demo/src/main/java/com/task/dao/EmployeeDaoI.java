package com.task.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.task.entity.Employee;

@Repository
public interface EmployeeDaoI extends JpaRepository<Employee, Integer> {

	

}
