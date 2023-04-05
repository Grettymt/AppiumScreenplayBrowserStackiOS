package android.demoapk.stepdefinitions;

import android.demoapk.driver.IOSDriver;
import android.demoapk.question.ValidarLogout;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.apache.log4j.Logger;
import org.assertj.core.api.Assertions;

import static android.demoapk.tasks.LoginTask.loginTask;
import static android.demoapk.tasks.LogoutTask.logoutTask;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.containsString;

public class LogoutStepsDefinitions {
    public static Logger LOGGER = Logger.getLogger(LogoutStepsDefinitions.class);
    protected Actor actor = Actor.named("User");

    @Given("User is logged in on the main page with valid credentials {string} {string}")
    public void userIsLoggedInOnTheMainPageWithValidCredentials(String user, String password) {
        try {
            LOGGER.info("INICIA LA AUTOMATIZACION");
            actor.can(BrowseTheWeb.with(IOSDriver.configureDriver().start()));

            actor.attemptsTo(
                    loginTask().conElUsuario(user)
                            .conelPassword(password)
            );

        } catch (Exception exception) {
            LOGGER.info(" fallo la configuracion inicial");
            Assertions.fail(exception.getMessage(), exception);
            LOGGER.warn(exception.getMessage(), exception);

        }
    }

    @When("the user navigates to the logout button")
    public void theUserNavigatesToTheLogoutButton() {
        try {
            actor.attemptsTo(
                    logoutTask()
            );
        } catch (Exception exception) {
            LOGGER.info(" fallo en el logout");
            Assertions.fail(exception.getMessage(), exception);
            LOGGER.warn(exception.getMessage(), exception);

        }
    }

    @Then("the user will be redirected to the login page")
    public void theUserWillBeRedirectedToTheLoginPage() {
        try {
            actor.should(
                    seeThat(ValidarLogout.isEqualTo(), containsString(String.format("Username")))
            );
            LOGGER.info("CUMPLE");
        } catch (Exception exception) {
            LOGGER.info("Error al realizar la comparacion");
            Assertions.fail(exception.getMessage(), exception);
            LOGGER.warn(exception.getMessage(), exception);

        }
    }


}
