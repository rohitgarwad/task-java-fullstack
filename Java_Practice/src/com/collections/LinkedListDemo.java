package com.collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		List<Integer> l = new LinkedList();
//		l.add(5.3);
//		l.add("rohit");
//		l.add("A");
//		l.add(l);
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(4);
		//System.out.println(l);
		
		//simple for loop
		for(int i = 0; i<l.size(); i++) {
			System.out.println(l.get(i));
		}
		
		//for-each loop
		for(Integer l1:l) {
			System.out.println(l1);
		}
		
		//iterator loop
		Iterator itr = l.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		//for-each with lambda
		l.forEach((x)->System.out.println(x));
	}
}
