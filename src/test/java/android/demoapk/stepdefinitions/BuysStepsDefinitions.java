package android.demoapk.stepdefinitions;

import android.demoapk.driver.IOSDriver;
import android.demoapk.question.ValidarCompra;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.apache.log4j.Logger;
import org.assertj.core.api.Assertions;

import static android.demoapk.tasks.AddProductTask.addProductTask;
import static android.demoapk.tasks.FormDatosTask.formDatosTask;
import static android.demoapk.tasks.LoginTask.loginTask;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.containsString;


public class BuysStepsDefinitions {
    public static Logger LOGGER = Logger.getLogger(BuysStepsDefinitions.class);
    protected Actor actor = Actor.named("User");

    @Given("User logged in with the valid credentials {string} {string}")
    public void userLoggedInWithTheValidCredentials(String user, String password) {
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

    @When("User adds a product to the cart")
    public void userAddsAProductToTheCart() {
        try {
            actor.attemptsTo(
                    addProductTask()
            );
        } catch (Exception exception) {
            LOGGER.info(" fallo al agregar productos");
            Assertions.fail(exception.getMessage(), exception);
            LOGGER.warn(exception.getMessage(), exception);
        }
    }

    @When("User enter all the shipping and billing information {string} {string} {string}")
    public void userEnterAllTheShippingAndBillingInformation(String name, String lastName, String zipCode) {
        try {
            actor.attemptsTo(
                    formDatosTask().conElName(name)
                            .conElLastName(lastName)
                            .conElZipCode(zipCode)
            );
        } catch (Exception exception) {
            LOGGER.info(" fallo al ingresar información de envio y facturación");
            Assertions.fail(exception.getMessage(), exception);
            LOGGER.warn(exception.getMessage(), exception);
        }
    }

    @Then("User should see a purchase confirmation message {string}")
    public void userShouldSeeAPurchaseConfirmationMessage(String mensaje) {
        try {
            actor.should(
                    seeThat(ValidarCompra.isEqualTo(), containsString(String.format(mensaje)))
            );
            LOGGER.info("CUMPLE");
        } catch (Exception exception) {
            LOGGER.info("Error al realizar la comparacion");
            Assertions.fail(exception.getMessage(), exception);
            LOGGER.warn(exception.getMessage(), exception);
        }
    }
}
