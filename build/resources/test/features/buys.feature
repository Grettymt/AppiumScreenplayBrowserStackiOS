Feature: buys

  Scenario: successful purchase
    Given User logged in with the valid credentials "bob@example.com" "10203040"
    When User adds a product to the cart
    And User enter all the shipping and billing information
    Then User should see a purchase confirmation message
