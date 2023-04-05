package android.demoapk.runner;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/login_logout_compra.feature",
        glue = "android.demoapk.stepdefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        tags="@Compra"
)
public class LogoutRunner {
}
