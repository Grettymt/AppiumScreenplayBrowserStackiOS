package com.sofkau.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.sofkau.userinterface.LogInUI.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;

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
                WaitUntil.the(CAMPO_USER, isClickable()).forNoMoreThan(10).seconds(),
                Enter.theValue(user).into(CAMPO_USER),

                WaitUntil.the(CAMPO_PASSWORD, isClickable()).forNoMoreThan(10).seconds(),
                Enter.theValue(password).into(CAMPO_PASSWORD),


                WaitUntil.the(BOTON_LOGIN, isClickable()).forNoMoreThan(10).seconds(),
                Click.on(BOTON_LOGIN)


        );

    }


    public static InicioSesion inicioSesion() {
        return new InicioSesion();
    }

}
