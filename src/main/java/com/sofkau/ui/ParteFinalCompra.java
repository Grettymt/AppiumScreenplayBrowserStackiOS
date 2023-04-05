package com.sofkau.ui;

import io.appium.java_client.MobileBy;
import net.serenitybdd.screenplay.targets.Target;

public class ParteFinalCompra {
    public static final Target CHECKOUT=Target.the("Checkout")
            .located(MobileBy.AccessibilityId("Checkout Complete"));
    public static final Target THANKS=Target.the("Thanks")
            .located(MobileBy.AccessibilityId("Thank you for your order"));
    public static final Target ON_WAY=Target.the("on the way")
            .located(MobileBy.AccessibilityId("Your new swag is on its way"));
}
