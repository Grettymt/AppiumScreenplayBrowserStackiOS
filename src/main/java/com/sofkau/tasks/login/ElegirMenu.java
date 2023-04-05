package com.sofkau.tasks.login;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.sofkau.ui.LogInUI.MENU;

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
