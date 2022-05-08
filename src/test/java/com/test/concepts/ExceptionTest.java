package com.test.concepts;

import org.testng.annotations.Test;

public class ExceptionTest {

	@Test
	private void test() {
		int i = 10;
		int j = 20;
		System.out.println("add "+(i+j));
	}
	
	@Test(expectedExceptions = Exception.class)
	private void test2() {
		int i = 10;
		int j = 0;
		System.out.println("divide "+(i/j));
	}
}
 