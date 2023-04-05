package android.demoapk.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static android.demoapk.userinterface.FlujoCompra.*;

public class FlujoCompraCompleto implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(CARRITO),
                Click.on(BOTON_PROCED_CHECKOUT),
                Enter.theValue("Rebeca Winter Prueba").into(CAMPO_NOMBRE),
                Enter.theValue("Mandorley 110").into(CAMPO_ADRESS1),
                Enter.theValue("Entrance 1").into(CAMPO_ADRESS2),
                Enter.theValue("Truro").into(CITY),
                Enter.theValue("Cornwali").into(STATE_REGION),
                Enter.theValue("89750").into(ZIP_CODE),
                Enter.theValue("United KingDom").into(COUNTRY),
                Click.on(RETURN),
                Click.on(BOTON_PAYMENT),
                Enter.theValue("Rebeca Winrwe").into(NOMBRE_TARJETA),
                Enter.theValue("4485908830181210").into(NUMERO_TARJETA),
                Enter.theValue("08/27").into(FECHA_TARJETA),
                Enter.theValue("813").into(CODIGO_TARJETA),
                Click.on(QUITAR_TECLADO_NUMERICO),
                Click.on(BOTON_REVIEW_ORDER),
                Click.on(BOTON_PLACE_ORDER)


        );
    }

    public static FlujoCompraCompleto flujoCompraCompleto(){
        return new FlujoCompraCompleto();
    }
}
