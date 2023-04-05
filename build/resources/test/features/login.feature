#language: en
Feature: Login saucelabs app

  Scenario: Login with valid credentials
    Given User wants to buy some clothes
    When User introduce the valid credentials "standard_user" "secret_sauce"
    Then User should see the Products list

  @Failed
  Scenario Outline: Sign in with invalid credentials
    Given the User wants to buy some clothes
    When User introduce the valid not credentials "user" "password"
    Then User should not see the Products list
    Examples:
      | user      | password |
      | "yeison"  | "hola"   |
      | " j"      | "j"      |
      | "standar" | "n_nda"  |