package com.sofkau.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import static com.sofkau.userinterface.TerminarCompra.BOTON_TERMINAR;

public class TerminarCompra implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(BOTON_TERMINAR)

        );
    }
    public static TerminarCompra terminarCompra() {
        return new TerminarCompra();
    }


}
