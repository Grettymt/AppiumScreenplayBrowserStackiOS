package android.demoapk.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

public class LlenarFormularioTarjeta implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

        );
    }
    public static LlenarFormularioTarjeta llenarFormularioTarjeta(){
        return new LlenarFormularioTarjeta();
    }
}
