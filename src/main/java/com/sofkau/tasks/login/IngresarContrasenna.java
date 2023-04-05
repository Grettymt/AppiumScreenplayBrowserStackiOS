package com.sofkau.tasks.login;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;

import static com.sofkau.ui.LogInUI.LOGIN_PASSWORD;

public class IngresarContrasenna implements Task {
    private CharSequence contrasenna;
    public IngresarContrasenna conLaContrasenna(String contrasenna){
        this.contrasenna=contrasenna;
        return this;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(contrasenna).into(LOGIN_PASSWORD)
        );
    }
    public static IngresarContrasenna ingresarContrasenna(){return new IngresarContrasenna();}
}
