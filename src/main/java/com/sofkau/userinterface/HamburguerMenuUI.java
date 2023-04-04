package com.sofkau.userinterface;

import io.appium.java_client.MobileBy;
import net.serenitybdd.screenplay.targets.Target;

public class HamburguerMenuUI {



    public static final Target BOTON_LOGIN = Target
            .the("USER")
            .located(MobileBy.AccessibilityId("menu item log in"));




    public static final Target BOTON_LOGUO = Target
            .the("USER")
            .located(MobileBy.AccessibilityId("menu item log out"));


}