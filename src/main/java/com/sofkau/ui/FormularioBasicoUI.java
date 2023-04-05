package com.sofkau.ui;

import io.appium.java_client.MobileBy;
import net.serenitybdd.screenplay.targets.Target;

public class FormularioBasicoUI {
    public static final Target NOMBRE_BASICO=Target.the("nombre formulario basico")
            .located(MobileBy.AccessibilityId("Full Name* input field"));
    public static final Target DIRECCION_BASICO=Target.the("direccion formulario basico")
            .located(MobileBy.AccessibilityId("Address Line 1* input field"));
    public static final Target CIUDAD=Target.the("ciudad formulario basico")
            .located(MobileBy.AccessibilityId("City* input field"));
    public static final Target OCULTAR_TECLADO=Target.the("ocultar teclado")
            .located(MobileBy.xpath("//XCUIElementTypeStaticText[@name=\"City*\"]"));
    public static final Target ZIP_CODE=Target.the("zip code formulario basico")
            .located(MobileBy.AccessibilityId("Zip Code* input field"));
    public static final Target PAIS=Target.the("pais formulario basico")
            .located(MobileBy.AccessibilityId("Country* input field"));
    public static final Target BOTON_FINAL=Target.the("to payment")
            .located(MobileBy.AccessibilityId("To Payment button"));
}