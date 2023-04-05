package com.sofkau.stepdefinitions;

import com.sofkau.driver.IOSDriver;
import com.sofkau.question.ResultadoCompra;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.apache.log4j.Logger;

import static com.sofkau.tasks.DatosComprar.datosComprador;
import static com.sofkau.tasks.InicioSesion.inicioSesion;
import static com.sofkau.tasks.MenuProducto.menuProducto;
import static com.sofkau.tasks.TerminarCompra.terminarCompra;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.CoreMatchers.containsString;

public class BuysSD {


    public static Logger LOGGER = Logger.getLogger(LoginStepsDefinitions.class);

    protected Actor actor = Actor.named("User");


    @Given("User is logged in to Swag app with valid credentials {string} {string}")
    public void userIsLoggedInToSwagAppWithValidCredentials(String user, String password) {
        try {
            actor.can(BrowseTheWeb.with(IOSDriver.configureDriver().start()));
            actor.attemptsTo(
                    inicioSesion().conElUsuario(user).yconElPassword(password)
            );
            LOGGER.info("INICIA LA AUTOMATIZACION");
        } catch (Exception e) {
            LOGGER.info(" fallo la configuracion inicial");
            LOGGER.warn(e.getMessage());
        }

    }

    @When("User adds a product to the cart and completes their personal information {string} {string} {string} and proceeds to checkout")
    public void userAddsAProductToTheCartAndCompletesTheirPersonalInformationAndProceedsToCheckout(String nombre, String apellido, String codigo) {
        try {

            actor.attemptsTo(
                    menuProducto(),
                    datosComprador().conElUsuario(nombre).yconElApallido(apellido).yconElCodigo(codigo),
                    terminarCompra()
            );
            LOGGER.info("Realiza la peticion");
        } catch (Exception e) {
            LOGGER.info(" fallo la peticion");
            LOGGER.warn(e.getMessage());
        }

    }

    @Then("User should see a {string} message.")
    public void userShouldSeeAMessage(String mensaje) {
        try {
            actor.should(
                    seeThat(ResultadoCompra.isEqualTo(), containsString((mensaje)))
            );
            LOGGER.info("CUMPLE");
        } catch (Exception e) {
            LOGGER.info(" fallo al momento de realizar la peticion");
            LOGGER.warn(e.getMessage());

        }


    }


}
