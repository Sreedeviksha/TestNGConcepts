package com.test.concepts;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterisedTest {

	@Test
	@Parameters({ "username", "password" })
	
	private void logIn(@Optional ("Kumar") String username, String password) {
		System.out.println("Enter the login details");
		System.out.println("UserName: " + username);
		System.out.println("PassWord: " + password);

	}

}
