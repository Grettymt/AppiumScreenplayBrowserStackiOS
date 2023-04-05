package com.sofkau.tasks.compra.pasareladepago;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;

import static com.sofkau.ui.PasarelaDePago.TARJETA;

public class LlenarTarjetaPasarela implements Task {
    private CharSequence tarjeta;
    public LlenarTarjetaPasarela conLaTarjeta(String tarjeta){
        this.tarjeta=tarjeta;
        return this;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(tarjeta).into(TARJETA)
        );
    }
    public static LlenarTarjetaPasarela llenarTarjetaPasarela(){return new LlenarTarjetaPasarela();}
}
