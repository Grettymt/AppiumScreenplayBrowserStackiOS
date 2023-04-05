Feature: Logout from Saucelabs app

  Scenario: Logout successfully from the app
    Given User is logged in to the Saucelabs app "standard_user" "secret_sauce"
    When User clicks on the Logout button
    Then User should be logged out and redirected to the Login page