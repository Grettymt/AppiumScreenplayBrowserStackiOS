package android.demoapk.questions;

import io.appium.java_client.MobileBy;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.targets.TheTarget;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RespuestaLoginBloqueado {

    public static final Target USUARIO_BLOQUEAD=Target.the("")
            .located(MobileBy.AccessibilityId("Sorry, this user has been locked out."));

    public static Question<String> isEqualTo(){
        return TheTarget.textOf(USUARIO_BLOQUEAD);
    }

    private RespuestaLoginBloqueado(){

    }
}
