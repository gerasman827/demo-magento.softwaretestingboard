package com.uam.automation.ui.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;

public class AddToCardProduct extends PageObject {
    public static final Target SELECTED_SIZE_PRODUCT = Target.the("Size").
            locatedBy("//div[@attribute-code='size']/div[@role='listbox']/div[contains(text(),'34')]");
    public static final Target SELECTED_COLOR_PRODUCT = Target.the("Color")
            .locatedBy("//div[@attribute-code='color']/div[@role='listbox']/div[@option-tooltip-value='#ef3dff']");
    public static final Target SELECTED_QUANTITY_PRODUCT = Target.the("Quantity of products")
            .located(By.id("qty"));
    public static final String QUANTITY_PRODUCTS = "4";
    public static final Target SELECTED_BUTTON_ADDTOCART = Target.the("Add to Cart")
            .locatedBy("//button[@type='submit' and @title='Add to Cart']");
}
