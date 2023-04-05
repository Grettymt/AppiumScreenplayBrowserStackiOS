package android.demoapk.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.targets.TheTarget;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CompraProductoQuestion {
   public static final Target FINALIZACION_COMPRA = Target
           .the("Mensaje finalizacion compra")
           .located(By.id("Thank you for your order"));
   public static Question<String> isEqualTo(){
       return TheTarget.textOf(FINALIZACION_COMPRA);
   }
   private CompraProductoQuestion(){

   }
}
