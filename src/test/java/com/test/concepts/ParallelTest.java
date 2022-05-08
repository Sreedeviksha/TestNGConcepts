package com.test.concepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class ParallelTest {
	
	
	@Test
	private void amazonTest() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91917\\eclipse-workspace\\TConcepts\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
	}
	@Test
	private void flipKart() {
		System.setProperty("webdriver.ie.driver", "C:\\Users\\91917\\eclipse-workspace\\TConcepts\\IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
		driver.get("https://www.flipkart.com/");
		
	}

}
