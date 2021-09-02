package com.testng.concepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserTest {
	
	public static WebDriver driver;
	@Test
	@Parameters("browser")
	private void title(String browserName) {
		
		if (browserName.equalsIgnoreCase("ie")) {
			System.setProperty("webdriver.ie.driver", ".//IEDriverServer.exe");
			driver= new InternetExplorerDriver();
			
		}else if (browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", ".//chromedriver.exe");
			driver= new ChromeDriver();
		}
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");	
		
		System.out.println(driver.getTitle());
		
		//driver.quit();
		
		
	}

}
