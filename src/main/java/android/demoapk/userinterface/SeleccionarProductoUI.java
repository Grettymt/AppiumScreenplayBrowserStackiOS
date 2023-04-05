package android.demoapk.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SeleccionarProductoUI {
    public static final Target BOTON_ORGANIZAR = Target.the("Boton organizar productos")
            .located(By.id("sort button"));
    public static final Target PRECIO_ASCENDENTE = Target.the("Boton organizar precio ascendente")
            .located(By.id("Price - Ascending"));
    public static final Target PRODUCTO_ONESIE = Target.the("Producto menor precio")
            .located(By.id("Sauce Labs Onesie"));
    public static final Target BOTON_COLOR_NEGRO = Target.the("Boton producto color negro")
            .located(By.id("black circle"));
    public static final Target BOTON_AGREGAR_CARRITO = Target.the("Boton agregar al carrito")
            .located(By.id("Add To Cart button"));
    public static final Target BOTON_CARRITO_COMPRAS = Target.the("Boton carrito compras")
            .located(By.id("tab bar option cart"));
    public static final Target BOTON_CHECKOUT = Target.the("Boton checkout")
            .located(By.id("Proceed To Checkout button"));
}
