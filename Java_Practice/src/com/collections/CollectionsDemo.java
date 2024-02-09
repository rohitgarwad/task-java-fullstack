package com.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class CollectionsDemo {

	public static void main(String[] args) {

		ArrayList<String> a = new ArrayList<String>();
		a.add("A");
		a.add("D");
		a.add("C");
		a.add("B");
		
		Collections.sort(a); // "Collections" is a class in java, which provides various methods for Collection(interface) frameworks.
		
		Iterator<String> itr = a.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
