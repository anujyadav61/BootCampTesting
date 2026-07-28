Feature: Login And Age Calculator

  Scenario: Verify Login and Calculate Age

    Given User launches the browser

    When User enters username and password from Excel

    And User clicks Login button

    And User opens Age Calculator page

    And User enters Day Month and Year from Excel

    And User clicks Calculate button

    Then Age should be calculated successfully