Feature: Logout User

  Scenario: Logout successfully

    Given User launches Chrome browser
    When User opens Automation Exercise website
    Then Home page should be displayed

    When User clicks Signup Login
    Then Login page should be displayed

    When User enters login email "yadavanuj151005@gmail.com"
    And User enters login password "Anuj@123"
    And User clicks Login button

    Then Logged in as "Anuj" should be displayed

    When User clicks Logout button

    Then Login page should be displayed