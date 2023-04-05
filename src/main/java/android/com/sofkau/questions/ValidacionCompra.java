package android.com.sofkau.questions;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.targets.TheTarget;

import static android.com.sofkau.userinterface.CompraUI.BTN_VALIDACION;

public class ValidacionCompra {
    public static Question<String> isEqualTo(){
        return TheTarget.textOf(BTN_VALIDACION);
    }

    private ValidacionCompra() {

    }
}
