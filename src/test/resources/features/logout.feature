#language: en
Feature: Logout saucelabs app

  Scenario: Logout from the app
    Given User finished their purchases
    And User use the credentials bob@example.com 10203040
    When User logs out from the app
    Then User should see the logout message