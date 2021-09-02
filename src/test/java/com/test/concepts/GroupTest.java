package com.test.concepts;

import org.testng.annotations.Test;

public class GroupTest {

	@Test(groups = "Selenium")
	private void seleniumTest1() {
		System.out.println("Log in test");
	}

	@Test(groups = "API")
	private void APITest1() {
		System.out.println("POST test");
	}

	@Test(groups = "Git")
	private void git1() {
		System.out.println("GiT Test1");
	}

	@Test(groups = "Selenium")
	private void seleniumTest2() {
		System.out.println("Order a product");
	}

	@Test(groups = "API")
	private void APITest2() {
		System.out.println("GET Test");
	}

	@Test(groups = "Git")
	private void git2() {
		System.out.println("GiT Test2");
	}

}
