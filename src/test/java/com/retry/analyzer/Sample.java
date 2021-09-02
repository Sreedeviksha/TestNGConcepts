package com.retry.analyzer;

import org.testng.annotations.Test;
import junit.framework.Assert;

public class Sample {

	@Test(retryAnalyzer=MyRetry.class)
	
	private void userNameValidation() {
		//Assert.assertEquals("A", "a");
		Assert.assertEquals('A', 'a');
	} 

	/*@Test
	private void logInValidation() {
		Assert.assertEquals("abc", "ABC");
	}*/

}
