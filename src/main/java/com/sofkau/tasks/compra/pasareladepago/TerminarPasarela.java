package com.sofkau.tasks.compra.pasareladepago;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.sofkau.ui.PasarelaDePago.*;

public class TerminarPasarela implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(OCULTAR_TECLADO),
                Click.on(BOTON_FINAL),
                Click.on(BOTON_FINAL),
                Click.on(BOTON_FINAL_FINAL)
        );
    }
    public static TerminarPasarela terminarPasarela(){return new TerminarPasarela();}
}
