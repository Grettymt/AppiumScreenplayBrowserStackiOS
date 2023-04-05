package com.sofkau.tasks.compra.pasareladepago;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;

import static com.sofkau.ui.PasarelaDePago.CODIGO;

public class LlenarCodigoPasarela implements Task {
    private CharSequence codigo;
    public LlenarCodigoPasarela conElCodigo(String codigo){
        this.codigo=codigo;
        return this;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(codigo).into(CODIGO)
        );
    }
    public static LlenarCodigoPasarela llenarCodigoPasarela(){return new LlenarCodigoPasarela();}
}
