package android.demoapk.userinterface;

import io.appium.java_client.MobileBy;
import net.serenitybdd.screenplay.targets.Target;

public class AddProductsUI {
    public static final Target PRODUCTO = Target
            .the("agregar producto")
            .located(MobileBy.xpath("(//XCUIElementTypeOther[@name=\"test-ADD TO CART\"])[1]"));

    public static final Target CARRITO = Target
            .the("agregar producto")
            .located(MobileBy.xpath("(//XCUIElementTypeOther[@name=\"1\"])[4]"));

    public static final Target BTN_CHECKOUT = Target
            .the("Boton Checkout")
            .located(MobileBy.AccessibilityId("test-CHECKOUT"));


}
