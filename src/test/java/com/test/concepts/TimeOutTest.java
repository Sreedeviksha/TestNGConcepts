package com.test.concepts;

import org.testng.annotations.Test;

public class TimeOutTest {

	@Test//(timeOut = 1500)
	private void searchMobile() throws InterruptedException {
		Thread.sleep(1000);
		System.out.println("Search Mobile");
	}

	@Test(timeOut = 500)
	private void searchLaptop() throws InterruptedException {
		Thread.sleep(2000);
		System.out.println("search Laptop");
	}

}
