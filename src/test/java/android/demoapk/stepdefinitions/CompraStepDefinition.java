package android.demoapk.stepdefinitions;

import android.demoapk.setup.SetUp;
import io.cucumber.java.en.*;
public class CompraStepDefinition extends SetUp{
    @When("user selects the product")
    public void userSelectsTheProduct() {
        ACTOR.attemptsTo(

        );
    }

    @And("finishes the buying process")
    public void finishesTheBuyingProcess() {
    }

    @Then("shows the checkout page")
    public void showsTheCheckoutPage() {
    }
}
