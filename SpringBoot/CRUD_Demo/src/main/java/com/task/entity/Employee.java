package com.task.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data //setters & getters
@ToString //toString
@AllArgsConstructor //parameterized constructor
@NoArgsConstructor //default constructor
@Entity
@Table(name="emp_table")
public class Employee {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="emp_id")
	private int empId;
	@Column(name="emp_name")
	private String empName;
	@Column(name="emp_address")
	private String empAddress;
	
}
