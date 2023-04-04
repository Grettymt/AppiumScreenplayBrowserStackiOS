package android.demoapk.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;

import static android.demoapk.userinterface.CardUI.*;

public class LlenarFormularioTarjeta implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue("Jose nunez").into(CAMPO_NAME_CARD),
                Enter.theValue("1234567891023456").into(CAMPO_NUMERO_CARD),
                Enter.theValue("03/25").into(EXPIRATION_DATE),
                Enter.theValue("561").into(CODIGO_SEGURIDAD),
                Hit.the(Keys.ENTER).into(CAMPO_NUMERO_CARD),
                Click.on(BTN_VER_DETALLES),
                Click.on(BTN_VER_DETALLES)
        );
    }
    public static LlenarFormularioTarjeta llenarFormularioTarjeta(){
        return new LlenarFormularioTarjeta();
    }
}
