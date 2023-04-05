package android.demoapk.tasks;

import android.demoapk.models.Cliente;
import android.demoapk.util.GenerateCliente;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static android.demoapk.userinterface.DatosUsuarioUI.*;

public class DatosClienteTask implements Task {
    Cliente cliente = GenerateCliente.generateCliente();
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(CAMPO_NOMBRE_CLIENTE),
                Enter.theValue(cliente.getNombre()).into(CAMPO_NOMBRE_CLIENTE),
                Click.on(CAMPO_DIRECCION_CLIENTE),
                Enter.theValue(cliente.getDireccion()).into(CAMPO_DIRECCION_CLIENTE),
                Click.on(CAMPO_CIUDAD),
                Enter.theValue(cliente.getCiudad()).into(CAMPO_CIUDAD),
                Click.on(CAMPO_ESTADO),
                Enter.theValue(cliente.getEstado()).into(CAMPO_ESTADO),
                Click.on(CAMPO_CODIGO_POSTAL),
                Enter.theValue(cliente.getCodigoPostal()).into(CAMPO_CODIGO_POSTAL),
                Click.on(CAMPO_PAIS),
                Enter.theValue(cliente.getPais()).into(CAMPO_PAIS),
                Click.on(BOTON_IR_A_PAGOS)
        );
    }
    public static DatosClienteTask datosClienteTask(){
        return new DatosClienteTask();
    }
}
