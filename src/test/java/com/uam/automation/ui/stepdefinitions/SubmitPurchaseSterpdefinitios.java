package com.uam.automation.ui.stepdefinitions;

import com.uam.automation.ui.tasks.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.ensure.Ensure;
import static com.uam.automation.ui.userinterface.PlaceOrder.ALERT;


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
        try {
            Thread.sleep(5000); // 10-second pause while browser loads
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        actor.attemptsTo(ShippingAddress.with());
        actor.attemptsTo(PlaceOrder.with());
    }
    @Then("{actor} should complete the purchase successfully")
    public void heShouldCompleteThePurchaseSuccessfully(Actor actor) {
        try {
            Thread.sleep(5000); // 10-second pause while browser loads
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        actor.attemptsTo(Ensure.that(ALERT).text().contains("Thank you for your purchase!"));
    }
}
