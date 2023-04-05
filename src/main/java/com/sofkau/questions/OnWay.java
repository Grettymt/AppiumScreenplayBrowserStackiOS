package com.sofkau.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.sofkau.ui.ParteFinalCompra.ON_WAY;

public class OnWay implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        return ON_WAY.resolveFor(actor).getText();
    }
    public static OnWay onWay() {
        return new OnWay();
    }
}
