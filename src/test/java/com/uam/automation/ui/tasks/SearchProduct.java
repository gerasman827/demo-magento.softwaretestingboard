package com.uam.automation.ui.tasks;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.MoveMouse;
import org.apache.pdfbox.contentstream.operator.graphics.MoveTo;

import static com.uam.automation.ui.userinterface.SearchProduct.*;
import static com.uam.automation.ui.userinterface.SelectedProduct.*;

public class SearchProduct implements Task {
    @Override
    @Step ("{0} search product")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue("pants").into(SEARCH_PRODUCT),
                Click.on(FIRST_PRODUCT_RESULT),
                MoveMouse.to(SELECTED_PRODUCT),
                Click.on(SELECTED_PRODUCT)
        );
    }

    public static SearchProduct with() {
        return Instrumented.instanceOf(SearchProduct.class).withProperties();
    }
}
