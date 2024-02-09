package com.collections;

import java.util.ArrayList;
import java.util.Collections;

class Employee implements Comparable<Employee> {

	String name;
	Employee(String name) {
		this.name = name;
	}
		
	@Override
	public int compareTo(Employee o) {
		return name.compareTo(o.name);
		//return 0;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + "]";
	}
	
	
	
}

public class EmployeeTest {

	public static void main(String[] args) {
		
		ArrayList<Employee> a = new ArrayList<Employee>();
		a.add(new Employee("Rohit"));
		a.add(new Employee("Rama"));
		a.add(new Employee("Laxmikanth"));
		Collections.sort(a);
		for(Employee e:a) {
			System.out.println(e);
		}
	}

}
