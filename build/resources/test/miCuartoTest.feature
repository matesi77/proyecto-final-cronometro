Feature: Login

  @Regression @SmokeTest
  Scenario: Como usuario adminitrador
  Quiero usar mi email
  Para ingresar a la aplicacion

    Given tengo un usuario "administrador"
    And tengo abierto facebook app
    When yo realizo el login a la app
      | email    | ucb@ucb.com |
      | password | 123456      |
    Then yo deberia de ingresar a faccebook