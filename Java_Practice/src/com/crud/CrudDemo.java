// CrudDemo.java

package com.crud;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class CrudDemo {

	@SuppressWarnings({ "rawtypes", "resource" })
	public static void main(String[] args) throws InterruptedException {

		Employee e1 = new Employee("Rohit", "Hyderabad");
		Employee e2 = new Employee("Rama", "BalNagar");
		Employee e3 = new Employee("Laxmikanth", "Sangareddy");
		System.out.println("EMPLOYEE CRUD APPLICATION:\n");
		Map<Integer, Employee> m = new HashMap<Integer, Employee> ();
		m.put(101, e1);
		m.put(102, e2);
		m.put(103, e3);
		
		do {
			System.out.println("\n");
			System.out.println("1. Read Employee");
			System.out.println("2. Read multiple Employees");
			System.out.println("3. Delete a Employee data");
			System.out.println("4. Update a Employee data");
			System.out.println("5. Insert a Employee data");
			System.out.println("\n");
			System.out.println("Please Enter (select) your option: ");
			
			//System.out.println(m);
			Scanner sc = new Scanner(System.in);
			int option = sc.nextInt();
			
			switch(option) {
			
			case 1:{
				System.out.println("Your option is to read Employee record");
				System.out.println("Enter (select) Employee Record like 101 or 102 or 103");
				int getId = sc.nextInt();
				Employee read = m.get(getId);
				System.out.println(read);
				break;
			}
			
			case 2:{
				System.out.println("Your option is to read multiple Employee record");
				System.out.println("Please wait... Fetching multiple records....");
				Set set = m.entrySet();
				Iterator itr = set.iterator();
				while(itr.hasNext()) {
					System.out.println(itr.next());
					Thread.sleep(1000);
				}
				break;
			}
			
			case 3:{
				System.out.println("Your option is to 'Delete' Employee record");
				System.out.println("Enter (select) which record you want to delete");
				int getId = sc.nextInt();
				Employee read = m.remove(getId);
				System.out.println(read+" this record is deleted!");
				break;
			}
			
			case 4:{
				System.out.println("Your option is to Update Employee record");
				System.out.println("Enter (select) which record you want to update");
				int getId = sc.nextInt();
				//Employee read = m.get(getId);
				System.out.println("Employee that you want to update is: ");
				Employee update = m.get(getId);
				System.out.println(update.getEmpName()+" "+update.getEmpAddress());
				System.out.println("Enter Employee Name to change: ");
				String name = sc.next();
				System.out.println("Enter Employee Address to change: ");
				String address = sc.next();
				update.setEmpName(name);
				update.setEmpAddress(address);
				System.out.println("Your Record is Successfully Updated!");
				Employee read = m.get(getId);
				System.out.println("Updated Record is: \n"+read);
				//System.out.println(update);
				break;
			}
			
			case 5:{
				System.out.println("Your option is to Insert Employee record");
				System.out.println("Enter Id for your record that you want to insert");
				int key = sc.nextInt();
				System.out.println("Enter Employee Name: ");
				String empName = sc.next();
				System.out.println("Enter Employee Address: ");
				String empAddress = sc.next();
				Employee e = new Employee(empName, empAddress);
				m.put(key, e);
				System.out.println("After Inserting Employee Record ");
				Set set = m.entrySet();
				Iterator itr = set.iterator();
				while(itr.hasNext()) {
					System.out.println(itr.next());
				}
			}
			
			default:{
				System.out.println("Entered option doesnot exist");
			}
			}
			//sc.close();
		} while (true);
	}

}
