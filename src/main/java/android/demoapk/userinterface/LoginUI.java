package android.demoapk.userinterface;

import io.appium.java_client.MobileBy;
import net.serenitybdd.screenplay.targets.Target;


public class LoginUI {
    public static final Target CAMPO_USER = Target
            .the("Campo escribir usuario")
            .located(MobileBy.AccessibilityId("test-Username"));

    public static final Target CAMPO_PASS = Target
            .the("Campo escribir contraseña")
            .located(MobileBy.AccessibilityId("test-Password"));

    public static final Target BTN_LOGIN = Target
            .the("Campo escribir contraseña")
            .located(MobileBy.AccessibilityId("test-LOGIN"));

}
