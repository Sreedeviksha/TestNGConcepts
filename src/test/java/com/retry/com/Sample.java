package com.retry.com;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Sample {
	
	@Test(retryAnalyzer=MyRetry.class)
	private void usernameValidation() {
		Assert.assertEquals("A", "a");
	}

}
