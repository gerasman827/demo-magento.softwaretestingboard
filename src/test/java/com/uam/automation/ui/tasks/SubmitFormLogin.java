package com.uam.automation.ui.tasks;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.annotations.Step;
import static com.uam.automation.ui.userinterface.SubmitFormLogin.*;

public class SubmitFormLogin implements Task {
    @Override
    @Step ("{0} submit the form login")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue("german.arenass@autonoma.edu.co").into(EMAIL_FIELD),
                Enter.theValue("Holamundo123").into(PASSWORD_FIELD),
                Click.on(SIGN_IN_BUTTON)
        );
    }

    public static SubmitFormLogin with() {
        return Instrumented.instanceOf(SubmitFormLogin.class).withProperties();
    }
}
