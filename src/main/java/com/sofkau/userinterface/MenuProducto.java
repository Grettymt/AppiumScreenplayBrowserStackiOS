package com.sofkau.userinterface;

import io.appium.java_client.MobileBy;
import net.serenitybdd.screenplay.targets.Target;

public class MenuProducto {


    public static final Target SELECT_PRODUCTO_1 = Target
            .the("PRODUCTO 1")
            .located(MobileBy.xpath("(//XCUIElementTypeOther[@name=\"test-ADD TO CART\"])[1]"));


    public static final Target SELECT_PRODUCTO_2 = Target
            .the("PRODUCTO 2")
            .located(MobileBy.xpath("(//XCUIElementTypeOther[@name=\"test-ADD TO CART\"])[2]"));



    public static final Target SELECT_PRODUCTO_3 = Target
            .the("PRODUCTO 3")
            .located(MobileBy.xpath("(//XCUIElementTypeOther[@name=\"test-ADD TO CART\"])[3]"));



    public static final Target VER_CARRITO = Target
            .the("VER EL CARRITO")
            .located(MobileBy.xpath("(//XCUIElementTypeOther[@name=\"3\"])[4]"));


    public static final Target BOTON_CHECKOUT = Target
            .the("BOTON CHECKOUT")
            .located(MobileBy.AccessibilityId("test-CHECKOUT"));



}