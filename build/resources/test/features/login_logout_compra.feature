#language: en
Feature: Login saucelabs app

  Background:
    Given User wants to buy some clothes
    When User introduce the valid credentials bob@example.com 10203040

  @Login
  Scenario: Login with valid credentials
    Then User should see the Products list

  @Logout
  Scenario: Verificar el logout
    And User navega y presiona el boton logout
    Then User debe ver el mensaje "You are successfully logged out."

  @Compra
  Scenario Outline: Comprar un producto
    And User selecciona un <producto> y la <cantidad>
    And User realiza el flujo de compra
    Then User recibe un mensaje de confirmacion
    Examples:
      | producto   | cantidad |
      | "mochila"  | 2        |
      | "camiseta" | 2        |
      | "camiseta" | 3        |
