package com.sofkau.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.sofkau.userinterface.Logout.BOTON_LOGOUT;
import static com.sofkau.userinterface.Logout.BOTON_MENU;
import static com.sofkau.userinterface.MenuProducto.*;

public class Logout implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BOTON_MENU),
                Click.on(BOTON_LOGOUT)


        );

    }


    public static Logout logout() {
        return new Logout();
    }


}
