package stepDefinition;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import Pages.HomePage;
import Pages.RegisterPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterSteps {

    WebDriver driver;

    HomePage home;
    RegisterPage register;

    @Given("User launches Chrome browser")
    public void user_launches_chrome_browser() {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.manage().window().maximize();

        home = new HomePage();
        register = new RegisterPage();
    }

    @When("User opens Automation Exercise website")
    public void user_opens_automation_exercise_website() {

        driver.get("https://automationexercise.com/");
    }

    @Then("Home page should be displayed")
    public void home_page_should_be_displayed() {

        Assert.assertTrue(home.verifyHomePage(),
                "Home page is not displayed.");
    }

    @When("User clicks Signup Login")
    public void user_clicks_signup_login() {

        home.clickSignupLogin();
    }

    @Then("New User Signup should be visible")
    public void new_user_signup_should_be_visible() {

        System.out.println("Signup Page Opened");
    }

    @When("User enters name {string}")
    public void user_enters_name(String name) {

        register.enterName(name);
    }

    @When("User enters email {string}")
    public void user_enters_email(String email) {

        register.enterEmail(email);
    }

    @When("User clicks Signup")
    public void user_clicks_signup() {

        register.clickSignup();
    }

    @Then("Enter Account Information page should be displayed")
    public void enter_account_information_page_should_be_displayed() {

        System.out.println("Account Information Page Displayed");
    }

    @When("User enters account details")
    public void user_enters_account_details() {

        register.enterAccountDetails();
    }

    @When("User enters address details")
    public void user_enters_address_details() {

        register.enterAddressDetails();
    }

    @When("User clicks Create Account")
    public void user_clicks_create_account() {

        register.clickCreateAccount();
    }

    @Then("Account Created message should be displayed")
    public void account_created_message_should_be_displayed() {

        System.out.println("Account Created Successfully");
    }

    @When("User clicks Continue")
    public void user_clicks_continue() {

        home.clickContinue();
    }

    @Then("Logged in as {string} should be displayed")
    public void logged_in_as_should_be_displayed(String user) {

        Assert.assertTrue(home.verifyLoggedInUser());
    }

    @When("User clicks Delete Account")
    public void user_clicks_delete_account() {

        home.clickDeleteAccount();
    }

    @Then("Account Deleted message should be displayed")
    public void account_deleted_message_should_be_displayed() {

        driver.quit();
    }

}