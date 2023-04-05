package android.demoapk.questions;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.targets.TheTarget;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RespuestaLoginSinUsername {

    public static final Target FALTA_USERNAME=Target.the("")
            .located(By.id("Username is required"));

    public static Question<String> isEqualTo(){
        return TheTarget.textOf(FALTA_USERNAME);
    }

    private RespuestaLoginSinUsername(){

    }
}
