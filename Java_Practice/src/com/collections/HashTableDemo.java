package com.collections;

import java.util.Hashtable;

public class HashTableDemo {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {

		Hashtable h = new Hashtable();
		h.put(1, "abc");
		h.put(2, "cde");
		h.put(3, "efg");
		h.put(h, "Object");
		System.out.println(h);
	}

}
