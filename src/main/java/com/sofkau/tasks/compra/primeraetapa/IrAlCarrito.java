package com.sofkau.tasks.compra.primeraetapa;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.sofkau.ui.CompraUI.IR_CARRITO;

public class IrAlCarrito implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(IR_CARRITO)
        );
    }
    public static IrAlCarrito irAlCarrito(){return new IrAlCarrito();}
}
