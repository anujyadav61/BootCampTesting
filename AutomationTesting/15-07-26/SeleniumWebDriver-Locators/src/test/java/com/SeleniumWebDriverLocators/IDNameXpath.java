package com.SeleniumWebDriverLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class IDNameXpath {
	WebDriver driver;
	String baseURL = "https://practicetestautomation.com/practice-test-login/";
	@Test
	public void IDLocator() {
		driver = new ChromeDriver();
		driver.navigate().to(baseURL);
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("student");
		driver.findElement(By.id("password")).sendKeys("Password123");
		driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();
		
		String ActualTitle = driver.getTitle();
		String ExpectedTitle = "Logged In Successfully | Practice Test Automation";
		
		if (ExpectedTitle.equals(ActualTitle)){
			System.out.println("Passed");
            System.out.println("Title : " + ActualTitle);
		}
		else {
            System.out.println("Failed");
            System.out.println("Expected Title : " + ExpectedTitle);
            System.out.println("Actual Title   : " + ActualTitle);
	}
	}

}
