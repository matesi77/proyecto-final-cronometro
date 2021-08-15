package runner;

import activities.whenDo.CreateTaskScreen;
import activities.whenDo.MainScreen;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

import java.net.MalformedURLException;
import java.util.Map;

public class MyStepdefsMovile {
    private MainScreen mainScreen = new MainScreen();
    private CreateTaskScreen createTaskScreen = new CreateTaskScreen();

    @Given("la app Whendo esta abierta")
    public void laAppWhendoEstaAbierta() {

    }

    @And("yo hago click en el boton agregar tarea")
    public void yoHagoClickEnElBotonAgregarTarea() throws MalformedURLException {
        mainScreen.addTaskButton.click();
    }

    @When("yo creo una tarea")
    public void yoCreoUnaTarea(Map<String, String> datos) throws MalformedURLException {
        createTaskScreen.titleTextBox.setValue(datos.get("titulo"));
        createTaskScreen.descriptionTextBox.setValue(datos.get("descripcion"));
    }

    @And("realizo click en el boton guardar")
    public void realizoClickEnElBotonGuardar() throws MalformedURLException {
        createTaskScreen.saveButton.click();
    }

    @Then("la tarea con el nombre {string} deberia ser creada")
    public void laTareaConElNombreDeberiaSerCreada(String expectedTitle) throws MalformedURLException {
        Assertions.assertEquals(expectedTitle, mainScreen.nameTaskLabel.getText(), "Error, task was not created");
    }
}
