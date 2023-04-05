package com.sofkau.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.sofkau.ui.LogInUI.PRODUCTOS;

public class Productos implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        return PRODUCTOS.resolveFor(actor).getText();
    }
    public static Productos productos() {
        return new Productos();
    }
}
