package android.demoapk.stepdefinitions;

import android.demoapk.driver.IOSDriver;
import android.demoapk.questions.RespuestaCompra;
import android.demoapk.questions.RespuestaLogin;
import android.demoapk.questions.RespuestaLogout;
import android.demoapk.tasks.CredencialesLogin;
import android.demoapk.tasks.FlujoALogin;
import android.demoapk.tasks.FlujoSeleccionProducto;
import com.ibm.icu.impl.Assert;
import io.cucumber.java.en.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.assertj.core.api.Assertions;
import org.openqa.selenium.JavascriptExecutor;

import java.net.MalformedURLException;
import java.util.logging.Logger;

import static android.demoapk.tasks.CredencialesLogin.credencialesLogin;
import static android.demoapk.tasks.FlujoALogin.flujoALogin;
import static android.demoapk.tasks.FlujoCompraCompleto.flujoCompraCompleto;
import static android.demoapk.tasks.FlujoSeleccionProducto.flujoSeleccionProducto;
import static android.demoapk.tasks.Logout.logout;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.containsString;

public class LoginStepsDefinitions {
    public static java.util.logging.Logger LOGGER = Logger.getLogger(String.valueOf(LoginStepsDefinitions.class));

    @Given("{actor} wants to buy some clothes")
    public void userWantsToBuySomeClothes(Actor actor) throws MalformedURLException {
        try {
            actor.can(BrowseTheWeb.with(IOSDriver.configureDriver().start()));
            actor.attemptsTo(
                    flujoALogin()
            );
        }catch (Exception e){
            LOGGER.warning(e.getMessage());
        }

    }

    @When("{actor} introduce the valid credentials {word} {word}")
    public void userIntroduceTheValidCredentialsBobExampleCom(Actor actor, String username, String password) {
        CredencialesLogin.user=username;
        CredencialesLogin.contra=password;
        try {
            actor.attemptsTo(
                    credencialesLogin()
            );
        }catch (Exception e){
            LOGGER.warning(e.getMessage());
        }

    }

    @Then("{actor} should see the {word} list")
    public void userShouldSeeTheProductsList(Actor actor,String expectedText) {
        try {
            actor.should(
                    seeThat(RespuestaLogin.isEqualTo(), containsString(expectedText))
            );
        }catch (Exception e){
            LOGGER.warning(e.getMessage());
        }

        
    }

//_____________________________________________________________________________________________
    @When("{actor} navega y presiona el boton logout")
    public void userNavegaYPresionaElBotonLogout(Actor actor){
        try {
            actor.attemptsTo(
                    logout()
            );
        }catch (Exception e){
            LOGGER.warning(e.getMessage());
        }

    }

    @Then("{actor} debe ver el mensaje {string}")
    public void userDebeVerElMensaje(Actor actor,String respuesta) {
        try {
            actor.should(
                    seeThat(RespuestaLogout.isEqualTo(),containsString(respuesta))
            );
        }catch (Exception e){
            LOGGER.warning(e.getMessage());
        }

    }

    //____________________________________________________________________________________________

    @When("{actor} selecciona un {string} y la {int}")
    public void userSeleccionaUnYLa(Actor actor,String producto, Integer cantidad) {
        FlujoSeleccionProducto.product=producto;
        FlujoSeleccionProducto.canti=cantidad;
        try {
            actor.attemptsTo(
                    flujoSeleccionProducto()
            );
        }catch (Exception e){
            LOGGER.warning(e.getMessage());
        }

    }
    @When("{actor} realiza el flujo de compra")
    public void userRealizaElFlujoDeCompra(Actor actor) {
        try {
            actor.attemptsTo(
                    flujoCompraCompleto()
            );
        }catch (Exception e){

        }

    }
    @Then("{actor} recibe un mensaje de confirmacion")
    public void userRecibeUnMensajeDeConfirmacion(Actor actor) {
        try {
            actor.should(
                    seeThat(RespuestaCompra.isEqualTo(),containsString("Checkout Complete"))
            );
        }catch (Exception e){
            LOGGER.warning(e.getMessage());
        }

    }
}
