Feature: Register User

  Scenario: Register a new user successfully

    Given User launches Chrome browser
    When User opens Automation Exercise website
    Then Home page should be displayed

    When User clicks Signup Login
    Then New User Signup should be visible

    When User enters name "Anuj"
    And User enters email "anuj.testing2026@gmail.com"
    And User clicks Signup

    Then Enter Account Information page should be displayed

    When User enters account details
    And User enters address details
    And User clicks Create Account

    Then Account Created message should be displayed

    When User clicks Continue

    Then Logged in as "Anuj" should be displayed

    When User clicks Delete Account

    Then Account Deleted message should be displayed