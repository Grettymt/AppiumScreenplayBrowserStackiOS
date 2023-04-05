package android.demoapk.userinterface;

import io.appium.java_client.MobileBy;
import net.serenitybdd.screenplay.targets.Target;

public class LogInUI {
    public static final Target MENU=Target.the("elegir menu")
            .located(MobileBy.AccessibilityId("tab bar option menu"));
    public static final Target LOGIN=Target.the("Elegir login")
            .located(MobileBy.AccessibilityId("menu item log in"));
    public static final Target LOGIN_USERNAME=Target.the("username")
            .located(MobileBy.AccessibilityId("Username input field"));
    public static final Target LOGIN_PASSWORD=Target.the("password")
            .located(MobileBy.AccessibilityId("Password input field"));
    public static final Target LOGIN_BOTON=Target.the("boton login")
            .located(MobileBy.AccessibilityId("Login button"));
    public static final Target PRODUCTOS=Target.the("Mensaje productos")
            .located(MobileBy.AccessibilityId("container header"));
}
