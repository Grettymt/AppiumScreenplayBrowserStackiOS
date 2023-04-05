package android.demoapk.tasks.login;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static android.demoapk.userinterface.LogInUI.MENU;

public class ElegirMenu implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(MENU)
        );
    }
    public static ElegirMenu elegirMenu(){
        return new ElegirMenu();
    }
}
