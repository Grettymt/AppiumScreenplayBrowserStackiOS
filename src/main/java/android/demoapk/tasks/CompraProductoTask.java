package android.demoapk.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static android.demoapk.userinterface.SeleccionarProductoUI.*;

public class CompraProductoTask implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BOTON_ORGANIZAR),
                Click.on(PRECIO_ASCENDENTE),
                Click.on(PRODUCTO_ONESIE),
                Click.on(BOTON_COLOR_NEGRO),
                Click.on(BOTON_AGREGAR_CARRITO),
                Click.on(BOTON_CARRITO_COMPRAS),
                Click.on(BOTON_CHECKOUT)
        );


    }
    public static CompraProductoTask compraProductoTask() {
        return new CompraProductoTask();
    }
}
