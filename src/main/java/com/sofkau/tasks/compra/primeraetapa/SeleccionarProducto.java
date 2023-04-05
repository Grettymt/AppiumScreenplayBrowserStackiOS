package com.sofkau.tasks.compra.primeraetapa;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.sofkau.ui.CompraUI.PRODUCTO;

public class SeleccionarProducto implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(PRODUCTO)
        );
    }
    public static SeleccionarProducto seleccionarProducto(){return new SeleccionarProducto();}
}
