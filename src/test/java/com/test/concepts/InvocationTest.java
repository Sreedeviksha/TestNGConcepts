package com.test.concepts;

import org.testng.annotations.Test;

public class InvocationTest {
	
	@Test(invocationCount=4)
	private void searchMobile() {
		System.out.println("Search Mobile");
	}

	
	@Test(invocationCount=2)
	private void searchLaptop() {
		System.out.println("search Laptop");
	}

	@Test
	private void searchWatch() {
		System.out.println("Search watch");
	}

}
