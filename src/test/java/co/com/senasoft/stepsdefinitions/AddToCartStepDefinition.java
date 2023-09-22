package co.com.senasoft.stepsdefinitions;

import co.com.senasoft.tasks.AddToCart;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;

public class AddToCartStepDefinition {

    @When("the user clicks on the product category")
    public void theUserClicksOnTheProductCategory() throws InterruptedException {
        OnStage.theActorInTheSpotlight().attemptsTo(AddToCart.prueba());
        Thread.sleep(9000);
    }
    @When("the user select a product")
    public void theUserSelectAProduct() {

    }
    @Then("the user should see the add to cart confirmation")
    public void theUserShouldSeeTheAddToCartConfirmation() {

    }
}
