package com.uam.automation.ui.stepdefinitions;

import com.uam.automation.ui.tasks.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;

public class SubmitPurchaseSterpdefinitios {

    @Given("{actor} is navigating on the online store")
    public void navigatingOnOnlineStore(Actor actor) {
        actor.wasAbleTo(Login.with());
    }

    @When("{actor} selects and purchases a product")
    public void heSelectsAndurchasesAproduct(Actor actor) {
        actor.attemptsTo(SubmitFormLogin.with());
        actor.attemptsTo(SearchProduct.with());
        actor.attemptsTo(AddToCardProduct.with());
        actor.attemptsTo(ShowMyCart.with());
        actor.attemptsTo(ShippingAddress.with());
    }
    @Then("{actor} should complete the purchase successfully")
    public void heShouldCompleteThePurchaseSuccessfully(Actor actor) {
        // Write code here that turns the phrase above into concrete actions

    }
}
