package android.demoapk.questions;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.targets.TheTarget;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LogoutQuestion {
    public static final Target BOTON_CONFIRMACION_LOGOUT = Target
            .the("Boton confirmacion logout")
            .located(By.id("OK"));
    public static Question<String> isEqualTo(){
        return TheTarget.textOf(BOTON_CONFIRMACION_LOGOUT);
    }
    private LogoutQuestion() {
    }
}
