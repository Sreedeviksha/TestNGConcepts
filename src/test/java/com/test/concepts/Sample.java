 package com.test.concepts;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Sample {
	
	@Test//(retryAnalyzer=MyRetry.class)
	private void userNameValidation() {
		Assert.assertEquals('a','A');
	}
	
	@Test
	private void logIn() {
		Assert.assertEquals('B','b');
	}
	
	
}
