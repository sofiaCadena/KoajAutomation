package co.com.senasoft.runners;


import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/add_to_cart.feature",
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        glue = "co.com.senasoft.stepsdefinitions"
)
public class AddToCartRunner {
}
