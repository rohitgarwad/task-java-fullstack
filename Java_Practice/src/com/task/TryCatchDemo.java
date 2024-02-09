package com.task;

public class TryCatchDemo {

	public static void main(String[] args) {
		
		int a = 10, b = 0, c = 0;
		try {
			c = a / b;
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			System.out.println(c);
		}
	}

}
