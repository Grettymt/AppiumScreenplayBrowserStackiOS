package android.demoapk.stepdefinitions;


import android.demoapk.driver.IOSDriver;
import android.demoapk.questions.MensajeInicioSesion;
import android.demoapk.setup.SetUp;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.apache.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;

import static android.demoapk.tasks.LogOut.logOut;
import static android.demoapk.tasks.Login.login;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;


public class LoginStepsDefinitions extends SetUp {

    public static Logger LOGGER= Logger.getLogger(LoginStepsDefinitions.class);

    @Given("User wants to buy some clothes")
    public void userWantsToBuySomeClothes() {
        try {
            actor.can(BrowseTheWeb.with(IOSDriver.configureDriver().start()));
            LOGGER.info("Automatizacion iniciada");
        } catch (Exception e) {
            LOGGER.warn(e.getMessage());
            LOGGER.warn("Fallo en la automatizacion");
        }
    }
    @When("User introduce the valid credentials {string} {string}")
    public void userIntroduceTheValidCredentials(String userName, String password) {
        try {
            actor.attemptsTo(
                    logOut(),
                    login()
                            .conElUser(userName)
                            .yLaPassword(password)
            );
            LOGGER.info("Sesion iniciada");
        } catch (Exception e){
            LOGGER.warn(e.getMessage());
            LOGGER.warn("Fallo iniciando sesion");
        }
    }
    @Then("User should see the Products list")
    public void userShouldSeeTheProductsList() {
        JavascriptExecutor jse = (JavascriptExecutor) IOSDriver.driver;
        try {
            actor.should(
                    seeThat("Comparacion de titulos",
                            MensajeInicioSesion.isEqualTo(),
                            equalTo("Products"))
            );
            LOGGER.info("Asercion exitosa");
        }catch (Exception | Error e){
            jse.executeScript("browserstack_executor: {\"action\": \"setSessionStatus\", \"arguments\": {\"status\": \"failed\", \"reason\": \"No coincide el resultado\"}}");
        }
    }
}
