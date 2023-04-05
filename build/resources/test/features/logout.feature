#language: en
Feature: Logout saucelabs app

  Scenario: Logout from the app
    Given User finished their purchases
    When User logs out from the app
    Then User should see the logout message