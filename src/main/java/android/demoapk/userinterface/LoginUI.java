package android.demoapk.userinterface;

import io.appium.java_client.MobileBy;
import net.serenitybdd.screenplay.targets.Target;

public class LoginUI {

    public static final Target CAMPO_USER = Target.the("Campo usuario")
            .located(MobileBy.AccessibilityId("Username input field"));

    public static final Target CAMPO_PSSWD = Target.the("Campo contrasenna")
            .located(MobileBy.AccessibilityId("Password input field"));

    public static final Target LOGIN_BUTTON = Target.the("Boton de inicio de sesion")
            .located(MobileBy.AccessibilityId("Login button"));
}
