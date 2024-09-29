package com.uam.automation.ui.tasks;

import com.uam.automation.ui.userinterface.StartPage;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class NavigateTo  {
    public static Performable theOnlineStore() {
        return Task.where("{0} opens the online store page",
                Open.browserOn().the(StartPage.class));
    }
}
