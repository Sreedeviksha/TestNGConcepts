package com.test.concepts;

import org.testng.annotations.Test;

public class PriorityTest {

	@Test(priority = 4)
	private void searchMobile() {  
		System.out.println("Search Mobile");
	}

	@Test(priority = 3)
	private void searchLaptop() {
		System.out.println("search Laptop");
	}

	@Test(priority = 3)
	private void searchFruits() {
		System.out.println("Search fruits");
	}

	@Test(priority = 2)
	private void searchWatch() {
		System.out.println("Search Watch");
	}

	@Test(priority = -1)
	private void searchTv() {
		System.out.println("Search Tv");
	}

}

