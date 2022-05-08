package com.test.concepts;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {

	//to execute multiple set of datas for a test case
	
	@Test(dataProvider="logInData")
	private void logIn(String username, String password) {
		System.out.println("Enter the login details");
		System.out.println("Username: " + username);
		System.out.println("Password: " + password);

	}
	
	@DataProvider
	private Object[][] logInData() {
		return new Object[][] {
			{"AAA","111"},{"BBB","222"},{"CCC","333"}
			};
	}
		
	}
	
	


