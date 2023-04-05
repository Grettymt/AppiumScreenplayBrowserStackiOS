package android.com.sofkau.questions;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.targets.TheTarget;

import static android.com.sofkau.userinterface.LogInUI.BTN_VALIDATION;

public class ValidacionLoguinUser {

    public static Question<String> isEqualTo(){
        return TheTarget.textOf(BTN_VALIDATION);
    }

    private ValidacionLoguinUser() {

    }
}
