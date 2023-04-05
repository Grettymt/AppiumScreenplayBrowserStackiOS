package android.demoapk.stepdefinitions;
import android.demoapk.driver.IOSDriver;
import android.demoapk.questions.*;
import android.demoapk.tasks.CredencialesLogin;
import android.demoapk.tasks.FlujoALogin;
import android.demoapk.tasks.FlujoSeleccionProducto;
import com.ibm.icu.impl.Assert;
import io.cucumber.java.en.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.assertj.core.api.Assertions;
import org.openqa.selenium.JavascriptExecutor;

import java.net.MalformedURLException;
import java.util.logging.Logger;

import static android.demoapk.driver.IOSDriver.driver;
import static android.demoapk.tasks.CredencialesLogin.credencialesLogin;
import static android.demoapk.tasks.FlujoALogin.flujoALogin;
import static android.demoapk.tasks.FlujoCompraCompleto.flujoCompraCompleto;
import static android.demoapk.tasks.FlujoSeleccionProducto.flujoSeleccionProducto;
import static android.demoapk.tasks.Logout.logout;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.containsString;
public class LoginCompletoStepsDefinitions {
    public static java.util.logging.Logger LOGGER = Logger.getLogger(String.valueOf(LoginCompletoStepsDefinitions.class));

    @Given("{actor} esta en la interfaz principal de la app")
    public void userEstaEnLaInterfazPrincipalDeLaApp(Actor actor) {
        try {
            actor.can(BrowseTheWeb.with(IOSDriver.configureDriver().start()));
            actor.attemptsTo(
                    flujoALogin()
            );
        }catch (Exception e){
            LOGGER.warning(e.getMessage());
        }
    }
    @When("{actor} realiza el flujo hasta el login e introduce {string} y {string}")
    public void userRealizaElFlujoHastaElLoginEIntroduceY(Actor actor,String usuario, String contrasenia) {
        CredencialesLogin.user=usuario;
        CredencialesLogin.contra=contrasenia;
        try {
            actor.attemptsTo(
                    credencialesLogin()
            );
        }catch (Exception e){
            LOGGER.warning(e.getMessage());
        }
    }
    @Then("{actor} recibe un {string} segun este {int} {int} o le falte un {int}")
    public void userRecibeUnSegunEsteOLeFalteUn(Actor actor,String mensaje, Integer registrado, Integer bloqueado, Integer campo) {
        if(registrado==1){
            if(bloqueado==0){
                if(campo==0){
                    try {
                        actor.should(
                                seeThat(RespuestaLogin.isEqualTo(), containsString(mensaje))
                        );
                    }catch (Exception e){
                        LOGGER.warning(e.getMessage());
                        Assertions.fail(e.getMessage());
                    }
                }else if(campo==1){
                    try {
                        actor.should(
                                seeThat(RespuestaLoginSinUsername.isEqualTo(), containsString(mensaje))
                        );
                    }catch (Exception e){
                        LOGGER.warning(e.getMessage());
                        Assertions.fail(e.getMessage());
                    }
                }else if(campo==2){
                    try {
                        actor.should(
                                seeThat(RespuestaLoginSinPassword.isEqualTo(), containsString(mensaje))
                        );
                    }catch (Exception e){
                        LOGGER.warning(e.getMessage());
                        Assertions.fail(e.getMessage());
                    }
                }
            }else if(bloqueado==1){
                try {
                    actor.should(
                            seeThat(RespuestaLoginBloqueado.isEqualTo(), containsString(mensaje))
                    );
                }catch (Exception e){
                    LOGGER.warning(e.getMessage());
                    Assertions.fail(e.getMessage());
                }
            }
        }else if(registrado==0){
            try {
                actor.should(
                        seeThat(RespuestaLoginNoRegistrado.isEqualTo(), containsString(mensaje))
                );
            }catch (Exception e){
                LOGGER.warning(e.getMessage());
                Assertions.fail(e.getMessage());
            }
        }
    }
}
