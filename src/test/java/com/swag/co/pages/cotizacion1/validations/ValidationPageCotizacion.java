package com.swag.co.pages.cotizacion1.validations;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class ValidationPageCotizacion extends PageObject {

    @FindBy(xpath = "//div[@id='step']//div[@id='step-1']")
    private WebElementFacade seleccionarVehiculo;

    @FindBy(xpath = "//div[@id='step']//div[@id='step-2']")
    private WebElementFacade ingresarDatos;

    @FindBy(xpath = "//div[@id='step']//div[@id='step-3']")
    private WebElementFacade confirmarSolicitud;

    @FindBy(xpath = "//h3[text()='Información de contacto']")
    private WebElementFacade informacionContacto;

    @FindBy(xpath = "//span[text()='Resumen de solicitud']")
    private WebElementFacade resumenSolicitud;

    public WebElementFacade getSeleccionarVehiculo() {
        return seleccionarVehiculo;
    }

    public WebElementFacade getIngresarDatos() {
        return ingresarDatos;
    }

    public WebElementFacade getConfirmarSolicitud() {
        return confirmarSolicitud;
    }

    public WebElementFacade getInformacionContacto() {
        return informacionContacto;
    }

    public WebElementFacade getResumenSolicitud() {
        return resumenSolicitud;
    }
}
