package android.demoapk.userinterface;

import io.appium.java_client.MobileBy;
import net.serenitybdd.screenplay.targets.Target;

public class FormDatosUI {
    public static final Target CAMPO_NOMBRE = Target
            .the("Campo escribir nombre")
            .located(MobileBy.AccessibilityId("test-First Name"));

    public static final Target CAMPO_APELLIDO = Target
            .the("Campo escribir apellido")
            .located(MobileBy.AccessibilityId("test-Last Name"));

    public static final Target CAMPO_ZIP_CODE = Target
            .the("Campo escribir codigo postal")
            .located(MobileBy.AccessibilityId("test-Zip/Postal Code"));

    public static final Target BTN_CONTINUE = Target
            .the("Botón continuar")
            .located(MobileBy.AccessibilityId("test-CONTINUE"));

    public static final Target BTN_FINISH = Target
            .the("Botón finish")
            .located(MobileBy.AccessibilityId("FINISH"));


}
