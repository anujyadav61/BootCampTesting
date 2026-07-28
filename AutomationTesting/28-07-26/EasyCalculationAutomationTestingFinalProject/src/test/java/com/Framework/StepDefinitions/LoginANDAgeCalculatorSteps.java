package com.Framework.StepDefinitions;

import com.Framework.Pages.AgeCalculatorPage;
import com.Framework.Pages.BaseClass;
import com.Framework.Pages.LoginPage;

import Utility.ExcelDataReader;
import Utility.Screenshot;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginANDAgeCalculatorSteps extends BaseClass {

	LoginPage login;

	AgeCalculatorPage age;

	ExcelDataReader loginData;

	ExcelDataReader ageData;

	@Given("User launches the browser")
	public void user_launches_the_browser() {

		setup();

		login = new LoginPage(driver);

		age = new AgeCalculatorPage(driver);

		loginData = new ExcelDataReader("./TestData/Login Data.xlsx");

		ageData = new ExcelDataReader("./TestData/TestData.xlsx");

	}

	@When("User enters username and password from Excel")
	public void user_enters_username_and_password_from_excel() {

		String username = loginData.getUsername(1);

		String password = loginData.getPassword(1);

		login.login(username, password);

		Screenshot.captureScreenshot(driver, "Login");

	}

	@And("User clicks Login button")
	public void user_clicks_login_button() {

		// Already handled in LoginPage.login()

	}

	@And("User opens Age Calculator page")
	public void user_opens_age_calculator_page() {

		age.openAgeCalculator();

		Screenshot.captureScreenshot(driver, "AgePage");

	}

	@And("User enters Day Month and Year from Excel")
	public void user_enters_day_month_and_year_from_excel() {

		String day = ageData.getDay(1);

		String month = ageData.getMonth(1);

		String year = ageData.getYear(1);

		age.calculateAge(day, month, year);

		Screenshot.captureScreenshot(driver, "AgeResult");

	}

	@And("User clicks Calculate button")
	public void user_clicks_calculate_button() {

		// Already handled in calculateAge()

	}

	@Then("Age should be calculated successfully")
	public void age_should_be_calculated_successfully() {

		age.scrollDown();

		loginData.closeWorkbook();

		ageData.closeWorkbook();

		tearDown();

	}

}