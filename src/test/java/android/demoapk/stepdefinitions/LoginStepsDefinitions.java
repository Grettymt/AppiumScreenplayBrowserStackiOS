package android.demoapk.stepdefinitions;

import android.demoapk.driver.IOSDriver;
import android.demoapk.questions.LogInQuestion;
import android.demoapk.tasks.IngresoCredencialesTask;
import io.cucumber.java.en.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.assertj.core.api.Assertions;

import java.net.MalformedURLException;
import java.util.logging.Logger;

import static android.demoapk.tasks.IngresoCredencialesTask.ingresoCredencialesTask;
import static android.demoapk.tasks.LoginTask.loginTask;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.containsString;

public class LoginStepsDefinitions {
    public static java.util.logging.Logger LOGGER = Logger.getLogger(String.valueOf(LoginStepsDefinitions.class));

    @Given("{actor} wants to buy some clothes")
    public void userWantsToBuySomeClothes(Actor actor) throws MalformedURLException {
        LOGGER.info("Incia Step: user wants to buy some clothes");
        try {
            actor.can(BrowseTheWeb.with(IOSDriver.configureDriver().start()));
            actor.attemptsTo(
                    loginTask()
            );
            LOGGER.info("Finaliza satisfactoriamente el Step: user wants to buy some clothes");
        } catch (Exception e) {
            LOGGER.info("Fallo en el step: user wants to buy some clothes");
            LOGGER.warning(e.getMessage());
        }
    }

    @When("{actor} introduce the valid credentials {word} {word}")
    public void userIntroduceTheValidCredentialsBobExampleCom(Actor actor, String username, String password) {
        LOGGER.info("Incia Step: user introduce the valid credentials");
        IngresoCredencialesTask.usuario = username;
        IngresoCredencialesTask.password = password;
        try {
            actor.attemptsTo(
                    ingresoCredencialesTask()
            );
            LOGGER.info("Finaliza satisfactoriamente el Step: user introduce the valid credentials");
        } catch (Exception e) {
            LOGGER.info("Fallo en el step: user introduce the valid credentials");
            LOGGER.warning(e.getMessage());

        }

    }

    @Then("{actor} should see the {word} list")
    public void userShouldSeeTheProductsList(Actor actor, String expectedText) {
        LOGGER.info("Incia Step: user should see the product");
        try {
            LOGGER.info("Finaliza satisfactoriamente el Step: user should see the product");
            actor.should(
                    seeThat(LogInQuestion.isEqualTo(),containsString(expectedText))
            );
        } catch (AssertionError e) {
            Assertions.fail(e.getMessage());
            LOGGER.info("Fallo en el step: user should see the product");
            LOGGER.warning(e.getMessage());
        }


    }
}
