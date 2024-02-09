package com.task;

import java.util.Scanner;


@SuppressWarnings("serial")
class InvalidCredentialsException extends Throwable {
	InvalidCredentialsException() {
		System.out.println("Invalid Username or Password. Please check correctly!");
	}
}

public class CredentialValidation {
	public static void main(String[] args) throws InvalidCredentialsException {
		String userName, passWord;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter UserName: ");
		userName = s.next();
		System.out.println("Enter PassWord: ");
		passWord = s.next();
		s.close();
		if (userName.equals("admin") && passWord.equals("admin")) {
			System.out.println("Login Success");
		} else {
			throw new InvalidCredentialsException();
		}
		
	}
}
