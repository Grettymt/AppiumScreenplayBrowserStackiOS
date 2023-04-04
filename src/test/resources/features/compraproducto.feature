
Feature: Iniciar sesion en la app swag y agregar productos al carrito
  yo como usuario de la aplicacion swag
  quiero iniciar sesion para poder usar la aplicacion
  para poder comprar productos en la aplicacion


  @CompraProducto
  Scenario: comprar un producto
    Given User inicio sesion en app de swag "standard_user" "secret_sauce"
    When User usuario agrega el producto al carrito y procede a comprarlo
    Then User usuario debera ver un mensaje gracias por tu compra

