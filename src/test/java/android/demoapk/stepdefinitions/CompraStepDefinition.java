package android.demoapk.stepdefinitions;

import android.demoapk.driver.IOSDriver;
import android.demoapk.questions.MensajeCompraExitosa;
import android.demoapk.questions.MensajeInicioSesion;
import android.demoapk.setup.SetUp;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.JavascriptExecutor;

import static android.demoapk.tasks.Comprar.comprar;
import static android.demoapk.tasks.LlenarFormularioTarjeta.llenarFormularioTarjeta;
import static android.demoapk.tasks.LlenarformularioCarrito.llenarformularioCarritopagar;
import static android.demoapk.tasks.LogOut.logOut;
import static android.demoapk.tasks.Login.login;
import static android.demoapk.tasks.SeleccionarProducto.seleccionarProducto;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;

public class CompraStepDefinition extends SetUp {

    @Given("el usuario a iniciado sesion")
    public void elUsuarioAIniciadoSesion() {
        try {
            actor.can(BrowseTheWeb.with(IOSDriver.configureDriver().start()));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    @When("seleccione un producto y realize el pago")
    public void seleccioneUnProductoYRealizeElPago() {
        String userName = "bob@example.com";
        String password = "10203040";
        actor.attemptsTo(
                logOut(),
                login()
                        .conElUser(userName)
                        .yLaPassword(password),
                seleccionarProducto(),
                llenarformularioCarritopagar(),
                llenarFormularioTarjeta(),
                comprar()
        );
    }
    @Then("vera un mensaje de compra exitosa")
    public void veraUnMensajeDeCompraExitosa() {
        JavascriptExecutor jse = (JavascriptExecutor) IOSDriver.driver;
        try {
            actor.should(
                    seeThat("Comparacion de compra",
                            MensajeCompraExitosa.isEqualTo(),
                            equalTo("Checkout Complete"))
            );
        }catch (Exception | Error e){
            jse.executeScript("browserstack_executor: {\"action\": \"setSessionStatus\", \"arguments\": {\"status\": \"failed\", \"reason\": \"No coincide el resultado\"}}");
        }
    }
}
