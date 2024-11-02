package com.swag.co.pages.validations;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class ValidationPage extends PageObject {

    //    @FindBy(xpath = "//*[@id='inventory_filter_container']")

    @FindBy(css = "#inventory_filter_container")
    protected WebElementFacade lbl_product;


    public WebElementFacade getLbl_productField() {
        waitFor(lbl_product).shouldBeVisible();

        return lbl_product;
    }

}