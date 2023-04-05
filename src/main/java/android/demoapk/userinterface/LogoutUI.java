package android.demoapk.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LogoutUI {

    public static final Target LOGOUT=Target.the("")
            .located(By.id("menu item log out"));

    public static final Target BOTON_LOGOUT=Target.the("")
            .located(By.xpath("//XCUIElementTypeButton[@name=\"Log Out\"]"));
}
