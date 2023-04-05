package android.com.sofkau.stepdefinitions;
import android.com.sofkau.tasks.TaskGeolocalizacion;
import android.com.sofkau.driver.IOSDriver;
import android.com.sofkau.tasks.TaskLoguin;
import android.com.sofkau.userinterface.GeolocalizacionUI;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.apache.log4j.Logger;
import java.net.MalformedURLException;


public class GeolocalizacionStepsDefinitions {
    public static org.apache.log4j.Logger LOGGER = Logger.getLogger(String.valueOf(GeolocalizacionStepsDefinitions.class));

    protected Actor actor = Actor.named("MELISSA");
    @Given("that the user has access to the APP")
    public void thatTheUserHasAccessToTheAPP() throws MalformedURLException {
        try {
            actor.can(BrowseTheWeb.with(IOSDriver.configureDriver().start()));
            LOGGER.info("Ha iniciado la automatizacion");
        } catch (MalformedURLException e) {
            LOGGER.info("Ha fallado el inicio de la automatizacion");
            LOGGER.warn("Error al iniciar el driver IOS: " + e.getMessage());

        }

    }
    @When("the user logs with credentials and navigates to the Geolocation option")
    public void theUserLogsWithCredentialsAndNavigatesToTheGeolocationOption() {
        try {
            actor.attemptsTo(
                    TaskLoguin.conLaInformacion(),
                    TaskGeolocalizacion.taskGeolocalizacion()
            );
            LOGGER.info("Se ha validado el inicio de sesion y la navegacion hacia la Geolocalizacion");
        } catch (Exception e) {
            LOGGER.info("La validacion de credenciales y/o de la navegacion ha fallado");
            LOGGER.warn("Error al realizar el login y navegar a la opción de geolocalización: " + e.getMessage());
        }
    }
    @Then("the user should see his geolocation data correctly")
    public void theUserShouldSeeHisGeolocationDataCorrectly() {
        try {
            if (GeolocalizacionUI.CAMPO_VALIDACION1.resolveFor(actor).isPresent() &&
                    GeolocalizacionUI.CAMPO_VALIDACION2.resolveFor(actor).isPresent()) {
                LOGGER.info("Se ha validado la geolocalización correctamente, SI CUMPLE ");
            } else {
                LOGGER.info("No se ha validado la geolocalizacion,no se encontro el boton de validacion");
                LOGGER.warn("No se encontró el botón de confirmación.");
            }
        } catch (Exception e) {
            LOGGER.info("Ocurrio un error al verificar la validacion de la geolocalizacion");
            LOGGER.warn("Error al verificar la validacion de geolocalización: " + e.getMessage());
        }


    }


}
