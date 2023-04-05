package com.sofkau.tasks.compra.primeraetapa;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.sofkau.ui.CompraUI.ANNADIR_CARRITO;

public class AnnadirAlCarrito implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(ANNADIR_CARRITO)
        );
    }
    public static AnnadirAlCarrito annadirAlCarrito(){return new AnnadirAlCarrito();}
}
