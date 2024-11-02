package com.swag.co.pages.cotizacion1;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class CotizacionPage extends PageObject {

    // Localizador para el botón "Solo ida"
    @FindBy(xpath = "//label[input[@value='one-way']]/span[text()='Solo ida']")
    protected WebElementFacade soloIda;

    // Localizador para el botón "Por horas"
    @FindBy(xpath = "//label[input[@value='hourly']]/span[text()='Por horas']")
    protected WebElementFacade porHoras;

    // Localizador para el campo "Origen"
    @FindBy(id = "origin-autocomplete")
    protected WebElementFacade origen;

    // Localizador para el campo "Destino"
    @FindBy(id = "destination-autocomplete")
    protected WebElementFacade destino;


    // Localizador para abrir el calendario
    @FindBy(xpath = "//input[@placeholder='Fecha y hora' and @type='text']")
    protected WebElementFacade openCalendarButton;

    // Localizador para seleccionar un día específico
    @FindBy(xpath = "//div[contains(@class, 'flatpickr-calendar')]//span[contains(@class, 'flatpickr-day')]")
    protected List<WebElementFacade> availableDays;

    // Localizador para el campo de horas
    @FindBy(css = ".flatpickr-hour")
    protected WebElementFacade hourInput;

    // Localizador para el campo de minutos
    @FindBy(css = ".flatpickr-minute")
    protected WebElementFacade minuteInput;

    // Localizador para el separador de tiempo
    @FindBy(css = ".flatpickr-time-separator")
    protected WebElementFacade timeSeparator;

    // Localizador para confirmar la selección de fecha y hora (si aplica)
    @FindBy(xpath = "//button[contains(@class, 'font-black') and span[text()='Buscar']]")
    protected WebElementFacade buscarButton;


    // Localizador para el botón "Buscar"
    @FindBy(xpath = "//button[contains(@class, 'font-black') and span[text()='Buscar']]")
    protected WebElementFacade btnBuscar;

    @FindBy(xpath = "//div[contains(@class, 'flex pt-5 pb-4 cursor-pointer') and @id='f2' and contains(., 'SEDAN BASICO')]")
    protected WebElementFacade btnSedanBasico;

    // Localizador para el botón "Continuar"
    @FindBy(xpath = "//button[@id='continue-form-btn' and contains(@class, 'bg-black') and span[text()='Continuar']]")
    protected WebElementFacade btnContinuar;

    // Localizador para el campo "Nombre y apellido"
    @FindBy(xpath = "//input[@name='name']")
    protected WebElementFacade inputNombreApellido;

    // Localizador para el campo "Email"
    @FindBy(xpath = "//input[@name='email']")
    protected WebElementFacade inputEmail;

    // Localizador para el campo "Teléfono"
    @FindBy(xpath = "//input[@name='phone']")
    protected WebElementFacade inputTelefono;

    // Localizador para el campo "Pasajeros"
    @FindBy(xpath = "//input[@name='passengers']")
    protected WebElementFacade inputPasajeros;

    @FindBy(xpath = "//textarea[@name='observations']")
    protected WebElementFacade textareaComentarios;


    public WebElementFacade getBuscarButton() {
        return buscarButton;
    }

    public WebElementFacade getSoloIda() {
        return soloIda;
    }

    public WebElementFacade getPorHoras() {
        return porHoras;
    }

    public WebElementFacade getOrigen() {
        return origen;
    }

    public WebElementFacade getDestino() {
        return destino;
    }



    public WebElementFacade getBtnBuscar() {
        return btnBuscar;
    }

    public WebElementFacade getBtnSedanBasico() {
        return btnSedanBasico;
    }

    public WebElementFacade getBtnContinuar() {
        return btnContinuar;
    }

    public WebElementFacade getInputNombreApellido() {
        return inputNombreApellido;
    }

    public WebElementFacade getInputEmail() {
        return inputEmail;
    }

    public WebElementFacade getInputTelefono() {
        return inputTelefono;
    }

    public WebElementFacade getInputPasajeros() {
        return inputPasajeros;
    }

    public WebElementFacade getTextareaComentarios() {
        return textareaComentarios;
    }

    public WebElementFacade getOpenCalendarButton() {
        return openCalendarButton;
    }

    public List<WebElementFacade> getAvailableDays() {
        return availableDays;
    }

    public WebElementFacade getHourInput() {
        return hourInput;
    }

    public WebElementFacade getMinuteInput() {
        return minuteInput;
    }

    public WebElementFacade getTimeSeparator() {
        return timeSeparator;
    }


}
