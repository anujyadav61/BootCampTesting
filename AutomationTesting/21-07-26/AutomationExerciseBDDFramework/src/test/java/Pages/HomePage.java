package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Utilities.DriverFactory;

public class HomePage {

    WebDriver driver = DriverFactory.driver;

    // Locators
    By signupLogin = By.xpath("//a[contains(text(),'Signup / Login')]");
    By loggedInUser = By.xpath("//a[contains(text(),'Logged in as')]");
    By deleteAccount = By.xpath("//a[contains(text(),'Delete Account')]");
    By continueBtn = By.xpath("//a[contains(text(),'Continue')]");

    // Home page logo
    By homeLogo = By.xpath("//img[@alt='Website for automation practice']");

    // Click Signup/Login
    public void clickSignupLogin() {
        driver.findElement(signupLogin).click();
    }

    // Verify Home Page
    public boolean verifyHomePage() {
        return driver.findElement(homeLogo).isDisplayed();
    }

    // Verify Logged In User
    public boolean verifyLoggedInUser() {
        return driver.findElement(loggedInUser).isDisplayed();
    }

    // Click Delete Account
    public void clickDeleteAccount() {
        driver.findElement(deleteAccount).click();
    }

    // Click Continue
    public void clickContinue() {
        driver.findElement(continueBtn).click();
    }
}