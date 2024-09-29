package com.uam.automation.ui.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;

public class ShowMyCart extends PageObject {
    public static final Target VIEW_MY_CART = Target.the("View my cart")
            .locatedBy("//a[contains(@class, 'showcart')]");
    public static final Target PROCEED_CHECKOUT = Target.the("Proceed checkout")
            .located(By.id("top-cart-btn-checkout"));
}
