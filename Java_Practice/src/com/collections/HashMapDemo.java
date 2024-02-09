package com.collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {

		// In HashMap "key" cannot be duplicated, but "values" can be duplicate
		Map m = new HashMap();
		m.put(42, "Rohit");
		m.put(46, "Avinash");
		m.put(02, "Rama");
		m.put(15, "Laxmikanth");
		m.put(42, "Rohit");
		m.put(04, "Rohit");
		
		System.out.println(m);
		System.out.println("KEYS: " + m.keySet());
		System.out.println("VALUES: " + m.values());
	}

}
