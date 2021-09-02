package com.retry.com;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import junit.framework.Assert;

public class AssertDemo {

	String actual = "Bala";
	String expected = "bala";
	
	//Hard Assert ----> validation
	
	@Test
	private void test1() {
		System.out.println("Test1 started");
		Assert.assertEquals(actual, expected);// When assertion fails it will terminate the execution
		System.out.println("Test2 completed");
	}
	
	// soft assert
	@Test
	private void test2() {
		SoftAssert sa = new SoftAssert();// verification-- even though the assertion fails it will continue the execution 
		System.out.println("Test2 Started");
		sa.assertEquals(actual, expected);
		System.out.println("Test2 Completed");
		sa.assertAll();// it is given to check whether the method is passed or failed 
	
	
	
	}
}
