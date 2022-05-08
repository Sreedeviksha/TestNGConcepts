package com.test.concepts;

import org.testng.annotations.*;

public class SimpleAnnotations {
	
	@BeforeSuite
	private void setUp() {
		System.out.println("SetUp");
	}

	@BeforeTest
	private void browserLaunch() {
		System.out.println("Browser Launch");
	}

	@BeforeClass
	private void enterUrl() {
		System.out.println("EnterUrl");
	}

	@BeforeMethod
	private void logIn() {
		System.out.println("LogIn");
	}

	@Test
	private void searchMobile() {
		System.out.println("Search Mobile");
	}

	@Test
	private void searchLaptop() {
		System.out.println("Search Laptop");

	}

	@AfterMethod
	private void verifyHomePage() {
		System.out.println("Verify HomePage");
	}

	@AfterClass
	private void logOut() {
		System.out.println("log out");
	}

	@AfterTest
	private void browserClose() {
		System.out.println("Browser Close");
	}

	@AfterSuite
	private void deleteCookies() {
		System.out.println("Delete Cookies");
	}

}
