package android.com.sofkau.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import static android.com.sofkau.userinterface.GeolocalizacionUI.*;

public class TaskGeolocalizacion implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(CAMPO_MENU),
                Click.on(CAMPO_GEOLOCALIZACION),
                Click.on(CAMPO_ACEPTERMINOS)
        );
    }
    public static TaskGeolocalizacion taskGeolocalizacion(){
        return new TaskGeolocalizacion();
    }
}
