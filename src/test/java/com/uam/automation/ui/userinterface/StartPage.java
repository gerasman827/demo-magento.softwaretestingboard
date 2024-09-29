package com.uam.automation.ui.userinterface;

import net.serenitybdd.annotations.DefaultUrl;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("https://magento.softwaretestingboard.com/")
public class StartPage extends PageObject {
    public static Target LOGIN = Target.the("Sing In").locatedBy("//a[contains(text(),'Sign In')]");
}
