Feature: Login completo

  @LoginCompleto
  Scenario Outline: Verificar el inicio de sesion
    Given User esta en la interfaz principal de la app
    When User realiza el flujo hasta el login e introduce <usuario> y <contrasenia>
    Then User recibe un <mensaje> segun este <registrado> <bloqueado> o le falte un <campo>
    Examples:
      | usuario             | contrasenia | mensaje                                 | registrado | bloqueado | campo |
      | "bob@example.com"   | "10203040"  | "Products"                              | 1          | 0         | 0     |
      #| "alice@example.com" | "10203040"  | "Sorry, this user has been locked out." | 1          | 1         | 0     |
      #| ""                  | "10203040"  | "Username is required"                                        | 1          | 0         | 1     |
      #| "bob@example.com"   | ""          | "Password is required"                                        | 1          | 0         | 2     |
      #| "pedro@example.com" | "10203040"  | "Provided credentials do not match any user in this service." | 0          | 0         | 0     |