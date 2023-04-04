package android.demoapk.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static android.demoapk.userinterface.HomeUI.OPCION_CATALOGO;
import static android.demoapk.userinterface.LoginUI.*;

public class Login implements Task {
    private String user;
    private String password;

    public Login conElUser(String user){
        this.user = user;
        return this;
    }
    public Login yLaPassword(String password){
        this.password = password;
        return this;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(user).into(CAMPO_USER),
                Enter.theValue(password).into(CAMPO_PSSWD),
                Click.on(LOGIN_BUTTON),
                Click.on(OPCION_CATALOGO)
        );
    }

    public static Login login(){
        return new Login();
    }
}
