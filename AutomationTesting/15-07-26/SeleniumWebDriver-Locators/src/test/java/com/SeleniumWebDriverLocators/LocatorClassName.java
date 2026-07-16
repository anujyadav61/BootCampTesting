package com.SeleniumWebDriverLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LocatorClassName {

	@Test
	public void TestDemo() throws Exception {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.navigate().to("https://www.hollandandbarrett.com/shop/vitamins-supplements/vitamins/");

		Thread.sleep(10000);

		try {
			driver.findElement(By.id("onetrust-accept-btn-handler")).click();
		} 
		catch (Exception e) {
			System.out.println("Cookie popup not displayed.");
		}

		driver.findElement(By.xpath("//img[@alt='Vitamin Drinks category product example']")).click();

		Thread.sleep(3000);

		driver.findElement(By.className("ProductCardImage-module_picture__QWY9P")).click();

		Thread.sleep(3000);

		String expectedProductURL = driver.getCurrentUrl();
		String actualURL = driver.getCurrentUrl();

		if (actualURL.equals(expectedProductURL)) {
			System.out.println("Passed");
		} 
		else {
			System.out.println("Failed");
		}

		System.out.println("Current URL : " + actualURL);
		driver.navigate().back();
		Thread.sleep(3000);

		String expectedBackURL = "https://www.hollandandbarrett.com/shop/vitamins-supplements/vitamins/";
		actualURL = driver.getCurrentUrl();

		if (actualURL.equals(expectedBackURL)) {
			System.out.println("Passed");
		} else {
			System.out.println("Failed");
		}
		System.out.println("Back URL : " + actualURL);
		driver.navigate().refresh();
		Thread.sleep(3000);

		actualURL = driver.getCurrentUrl();

		if (actualURL.equals(expectedBackURL)) {
			System.out.println("Passed");
		} else {
			System.out.println("Failed");
		}

		System.out.println("Refresh URL : " + actualURL);

		driver.quit();
	}
}