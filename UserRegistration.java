package com.bl;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first name");
		String firstName = scan.nextLine();
		System.out.println("Enter last name");
		String lastName = scan.nextLine();
		System.out.println("Enter email id");
		String email = scan.nextLine();
		UserRegistration userRegistration = new UserRegistration();
		userRegistration.nameValidation(firstName);
		userRegistration.lastNameValidation(lastName);
		userRegistration.emailValidation(email);
	}

	public void nameValidation(String fname) {
		String regex = "^[A-Z][a-z]{2,}"; // name validation name start with cap and contain 3 characters
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(fname);
		System.out.println("is valid: " + matcher.matches());
	}

	public void lastNameValidation(String lname) {
		String regex = "^[A-Z][a-z]{2,}"; // lastname validation name start with cap and contain min 3 characters
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(lname);
		System.out.println("is valid: " + matcher.matches());

	}

	public void emailValidation(String email) {
		String regex = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$"; // email validation
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(email);
		System.out.println("is valid: " + matcher.matches());
	}
}
