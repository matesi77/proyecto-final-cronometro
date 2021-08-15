Feature: Login

  Scenario Outline: Como usuario adminitrador
  Quiero usar mi email
  Para ingresar a la aplicacion

    Given tengo un usuario "administrador"
    And tengo abierto facebook app
    When yo ingreso mi <email> en la caja de texto usuario
    And yo ingreso mi <password> en la caja de texto password
    And yo hago click en el boton login
    Then yo deberia de ingresar a faccebook
    Examples:
      | email           | password |
      | ucb@ucb.com     | 123      |
      | ucb@gmail.com   | 456      |
      | ucb@outlook.com | 678      |