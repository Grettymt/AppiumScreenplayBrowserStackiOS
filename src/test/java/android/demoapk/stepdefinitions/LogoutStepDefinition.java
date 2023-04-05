package android.demoapk.stepdefinitions;

import android.demoapk.driver.IOSDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

import java.net.MalformedURLException;

import static android.demoapk.tasks.LoginTask.loginTask;
import static android.demoapk.tasks.LogoutTask.logoutTask;

public class LogoutStepDefinition {
    @Given("{actor} finished their purchases")
    public void user_finished_their_purchases(Actor actor) throws MalformedURLException {
        actor.can(BrowseTheWeb.with(IOSDriver.configureDriver().start()));
        actor.attemptsTo(
                loginTask()
        );
    }

    @When("{actor} logs out from the app")
    public void user_logs_out_from_the_app(Actor actor) {
        actor.attemptsTo(
                logoutTask()
        );
    }

    @Then("{actor} should see the logout message")
    public void user_should_see_the_logout_message(Actor actor) {

    }
}
