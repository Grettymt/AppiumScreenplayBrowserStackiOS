package android.demoapk.stepdefinitions;

import android.demoapk.driver.IOSDriver;
import android.demoapk.question.ValidarLogin;
import io.cucumber.java.en.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.apache.log4j.Logger;
import org.assertj.core.api.Assertions;


import java.net.MalformedURLException;

import static android.demoapk.tasks.LoginTask.loginTask;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.containsString;

public class LoginStepsDefinitions {
    public static Logger LOGGER = Logger.getLogger(LoginStepsDefinitions.class);
    protected Actor actor = Actor.named("User");

    @Given("User wants to buy some clothes")
    public void userWantsToBuySomeClothes() throws MalformedURLException {
        try {
            LOGGER.info("INICIA LA AUTOMATIZACION");
            actor.can(BrowseTheWeb.with(IOSDriver.configureDriver().start()));

        }catch (Exception exception){
            LOGGER.info(" fallo la configuracion inicial");
            Assertions.fail(exception.getMessage(), exception);
            LOGGER.warn(exception.getMessage(), exception);

        }
    }
    @When("User introduce the valid credentials {string} {string}")
    public void userIntroduceTheValidCredentials(String user, String password) {
        try {
            actor.attemptsTo(
                    loginTask().conElUsuario(user)
                            .conelPassword(password)
            );
        }catch (Exception exception){
            LOGGER.info(" fallo en el incio de sesión");
            Assertions.fail(exception.getMessage(), exception);
            LOGGER.warn(exception.getMessage(), exception);

        }
    }
    @Then("User should see the Products list")
    public void userShouldSeeTheProductsList() {
        try {
            actor.should(
                    seeThat(ValidarLogin.isEqualTo(), containsString(String.format("PRODUCTS")))
            );
            LOGGER.info("CUMPLE");
        }catch (Exception exception){
            LOGGER.info("Error al realizar la comparacion");
            Assertions.fail(exception.getMessage(), exception);
            LOGGER.warn(exception.getMessage(), exception);
        }
    }


}
