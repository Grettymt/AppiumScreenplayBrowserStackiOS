package android.demoapk.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static android.demoapk.userinterface.LogInUI.MENU;
import static android.demoapk.userinterface.LogoutUI.BOTON_LOGOUT;
import static android.demoapk.userinterface.LogoutUI.LOGOUT;

public class Logout implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(MENU),
                Click.on(LOGOUT),
                Click.on(BOTON_LOGOUT)
        );
    }

    public static Logout logout(){
        return new Logout();
    }
}
