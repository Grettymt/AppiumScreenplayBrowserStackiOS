package android.demoapk.userinterface;

import io.appium.java_client.MobileBy;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LogInUI {
    public static final Target MENU_PRINCIPAL = Target.the("Menu principal")
            .located(By.id("tab bar option menu"));
    public static final Target MENU_LOGIN = Target.the("Menu login")
            .located(By.id("menu item log in"));
    public static final Target INGRESO_USUARIO = Target.the("Ingreso datos usuario")
            .located(By.id("Username input field"));
    public static final Target INGRESO_PASSWORD = Target.the("Ingreso datos password")
            .located(By.id("Password input field"));
    public static final Target BOTON_LOGIN = Target.the("Boton Login")
            .located(By.id("Login button"));
}
