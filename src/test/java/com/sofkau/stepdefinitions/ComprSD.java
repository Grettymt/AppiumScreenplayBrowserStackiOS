package com.sofkau.stepdefinitions;

import com.sofkau.driver.IOSDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.apache.log4j.Logger;

import static com.sofkau.tasks.DatosComprar.datosComprador;
import static com.sofkau.tasks.InicioSesion.inicioSesion;
import static com.sofkau.tasks.MenuProducto.menuProducto;

public class ComprSD {


    public static Logger LOGGER = Logger.getLogger(LoginStepsDefinitions.class);

    protected Actor actor = Actor.named("User");


    @Given("User inicio sesion en app de swag {string} {string}")
    public void userInicioSesionEnAppDeSwag(String user, String password) {
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

    @When("User usuario agrega el producto al carrito y procede a comprarlo")
    public void userUsuarioAgregaElProductoAlCarritoYProcedeAComprarlo() {
        try {

            actor.attemptsTo(
                menuProducto(),
                    datosComprador().conElUsuario("yeison").yconElApallido("ferney").yconElCodigo("45463")
            );

            LOGGER.info("INICIA LA AUTOMATIZACION");
        } catch (Exception e) {
            LOGGER.info(" fallo la configuracion inicial");
            LOGGER.warn(e.getMessage());
        }

    }

    @Then("User usuario debera ver un mensaje gracias por tu compra")
    public void userUsuarioDeberaVerUnMensajeGraciasPorTuCompra() {


    }


}
