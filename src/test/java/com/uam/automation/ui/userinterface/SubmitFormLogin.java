package com.uam.automation.ui.userinterface;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;

public class SubmitFormLogin extends PageObject {
    public static final Target EMAIL_FIELD = Target.the("email")
            .located(By.id("email"));

    public static final Target PASSWORD_FIELD = Target.the("password")
            .located(By.id("pass"));

    public static final Target SIGN_IN_BUTTON = Target.the("Submit login")
            .located(By.id("send2"));
}


