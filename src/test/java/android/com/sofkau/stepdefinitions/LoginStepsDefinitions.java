package android.com.sofkau.stepdefinitions;
import android.com.sofkau.driver.IOSDriver;
import android.com.sofkau.questions.ValidacionLoguinUser;
import android.com.sofkau.tasks.TaskLoguin;
import io.cucumber.java.en.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.apache.log4j.Logger;
import java.net.MalformedURLException;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.CoreMatchers.containsString;


public class LoginStepsDefinitions {
    public static org.apache.log4j.Logger LOGGER = Logger.getLogger(String.valueOf(LoginStepsDefinitions.class));
    protected Actor actor = Actor.named("MELISSA");
    @Given("User wants to buy some clothes")
    public void userWantsToBuySomeClothes() throws MalformedURLException {
        try {
            actor.can(BrowseTheWeb.with(IOSDriver.configureDriver().start()));
            LOGGER.info("Se ha iniciado la automatizacion ");
        } catch (MalformedURLException e) {
            LOGGER.info("Ocurrio un error iniciando la automatizacion");
            LOGGER.error("Error al intentar acceder a la app", e);

        }

    }
    @When("User introduce the valid credentials")
    public void userIntroduceTheValidCredentials() {
        try {
            actor.attemptsTo(TaskLoguin.conLaInformacion());
            LOGGER.info("El usuario inicio sesion correctamente");
        } catch (Exception e) {
            LOGGER.info("El usuario no pudo iniciar sesion , ha ocurrido un error");
            LOGGER.warn("Error al intentar ingresar las credenciales", e);
        }
    }
    @Then("User should see the Products list")
    public void userShouldSeeTheProductsList() {
        try {
            actor.should(
                    seeThat(ValidacionLoguinUser.isEqualTo(), containsString(String.format("PRODUCTS")))
            );

            LOGGER.info("Se ha validado correctamente la automatizacion , SI CUMPLE");
        } catch (Exception e) {
            LOGGER.info("No cumple la asercion ");
            LOGGER.warn("No se encontro el boton de validacion", e);
            throw new AssertionError("No se encontro el boton de validacion", e);
        }



    }

}





