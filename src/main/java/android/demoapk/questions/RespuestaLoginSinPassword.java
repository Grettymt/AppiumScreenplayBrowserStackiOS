package android.demoapk.questions;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.targets.TheTarget;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RespuestaLoginSinPassword {

    public static final Target FALTA_CONTRASENIA=Target.the("")
            .located(By.id("Password is required"));

    public static Question<String> isEqualTo(){
        return TheTarget.textOf(FALTA_CONTRASENIA);
    }

    private RespuestaLoginSinPassword(){

    }
}
