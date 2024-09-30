package com.uam.automation.ui.tasks;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import static com.uam.automation.ui.userinterface.PlaceOrder.*;

public class PlaceOrder  implements Task {
    @Override
    @Step ("{0} Place order")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(PLACE_ORDER)
        );
    }

    public static PlaceOrder with() {
        return Instrumented.instanceOf(PlaceOrder.class).withProperties();
    }
}
