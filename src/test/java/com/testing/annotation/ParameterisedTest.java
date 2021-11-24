package com.testing.annotation;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterisedTest {
	
	@Test
	@Parameters({"username", "password"})
	private void logIn(@Optional("Sanjeev")String username, String password) {
		System.out.println("Enter the login details");
		System.out.println("USERNAME:" + username);
		System.out.println("PASSWORD:" + password);
		
		
	}

}
