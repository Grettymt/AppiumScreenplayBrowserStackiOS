package android.demoapk.tasks.login;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;

import static android.demoapk.userinterface.LogInUI.LOGIN_USERNAME;

public class IngresarUsuario implements Task {
    private CharSequence usuario;
    public IngresarUsuario conElUsuario(String usuario){
        this.usuario=usuario;
        return this;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(usuario).into(LOGIN_USERNAME)
        );
    }
    public static IngresarUsuario ingresarUsuario(){ return new IngresarUsuario(); }
}
