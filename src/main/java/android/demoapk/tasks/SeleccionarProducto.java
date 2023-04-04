package android.demoapk.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static android.demoapk.userinterface.CatalogoUI.PRODUCTO_SELECCIONADO;
import static android.demoapk.userinterface.ProductUI.BOTON_ADD_TO_CART;

public class SeleccionarProducto implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(PRODUCTO_SELECCIONADO),
                Click.on(BOTON_ADD_TO_CART)
        );
    }

    public static SeleccionarProducto seleccionarProducto(){
        return new SeleccionarProducto();
    }
}
