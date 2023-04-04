package android.demoapk.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static android.demoapk.userinterface.HomeUI.*;

public class LogOut implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(OPCION_MENU),
                Click.on(OPCION_LOGOUT),
                Click.on(CONFIRMAR_LOGOUT),
                Click.on(BTN_FINISH_LOGOUT)
        );
    }
    public static LogOut logOut(){
        return new LogOut();
    }
}
