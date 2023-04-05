#language: en
Feature: Purchase a product

  Scenario: Purchase a product
    Given User wants to buy clothes
    And User introduce the credentials bob@example.com 10203040
    When User selects the cheapest item to buy
    Then User should see a confirmation message of the purchase