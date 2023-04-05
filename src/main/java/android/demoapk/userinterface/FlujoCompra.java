package android.demoapk.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

import java.lang.reflect.Field;

public class FlujoCompra {

    public static final Target CARRITO=Target.the("")
            .located(By.id("tab bar option cart"));
    public static final Target BOTON_PROCED_CHECKOUT=Target.the("")
            .located(By.id("Proceed To Checkout button"));
    public static final Target CAMPO_NOMBRE=Target.the("")
            .located(By.id("Full Name* input field"));
    public static final Target CAMPO_ADRESS1=Target.the("")
            .located(By.id("Address Line 1* input field"));
    public static final Target CAMPO_ADRESS2=Target.the("")
            .located(By.id("Address Line 2 input field"));
    public static final Target CITY=Target.the("")
            .located(By.id("City* input field"));
    public static final Target STATE_REGION=Target.the("")
            .located(By.id("State/Region input field"));

    public static final Target ZIP_CODE=Target.the("")
            .located(By.id("Zip Code* input field"));
    public static final Target COUNTRY=Target.the("")
            .located(By.id("Country* input field"));
    public static final Target BOTON_PAYMENT=Target.the("")
            .located(By.id("To Payment button"));

    //TARJETA DE CREDITO
    public static final Target NOMBRE_TARJETA=Target.the("")
            .located(By.id("Full Name* input field"));
    public static final Target NUMERO_TARJETA=Target.the("")
            .located(By.id("Card Number* input field"));
    public static final Target FECHA_TARJETA=Target.the("")
            .located(By.id("Expiration Date* input field"));

    public static final Target CODIGO_TARJETA=Target.the("")
            .located(By.id("Security Code* input field"));

    public static final Target BOTON_REVIEW_ORDER=Target.the("")
            .located(By.id("Review Order button"));

    public static final Target BOTON_PLACE_ORDER=Target.the("")
            .located(By.id("Place Order button"));

    public static final Target RETURN=Target.the("")
            .located(By.id("Return"));

    public static final Target QUITAR_TECLADO_NUMERICO=Target.the("")
            .located(By.className("//XCUIElementTypeStaticText[@name=\"Full Name*\"]"));

}
