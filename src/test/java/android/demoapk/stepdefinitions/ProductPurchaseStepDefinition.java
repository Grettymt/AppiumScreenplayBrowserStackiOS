package android.demoapk.stepdefinitions;

import android.demoapk.driver.IOSDriver;
import android.demoapk.questions.CompraProductoQuestion;
import android.demoapk.tasks.IngresoCredencialesTask;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.assertj.core.api.Assertions;

import java.net.MalformedURLException;
import java.util.logging.Logger;

import static org.hamcrest.Matchers.containsString;
import static android.demoapk.tasks.CompraProductoTask.compraProductoTask;
import static android.demoapk.tasks.DatosClienteTask.datosClienteTask;
import static android.demoapk.tasks.DatosTarjetaTask.datosTarjetaTask;
import static android.demoapk.tasks.IngresoCredencialesTask.ingresoCredencialesTask;
import static android.demoapk.tasks.LoginTask.loginTask;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class ProductPurchaseStepDefinition {
    public static java.util.logging.Logger LOGGER = Logger.getLogger(String.valueOf(LoginStepsDefinitions.class));

    @Given("{actor} wants to buy clothes")
    public void user_wants_to_buy_clothes(Actor actor) throws MalformedURLException {
        LOGGER.info("Incia Step: user wants to buy clothes");
        try {
            actor.can(BrowseTheWeb.with(IOSDriver.configureDriver().start()));
            actor.attemptsTo(
                    loginTask()
            );
            LOGGER.info("Finaliza satisfactoriamente el Step: user wants to buy clothes");
        } catch (Exception e){
            LOGGER.info("Fallo en el step: user wants to buy clothes");
            LOGGER.warning(e.getMessage());
        }
    }

    @Given("{actor} introduce the credentials {word} {word}")
    public void userIntroduceTheCredentialsBobExampleCom(Actor actor, String username, String password) {
        LOGGER.info("Incia Step: user introduce the credentials");
        try {
            IngresoCredencialesTask.usuario = username;
            IngresoCredencialesTask.password = password;
            actor.attemptsTo(
                    ingresoCredencialesTask()
            );
            LOGGER.info("Finaliza satisfactoriamente el Step: user introduce the credentials");
        } catch (Exception e){
            LOGGER.info("Fallo en el step: user introduce the credentials");
            LOGGER.warning(e.getMessage());
        }

    }

    @When("{actor} selects the cheapest item to buy")
    public void user_selects_the_cheapest_item_to_buy(Actor actor) {
        LOGGER.info("Incia Step: user selects the cheapest item to buy");
        try {
            actor.attemptsTo(
                    compraProductoTask(),
                    datosClienteTask(),
                    datosTarjetaTask()
            );
            LOGGER.info("Finaliza satisfactoriamente el Step: user selects the cheapest item to buy");
        } catch(Exception e){
            LOGGER.info("Fallo en el step: user selects the cheapest item to buy");
            LOGGER.warning(e.getMessage());
        }
    }

    @Then("{actor} should see a confirmation message of the purchase")
    public void user_should_see_a_confirmation_message_of_the_purchase(Actor actor) {
        LOGGER.info("Incia Step: user should see a confirmation message of the purchase");
        try {
            LOGGER.info("Finaliza satisfactoriamente el Step: user should see a confirmation message of the purchase");
            actor.should(
                    seeThat(CompraProductoQuestion.isEqualTo(),containsString("Thank you for your order"))
            );
        } catch (AssertionError e) {
            Assertions.fail(e.getMessage());
            LOGGER.info("Fallo en el step: user should see a confirmation message of the purchase");
            LOGGER.warning(e.getMessage());
        }
    }
}