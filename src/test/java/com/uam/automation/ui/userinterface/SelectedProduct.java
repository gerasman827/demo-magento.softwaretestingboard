package com.uam.automation.ui.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;

public class SelectedProduct extends PageObject {
    public static final Target SELECTED_PRODUCT = Target.the("Selected product")
            .locatedBy("//div[contains(@class,'products-grid')]//img[contains(@alt, 'Caesar Warm-Up Pant')]");

}
