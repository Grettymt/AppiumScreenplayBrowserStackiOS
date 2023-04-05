package android.demoapk.question;

import io.appium.java_client.MobileBy;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.targets.TheTarget;
import net.serenitybdd.screenplay.targets.Target;

public class ValidarLogout {
    public static final Target CONFIRMAR_LOGOUT = Target
            .the("Texto para confirmar el logout")
            .located(MobileBy.AccessibilityId("test-Username"));

    public static Question<String> isEqualTo(){
        return TheTarget.textOf(CONFIRMAR_LOGOUT);
    }

    private ValidarLogout() {

    }
}
