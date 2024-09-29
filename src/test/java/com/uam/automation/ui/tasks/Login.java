package com.uam.automation.ui.tasks;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import static com.uam.automation.ui.userinterface.StartPage.*;

public class Login implements Task {

    @Override
    @Step("{0} Start login")
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                NavigateTo.theOnlineStore(),
                Click.on(LOGIN)
        );
    }

    public static Login with() {
        return Instrumented.instanceOf(Login.class).withProperties();
    }
}
