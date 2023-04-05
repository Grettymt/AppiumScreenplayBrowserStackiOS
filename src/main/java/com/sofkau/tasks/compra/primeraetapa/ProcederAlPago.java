package com.sofkau.tasks.compra.primeraetapa;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.sofkau.ui.CompraUI.PASAR_AL_PAGO;

public class ProcederAlPago implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(PASAR_AL_PAGO)
        );
    }
    public static ProcederAlPago procederAlPago(){return new ProcederAlPago();}
}
