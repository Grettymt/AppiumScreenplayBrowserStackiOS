package com.sofkau.userinterface;

import io.appium.java_client.MobileBy;
import net.serenitybdd.screenplay.targets.Target;

public class Logout {


    public static final Target BOTON_MENU = Target
            .the("MENU")
            .located(MobileBy.AccessibilityId("test-Menu"));


    public static final Target BOTON_LOGOUT = Target
            .the("MENU")
            .located(MobileBy.AccessibilityId("test-LOGOUT"));


}
