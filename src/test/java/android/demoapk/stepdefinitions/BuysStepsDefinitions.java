package android.demoapk.stepdefinitions;

import android.demoapk.driver.IOSDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

import java.net.MalformedURLException;

public class BuysStepsDefinitions {
    protected Actor actor = Actor.named("User");

    @Given("User logged in with the valid credentials {string} {string}")
    public void userLoggedInWithTheValidCredentials(String email, String password) throws MalformedURLException {
        actor.can(BrowseTheWeb.with(IOSDriver.configureDriver().start()));
    }
    @When("User adds a product to the cart")
    public void userAddsAProductToTheCart() {

    }
    @When("User enter all the shipping and billing information")
    public void userEnterAllTheShippingAndBillingInformation() {

    }
    @Then("User should see a purchase confirmation message")
    public void userShouldSeeAPurchaseConfirmationMessage() {

    }

}
