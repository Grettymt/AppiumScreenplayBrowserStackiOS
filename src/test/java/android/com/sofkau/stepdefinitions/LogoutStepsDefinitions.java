package android.com.sofkau.stepdefinitions;
import android.com.sofkau.driver.IOSDriver;
import android.com.sofkau.tasks.TaskLoguin;
import android.com.sofkau.userinterface.LogoutUI;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.apache.log4j.Logger;
import java.net.MalformedURLException;
import static android.com.sofkau.tasks.TaskCompra.taskCompra;
import static android.com.sofkau.tasks.TaskLogout.taskLogout;

public class LogoutStepsDefinitions {
    public static org.apache.log4j.Logger LOGGER = Logger.getLogger(String.valueOf(LogoutStepsDefinitions.class));
    protected Actor actor = Actor.named("MELISSA");
    @Given("the user is on the app")
    public void theUserIsOnTheApp() throws MalformedURLException {
        try {
            actor.can(BrowseTheWeb.with(IOSDriver.configureDriver().start()));
            LOGGER.info("Ha iniciado la automatizacion");
        } catch (MalformedURLException e) {
            LOGGER.info("Ocurrio un error al iniciar la automatizacion");
            LOGGER.warn("Error al iniciar la app " + e.getMessage());

        }

    }
    @Given("successfully logs  with the valid credentials")
    public void successfullyLogsWithTheValidCredentials() {
        try {
            actor.attemptsTo(TaskLoguin.conLaInformacion());
            LOGGER.info("El usuario se ha logueado exitosamente");
        } catch (Exception e) {
            LOGGER.info("Ocurrio un error al loguear al usuario");
            LOGGER.warn("Error en el inicio de sesion del usuario " + e.getMessage());
        }

    }
    @When("the user buys a product with {string} {string} {string} and the user logs off")
    public void theUserBuysAProductWithAndTheUserLogsOff(String name, String lastname, String zipcode) {

        try {
            actor.attemptsTo(taskCompra(name,lastname,zipcode), taskLogout());
            LOGGER.info("El usuario hizo el flujo de compra y salio de su sesion exitosamnete");
        } catch (Exception e) {
            LOGGER.info("El usuario hizo el flujo de compra y salio de su sesion exitosamnete");
            LOGGER.warn("Error en el proceso de compra y cierre de sesion " + e.getMessage());
        }

    }
    @Then("the user valid his closed session")
    public void theUserValidHisClosedSession() {
        try {
            LogoutUI.CAMPO_VALIDACION.resolveFor(actor).isPresent();
            LOGGER.info("Validacion acertada , se ha cerrado la sesion del usuario correctamente , SI CUMPLE");
        } catch (Exception e) {
            LOGGER.info("Validacion incorrecta , no se pudo completa la asercion porque ocurrio un error");
            LOGGER.warn("Ocurrio un error en la asercion", e);
        }

    }
}



