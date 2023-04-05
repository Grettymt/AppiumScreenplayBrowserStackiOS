#language: en
Feature: Logout saucelabs app

  Scenario: Logout the app
    Given User is logged in on the main page with valid credentials "standard_user" "secret_sauce"
    When the user navigates to the logout button
    Then the user will be redirected to the login page

