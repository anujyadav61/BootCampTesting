package com.SeleniumWebDriveriFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MultipleFrames {

    @Test
    public void Frames() throws Exception {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("file:///C:/iframe/iframe.html");
        Thread.sleep(5000);

        // Count total frames
        int totalNoOfFrames = driver.findElements(By.tagName("iframe")).size();
        System.out.println("Number of Frames : " + totalNoOfFrames);

        
        driver.switchTo().frame("easycalculation");

        driver.get("https://www.login.hiox.com/login?referrer=easycalculation.com");

        driver.findElement(By.id("log_email")).sendKeys("9740672280");
        driver.findElement(By.id("log_password")).sendKeys("Dhruv@123");
        driver.findElement(By.xpath("//input[contains(@name,'log_submit')]")).click();

        String title = driver.getTitle();
        System.out.println("Frame 1 Title : " + title);

        driver.switchTo().defaultContent();

   
        driver.navigate().to("file:///C:/iframe/iframe.html");
        Thread.sleep(5000);
        driver.findElement(By.xpath("/html/body/a")).click();
        driver.navigate().to("https://www.selenium.dev/");
        driver.findElement(By.xpath("//*[@id='main_navbar']/ul/li[3]/a/span")).click();
        Thread.sleep(5000);
        String title1 = driver.getTitle();
        System.out.println("Frame 2 Title : " + title1);

    
        driver.navigate().to("file:///C:/iframe/iframe.html");

        driver.switchTo().frame("Practice Test Automation");

        driver.navigate().to("https://practicetestautomation.com/practice-test-login/");

        driver.findElement(By.id("username")).sendKeys("student");
        driver.findElement(By.id("password")).sendKeys("Password123");

        driver.findElement(By.xpath("//button[@id='submit']")).click();

        String title2 = driver.getTitle();
        System.out.println("Frame 3 Title : " + title2);

        Thread.sleep(5000);

        driver.quit();
    }
}