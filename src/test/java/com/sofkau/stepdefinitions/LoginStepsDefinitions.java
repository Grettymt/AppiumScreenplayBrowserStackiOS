package com.sofkau.stepdefinitions;

import com.sofkau.driver.IOSDriver;
import com.sofkau.question.ResultadoLogin;
import io.cucumber.java.en.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.apache.log4j.Logger;
import java.net.MalformedURLException;
import static com.sofkau.tasks.InicioSesion.inicioSesion;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class LoginStepsDefinitions {


    protected Actor actor = Actor.named("User");

    public static Logger LOGGER = Logger.getLogger(LoginStepsDefinitions.class);

    @Given("User wants to buy some clothes")
    public void userWantsToBuySomeClothes() throws MalformedURLException {

        try {
            actor.can(BrowseTheWeb.with(IOSDriver.configureDriver().start()));

            LOGGER.info("INICIA LA AUTOMATIZACION");
        } catch (Exception e) {
            LOGGER.info(" fallo la configuracion inicial");
            LOGGER.warn(e.getMessage());
        }


    }

    @When("User introduce the valid credentials {string} {string}")
    public void userIntroduceTheValidCredentials(String user, String password) {
        try {
            actor.attemptsTo(
                    inicioSesion().conElUsuario(user).yconElPassword(password)
            );
            LOGGER.info("Realiza la peticion");
        } catch (Exception e) {
            LOGGER.info(" fallo al momento de realizar la peticion");
            LOGGER.warn(e.getMessage());
        }


    }

    @Then("User should see the Products list")
    public void userShouldSeeTheProductsList() {

        try {
            actor.should(
                    seeThat(ResultadoLogin.isEqualTo("PRODUCTS"))
            );
            LOGGER.info("CUMPLE");
        } catch (Exception e) {
            LOGGER.info(" fallo al momento de realizar la peticion");
            LOGGER.warn(e.getMessage());

        }

    }

}
