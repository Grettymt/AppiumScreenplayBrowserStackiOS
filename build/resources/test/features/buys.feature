Feature: buys

  Scenario: successful purchase
    Given User logged in with the valid credentials "standard_user" "secret_sauce"
    When User adds a product to the cart
    And User enter all the shipping and billing information "Jesus" "Molina" "112233"
    Then User should see a purchase confirmation message "THANK YOU FOR YOU ORDER"
