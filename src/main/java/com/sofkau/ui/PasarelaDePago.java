package com.sofkau.ui;

import io.appium.java_client.MobileBy;
import net.serenitybdd.screenplay.targets.Target;

public class PasarelaDePago {
    public static final Target TARJETA=Target.the("Tarjeta")
            .located(MobileBy.AccessibilityId("Card Number* input field"));
    public static final Target VENCIMIENTO=Target.the("vencimiento")
            .located(MobileBy.AccessibilityId("Expiration Date* input field"));
    public static final Target CODIGO=Target.the("codigo")
            .located(MobileBy.AccessibilityId("Security Code* input field"));
    public static final Target BOTON_FINAL=Target.the("boton final")
            .located(MobileBy.AccessibilityId("Review Order button"));
    public static final Target BOTON_FINAL_FINAL=Target.the("boton final final")
            .located(MobileBy.AccessibilityId("Place Order button"));
    public static final Target OCULTAR_TECLADO=Target.the("ocultar teclado")
            .located(MobileBy.xpath("//XCUIElementTypeStaticText[@name=\"Expiration Date*\"]"));
}
