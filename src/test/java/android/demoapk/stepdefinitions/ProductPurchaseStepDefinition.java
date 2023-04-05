package android.demoapk.stepdefinitions;

import android.demoapk.driver.IOSDriver;
import android.demoapk.tasks.IngresoCredencialesTask;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

import java.net.MalformedURLException;

import static android.demoapk.tasks.CompraProductoTask.compraProductoTask;
import static android.demoapk.tasks.DatosClienteTask.datosClienteTask;
import static android.demoapk.tasks.DatosTarjetaTask.datosTarjetaTask;
import static android.demoapk.tasks.IngresoCredencialesTask.ingresoCredencialesTask;
import static android.demoapk.tasks.LoginTask.loginTask;

public class ProductPurchaseStepDefinition {
    @Given("{actor} wants to buy clothes")
    public void user_wants_to_buy_clothes(Actor actor) throws MalformedURLException {
        actor.can(BrowseTheWeb.with(IOSDriver.configureDriver().start()));
        actor.attemptsTo(
                loginTask()
        );
    }

    @Given("{actor} introduce the credentials {word} {word}")
    public void userIntroduceTheCredentialsBobExampleCom(Actor actor, String username, String password) {
        IngresoCredencialesTask.usuario = username;
        IngresoCredencialesTask.password = password;
        actor.attemptsTo(
                ingresoCredencialesTask()
        );
    }

    @When("{actor} selects the cheapest item to buy")
    public void user_selects_the_cheapest_item_to_buy(Actor actor) {
        actor.attemptsTo(
                compraProductoTask(),
                datosClienteTask(),
                datosTarjetaTask()
        );
    }

    @Then("{actor} should see a confirmation message of the purchase")
    public void user_should_see_a_confirmation_message_of_the_purchase(Actor actor) {

    }
}
