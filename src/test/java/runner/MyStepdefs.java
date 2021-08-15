package runner;

import io.cucumber.java.DataTableType;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;
import java.util.Map;

public class MyStepdefs {
    /***
     * {int} ----> entero/ numerico
     * {string} ---->  "cualquier valor"
     * {} -----> cualquier valor
     * {float}
     * {word}
     */

    @Given("tengo un usuario {string}")
    public void tengoUnUsuarioAdministrador(String tipoUsuario) {

    }

    @And("tengo abierto facebook app")
    public void tengoAbiertoFacebookApp() {
    }

    @When("yo ingreso mi {} en la caja de texto usuario")
    public void yoIngresoMiUcbUcbComEnLaCajaDeTextoUsuario(String email) {
    }

    @And("yo ingreso mi {} en la caja de texto password")
    public void yoIngresoMiPwdEnLaCajaDeTextoPassword(String pwd) {
    }

    @And("yo hago click en el boton login")
    public void yoHagoClickEnElBotonLogin() {
    }

    @Then("yo deberia de ingresar a faccebook")
    public void yoDeberiaDeIngresarAFaccebook() {
    }

    @When("yo realizo el login a la app")
    public void yoRealizoElLoginALaApp(Map<String, String> textBoxes) {
        for (String key: textBoxes.keySet()
             ) {
            System.out.println("key: " + key + " value: " + textBoxes.get(key));
        }
    }

    @When("yo realizo el login en la app")
    public void yoRealizoElLoginEnLaApp(List<FormularioLogin> login) {
    }
    @DataTableType()
    public FormularioLogin covertMap (Map<String,String> value){
        return new FormularioLogin(value.get("email"),value.get("password"));

    }
}
