package android.demoapk.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.targets.TheTarget;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LogInQuestion {
    public static final Target VERIFICACION_LOGIN=Target.the("Banner Products")
            .located(By.xpath("//XCUIElementTypeStaticText[@name=\"Products\"]"));

    public static Question<String> isEqualTo(){
        return TheTarget.textOf(VERIFICACION_LOGIN);
    }
    private LogInQuestion(){

    }



}
