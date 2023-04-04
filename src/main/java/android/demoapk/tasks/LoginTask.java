package android.demoapk.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static android.demoapk.userinterface.LogInUI.MENU_LOGIN;
import static android.demoapk.userinterface.LogInUI.MENU_PRINCIPAL;

public class LoginTask implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(MENU_PRINCIPAL),
                Click.on(MENU_LOGIN)
        );
    }
    public static LoginTask loginTask(){
        return new LoginTask();

    }
}
