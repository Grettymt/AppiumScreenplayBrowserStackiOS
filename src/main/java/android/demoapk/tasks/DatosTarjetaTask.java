package android.demoapk.tasks;

import android.demoapk.models.Cliente;
import android.demoapk.util.GenerateCliente;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static android.demoapk.userinterface.TarjetaCreditoUI.*;

public class DatosTarjetaTask implements Task {
    Cliente cliente = GenerateCliente.generateCliente();

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(CAMPO_NOMBRE_TARJETA),
                Enter.theValue(cliente.getNombre()).into(CAMPO_NOMBRE_TARJETA),
                Click.on(CAMPO_NUMERO_TARJETA),
                Enter.theValue(cliente.getNumeroTarjeta()).into(CAMPO_NUMERO_TARJETA),
                Click.on(CAMPO_FECHA_EXP_TARJETA),
                Enter.theValue(cliente.getExpiracionTarjeta()).into(CAMPO_FECHA_EXP_TARJETA),
                Click.on(CAMPO_CODIGO_SEG_TARJETA),
                Enter.theValue(cliente.getCodigoTarjeta()).into(CAMPO_CODIGO_SEG_TARJETA),
                Click.on(TAP_NOMBRE),
                Click.on(BOTON_ORDEN),
                Click.on(BOTON_TERMINAR_ORDEN)
        );
    }
    public static DatosTarjetaTask datosTarjetaTask(){
        return new DatosTarjetaTask();
    }
}
