package android.demoapk.userinterface;

import io.appium.java_client.MobileBy;
import net.serenitybdd.screenplay.targets.Target;
public class LogoutUI {
    public static final Target MENU = Target.the("Menu de la aplicación")
            .located(MobileBy.AccessibilityId("test-Menu"));

    public static final Target LOGOUT = Target.the("logout")
            .located(MobileBy.AccessibilityId("test-LOGOUT"));

}
