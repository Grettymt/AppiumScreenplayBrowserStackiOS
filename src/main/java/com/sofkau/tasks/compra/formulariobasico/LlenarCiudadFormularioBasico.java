package com.sofkau.tasks.compra.formulariobasico;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;

import static com.sofkau.ui.FormularioBasicoUI.CIUDAD;

public class LlenarCiudadFormularioBasico implements Task {
    private CharSequence ciudad;
    public LlenarCiudadFormularioBasico conLaCiudad(String ciudad){
        this.ciudad=ciudad;
        return this;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(ciudad).into(CIUDAD)
        );
    }
    public static LlenarCiudadFormularioBasico llenarCiudadFormularioBasico(){return new LlenarCiudadFormularioBasico();}
}
