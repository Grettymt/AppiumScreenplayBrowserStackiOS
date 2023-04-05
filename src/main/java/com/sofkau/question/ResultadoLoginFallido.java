package com.sofkau.question;

import io.appium.java_client.MobileBy;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.targets.TheTarget;
import net.serenitybdd.screenplay.targets.Target;

public class ResultadoLoginFallido {


    public static final Target MENSAJE_LOGIN_FALLIDO = Target
            .the("MENSAJE DE LOGIN")
            .located(MobileBy.AccessibilityId("Username and password do not match any user in this service."));

    public static Question<String> isEqualTo(String producto) {
        return TheTarget.textOf(MENSAJE_LOGIN_FALLIDO);
    }

    private ResultadoLoginFallido() {
    }

}
