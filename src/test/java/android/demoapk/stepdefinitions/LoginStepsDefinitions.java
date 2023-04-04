package android.demoapk.stepdefinitions;

import android.demoapk.driver.IOSDriver;
import android.demoapk.tasks.IngresoCredencialesTask;
import io.cucumber.java.en.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.JavascriptExecutor;

import java.net.MalformedURLException;

import static android.demoapk.tasks.IngresoCredencialesTask.ingresoCredencialesTask;
import static android.demoapk.tasks.LoginTask.loginTask;

public class LoginStepsDefinitions {

    @Given("{actor} wants to buy some clothes")
    public void userWantsToBuySomeClothes(Actor actor) throws MalformedURLException {
        actor.can(BrowseTheWeb.with(IOSDriver.configureDriver().start()));
        actor.attemptsTo(
                loginTask()
        );
    }

    @When("{actor} introduce the valid credentials {word} {word}")
    public void userIntroduceTheValidCredentialsBobExampleCom(Actor actor, String username, String password) {
        IngresoCredencialesTask.usuario = username;
        IngresoCredencialesTask.password= password;
        actor.attemptsTo(
                ingresoCredencialesTask()
        );
    }

    @Then("{actor} should see the {word} list")
    public void userShouldSeeTheProductsList(Actor actor,String expectedText) {
        JavascriptExecutor jse = (JavascriptExecutor) IOSDriver.driver;
        try {

        }catch (Exception | Error e){
            jse.executeScript("browserstack_executor: {\"action\": \"setSessionStatus\", \"arguments\": {\"status\": \"failed\", \"reason\": \"No coincide el resultado\"}}");
        }


    }
}
