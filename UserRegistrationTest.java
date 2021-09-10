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
}
