package android.demoapk.questions;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.targets.TheTarget;

import static android.demoapk.userinterface.MensajeFinalUI.MENSAJE_FINAL_COMPRA;

public class MensajeCompraExitosa {

    public static Question<String> isEqualTo() {
        return TheTarget.textOf(MENSAJE_FINAL_COMPRA);
    }
    private MensajeCompraExitosa() {
    }
}
