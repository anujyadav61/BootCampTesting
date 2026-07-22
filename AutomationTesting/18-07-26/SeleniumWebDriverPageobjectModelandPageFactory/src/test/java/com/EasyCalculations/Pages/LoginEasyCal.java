package com.EasyCalculations.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginEasyCal {

	WebDriver driver;

	// Create Constructor
	public LoginEasyCal(WebDriver driver) {
		this.driver = driver;
	}
	
	@FindBy(id = "log_email")
	WebElement email;

	@FindBy(name = "log_password")
	WebElement password;

	@FindBy(xpath = "//*[@id=\"log_frm\"]/div[4]/input[1]")
	WebElement loginbtn;

	public void login_EasyCal(String uname, String pass) {

		email.sendKeys(uname);
		password.sendKeys(pass);
		loginbtn.click();

	}
}