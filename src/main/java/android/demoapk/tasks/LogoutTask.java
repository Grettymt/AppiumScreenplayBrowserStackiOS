package android.demoapk.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static android.demoapk.userinterface.LogoutUI.*;

public class LogoutTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(MENU),
                Click.on(LOGOUT)
        );
    }
    public static LogoutTask logoutTask() {
        return new LogoutTask();
    }
}
