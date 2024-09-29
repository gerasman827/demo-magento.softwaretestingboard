package com.uam.automation.ui.tasks;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;


import static com.uam.automation.ui.userinterface.ShippingAddress.*;

public class ShippingAddress implements Task {
    @Override
    @Step ("{0} Shipping address")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue("Universidad Autónoma de Manizales").into(SHIPPING_ADDRESS_COMPANY),
                Enter.theValue("Universidad Autónoma de Manizales").into(SHIPPING_ADDRESS_STREETADDRESS),
                Enter.theValue("Manizales").into(SHIPPING_ADDRESS_CITY),
                Click.on(SHIPPING_ADDRESS_STATE),
                Click.on(SHIPPING_ADDRESS_STATE_CALDAS),
                Enter.theValue("170001").into(SHIPPING_ADDRESS_POSTALCODE),
                Click.on(SHIPPING_ADDRESS_COUNTRY),
                SelectFromOptions.byValue("CO").from(SHIPPING_ADDRESS_COUNTRY),
                Enter.theValue("3136620429").into(SHIPPING_ADDRESS_PHONE_NUMBER),
                Click.on(BUTTON_NEXT)
        );
    }

    public static ShippingAddress with() {
        return Instrumented.instanceOf(ShippingAddress.class).withProperties();
    }
}
