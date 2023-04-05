package android.demoapk.questions;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.targets.TheTarget;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RespuestaLoginNoRegistrado {

    public static final Target RESPUESTA_LOGIN_NO_REGISTRADO=Target.the("")
            .located(By.xpath("Provided credentials do not match any user in this service."));

    public static Question<String> isEqualTo(){
        return TheTarget.textOf(RESPUESTA_LOGIN_NO_REGISTRADO);
    }
    private RespuestaLoginNoRegistrado(){

    }
}
