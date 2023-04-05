package android.com.sofkau.userinterface;

import net.serenitybdd.screenplay.targets.Target;

import static org.openqa.selenium.By.id;
import static org.openqa.selenium.By.xpath;

public class LogoutUI {
    public static final Target BTN_MENU = Target
            .the("opcion menu")
            .located(id("test-Menu"));
    public static final Target CAMPO_LOGOUT = Target
            .the("opcion logout")
            .located(id("test-LOGOUT"));
    public static final Target CAMPO_VALIDACION = Target
            .the("opcion titulo pagina de inicio-validacion")
            .located(xpath("(//XCUIElementTypeOther[@name=\"LOGIN\"])[1]/XCUIElementTypeOther[6]/XCUIElementTypeImage"));

}
