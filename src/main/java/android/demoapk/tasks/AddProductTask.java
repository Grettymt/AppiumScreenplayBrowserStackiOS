package android.demoapk.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static android.demoapk.userinterface.AddProductsUI.*;

public class AddProductTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(PRODUCTO),
                Click.on(CARRITO),
                Click.on(BTN_CHECKOUT)
        );
    }

    public static AddProductTask addProductTask() {return new AddProductTask();}
}
