package com.test.concepts;

import org.testng.annotations.Test;

public class PriorityTest {

	@Test(priority = 1)
	private void searchMobile() {
		System.out.println("Search Mobile");
	}

	@Test(priority = 0,dependsOnMethods="searchMobile")
	private void searchLaptop() {
		System.out.println("search Laptop");
	/*}

	@Test(priority = -1)
	private void searchFruits() {
		System.out.println("Search fruits");
	}

	@Test
	private void searchWatch() {
		System.out.println("Search Watch");
	}

	@Test(priority = -2)
	private void searchTv() {
		System.out.println("Search Tv");*/
	}

}

