package android.demoapk.userinterface;

import io.appium.java_client.MobileBy;
import net.serenitybdd.screenplay.targets.Target;

public class CatalogoUI {

    public static final Target PRODUCTO_SELECCIONADO = Target.the("Producto seleccionado")
            .located(MobileBy.AccessibilityId("Sauce Labs Backpack"));

}
