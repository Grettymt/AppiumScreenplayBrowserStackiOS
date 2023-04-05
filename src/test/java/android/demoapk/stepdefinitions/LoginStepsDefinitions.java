package android.demoapk.stepdefinitions;

import android.demoapk.setup.SetUp;
import io.cucumber.java.en.*;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.JavascriptExecutor;

import static android.demoapk.driver.IOSDriver.DRIVER;
import static android.demoapk.questions.Productos.productos;
import static android.demoapk.tasks.login.ElegirLogin.elegirLogin;
import static android.demoapk.tasks.login.ElegirMenu.elegirMenu;
import static android.demoapk.tasks.login.FinalizarLogin.finalizarLogin;
import static android.demoapk.tasks.login.IngresarContrasenna.ingresarContrasenna;
import static android.demoapk.tasks.login.IngresarUsuario.ingresarUsuario;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.containsString;

public class LoginStepsDefinitions extends SetUp {
    public static Logger LOGGER = Logger.getLogger(LoginStepsDefinitions.class);

    @Given("user wants to buy some clothes")
    public void userWantsToBuySomeClothes(){
        try{
            configurarCelular();
            LOGGER.info("Inicia la automatizacion");
        }catch (Exception e){
            LOGGER.info("Fallo la configuracion");
            LOGGER.warn(e.getMessage());
            Assertions.fail();
            quitarDriver();
        }
    }

    @When("introduce the valid credentials {word} {word}")
    public void userIntroduceTheValidCredentialsBobExampleCom(String username, String password) {
        try {
            ACTOR.attemptsTo(
                    elegirMenu(),
                    elegirLogin(),
                    ingresarUsuario().conElUsuario(username),
                    ingresarContrasenna().conLaContrasenna(password),
                    finalizarLogin()
            );
            LOGGER.info("Se inicia sesion");
        }catch (Exception e){
            LOGGER.info("Fallo el inicio de sesion");
            LOGGER.warn(e.getMessage());
            Assertions.fail();
            quitarDriver();
        }
    }

    @Then("should see the {word} list")
    public void userShouldSeeTheProductsList(String expectedText) {
        JavascriptExecutor jse = DRIVER;
        try {
            ACTOR.should(
                    seeThat(productos(),containsString(expectedText))
            );
            LOGGER.info("Se compara el mensaje");
        }catch (Exception | Error e){
            jse.executeScript("browserstack_executor: {\"action\": \"setSessionStatus\", \"arguments\": {\"status\": \"failed\", \"reason\": \"No coincide el resultado\"}}");
        }finally {
            quitarDriver();
        }
    }
}
