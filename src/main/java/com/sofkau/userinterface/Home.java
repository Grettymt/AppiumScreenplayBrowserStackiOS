package com.sofkau.userinterface;

import io.appium.java_client.MobileBy;
import net.serenitybdd.screenplay.targets.Target;

public class Home {



    public static final Target BOTON_MENU = Target
            .the("BOTON MENU")
            .located(MobileBy.AccessibilityId("test-Username"));



}
