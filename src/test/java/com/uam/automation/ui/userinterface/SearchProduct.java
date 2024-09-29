package com.uam.automation.ui.userinterface;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;

public class SearchProduct extends PageObject {
    public static final Target SEARCH_PRODUCT = Target.the("Search")
            .located(By.id("search"));

    public static final Target FIRST_PRODUCT_RESULT = Target.the("Product")
            .locatedBy("//ul[@role='listbox']//li[1]");
}



