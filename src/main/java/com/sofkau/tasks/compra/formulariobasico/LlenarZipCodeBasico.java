package com.sofkau.tasks.compra.formulariobasico;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;

import static com.sofkau.ui.FormularioBasicoUI.ZIP_CODE;

public class LlenarZipCodeBasico implements Task {
    private CharSequence zipCode;
    public LlenarZipCodeBasico conElZipCode(String zipCode){
        this.zipCode=zipCode;
        return this;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(zipCode).into(ZIP_CODE)
        );
    }
    public static LlenarZipCodeBasico llenarZipCodeBasico(){return new LlenarZipCodeBasico();}
}
