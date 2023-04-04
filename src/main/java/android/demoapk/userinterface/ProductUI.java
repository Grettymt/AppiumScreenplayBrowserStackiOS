package android.demoapk.userinterface;

import io.appium.java_client.MobileBy;
import net.serenitybdd.screenplay.targets.Target;

public class ProductUI {
    public static final Target BOTON_ADD_TO_CART = Target.the("Boton agregar al carrito")
            .located(MobileBy.AccessibilityId("Add To Cart button"));
}
