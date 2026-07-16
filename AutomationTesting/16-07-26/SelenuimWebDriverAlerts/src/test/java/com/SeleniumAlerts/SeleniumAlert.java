package com.SeleniumAlerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.Utility.Helper;

public class SeleniumAlert {

	@Test
	public void TestPopups() throws Exception {

		WebDriver driver = Helper.startBrowser("Chrome");
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");

		// JS Alert
		driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();

		Alert alert1 = driver.switchTo().alert();
		Thread.sleep(2000);
		alert1.accept();

		String result = driver.findElement(By.id("result")).getText();
		System.out.println(result);
		Assert.assertEquals(result, "You successfully clicked an alert");

		// JS Confirm - Cancel
		driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();

		Alert alert2 = driver.switchTo().alert();
		Thread.sleep(2000);
		alert2.dismiss();

		String result2 = driver.findElement(By.id("result")).getText();
		System.out.println(result2);
		Assert.assertEquals(result2, "You clicked: Cancel");

		// JS Confirm - OK
		driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();

		Alert alert3 = driver.switchTo().alert();
		Thread.sleep(2000);
		alert3.accept();

		String result3 = driver.findElement(By.id("result")).getText();
		System.out.println(result3);
		Assert.assertEquals(result3, "You clicked: Ok");

		// JS Prompt
		driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();

		Alert alert4 = driver.switchTo().alert();
		Thread.sleep(2000);

		alert4.sendKeys("Anuj");
		alert4.accept();

		String result4 = driver.findElement(By.id("result")).getText();
		System.out.println(result4);
		Assert.assertEquals(result4, "You entered: Anuj");
		

	}
}