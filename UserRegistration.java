package com.bl;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
//		System.out.println("Enter first name");
//		String firstName = scan.nextLine();
//		System.out.println("Enter last name");
//		String lastName = scan.nextLine();
//		System.out.println("Enter email id");
//		String email = scan.nextLine();
//		System.out.println("Enter phoneNumber");
//		String phoNumber = scan.nextLine();
		System.out.println("Enter password");
		String password = scan.nextLine();
		UserRegistration userRegistration = new UserRegistration();
//		userRegistration.nameValidation(firstName);
//		userRegistration.lastNameValidation(lastName);
//		userRegistration.emailValidation(email);
//		userRegistration.phoneNumberValidation(phoNumber);
		userRegistration.passwordValidation(password);
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

	public void phoneNumberValidation(String phoNumber) {
		String phoneRegex = "^[0-9]{2}\\s{1}[0-9]{10}"; // PhoneNumber Validation
		Pattern pattern = Pattern.compile(phoneRegex);
		Matcher matcher = pattern.matcher(phoNumber);
		System.out.println("is valid phone number: " + matcher.matches());
	}

	public void passwordValidation(String password) {
		String passwordRegex = "^(?=.*[A-Z])[a-z0-9]+.{8,20}$"; // password validation
		Pattern pattern = Pattern.compile(passwordRegex);
		Matcher matcher = pattern.matcher(password);
		System.out.println("is valid password: " + matcher.matches());
	}}
