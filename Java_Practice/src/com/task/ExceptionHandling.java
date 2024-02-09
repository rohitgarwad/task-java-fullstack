package com.task;

//import java.io.FileReader;

public class ExceptionHandling {

	public static void main(String[] args) {

		//checkedException(FileNotFoundException)
//		FileReader f = new FileReader("C:/abc.txt");
//		System.out.println("abc.txt file read Concept");
		
		//uncheckedException(ArithmeticException)
		int a = 5;
		int b = 0;
		
		int c = a/b;
		
		System.out.println("Division of a & b is "+c);
		
	}

}
