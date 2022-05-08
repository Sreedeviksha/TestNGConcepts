package com.test.concepts;

import org.testng.annotations.Test;

public class DependencyTest {

	@Test(dependsOnMethods = "searchWatch")
	private void searchLaptop() {
		System.out.println("Search Laptop");
	}

	@Test(dependsOnMethods = "searchLaptop")
	private void searchMobile() {
		System.out.println("Search Mobile");
	}

	@Test
	private void searchWatch() {
		System.out.println("Search watch");
	}

	
}
