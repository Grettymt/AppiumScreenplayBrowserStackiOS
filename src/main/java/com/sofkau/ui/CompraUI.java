package com.sofkau.ui;

import io.appium.java_client.MobileBy;
import net.serenitybdd.screenplay.targets.Target;

public class CompraUI {
    public static final Target PRODUCTO = Target.the("Producto")
            .located(MobileBy.AccessibilityId("Sauce Labs Bolt T-Shirt"));
    public static final Target COLOR = Target.the("Color")
            .located(MobileBy.AccessibilityId("black circle"));
    public static final Target CANTIDAD = Target.the("Cantidad")
            .located(MobileBy.AccessibilityId("counter plus button"));
    public static final Target ANNADIR_CARRITO = Target.the("Carrito")
            .located(MobileBy.AccessibilityId("Add To Cart button"));
    public static final Target IR_CARRITO = Target.the("ir al carrito")
            .located(MobileBy.AccessibilityId("tab bar option cart"));
    public static final Target PASAR_AL_PAGO = Target.the("pasar al pago")
            .located(MobileBy.AccessibilityId("Proceed To Checkout button"));
}