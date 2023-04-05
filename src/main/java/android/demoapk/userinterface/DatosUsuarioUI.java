package android.demoapk.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DatosUsuarioUI {
    public static final Target CAMPO_NOMBRE_CLIENTE = Target.the("Ingresar nombre cliente")
            .located(By.id("Full Name* input field"));
    public static final Target CAMPO_DIRECCION_CLIENTE = Target.the("Ingresar direccion cliente")
            .located(By.id("Address Line 1* input field"));
    public static final Target CAMPO_CIUDAD = Target.the("Ingresar ciudad cliente")
            .located(By.id("City* input field"));
    public static final Target CAMPO_ESTADO = Target.the("Ingresar estado cliente")
            .located(By.id("State/Region input field"));
    public static final Target CAMPO_CODIGO_POSTAL = Target.the("Ingresar codigo postal")
            .located(By.id("Zip Code* input field"));
    public static final Target CAMPO_PAIS = Target.the("Ingresar pais cliente")
            .located(By.id("Country* input field"));
    public static final Target BOTON_IR_A_PAGOS = Target.the("Boton ir a pagos")
            .located(By.id("To Payment button"));
}
