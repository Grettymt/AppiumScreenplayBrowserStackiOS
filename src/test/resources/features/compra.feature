Feature: compra de productos
  I AS user of the app
  WANT TO buy some products
  TO enjoy them

  Scenario: Buying products
    Given user wants to buy some clothes
    And introduce the valid credentials bob@example.com 10203040
    When user selects the product
    And finishes the buying process
    Then shows the checkout page