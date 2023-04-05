package com.sofkau.question;

import io.appium.java_client.MobileBy;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.targets.TheTarget;
import net.serenitybdd.screenplay.targets.Target;

public class ResultadoLogin {


    public static final Target MENSAJE_LOGIN = Target
            .the("MENSAJE DE LOGIN")
            .located(MobileBy.xpath("//XCUIElementTypeStaticText[@name=\"PRODUCTS\"]"));

    public static Question<String> isEqualTo(String producto) {
        return TheTarget.textOf(MENSAJE_LOGIN);
    }

    private ResultadoLogin() {
    }


}
