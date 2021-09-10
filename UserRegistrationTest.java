package com.bl;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class UserRegistrationTest {
	UserRegistration user = new UserRegistration();

	@Test
	public void givenFirstName_WhenProper_ShouldReturnTrue() {
		boolean value = user.nameValidation("Damini");
		Assert.assertEquals(true, value);
	}

	@Test
	public void givenFirstName_WhenProper_ShouldReturnFalse() {
		boolean value = user.nameValidation("damini");
		Assert.assertEquals(false, value);
	}

	@Test
	public void givenLastName_WhenProper_ShouldReturnTrue() {
		boolean value = user.lastNameValidation("Chandrakar");
		Assert.assertEquals(true, value);
	}

	@Test
	public void givenLastName_WhenProper_ShouldReturnFalse() {
		boolean value = user.lastNameValidation("Ch");
		Assert.assertEquals(false, value);
	}

	@Test
	public void givenEmail_WhenProper_ShouldReturnTrue() {
		boolean value = user.emailValidation("damini@gmail.com");
		Assert.assertEquals(true, value);
	}

	@Test
	public void givenEmail_WhenProper_ShouldReturnFalse() {
		boolean value = user.emailValidation("daminigmail.com");
		Assert.assertEquals(false, value);
	}

	@Test
	public void givenPhone_WhenProper_ShouldReturnTrue() {
		boolean value = user.phoneNumberValidation("91 1234567890");
		Assert.assertEquals(true, value);
	}

	@Test
	public void givenPhone_WhenProper_ShouldReturnFalse() {
		boolean value = user.phoneNumberValidation("911234567890");
		Assert.assertEquals(false, value);
	}

	@Test
	public void givenPassword_WhenProper_ShouldReturnTrue() {
		boolean value = user.passwordValidation("Damini@24");
		Assert.assertEquals(true, value);
	}

	@Test
	public void givenPassword_WhenProper_ShouldReturnFalse() {
		UserRegistration user = new UserRegistration();
		boolean value = user.passwordValidation("Damini4");
		assertEquals(false, value);
	}

//	@RunWith(Parameterized.class)
//	public class ValidEmailTest {
//		private String email12test;
//		private String expectedResult;
//
//		public ValidEmailTest(String email, String expectedResult) {
//			this.email12test = email;
//			this.expectedResult = expectedResult;
//		}
//
//		@Parameterized.Parameters
//		public Collection data() {
//			return Arrays.asList(new Object[][] { { "abc@yahoo.com", true }, { "abc111@abc.com", true },
//					{ "abc@1.com", true }, { "abc", false }, { "abcgmail.com", false } });
//		}
//
//		@Test
//		public void givenEmail_WhenProper_ShouldReturnTrue1() {
//			boolean value = user.emailValidation(this.email12test);
//			assertEquals(expectedResult, value);
//		}
//
//		
//	}

}
