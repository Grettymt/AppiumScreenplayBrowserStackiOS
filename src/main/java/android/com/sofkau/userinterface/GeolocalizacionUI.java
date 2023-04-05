package android.com.sofkau.userinterface;

import net.serenitybdd.screenplay.targets.Target;

import static org.openqa.selenium.By.id;

public class GeolocalizacionUI {

    public static final Target CAMPO_MENU = Target
            .the("opcion menu")
            .located(id("test-Menu"));
    public static final Target CAMPO_GEOLOCALIZACION = Target
            .the("opcion geo-localizacion")
            .located(id("test-GEO LOCATION"));
    public static final Target CAMPO_ACEPTERMINOS = Target
            .the("opcion aceptar terminos")
            .located(id("Allow While Using App"));
    public static final Target CAMPO_VALIDACION1 = Target
            .the("opcion validacion1")
            .located(id("Latitude:"));
    public static final Target CAMPO_VALIDACION2 = Target
            .the("opcion validacion2")
            .located(id("Longitude:"));
}
