package com.uam.automation.ui.tasks;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.uam.automation.ui.userinterface.ShowMyCart.*;

public class ShowMyCart implements Task {
    @Override
    @Step("{0} Proceed to checkout")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(VIEW_MY_CART),
                Click.on(PROCEED_CHECKOUT)
        );
    }

    public static ShowMyCart with() {
        return Instrumented.instanceOf(ShowMyCart.class).withProperties();
    }
}
