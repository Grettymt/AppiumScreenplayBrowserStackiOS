package android.demoapk.stepdefinitions;

import android.demoapk.driver.IOSDriver;
import android.demoapk.questions.CompraProductoQuestion;
import android.demoapk.questions.LogoutQuestion;
import android.demoapk.tasks.IngresoCredencialesTask;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.assertj.core.api.Assertions;

import java.net.MalformedURLException;
import java.util.logging.Logger;

import static android.demoapk.tasks.IngresoCredencialesTask.ingresoCredencialesTask;
import static android.demoapk.tasks.LoginTask.loginTask;
import static android.demoapk.tasks.LogoutTask.logoutTask;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.containsString;

public class LogoutStepDefinition {
    public static java.util.logging.Logger LOGGER = Logger.getLogger(String.valueOf(LoginStepsDefinitions.class));

    @Given("{actor} finished their purchases")
    public void user_finished_their_purchases(Actor actor) throws MalformedURLException {
        LOGGER.info("Incia Step: user finished their purchases");
        try {
            actor.can(BrowseTheWeb.with(IOSDriver.configureDriver().start()));
            actor.attemptsTo(
                    loginTask()
            );
            LOGGER.info("Finaliza satisfactoriamente el Step: user finished their purchases");
        } catch (Exception e) {
            LOGGER.info("Fallo en el step: user finished their purchases");
            LOGGER.warning(e.getMessage());
        }
    }

    @Given("{actor} use the credentials {word} {word}")
    public void userUseTheCredentialsBobExampleCom(Actor actor, String username, String password) {
        LOGGER.info("Incia Step: user use the credentials");
        try {
            IngresoCredencialesTask.usuario = username;
            IngresoCredencialesTask.password = password;
            actor.attemptsTo(
                    ingresoCredencialesTask()
            );
            LOGGER.info("Finaliza satisfactoriamente el Step: user use the credentials");
        } catch (Exception e) {
            LOGGER.info("Fallo en el step: user use the credentials");
            LOGGER.warning(e.getMessage());
        }
    }

    @When("{actor} logs out from the app")
    public void user_logs_out_from_the_app(Actor actor) {
        LOGGER.info("Incia Step: user logs out from the app");
        try {
            actor.attemptsTo(
                    logoutTask()
            );
            LOGGER.info("Finaliza satisfactoriamente el Step: user logs out from the app");
        } catch (Exception e) {
            LOGGER.info("Fallo en el step: user logs out from the app");
            LOGGER.warning(e.getMessage());
        }
    }

    @Then("{actor} should see the logout message")
    public void user_should_see_the_logout_message(Actor actor) {
        LOGGER.info("Incia Step: user should see the logout message");
        try {
            LOGGER.info("Finaliza satisfactoriamente el Step: user should see the logout message");
            actor.should(
                    seeThat(
                            LogoutQuestion.isEqualTo(),containsString("OK"))
            );
        } catch (AssertionError e) {
            Assertions.fail(e.getMessage());
            LOGGER.info("Fallo en el step: user should see the logout message");
            LOGGER.warning(e.getMessage());
        }

    }
}
