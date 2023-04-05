package com.sofkau.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.sofkau.ui.ParteFinalCompra.CHECKOUT;

public class Checkout implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        return CHECKOUT.resolveFor(actor).getText();
    }
    public static Checkout checkout() {
        return new Checkout();
    }
}