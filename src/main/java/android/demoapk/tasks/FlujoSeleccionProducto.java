package android.demoapk.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static android.demoapk.userinterface.SeleccionarProducto.*;


public class FlujoSeleccionProducto implements Task {
    public static String product;

    public static int canti;
    @Override
    public <T extends Actor> void performAs(T actor) {

        if(product.equals("camiseta")){
            actor.attemptsTo(
                    Click.on(CAMISETA)
            );
        }else if(product.equals("mochila")){
            actor.attemptsTo(
                    Click.on(MOCHILA)
            );
        }
        for (int i=1;i<canti;i++){
            actor.attemptsTo(
                    Click.on(SUMAR_CANTIDAD)
            );
        }
        actor.attemptsTo(
                Click.on(BOTON_ADD_CART)
        );

    }

    public static FlujoSeleccionProducto flujoSeleccionProducto(){
        return new FlujoSeleccionProducto();
    }
}
