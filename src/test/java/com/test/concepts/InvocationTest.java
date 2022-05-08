package com.test.concepts;

import org.testng.annotations.Test;

public class InvocationTest {

	@Test(invocationCount = 5)
	private void searchMobile() {
		System.out.println("Search Mobile");
	}

	@Test
	private void searchLaptop() {
		System.out.println("search Laptop");
	}

	@Test(invocationCount = 3)
	private void searchWatch() {
		System.out.println("Search watch");
	}

}
