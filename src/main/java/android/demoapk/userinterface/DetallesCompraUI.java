package android.demoapk.userinterface;

import io.appium.java_client.MobileBy;
import net.serenitybdd.screenplay.targets.Target;

public class DetallesCompraUI {
    public static final Target BTN_PAGAR_COMPRA = Target.the("Boton final de pagar")
            .located(MobileBy.AccessibilityId("Place Order button"));
}
