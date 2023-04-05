package com.sofkau.question;

import io.appium.java_client.MobileBy;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.targets.TheTarget;
import net.serenitybdd.screenplay.targets.Target;

public class ResultLogout {


    public static final Target MENSAJE_LOGOUT = Target
            .the("MENSAJE DE LOGIN")
            .located(MobileBy.AccessibilityId("The currently accepted usernames for this application are (tap to autofill):"));

    public static Question<String> isEqualTo(String producto) {
        return TheTarget.textOf(MENSAJE_LOGOUT);
    }

    private ResultLogout() {
    }

}
