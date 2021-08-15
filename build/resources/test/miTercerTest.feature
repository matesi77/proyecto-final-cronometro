Feature: Login

  #esto es un comentario con el #, no con //
  Background:
    Given tengo un usuario "usuario comun"
    And tengo abierto facebook app

  Scenario: Como usuario adminitrador
  Quiero usar mi email
  Para ingresar a la aplicacion


    When yo ingreso mi ucb@ucb.com en la caja de texto usuario
    And yo ingreso mi pwd123 en la caja de texto password
    And yo hago click en el boton login
    Then yo deberia de ingresar a faccebook


  Scenario: Como usuario adminitrador
  Quiero usar mi email
  Para ingresar a la aplicacion

    And yo ingreso mi pwd123 en la caja de texto password
    And yo hago click en el boton login



  Scenario: Como usuario adminitrador
  Quiero usar mi email
  Para ingresar a la aplicacion

    When yo ingreso mi ucb@ucb.com en la caja de texto usuario
    And yo hago click en el boton login
