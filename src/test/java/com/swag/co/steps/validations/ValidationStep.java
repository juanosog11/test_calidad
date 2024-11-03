package com.swag.co.steps.validations;

import com.swag.co.pages.validations.ValidationPage;
import net.serenitybdd.annotations.Step;

public class ValidationStep {

    private ValidationPage validation;

    @Step("Validar visualización del módulo de productos")
    public Boolean titleIsVisible(){
        return validation.getLbl_productField().isVisible();
    }
}
