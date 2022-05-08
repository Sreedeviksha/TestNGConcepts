package com.test.concepts;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class IgnoreTest {

	@Ignore
	@Test
	private void searchMobile() {
		System.out.println("Search Mobile");
	}

	@Test
	private void searchLaptop() {
		System.out.println("Search Laptop");
	}

	@Test(enabled=false)
	private void searchTv() {
		System.out.println("Search Tv");
	}

	@Test

	private void searchFruits() {
		System.out.println("searchfruits");
	}

}
