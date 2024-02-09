package com.collections;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {

		Set s = new HashSet();
		s.add(10);
		s.add(20);
		s.add("Rohit");
		s.add("A");
		s.add(null);
		s.add(10);// HashSet doesnot allow duplicate values and insertion order is not preserved, also allows "null" values.
		System.out.println(s);
	}

}
