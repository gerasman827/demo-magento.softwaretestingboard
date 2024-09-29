package com.uam.automation.ui.tasks;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SendKeys;
import org.openqa.selenium.Keys;

import static com.uam.automation.ui.userinterface.AddToCardProduct.*;

public class AddToCardProduct implements Task {
    @Override
    @Step ("{0} product add to card")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(SELECTED_SIZE_PRODUCT),
                Click.on(SELECTED_COLOR_PRODUCT),
                Click.on(SELECTED_QUANTITY_PRODUCT),
                SendKeys.of(Keys.chord(Keys.CONTROL, "a")).into(SELECTED_QUANTITY_PRODUCT),
                SendKeys.of(String.valueOf(QUANTITY_PRODUCTS)).into(SELECTED_QUANTITY_PRODUCT),
                Click.on(SELECTED_BUTTON_ADDTOCART)
        );
    }

    public static AddToCardProduct with() {
        return Instrumented.instanceOf(AddToCardProduct.class).withProperties();
    }
}
