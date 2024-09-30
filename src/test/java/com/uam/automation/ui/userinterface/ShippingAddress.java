package com.uam.automation.ui.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;

public class ShippingAddress extends PageObject {
    public static final Target SHIPPING_ADDRESS_COMPANY = Target.the("Company name")
            .locatedBy("//input[contains(@name,'company')]");

    public static final Target SHIPPING_ADDRESS_STREETADDRESS = Target.the("Street Address")
            .locatedBy("//input[contains(@name,'street[0]')]");

    public static final Target SHIPPING_ADDRESS_CITY = Target.the("City name")
            .locatedBy("//input[contains(@name,'city')]");

    public static final Target SHIPPING_ADDRESS_STATE = Target.the("State")
            .locatedBy("//select[contains(@name,'region_id')]");

    public static final String SHIPPING_ADDRESS_VALUE_STATE = "628";

    public static final Target SHIPPING_ADDRESS_POSTALCODE = Target.the("Postal code")
            .locatedBy("//input[contains(@name,'postcode')]");

    public static final Target SHIPPING_ADDRESS_COUNTRY = Target.the("Country")
            .locatedBy("//select[contains(@name,'country_id')]");

    public static final String SHIPPING_ADDRESS_VALUE_COUNTRY = "CO";

    public static final Target SHIPPING_ADDRESS_PHONE_NUMBER = Target.the("PhoneNumber")
            .locatedBy("//input[contains(@name,'telephone')]");

    public static final Target SHIPPING_METHOD = Target.the("Shipping Methods")
            .locatedBy("//*[@id=\"checkout-shipping-method-load\"]/table/tbody/tr[2]/td[1]");

    public static final Target BUTTON_NEXT = Target.the("Continue with purchase")
            .located(By.className("continue"));  // con xpath no funcionó: button[@type='submit']

}
