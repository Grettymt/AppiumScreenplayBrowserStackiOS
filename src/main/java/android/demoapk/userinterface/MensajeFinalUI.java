package android.demoapk.userinterface;

import io.appium.java_client.MobileBy;
import net.serenitybdd.screenplay.targets.Target;

public class MensajeFinalUI {
    public static final Target MENSAJE_FINAL_COMPRA = Target.the("Mensaje final de compra")
            .located(MobileBy.AccessibilityId("Checkout Complete"));
}
