package android.demoapk.questions;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.targets.TheTarget;

import static android.demoapk.userinterface.HomeUI.MENSAJE_LOGIN;

public class MensajeInicioSesion {
        public static Question<String> isEqualTo() {
            return TheTarget.textOf(MENSAJE_LOGIN);
        }
        private MensajeInicioSesion() {
        }
}
