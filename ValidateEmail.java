package com.bl;

import static org.junit.Assert.assertEquals;
import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class ValidateEmail {
	private String email12test;
	private boolean expectedResult;

	public ValidateEmail(String email12test, Boolean expectedResult) {
		super();
		this.email12test = email12test;
		this.expectedResult = expectedResult;
	}

	UserRegistration userRegistration = new UserRegistration();

	@Parameterized.Parameters
	public static Collection data() {
		return Arrays.asList(new Object[][] { { "abc@yahoo.com", true }, { "abc111@abc.com", true },
				{ "abc@1.com", false }, { "abc", false }, { "abcgmail.com", false } });
	}

	@Test
	public void emailcheck() {
		System.out.println("Parameterized Email is : " + email12test);
		assertEquals(expectedResult, userRegistration.emailValidation(email12test));
	}

}
