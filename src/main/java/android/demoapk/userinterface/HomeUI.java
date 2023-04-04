package android.demoapk.userinterface;


import io.appium.java_client.MobileBy;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomeUI {
    public static final Target OPCION_MENU = Target.the("Opcion de menu")
            .located(MobileBy.AccessibilityId("tab bar option menu"));

    public static final Target OPCION_LOGOUT = Target.the("Opcion de logout")
            .located(MobileBy.AccessibilityId("menu item log out"));

    public static final Target CONFIRMAR_LOGOUT= Target.the("Boton confirmar Logout")
            .located(By.xpath("//XCUIElementTypeButton[@name='Log Out']"));

    public static final Target BTN_FINISH_LOGOUT = Target.the("Boton finalizar LogOut")
            .located(MobileBy.AccessibilityId("OK"));

    public static final Target OPCION_CATALOGO = Target.the("Opcion de catalogo")
            .located(MobileBy.AccessibilityId("tab bar option catalog"));

    public static final Target MENSAJE_LOGIN = Target.the("Mensaje de login")
            .located(By.xpath("//XCUIElementTypeStaticText[@name='Products']"));

    public static final Target OPCION_CARRITO = Target.the("Opcion de carrito")
            .located(MobileBy.AccessibilityId("tab bar option cart"));
}
