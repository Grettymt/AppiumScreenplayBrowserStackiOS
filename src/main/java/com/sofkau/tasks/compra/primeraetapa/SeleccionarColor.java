package com.sofkau.tasks.compra.primeraetapa;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.sofkau.ui.CompraUI.COLOR;

public class SeleccionarColor implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(COLOR)
        );
    }
    public static SeleccionarColor seleccionarColor(){return new SeleccionarColor();}
}
