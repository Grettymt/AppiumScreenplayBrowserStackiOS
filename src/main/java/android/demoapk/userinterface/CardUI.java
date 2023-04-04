package android.demoapk.userinterface;

import io.appium.java_client.MobileBy;
import net.serenitybdd.screenplay.targets.Target;

public class CardUI {

    public static final Target CAMPO_NAME = Target.the("Campo nombre propietario tarjeta")
            .located(MobileBy.AccessibilityId("Full Name* input field"));

    public static final Target CAMPO_NUMERO_CARD = Target.the("Campo numero de tarjeta")
            .located(MobileBy.AccessibilityId("Card Number* input field"));

    public static final Target EXPIRATION_DATE = Target.the("Fecha de expiracion tarjeta")
            .located(MobileBy.AccessibilityId("Expiration Date* input field"));

    public static final Target CODIGO_SEGURIDAD = Target.the("Campo codigo de seguridad tarjeta")
            .located(MobileBy.AccessibilityId("Security Code* input field"));

    public static final Target BTN_VER_DETALLES = Target.the("Boton ver detalles de compra")
            .located(MobileBy.AccessibilityId("Review Order button"));



/*
1234567891023456
 */
}
