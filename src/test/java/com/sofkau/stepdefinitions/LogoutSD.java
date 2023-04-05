package com.sofkau.stepdefinitions;

import com.sofkau.driver.IOSDriver;
import com.sofkau.question.ResultLogout;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.apache.log4j.Logger;
import static com.sofkau.tasks.InicioSesion.inicioSesion;
import static com.sofkau.tasks.Logout.logout;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class LogoutSD {


    public static Logger LOGGER = Logger.getLogger(LoginStepsDefinitions.class);

    protected Actor actor = Actor.named("User");


    @Given("User is logged in to the Saucelabs app {string} {string}")
    public void userIsLoggedInToTheSaucelabsApp(String user, String password) {
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

    @When("User clicks on the Logout button")
    public void userClicksOnTheLogoutButton() {
        try {
            actor.attemptsTo(
                    logout()
            );
            LOGGER.info("Realiza la peticion");
        } catch (Exception e) {
            LOGGER.info(" fallo al momento de realizar la peticion");
            LOGGER.warn(e.getMessage());
        }
    }

    @Then("User should be logged out and redirected to the Login page")
    public void userShouldBeLoggedOutAndRedirectedToTheLoginPage() {

        try {
            actor.should(
                    seeThat(ResultLogout.isEqualTo("The currently accepted usernames for this application are (tap to autofill):"))
            );
            LOGGER.info("CUMPLE");
        } catch (Exception e) {
            LOGGER.info(" fallo al momento de realizar la peticion");
            LOGGER.warn(e.getMessage());

        }

    }

}
