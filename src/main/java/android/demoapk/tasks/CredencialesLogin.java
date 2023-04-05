package android.demoapk.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static android.demoapk.userinterface.LogInUI.*;

public class CredencialesLogin implements Task {

    public static String user;
    public static String contra;
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(user).into(CAMPO_USERNAME),
                Enter.theValue(contra).into(CAMPO_CONTRASENIA),
                Click.on(BOTON_LOGIN)
        );
    }

    public static CredencialesLogin credencialesLogin(){
        return new CredencialesLogin();
    }
}
