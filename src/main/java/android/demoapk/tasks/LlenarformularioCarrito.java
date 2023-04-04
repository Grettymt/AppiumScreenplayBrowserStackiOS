package android.demoapk.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;

import static android.demoapk.userinterface.CarritoUI.*;
import static android.demoapk.userinterface.HomeUI.OPCION_CARRITO;

public class LlenarformularioCarrito implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(OPCION_CARRITO),
                Enter.theValue("Jose nunez").into(CAMPO_NAME),
                Enter.theValue("Calle 15").into(CAMPO_ADDRESS),
                Enter.theValue("Bogota").into(CAMPO_CITY),
                Enter.theValue("15152").into(CAMPO_ZIP),
                Enter.theValue("Colombia").into(CAMPO_PAIS),
                Hit.the(Keys.ENTER).into(CAMPO_PAIS),
                Click.on(BTN_PAGAR)
        );
    }
    public static LlenarformularioCarrito llenarformularioCarritopagar(){
        return new LlenarformularioCarrito();
    }
}
