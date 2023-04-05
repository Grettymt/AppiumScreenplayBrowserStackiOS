package com.sofkau.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.sofkau.ui.ParteFinalCompra.THANKS;

public class ThankYou implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        return THANKS.resolveFor(actor).getText();
    }
    public static ThankYou thankYou() {
        return new ThankYou();
    }
}
