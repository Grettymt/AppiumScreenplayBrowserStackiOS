package com.sofkau.userinterface;

import io.appium.java_client.MobileBy;
import net.serenitybdd.screenplay.targets.Target;

public class DatosComprador {


    public static final Target CAMPO_NOMBRE = Target
            .the("NOMBRE")
            .located(MobileBy.AccessibilityId("test-First Name"));


    public static final Target CAMPO_APELLIDO = Target
            .the("APELLIDO")
            .located(MobileBy.AccessibilityId("test-Last Name"));

    public static final Target CAMPO_CODIGOP = Target
            .the("CODIGO")
            .located(MobileBy.AccessibilityId("test-Zip/Postal Code"));


    public static final Target BOTON_CONTINUAR = Target
            .the("CODIGO")
            .located(MobileBy.AccessibilityId("test-CONTINUE"));


}
