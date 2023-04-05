package com.sofkau.tasks.compra.pasareladepago;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;

import static com.sofkau.ui.PasarelaDePago.VENCIMIENTO;

public class LlenarFechaDeVencimientoPasarela implements Task {
    private CharSequence vencimiento;
    public LlenarFechaDeVencimientoPasarela conVencimiento(String vencimiento){
        this.vencimiento=vencimiento;
        return this;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(vencimiento).into(VENCIMIENTO)
        );
    }
    public static LlenarFechaDeVencimientoPasarela llenarFechaDeVencimientoPasarela(){return new LlenarFechaDeVencimientoPasarela();}
}
