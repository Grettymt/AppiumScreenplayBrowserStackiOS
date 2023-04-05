#language: en
Feature: Buy in APP

  Scenario: Successful product purchase
    Given the user is in the app
    And logged in successfully with the valid credentials
    When the user buys a product with de information "Matilde" "Mejia" "600301"
    Then the user can validate his purchase