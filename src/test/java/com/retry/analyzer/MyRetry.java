package com.retry.analyzer;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class MyRetry implements IRetryAnalyzer {

	
	int count = 1;
	int limit = 4;

	public boolean retry(ITestResult result) {
		if (count < limit) {
			count++;// count = count + 1
			return true;
		}
		return false;
	}

	
	
}
