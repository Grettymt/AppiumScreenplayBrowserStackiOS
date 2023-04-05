package com.sofkau.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import static com.sofkau.userinterface.DatosComprador.*;

public class DatosComprar implements Task {


    private String nombre;
    private String apellido;
    private String codigoP;


    public DatosComprar conElUsuario(String nombre) {
        this.nombre = nombre;
        return this;
    }


    public DatosComprar yconElApallido(String apellido) {
        this.apellido = apellido;
        return this;
    }


    public DatosComprar yconElCodigo(String codigoP) {
        this.codigoP = codigoP;
        return this;
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(nombre).into(CAMPO_NOMBRE),
                Enter.theValue(apellido).into(CAMPO_APELLIDO),
                Enter.theValue(codigoP).into(CAMPO_CODIGOP),
                Click.on(BOTON_CONTINUAR)
        );

    }


    public static DatosComprar datosComprador() {
        return new DatosComprar();
    }


}
