package android.demoapk.userinterface;

import io.appium.java_client.MobileBy;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LogInUI {

    public static final Target MENU=Target.the("")
            .located(By.id("tab bar option menu"));

    public static final Target LOGIN=Target.the("")
            .located(By.id("menu item log in"));

    //CREDENCIALES

    public static final Target CAMPO_USERNAME=Target.the("")
            .located(By.id("Username input field"));

    public static final Target CAMPO_CONTRASENIA=Target.the("")
            .located(By.id("Password input field"));

    public static final Target BOTON_LOGIN=Target.the("")
            .located(By.id("Login button"));


}
