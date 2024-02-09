package com.task;

import java.util.Scanner;

public class FinallyDemo {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a, b, c;
		try {
			System.out.println("Enter a, b values: ");
			a = s.nextInt();
			b = s.nextInt();
			c = a/b;
			System.out.println(c);
		} catch (ArithmeticException ae ) {
			//ae.printStackTrace();
			throw ae;
		} finally {
			s.close();
		}
	}
}
