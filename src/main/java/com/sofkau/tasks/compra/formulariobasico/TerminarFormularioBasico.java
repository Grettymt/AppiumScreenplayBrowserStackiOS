package com.sofkau.tasks.compra.formulariobasico;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.sofkau.ui.FormularioBasicoUI.BOTON_FINAL;
import static com.sofkau.ui.FormularioBasicoUI.OCULTAR_TECLADO;

public class TerminarFormularioBasico implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(OCULTAR_TECLADO),
                Click.on(BOTON_FINAL)
        );
    }
    public static TerminarFormularioBasico terminarFormularioBasico(){return new TerminarFormularioBasico();}
}
