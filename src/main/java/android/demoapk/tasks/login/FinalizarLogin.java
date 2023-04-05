package android.demoapk.tasks.login;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static android.demoapk.userinterface.LogInUI.LOGIN_BOTON;

public class FinalizarLogin implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(LOGIN_BOTON)
        );
    }
    public static FinalizarLogin finalizarLogin(){return new FinalizarLogin();}
}
