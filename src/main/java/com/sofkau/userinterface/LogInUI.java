package com.sofkau.userinterface;

import io.appium.java_client.MobileBy;
import net.serenitybdd.screenplay.targets.Target;


public class LogInUI {


    public static final Target CAMPO_USER = Target
            .the("USER")
            .located(MobileBy.AccessibilityId("test-Username"));


    public static final Target CAMPO_PASSWORD = Target
            .the("USER")
            .located(MobileBy.AccessibilityId("test-Password"));


    public static final Target BOTON_LOGIN = Target
            .the("USER")
            .located(MobileBy.AccessibilityId("test-LOGIN"));


}
