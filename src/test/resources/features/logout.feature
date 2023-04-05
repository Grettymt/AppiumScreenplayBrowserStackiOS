#language: en
Feature: Logout in APP Swaglabs

  Scenario: Logout Successful in the App
    Given the user is on the app
    And successfully logs  with the valid credentials
    When the user buys a product with "Matilde" "Acevedo" "600301" and the user logs off
    Then the user valid his closed session