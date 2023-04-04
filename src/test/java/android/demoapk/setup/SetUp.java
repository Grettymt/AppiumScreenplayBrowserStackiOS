package android.demoapk.setup;

import net.serenitybdd.screenplay.Actor;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

public class SetUp {
    protected Actor actor = Actor.named("Jose");
    @Managed(driver = "Appium")
    protected WebDriver theMobileDevice;
}
