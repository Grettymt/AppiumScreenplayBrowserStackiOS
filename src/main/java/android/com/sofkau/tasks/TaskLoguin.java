package android.com.sofkau.tasks;

import io.github.cdimascio.dotenv.Dotenv;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static android.com.sofkau.userinterface.LogInUI.*;

public class TaskLoguin implements Task {
    Dotenv dotenv = Dotenv.configure().load();
    public static TaskLoguin conLaInformacion (){
        return new TaskLoguin();
    }
    private String username= dotenv.get("USER_APP");
    private String password= dotenv.get("PASSWORD_APP");

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(CAMPO_NOMBRE),
                Enter.theValue(username).into(CAMPO_NOMBRE),
                Click.on(CAMPO_CONTRASENNA),
                Enter.theValue(password).into(CAMPO_CONTRASENNA),
                Click.on(BTN_LOGIN)
        );

    }


}
