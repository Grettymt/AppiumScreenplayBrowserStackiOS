package android.demoapk.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LogoutUI {
    public static final Target MENU_PRINCIPAL = Target.the("Menu principal")
            .located(By.id("tab bar option menu"));
    public static final Target BOTON_MENU_LOGOUT = Target.the("Boton menu log out")
            .located(By.id("menu item log out"));
    public static final Target BOTON_LOGOUT = Target.the("Boton log out")
            .located(By.xpath("//XCUIElementTypeButton[@name=\"Log Out\"]"));
}
