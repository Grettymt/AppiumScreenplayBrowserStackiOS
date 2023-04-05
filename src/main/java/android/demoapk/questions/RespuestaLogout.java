package android.demoapk.questions;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.targets.TheTarget;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RespuestaLogout {

    public static final Target RESPUESTA_LOGOUT=Target.the("")
            .located(By.xpath("//XCUIElementTypeStaticText[@name=\"You are successfully logged out.\"]"));

    public static Question<String> isEqualTo(){
        return TheTarget.textOf(RESPUESTA_LOGOUT);
    }
}
