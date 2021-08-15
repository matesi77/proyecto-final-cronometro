Feature: Task
  @Appium
  Scenario: Como usuario en la app
  quiero crear tareas con titulo y descripcion
  para realizar seguimiento a mis actividades
    Given la app Whendo esta abierta
    And yo hago click en el boton agregar tarea
    When yo creo una tarea
      | titulo      | Clean                   |
      | descripcion | Esto es una descripcion |
    And realizo click en el boton guardar
    Then la tarea con el nombre "Clean" deberia ser creada