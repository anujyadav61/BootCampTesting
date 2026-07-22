package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Utilities.DriverFactory;

public class LoginPage {

	WebDriver driver = DriverFactory.driver;

    By email = By.xpath("//input[@data-qa='login-email']");
    By password = By.xpath("//input[@data-qa='login-password']");
    By loginButton = By.xpath("//button[@data-qa='login-button']");
    By logoutButton = By.xpath("//a[contains(text(),'Logout')]");

    public void enterEmail(String userEmail) {
        driver.findElement(email).sendKeys(userEmail);
    }

    public void enterPassword(String userPassword) {
        driver.findElement(password).sendKeys(userPassword);
    }

    public void clickLogin() {
        driver.findElement(loginButton).click();
    }

    public void clickLogout() {
        driver.findElement(logoutButton).click();
    }
}