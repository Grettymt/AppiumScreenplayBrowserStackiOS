package android.demoapk.stepdefinitions;

import android.demoapk.driver.IOSDriver;
import android.demoapk.tasks.IngresoCredencialesTask;
import io.cucumber.java.en.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.assertj.core.api.Assertions;
import org.openqa.selenium.JavascriptExecutor;

import java.net.MalformedURLException;
import java.util.logging.Logger;

import static android.demoapk.tasks.IngresoCredencialesTask.ingresoCredencialesTask;
import static android.demoapk.tasks.LoginTask.loginTask;

public class LoginStepsDefinitions {
    public static java.util.logging.Logger LOGGER = Logger.getLogger(String.valueOf(LoginStepsDefinitions.class));

    @Given("{actor} wants to buy some clothes")
    public void userWantsToBuySomeClothes(Actor actor) throws MalformedURLException {
        LOGGER.info("Incia Step: ");
        try {
            actor.can(BrowseTheWeb.with(IOSDriver.configureDriver().start()));
            actor.attemptsTo(
                    loginTask()
            );
            LOGGER.info("Finaliza satisfactoriamente el Step: ");
        }catch (Exception e){
            LOGGER.info("Fallo en el step: ");
            LOGGER.warning(e.getMessage());
        }
    }

    @When("{actor} introduce the valid credentials {word} {word}")
    public void userIntroduceTheValidCredentialsBobExampleCom(Actor actor, String username, String password) {
        LOGGER.info("Incia Step: ");
        IngresoCredencialesTask.usuario = username;
        IngresoCredencialesTask.password= password;
        try {
            actor.attemptsTo(
                    ingresoCredencialesTask()
            );
            LOGGER.info("Finaliza satisfactoriamente el Step: ");
        } catch (Exception e){
            LOGGER.info("Fallo en el step: ");
            LOGGER.warning(e.getMessage());

        }

    }

    @Then("{actor} should see the {word} list")
    public void userShouldSeeTheProductsList(Actor actor,String expectedText) {
        LOGGER.info("Incia Step: ");
        JavascriptExecutor jse = (JavascriptExecutor) IOSDriver.driver;
        try {
            LOGGER.info("Finaliza satisfactoriamente el Step: ");

        }catch(AssertionError e){
            Assertions.fail(e.getMessage());
            LOGGER.info("Fallo en el step: ");
            LOGGER.warning(e.getMessage());
        }


    }
}
