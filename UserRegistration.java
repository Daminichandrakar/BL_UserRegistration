package com.bl;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
	public boolean nameValidation(String fname) {
		String regex = "^[A-Z][a-z]{2,}"; // name validation name start with cap and contain 3 characters
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(fname);
		return matcher.matches();
	}

	public boolean lastNameValidation(String lname) {
		String regex = "^[A-Z][a-z]{2,}"; // lastname validation name start with cap and contain min 3 characters
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(lname);
		return matcher.matches();

	}

	public boolean emailValidation(String email) {
		String regex = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$"; // email validation
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(email);
		return matcher.matches();
	}

	public boolean phoneNumberValidation(String phoNumber) {
		String phoneRegex = "^[0-9]{2}\\s{1}[0-9]{10}"; // PhoneNumber Validation
		Pattern pattern = Pattern.compile(phoneRegex);
		Matcher matcher = pattern.matcher(phoNumber);
		return matcher.matches();
	}

	public boolean passwordValidation(String password) {
		String passwordRegex = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@+.-]).{8,20}$"; // password validation
		Pattern pattern = Pattern.compile(passwordRegex);
		Matcher matcher = pattern.matcher(password);
		return matcher.matches();
	}

}
