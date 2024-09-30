package com.uam.automation.ui.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;

public class PlaceOrder extends PageObject {
    public static final Target PLACE_ORDER = Target.the("Place order")
            .locatedBy("//button[@title='Place Order']");
    public static final Target ORDER_TOTAL = Target.the("Order total")
            .located(By.className("price"));

    public static final Target ALERT = Target.the("Alert").locatedBy("//h1[@class='page-title']");
}
