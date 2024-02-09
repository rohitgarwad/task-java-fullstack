package com.collections;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {

		Set s = new LinkedHashSet();
		s.add(10);
		s.add(20);
		s.add("Rohit");
		s.add("A");
		s.add(null);
		s.add(10);// LinkedHashSet doesnot allow duplicate values and insertion order is preserved, also allows "null" values.
		System.out.println(s);
	}

}
