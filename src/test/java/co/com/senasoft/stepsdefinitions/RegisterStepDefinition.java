package co.com.senasoft.stepsdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

public class RegisterStepDefinition {
    @Managed
    WebDriver hisBrowser;

    @Before
    public void setUp(){
        OnStage.setTheStage(Cast.ofStandardActors());
        OnStage.theActorCalled("user");
        OnStage.theActorInTheSpotlight().can(BrowseTheWeb.with(hisBrowser));
    }
    @Given("That the user enters to the web page")
    public void thatTheUserEntersToTheWebPage() throws InterruptedException {
       OnStage.theActorInTheSpotlight().wasAbleTo(Open.url("https://www.koaj.co/"));
    }

    @When("the user hover on the user icon")
    public void theUserHoverOnTheUserIcon() {

    }

    @And("the user clicks on the registrate button")
    public void theUserClicksOnTheRegistrateButton() {

    }

    @And("the user enters the credentials")
    public void theUserEntersTheCredentials() {

    }

    @Then("the user should enter to the successful register page")
    public void theUserShouldEnterToTheSuccessfulRegisterPage() {

    }

}
