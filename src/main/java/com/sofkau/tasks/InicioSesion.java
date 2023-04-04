package com.sofkau.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.sofkau.userinterface.LogInUI.*;

public class InicioSesion implements Task {


    private String user;
    private String password;


    public InicioSesion conElUsuario(String user) {
        this.user = user;
        return this;
    }


    public InicioSesion yconElPassword(String password) {
        this.password = password;
        return this;
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(user).into(CAMPO_USER),
                Enter.theValue(password).into(CAMPO_PASSWORD),
                Click.on(BOTON_LOGIN)


        );

    }


    public static InicioSesion inicioSesion() {
        return new InicioSesion();
    }

}
