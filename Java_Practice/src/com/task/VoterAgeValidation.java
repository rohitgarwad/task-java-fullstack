package com.task;


@SuppressWarnings("serial")
class InvalidVoterAgeValidation extends Throwable {
	InvalidVoterAgeValidation(){
		System.out.println("Your are not allowed to vote (underage). ");
	}
}

public class VoterAgeValidation {
	public static void main(String[] args) throws InvalidVoterAgeValidation {
		int age = 17;
		if (age <= 18) {
			throw new InvalidVoterAgeValidation();
		} else {
			System.out.println("Eligible to vote");
		}
	}
}
