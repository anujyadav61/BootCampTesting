package stepDefinition;

import io.cucumber.java.en.*;

public class LogoutSteps {

	@Then("Login page should be displayed")
	public void login_page_should_be_displayed() {
		System.out.println("Login Page Displayed");
	}

	@When("User enters login email {string}")
	public void user_enters_login_email(String email) {
		System.out.println("Login Email : " + email);
	}

	@When("User enters login password {string}")
	public void user_enters_login_password(String password) {
		System.out.println("Password : " + password);
	}

	@When("User clicks Login button")
	public void user_clicks_login_button() {
		System.out.println("Login Button Clicked");
	}

	@When("User clicks Logout button")
	public void user_clicks_logout_button() {
		System.out.println("Logout Button Clicked");
	}
}