package android.com.sofkau.userinterface;
import net.serenitybdd.screenplay.targets.Target;
import static org.openqa.selenium.By.xpath;
import static org.openqa.selenium.By.id;

public class CompraUI {

    public static final Target BTN_ADD_CARRITO = Target
            .the("opcion annadir al carrito")
            .located(xpath("(//XCUIElementTypeOther[@name=\"test-ADD TO CART\"])[1]"));
    public static final Target BTN_VER_CARRITO = Target
            .the("opcion ver carrito")
            .located(xpath("(//XCUIElementTypeOther[@name=\"1\"])[4]"));
    public static final Target BTN_CHECKOUT = Target
            .the("opcion checkout")
            .located(id("test-CHECKOUT"));
    //aca va el loguin
    public static final Target BTN_NOMBRE = Target
            .the("opcion nombre")
            .located(id("test-First Name"));
    public static final Target BTN_NOMBREDOS = Target
            .the("opcion apellido")
            .located(id("test-Last Name"));
    public static final Target BTN_ZIPCODE = Target
            .the("opcion codigo postal")
            .located(id("test-Zip/Postal Code"));
    public static final Target BTN_CONTINUE = Target
            .the("boton continuar")
            .located(id("test-CONTINUE"));

    public static final Target BTN_FINISH = Target
            .the("boton finalizar")
            .located(id("FINISH"));
    public static final Target BTN_VALIDACION = Target
            .the("opcion validacion")
            .located(id("THANK YOU FOR YOU ORDER"));
}
