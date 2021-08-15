Feature: Login

  @Regression @SmokeTest
  Scenario: Como usuario adminitrador
  Quiero usar mi email
  Para ingresar a la aplicacion

    Given tengo un usuario "usuario comun"
    And tengo abierto facebook app
    When yo realizo el login en la app
      | email       | password |
      | ucb@ucb.com | 123456   |
    Then yo deberia de ingresar a faccebook