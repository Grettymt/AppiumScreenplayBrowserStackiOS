
#language: en
Feature: Login to Swag app and add products to cart
  As a user of the Swag app
  I want to log in to use the application
  So that I can purchase products in the application

  @CompraProducto
  Scenario: Purchase a product
    Given User is logged in to Swag app with valid credentials "standard_user" "secret_sauce"
    When User adds a product to the cart and completes their personal information "Yulitza" "Lopez" "5440987" and proceeds to checkout
    Then User should see a "THANK YOU FOR YOU ORDER" message.