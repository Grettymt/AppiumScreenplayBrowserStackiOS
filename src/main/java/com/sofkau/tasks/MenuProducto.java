package com.sofkau.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.sofkau.userinterface.MenuProducto.*;

public class MenuProducto implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(SELECT_PRODUCTO_1),
                Click.on(SELECT_PRODUCTO_2),
                Click.on(SELECT_PRODUCTO_3),
                Click.on(VER_CARRITO),
                Click.on(BOTON_CHECKOUT)

        );

    }


    public static MenuProducto menuProducto() {
        return new MenuProducto();
    }

}
