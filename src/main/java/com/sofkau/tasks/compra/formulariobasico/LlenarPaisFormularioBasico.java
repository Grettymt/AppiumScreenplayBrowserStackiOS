package com.sofkau.tasks.compra.formulariobasico;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;

import static com.sofkau.ui.FormularioBasicoUI.PAIS;

public class LlenarPaisFormularioBasico implements Task {
    private CharSequence pais;
    public LlenarPaisFormularioBasico conElPais(String pais){
        this.pais=pais;
        return this;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(pais).into(PAIS)
        );
    }
    public static LlenarPaisFormularioBasico llenarPaisFormularioBasico(){return new LlenarPaisFormularioBasico();}
}
