package android.com.sofkau.userinterface;

import io.appium.java_client.MobileBy;
import net.serenitybdd.screenplay.targets.Target;

import static org.openqa.selenium.By.xpath;
import static org.openqa.selenium.By.id;

public class LogInUI {
    public static final Target CAMPO_NOMBRE = Target
            .the("opcion nombre")
            .located(id("test-Username"));
    public static final Target CAMPO_CONTRASENNA = Target
            .the("opcion contrasenna")
            .located(id("test-Password"));
    public static final Target BTN_LOGIN = Target
            .the("boton loguearse")
            .located(id("test-LOGIN"));
    public static final Target BTN_VALIDATION = Target
            .the("boton validacion")
            .located(xpath("//XCUIElementTypeStaticText[@name=\"PRODUCTS\"]"));



}
