package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import Utilities.DriverFactory;

public class RegisterPage {

	WebDriver driver = DriverFactory.driver;

	// Signup
	By name = By.name("name");
	By email = By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/input[3]");
	By signupBtn = By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/button");

	// Account Information
	By title = By.id("id_gender1");
	By password = By.id("password");
	By days = By.id("days");
	By months = By.id("months");
	By years = By.id("years");

	By newsletter = By.id("newsletter");
	By offers = By.id("optin");

	// Address
	By firstName = By.id("first_name");
	By lastName = By.id("last_name");
	By company = By.id("company");
	By address = By.id("address1");
	By country = By.id("country");
	By state = By.id("state");
	By city = By.id("city");
	By zipcode = By.id("zipcode");
	By mobile = By.id("mobile_number");

	By createAccount = By.xpath("//button[@data-qa='create-account']");

	public void enterName(String uname) {
		driver.findElement(name).sendKeys(uname);
	}

	public void enterEmail(String uemail) {
		driver.findElement(email).sendKeys(uemail);
	}

	public void clickSignup() {
		driver.findElement(signupBtn).click();
	}

	public void enterAccountDetails() {

		driver.findElement(title).click();

		driver.findElement(password).sendKeys("Anuj@123");

		new Select(driver.findElement(days)).selectByVisibleText("15");
		new Select(driver.findElement(months)).selectByVisibleText("October");
		new Select(driver.findElement(years)).selectByVisibleText("2005");

		driver.findElement(newsletter).click();
		driver.findElement(offers).click();
	}

	public void enterAddressDetails() {

		driver.findElement(firstName).sendKeys("Anuj");
		driver.findElement(lastName).sendKeys("Yadav");
		driver.findElement(company).sendKeys("Coforge");
		driver.findElement(address).sendKeys("Greater Noida");

		new Select(driver.findElement(country)).selectByVisibleText("India");

		driver.findElement(state).sendKeys("Uttar Pradesh");
		driver.findElement(city).sendKeys("Greater Noida");
		driver.findElement(zipcode).sendKeys("201310");
		driver.findElement(mobile).sendKeys("9876543210");
	}

	public void clickCreateAccount() {
		driver.findElement(createAccount).click();
	}
}