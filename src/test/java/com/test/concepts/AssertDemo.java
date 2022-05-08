package com.test.concepts;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertDemo {
	
	String actual ="Bala";
	String expected = "bala";
	
	
	//Hard Assert--> Validation
	@Test
	private void test1() {
		System.out.println("Test1 Started");
		//Assert.assertEquals(actual, expected); // when assertion fails it will terminate the execution
		Assert.assertTrue(true); 
		System.out.println("Test1 Completed");
		
	
	}
	
	/*@Test
	private void test2() {
		SoftAssert sa = new SoftAssert(); //Verification-- even though the assertion fails it will continue the execution
		System.out.println("Test2 Started");		
		sa.assertEquals(actual, expected);
		System.out.println("Test2 Completed");
		sa.assertAll();// it is given to check whether the method is passed or failed
	
		
		
	}
*/
}
