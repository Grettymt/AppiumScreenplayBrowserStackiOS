package android.demoapk.question;

import io.appium.java_client.MobileBy;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.targets.TheTarget;
import net.serenitybdd.screenplay.targets.Target;

public class ValidarCompra {
    public static final Target MENSAJE_OVERVIEW = Target
            .the("Mensaje gracias por su orden")
            .located(MobileBy.AccessibilityId("THANK YOU FOR YOU ORDER"));

    public static Question<String> isEqualTo(){
        return TheTarget.textOf(MENSAJE_OVERVIEW);
    }

    private ValidarCompra() {

    }
}
