package com.sofkau.userinterface;

import io.appium.java_client.MobileBy;
import net.serenitybdd.screenplay.targets.Target;

public class MenuProducto {



    public static final Target BOTO = Target
            .the("USER")
            .located(MobileBy.AccessibilityId("menu item log in"));




    public static final Target BOTON_LOGUO = Target
            .the("USER")
            .located(MobileBy.AccessibilityId("menu item log out"));



    public static final Target SELECT_PRODUCTO = Target
            .the("USER")
            .located(MobileBy.xpath("(//XCUIElementTypeOther[@name=\"test-ADD TO CART\"])[2]"));



    public static final Target VER_CARRITO = Target
            .the("USER")
            .located(MobileBy.xpath("(//XCUIElementTypeOther[@name=\"1\"])[4]"));


    public static final Target BOTON_CHECKOUT = Target
            .the("USER")
            .located(MobileBy.AccessibilityId("test-CHECKOUT"));











}