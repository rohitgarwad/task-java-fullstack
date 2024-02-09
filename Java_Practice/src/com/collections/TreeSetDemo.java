package com.collections;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {

		Set s = new TreeSet();
		s.add(10);
		s.add(10);// TreeSet doesnot allow duplicate values.
//		s.add(null);// TreeSet doesnot allow null values.
		
		// TreeSet doesnot allow hetrogeneous data type elements.
//		s.add("Rohit");
//		s.add("A");    
//		s.add(5.5);
		
		// TreeSet Sorts the data elements in ascending order
		s.add(40);
		s.add(20);
		s.add(30);
		System.out.println(s);
		
		Set<String> s1 = new TreeSet<String>();
		s1.add("Rohit");
		s1.add("Rama");
		s1.add("Laxmikanth");
		s1.add("Avinash");
		System.out.println(s1);
	}

}
