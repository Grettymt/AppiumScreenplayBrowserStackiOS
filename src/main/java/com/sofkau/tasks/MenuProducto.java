package com.sofkau.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.jsoup.parser.Tag;

import javax.swing.text.html.HTML;

import static com.sofkau.userinterface.LogInUI.*;
import static com.sofkau.userinterface.LogInUI.BOTON_LOGIN;
import static com.sofkau.userinterface.MenuProducto.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;

public class MenuProducto implements Task {




    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(SELECT_PRODUCTO),
                Click.on(VER_CARRITO),
                Click.on(BOTON_CHECKOUT)


        );

    }


    public static MenuProducto menuProducto() {
        return new MenuProducto();
    }

}
