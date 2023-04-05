package android.demoapk.setup;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static android.demoapk.driver.IOSDriver.DRIVER;
import static android.demoapk.driver.IOSDriver.configureDriver;
import static android.demoapk.util.Log4j.LOG4J_PROPERTIES_FILE_PATH;
import static com.google.common.base.StandardSystemProperty.USER_DIR;
import org.apache.log4j.PropertyConfigurator;

public class SetUp {
    protected static final Actor ACTOR = Actor.named("Ivan");
    private void setupUser() {
        OnStage.setTheStage(new OnlineCast());
        try{
            ACTOR.can(BrowseTheWeb.with(configureDriver().start()));
        }catch (Exception e){
            DRIVER.quit();
        }
    }
    protected void configurarCelular() {
        setupUser();
        setUplog4j();
    }
    private void setUplog4j() {
        PropertyConfigurator.configure(USER_DIR.value() + LOG4J_PROPERTIES_FILE_PATH.getValue());
    }
    protected void quitarDriver() {
        DRIVER.quit();
    }
}
