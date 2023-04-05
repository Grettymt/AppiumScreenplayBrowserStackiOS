package android.demoapk.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class TarjetaCreditoUI {
    public static final Target CAMPO_NOMBRE_TARJETA = Target.the("Ingresar nombre tarjeta de credito")
            .located(By.id("Full Name* input field"));
    public static final Target CAMPO_NUMERO_TARJETA = Target.the("Ingresar numero tarjeta de credito")
            .located(By.id("Card Number* input field"));
    public static final Target CAMPO_FECHA_EXP_TARJETA = Target.the("Ingresar fecha expiracion tarjeta de credito")
            .located(By.id("Expiration Date* input field"));
    public static final Target CAMPO_CODIGO_SEG_TARJETA = Target.the("Ingresar codigo seguridad tarjeta de credito")
            .located(By.id("Security Code* input field"));
    public static final Target TAP_NOMBRE = Target.the("Tap para quitar teclado numerico")
            .located(By.className("//XCUIElementTypeStaticText[@name= \"Full Name*\"]"));
    public static final Target BOTON_ORDEN = Target.the("Boton revisar orden")
            .located(By.id("Review Order button"));
    public static final Target BOTON_TERMINAR_ORDEN = Target.the("Boton completar orden")
            .located(By.id("Place Order button"));
}
