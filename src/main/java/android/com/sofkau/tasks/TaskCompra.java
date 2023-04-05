package android.com.sofkau.tasks;
import android.com.sofkau.userinterface.CompraUI;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class TaskCompra implements Task {
    private String name, lastname, zipcode;

    public TaskCompra(String name, String lastname, String zipcode){
        this.name=name;
        this.lastname=lastname;
        this.zipcode=zipcode;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(CompraUI.BTN_ADD_CARRITO),
                Click.on(CompraUI.BTN_VER_CARRITO),
                Click.on(CompraUI.BTN_CHECKOUT),
                Click.on(CompraUI.BTN_NOMBRE),
                Enter.theValue(name).into(CompraUI.BTN_NOMBRE),
                Click.on(CompraUI.BTN_NOMBREDOS),
                Enter.theValue(lastname).into(CompraUI.BTN_NOMBREDOS),
                Click.on(CompraUI.BTN_ZIPCODE),
                Enter.theValue(zipcode).into(CompraUI.BTN_ZIPCODE),
                Click.on(CompraUI.BTN_CONTINUE),
                Click.on(CompraUI.BTN_FINISH)
        );
    }
    public  static TaskCompra taskCompra(String name, String lastname, String zipcode){
        return Instrumented.instanceOf(TaskCompra.class).withProperties(name,lastname,zipcode);
    }
}
