package com.sofkau.stepdefinitions;

import com.sofkau.setup.SetUp;
import com.sofkau.tasks.compra.formulariobasico.LlenarNombreFormularioBasico;
import io.cucumber.java.en.*;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.JavascriptExecutor;

import static com.sofkau.driver.IOSDriver.DRIVER;
import static com.sofkau.questions.Checkout.checkout;
import static com.sofkau.questions.OnWay.onWay;
import static com.sofkau.questions.Productos.productos;
import static com.sofkau.questions.ThankYou.thankYou;
import static com.sofkau.tasks.compra.formulariobasico.LlenarCiudadFormularioBasico.llenarCiudadFormularioBasico;
import static com.sofkau.tasks.compra.formulariobasico.LlenarPaisFormularioBasico.llenarPaisFormularioBasico;
import static com.sofkau.tasks.compra.formulariobasico.LlenarZipCodeBasico.llenarZipCodeBasico;
import static com.sofkau.tasks.compra.formulariobasico.TerminarFormularioBasico.terminarFormularioBasico;
import static com.sofkau.tasks.compra.pasareladepago.LlenarCodigoPasarela.llenarCodigoPasarela;
import static com.sofkau.tasks.compra.pasareladepago.LlenarFechaDeVencimientoPasarela.llenarFechaDeVencimientoPasarela;
import static com.sofkau.tasks.compra.pasareladepago.LlenarTarjetaPasarela.llenarTarjetaPasarela;
import static com.sofkau.tasks.compra.pasareladepago.TerminarPasarela.terminarPasarela;
import static com.sofkau.tasks.compra.primeraetapa.AnnadirAlCarrito.annadirAlCarrito;
import static com.sofkau.tasks.compra.primeraetapa.CambiarCantidad.cambiarCantidad;
import static com.sofkau.tasks.compra.primeraetapa.IrAlCarrito.irAlCarrito;
import static com.sofkau.tasks.compra.primeraetapa.ProcederAlPago.procederAlPago;
import static com.sofkau.tasks.compra.primeraetapa.SeleccionarColor.seleccionarColor;
import static com.sofkau.tasks.compra.primeraetapa.SeleccionarProducto.seleccionarProducto;
import static com.sofkau.tasks.compra.formulariobasico.LlenarNombreFormularioBasico.llenarNombreFormularioBasico;
import static com.sofkau.tasks.compra.formulariobasico.LlenarDireccionFormularioBasico.llenarDireccionFormularioBasico;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.containsString;

public class CompraStepDefinition extends SetUp{
    public static Logger LOGGER = Logger.getLogger(CompraStepDefinition.class);
    @When("user selects the product")
    public void userSelectsTheProduct() {
        try {
            ACTOR.attemptsTo(
                    seleccionarProducto(),
                    seleccionarColor(),
                    cambiarCantidad(),
                    annadirAlCarrito(),
                    irAlCarrito()
            );
            LOGGER.info("Selecciona productos");
        }catch (Exception e){
            LOGGER.info("Fallo la seleccion de productos");
            LOGGER.warn(e.getMessage());
            Assertions.fail();
            quitarDriver();
        }
    }

    @And("finishes the buying process")
    public void finishesTheBuyingProcess() {
        try {
            formularioBasico();
            pasarela();
            LOGGER.info("Finaliza la compra");
        }catch (Exception e){
            LOGGER.info("Fallo la seleccion de productos");
            LOGGER.warn(e.getMessage());
            Assertions.fail();
            quitarDriver();
        }
    }
    @Then("shows the checkout page")
    public void showsTheCheckoutPage() {
        JavascriptExecutor jse = DRIVER;
        try {
            ACTOR.should(
                    seeThat(checkout(),containsString("Checkout Complete")),
                    seeThat(thankYou(),containsString("Thank you for your order")),
                    seeThat(onWay(),containsString("Your new swag is on its way"))
            );
            LOGGER.info("Se compara el mensaje");
        }catch (Exception | Error e){
            jse.executeScript("browserstack_executor: {\"action\": \"setSessionStatus\", \"arguments\": {\"status\": \"failed\", \"reason\": \"No coincide el resultado\"}}");
        }finally {
            quitarDriver();
        }
    }
    private void formularioBasico() {
        ACTOR.attemptsTo(
                procederAlPago(),
                getRebeccaWinter(),
                llenarDireccionFormularioBasico().conLaDireccion("Mandorley 112"),
                llenarCiudadFormularioBasico().conLaCiudad("Truro"),
                llenarZipCodeBasico().conElZipCode("89750"),
                llenarPaisFormularioBasico().conElPais("United Kingdom"),
                terminarFormularioBasico()
        );
    }
    private LlenarNombreFormularioBasico getRebeccaWinter() {
        return llenarNombreFormularioBasico().conElNombre("Rebecca Winter");
    }
    private void pasarela() {
        ACTOR.attemptsTo(
                getRebeccaWinter(),
                llenarTarjetaPasarela().conLaTarjeta("325812657568789"),
                llenarFechaDeVencimientoPasarela().conVencimiento("0325"),
                llenarCodigoPasarela().conElCodigo("123"),
                terminarPasarela()
        );
    }
}
