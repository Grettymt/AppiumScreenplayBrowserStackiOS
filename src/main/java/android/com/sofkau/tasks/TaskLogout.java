package android.com.sofkau.tasks;

import android.com.sofkau.userinterface.LogoutUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class TaskLogout implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(
            Click.on(LogoutUI.BTN_MENU),
            Click.on(LogoutUI.CAMPO_LOGOUT)
    );
    }
    public static TaskLogout taskLogout(){
        return new TaskLogout();
    }
}
