	package com.testing.annotation;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DataProviderTest {
	
	@Test(dataProvider = "logInData")
	private void logIn(String username, String password) {
		System.out.println("Enter the login details");
		System.out.println("USERNAME:" + username);
		System.out.println("PASSWORD:" + password);
		
		
	}
	
	@DataProvider
	private Object[][] logInData() {
		return new Object[][] {
			{"AAA", "111"},
			{"BBB", "222"},
			{"CCC" ,"333"},
		};
		
	}


}
