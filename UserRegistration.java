package com.bl;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first name");
		String firstName = scan.nextLine();
		UserRegistration userRegistration = new UserRegistration();
		userRegistration.nameValidation(firstName);
	}

	public void nameValidation(String fname) {
		String regex = "^[A-Z][a-z]{2,}"; // name validation name start with cap and contain 3 characters
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(fname);
		System.out.println("is valid: " + matcher.matches());
	}
}
