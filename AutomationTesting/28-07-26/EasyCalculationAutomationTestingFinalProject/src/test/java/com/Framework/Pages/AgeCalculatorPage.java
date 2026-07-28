package com.Framework.Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utility.ConfigDataProvider;
import Utility.Helper;

public class AgeCalculatorPage {

    WebDriver driver;

    ConfigDataProvider config = new ConfigDataProvider();

    public AgeCalculatorPage(WebDriver driver) {

        this.driver = driver;

        PageFactory.initElements(driver, this);

    }

    @FindBy(id = "i21")
    WebElement day;

    @FindBy(id = "i22")
    WebElement month;

    @FindBy(id = "i23")
    WebElement year;

    @FindBy(name = "but")
    WebElement goButton;

    public void openAgeCalculator() {

        driver.get(config.getAgeCalculatorUrl());

    }

    public void calculateAge(String d, String m, String y) {

        Helper.waitForElement(driver, day);
        day.clear();
        day.sendKeys(d);

        month.clear();
        month.sendKeys(m);

        year.clear();
        year.sendKeys(y);
        
        try {

            Thread.sleep(5000); 

        } catch (InterruptedException e) {

            e.printStackTrace();

        }

        Helper.waitForClick(driver, goButton);
        goButton.click();

    }

    public void scrollDown() {

        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("window.scrollBy(0,500)");

    }

}