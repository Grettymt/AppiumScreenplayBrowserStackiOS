package com.sofkau.tasks.compra.formulariobasico;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;

import static com.sofkau.ui.FormularioBasicoUI.NOMBRE_BASICO;

public class LlenarNombreFormularioBasico implements Task {
    private CharSequence nombre;
    public LlenarNombreFormularioBasico conElNombre(String nombre){
        this.nombre=nombre;
        return this;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(nombre).into(NOMBRE_BASICO)
        );
    }
    public static LlenarNombreFormularioBasico llenarNombreFormularioBasico(){return new LlenarNombreFormularioBasico();}
}
