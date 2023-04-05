package android.demoapk.questions;


import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.targets.TheTarget;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RespuestaCompra {

    public static final Target CONFIRMACION_COMPRA=Target.the("")
            .located(By.id("Checkout Complete"));

    public static Question<String> isEqualTo(){
        return TheTarget.textOf(CONFIRMACION_COMPRA);
    }
    private RespuestaCompra(){
    }
}
