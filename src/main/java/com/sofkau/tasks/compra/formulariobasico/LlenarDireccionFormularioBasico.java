package com.sofkau.tasks.compra.formulariobasico;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;

import static com.sofkau.ui.FormularioBasicoUI.DIRECCION_BASICO;

public class LlenarDireccionFormularioBasico implements Task {
    private CharSequence direccion;
    public LlenarDireccionFormularioBasico conLaDireccion(String direccion){
        this.direccion=direccion;
        return this;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(direccion).into(DIRECCION_BASICO)
        );
    }
    public static LlenarDireccionFormularioBasico llenarDireccionFormularioBasico(){return new LlenarDireccionFormularioBasico();}
}
