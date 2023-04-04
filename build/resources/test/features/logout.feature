#language: en
Feature: Logout saucelabs app

  Scenario: Logout the app
    Given User is logged in on the main page with valid credentials "standard_user" "secret_sauce"
    Then  the user navigates to the logout button

