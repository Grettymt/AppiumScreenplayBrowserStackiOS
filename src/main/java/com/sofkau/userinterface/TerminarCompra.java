package com.sofkau.userinterface;

import io.appium.java_client.MobileBy;
import net.serenitybdd.screenplay.targets.Target;

public class TerminarCompra {


    public static final Target BOTON_TERMINAR = Target
            .the("TERMINAR COMPRA")
            .located(MobileBy.AccessibilityId("FINISH"));



}
