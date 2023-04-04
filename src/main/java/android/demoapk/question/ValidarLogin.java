package android.demoapk.question;

import io.appium.java_client.MobileBy;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.targets.TheTarget;
import net.serenitybdd.screenplay.targets.Target;

public class ValidarLogin {
    public static final Target MENSAJE_PRODUCTO = Target
            .the("Campo escribir usuario")
            .located(MobileBy.xpath("//XCUIElementTypeStaticText[@name=\"PRODUCTS\"]"));

    public static Question<String> isEqualTo(){
        return TheTarget.textOf(MENSAJE_PRODUCTO);
    }

    private ValidarLogin() {

    }
}
