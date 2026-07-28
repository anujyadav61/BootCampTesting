package com.Framework.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utility.Helper;

public class LoginPage {

    WebDriver driver;

    public LoginPage(WebDriver driver) {

        this.driver = driver;

        PageFactory.initElements(driver, this);

    }

    @FindBy(xpath = "//*[@id='wrap']/div[2]/div[2]/span[2]/a/span")
    WebElement loginLink;

    @FindBy(id = "log_email")
    WebElement email;

    @FindBy(id = "log_password")
    WebElement password;

    @FindBy(name = "log_submit")
    WebElement loginButton;

    public void login(String username, String pass) {

        Helper.waitForElement(driver, loginLink);
        loginLink.click();

        Helper.waitForElement(driver, email);
        email.clear();
        email.sendKeys(username);

        password.clear();
        password.sendKeys(pass);

        // Temporary delay for debugging
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Helper.waitForClick(driver, loginButton);
        loginButton.click();

    }

}