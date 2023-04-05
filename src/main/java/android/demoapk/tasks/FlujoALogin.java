package android.demoapk.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static android.demoapk.userinterface.LogInUI.LOGIN;
import static android.demoapk.userinterface.LogInUI.MENU;

public class FlujoALogin implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(MENU),
                Click.on(LOGIN)
        );
    }

    public static FlujoALogin flujoALogin(){
        return new FlujoALogin();
    }
}
