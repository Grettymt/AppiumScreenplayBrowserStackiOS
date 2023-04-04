package android.demoapk.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static android.demoapk.userinterface.DetallesCompraUI.BTN_PAGAR_COMPRA;

public class Comprar implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_PAGAR_COMPRA)
        );
    }
    public static Comprar comprar(){
        return new Comprar();
    }
}
