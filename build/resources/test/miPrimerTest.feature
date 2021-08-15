Feature: Login
  @Regression @SmokeTest
  Scenario: Como usuario adminitrador
  Quiero usar mi email
  Para ingresar a la aplicacion

    Given tengo un usuario "administrador"
    And tengo abierto facebook app
    When yo ingreso mi ucb@ucb.com en la caja de texto usuario
    And yo ingreso mi pwd123 en la caja de texto password
    And yo hago click en el boton login
    Then yo deberia de ingresar a faccebook