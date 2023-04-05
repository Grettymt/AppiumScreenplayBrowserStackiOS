package android.com.sofkau.stepdefinitions;
import android.com.sofkau.questions.ValidacionCompra;
import android.com.sofkau.driver.IOSDriver;
import android.com.sofkau.tasks.TaskLoguin;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.apache.log4j.Logger;
import java.net.MalformedURLException;
import static android.com.sofkau.tasks.TaskCompra.taskCompra;
import static org.hamcrest.CoreMatchers.containsString;

public class CompraStepsDefinitions {
    public static org.apache.log4j.Logger LOGGER = Logger.getLogger(String.valueOf(CompraStepsDefinitions.class));
    protected Actor actor = Actor.named("MELISSA");

    @Given("the user is in the app")
    public void theUserIsInTheApp() throws MalformedURLException {
        try {
            actor.can(BrowseTheWeb.with(IOSDriver.configureDriver().start()));
            LOGGER.info("Ha iniciado la automatizacion correctamente");
        } catch (MalformedURLException e) {
            LOGGER.info("Ha ocurrido un error con la configuracion de inicio");
            LOGGER.warn("Failed to start driver", e);
        }
    }
    @Given("logged in successfully with the valid credentials")
    public void loggedInSuccessfullyWithTheValidCredentials() {
        try {
            actor.attemptsTo(TaskLoguin.conLaInformacion());
            LOGGER.info("El usuario ha inciado sesion exitosamente con sus credenciales ");
        } catch (Exception e) {
            LOGGER.info("Ocurrio un error al loguearse con dichas credenciales");
            LOGGER.warn("Failed to login with valid credentials", e);
        }

    }
    @When("the user buys a product with de information {string} {string} {string}")
    public void theUserBuysAProductWithDeInformation(String name, String lastname, String zipcode) {
        try {
            actor.attemptsTo(taskCompra(name,lastname,zipcode));
            LOGGER.info("Se ha hecho la compra exitosamente ");
        } catch (Exception e) {
            LOGGER.info("Ocurrio un error haciendoel flujo de compra");
            LOGGER.warn("Failed to buy product", e);
        }

    }
    @Then("the user can validate his purchase")
    public void theUserCanValidateHisPurchase() {
        try {
            actor.should(
                    GivenWhenThen.seeThat(ValidacionCompra.isEqualTo(), containsString(String.format("THANK YOU FOR YOU ORDER")))
            );
            LOGGER.info("La asercion SI CUMPLE");
        } catch (Exception e) {
            LOGGER.info("NO CUMPLE la asercion, ocurrio un error");
            LOGGER.warn("Failed to validate purchase", e);

        }

    }
}
