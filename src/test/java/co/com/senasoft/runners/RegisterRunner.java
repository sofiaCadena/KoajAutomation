package co.com.senasoft.runners;

import io.cucumber.junit.CucumberOptions;
import jxl.demo.Features;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/Register.feature",
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        glue = "co.com.senasoft.stepsdefinitions"

)
public class RegisterRunner {

}
