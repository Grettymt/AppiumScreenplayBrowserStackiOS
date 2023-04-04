package com.sofkau.stepdefinitions;

import com.sofkau.driver.IOSDriver;
import io.cucumber.java.en.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

import java.net.MalformedURLException;

import static com.sofkau.tasks.InicioSesion.inicioSesion;

public class LoginStepsDefinitions {


    protected Actor actor = Actor.named("User");

    @Given("User wants to buy some clothes")
    public void userWantsToBuySomeClothes() throws MalformedURLException {
        actor.can(BrowseTheWeb.with(IOSDriver.configureDriver().start()));
    }

    @When("User introduce the valid credentials {string} {string}")
    public void userIntroduceTheValidCredentials(String user, String password) {
        actor.attemptsTo(
                inicioSesion().conElUsuario(user).yconElPassword(password)

        );

    }

    @Then("User should see the Products list")
    public void userShouldSeeTheProductsList() {

    }

}
