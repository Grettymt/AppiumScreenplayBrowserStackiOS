package android.demoapk.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SeleccionarProducto {

    public static final Target CAMISETA=Target.the("")
            .located(By.id("Sauce Labs Bolt T-Shirt"));

    public static final Target MOCHILA=Target.the("")
            .located(By.id("Sauce Labs Backpack"));

    public static final Target BOTON_ADD_CART=Target.the("")
            .located(By.id("Add To Cart button"));

    public static final Target SUMAR_CANTIDAD=Target.the("")
            .located(By.id("counter plus button"));


}
