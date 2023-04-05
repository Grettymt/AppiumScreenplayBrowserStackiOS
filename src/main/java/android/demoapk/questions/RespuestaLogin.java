package android.demoapk.questions;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.targets.TheTarget;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RespuestaLogin {

    public static final Target RESPUESTA_LOGIN=Target.the("")
            .located(By.xpath("//XCUIElementTypeStaticText[@name=\"Products\"]"));

    public static Question<String> isEqualTo(){
        return TheTarget.textOf(RESPUESTA_LOGIN);
    }
    private RespuestaLogin(){

    }
}
