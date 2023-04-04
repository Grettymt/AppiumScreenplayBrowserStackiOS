package android.demoapk.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static android.demoapk.userinterface.FormDatosUI.*;

public class FormDatosTask implements Task {
    private String name;
    private String lastName;
    private String zipCode;

    public FormDatosTask conElName(String name) {
        this.name=name;
        return this;
    }

    public FormDatosTask conElLastName(String lastName) {
        this.lastName=lastName;
        return this;
    }

    public FormDatosTask conElZipCode(String zipCode) {
        this.zipCode=zipCode;
        return this;
    }



    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(name).into(CAMPO_NOMBRE),
                Enter.theValue(lastName).into(CAMPO_APELLIDO),
                Enter.theValue(zipCode).into(CAMPO_ZIP_CODE),
                Click.on(BTN_CONTINUE)
        );
    }

    public static FormDatosTask formDatosTask() {return new FormDatosTask();}
}
