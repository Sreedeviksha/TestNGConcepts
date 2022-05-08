package com.test.concepts;

import org.testng.annotations.Test;

public class GroupTest {

	@Test(groups = "Selenium")
	private void seleniumTest1() {
		System.out.println("seleniumTest1");
	}

	@Test(groups = "API")
	private void APITest1() {
		System.out.println("APITest1");
	}

	@Test(groups = "Git")
	private void git1() {
		System.out.println("git1");
	}

	@Test(groups = "Selenium")
	private void seleniumTest2() {
		System.out.println("seleniumTest2");
	}

	@Test(groups = "API")
	private void APITest2() {
		System.out.println("APITest2");
	}

	@Test(groups = "Git")
	private void git2() {
		System.out.println("git2");
	}

}
