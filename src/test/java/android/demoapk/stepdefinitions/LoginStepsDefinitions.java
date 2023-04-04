package android.demoapk.stepdefinitions;


import android.demoapk.driver.IOSDriver;
import android.demoapk.setup.SetUp;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.JavascriptExecutor;

import static android.demoapk.tasks.LogOut.logOut;


public class LoginStepsDefinitions extends SetUp {

    @Given("User wants to buy some clothes")
    public void userWantsToBuySomeClothes() {
        try {
            actor.can(BrowseTheWeb.with(IOSDriver.configureDriver().start()));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    @When("User introduce the valid credentials {string} {string}")
    public void userIntroduceTheValidCredentials(String userName, String password) {
        actor.attemptsTo(
                logOut()
        );
    }
    @Then("User should see the Products list")
    public void userShouldSeeTheProductsList() {
        JavascriptExecutor jse = (JavascriptExecutor) IOSDriver.driver;
        try {

        }catch (Exception | Error e){
            jse.executeScript("browserstack_executor: {\"action\": \"setSessionStatus\", \"arguments\": {\"status\": \"failed\", \"reason\": \"No coincide el resultado\"}}");
        }
    }
}
