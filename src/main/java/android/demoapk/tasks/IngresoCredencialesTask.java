package android.demoapk.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static android.demoapk.userinterface.LogInUI.*;

public class IngresoCredencialesTask implements Task {
    public static String usuario;
    public static String password;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(INGRESO_USUARIO),
                Enter.theValue(usuario).into(INGRESO_USUARIO),
                Click.on(INGRESO_PASSWORD),
                Enter.theValue(password).into(INGRESO_PASSWORD),
                Click.on(BOTON_LOGIN)
        );
    }

    public static IngresoCredencialesTask ingresoCredencialesTask() {
        return new IngresoCredencialesTask();
    }
}
