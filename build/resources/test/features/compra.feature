Feature: Compra
  AS usuario de la aplicacion DEMO
  WANT seleccionar productos de l app
  BECAUSE comprar productos

  @Compras
  Scenario: Realizar una compra
    Given el usuario a iniciado sesion
    When seleccione un producto y realize el pago
    Then vera un mensaje de compra exitosa