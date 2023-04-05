package android.demoapk.tasks.login;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static android.demoapk.userinterface.LogInUI.LOGIN;

public class ElegirLogin implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(LOGIN)
        );
    }
    public static ElegirLogin elegirLogin(){
        return new ElegirLogin();
    }
}
