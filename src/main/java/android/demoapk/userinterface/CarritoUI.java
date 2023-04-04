package android.demoapk.userinterface;

import io.appium.java_client.MobileBy;
import net.serenitybdd.screenplay.targets.Target;

public class CarritoUI {

    public static final Target CAMPO_NAME = Target.the("Campo nombre")
            .located(MobileBy.AccessibilityId("Full Name* input field"));

    public static final Target CAMPO_CITY = Target.the("Campo ciudad")
            .located(MobileBy.AccessibilityId("City* input field"));

    public static final Target CAMPO_ADDRESS = Target.the("Campo direccion")
            .located(MobileBy.AccessibilityId("Address Line 1* input field"));

    public static final Target CAMPO_ZIP = Target.the("Campo codigo postal")
            .located(MobileBy.AccessibilityId("Zip Code* input field"));

    public static final Target CAMPO_PAIS = Target.the("Campo pais")
            .located(MobileBy.AccessibilityId("Country* input field"));

    public static final Target BTN_PAGAR = Target.the("Boton pagar")
            .located(MobileBy.AccessibilityId("To Payment button"));

}
