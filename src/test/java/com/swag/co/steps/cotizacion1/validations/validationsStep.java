package com.swag.co.steps.cotizacion1.validations;

import com.swag.co.pages.cotizacion1.validations.ValidationPageCotizacion;
import net.serenitybdd.annotations.Step;

public class validationsStep {

    private ValidationPageCotizacion validationPageCotizacion;

    @Step("esperar abrir la pestaña de los carros")
    public Boolean titleSeleccionarVehiculoIsVisible() {
        Boolean isVisible = validationPageCotizacion.getSeleccionarVehiculo().isVisible();
        System.out.println(isVisible);
        return isVisible;
    }


}
