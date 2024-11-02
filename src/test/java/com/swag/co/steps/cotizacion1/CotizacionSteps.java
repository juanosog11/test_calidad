package com.swag.co.steps.cotizacion1;

import com.swag.co.pages.cotizacion1.CotizacionPage;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import java.util.Arrays;

import static net.serenitybdd.core.Serenity.getDriver;

public class CotizacionSteps {

    private CotizacionPage cotizacionPage;


    @Step("el usuario ingresa los datos de origen, destino, fecha y hora")
    public void ingresarDatosOrigenDestinoFechaHora(String origen, String destino, String fechaYHora) {
        // Separar la fecha y la hora
        String[] fechaHoraSplit = fechaYHora.split(", "); // Separa por coma y espacio
        verificarFormatoFechaHora(fechaHoraSplit);

        String fecha = fechaHoraSplit[0]; // Sábado 16
        String horaYMinuto = fechaHoraSplit[1].trim(); // "12:00 PM"
        String[] horaMinutoSplit = horaYMinuto.split(":");
        verificarFormatoHora(horaMinutoSplit);

        String hour = horaMinutoSplit[0];
        String minute = horaMinutoSplit[1].replace(" PM", "").replace(" AM", ""); // Extraer solo los minutos
        String day = fecha.split(" ")[1]; // Suponiendo que la fecha es 'Sábado 16'

        // Ingresar los datos de origen y destino
        ingresarDatosOrigenDestino(origen, destino);

        // Abrir el calendario y seleccionar el día
        seleccionarDiaEnCalendario(day);

        // Ingresar la hora y los minutos
        ingresarHoraYMinuto(hour, minute);
    }

    // Método para verificar el formato de fecha y hora
    private void verificarFormatoFechaHora(String[] fechaHoraSplit) {
        if (fechaHoraSplit.length < 2) {
            throw new IllegalArgumentException("El formato de fecha y hora es inválido: " + Arrays.toString(fechaHoraSplit));
        }
    }

    // Método para verificar el formato de hora
    private void verificarFormatoHora(String[] horaMinutoSplit) {
        if (horaMinutoSplit.length < 2) {
            throw new IllegalArgumentException("El formato de hora es inválido: " + Arrays.toString(horaMinutoSplit));
        }
    }

    // Método para ingresar datos de origen y destino
    private void ingresarDatosOrigenDestino(String origen, String destino) {
        cotizacionPage.getOrigen().sendKeys(origen);

        cotizacionPage.getOrigen().sendKeys(Keys.ENTER);

        cotizacionPage.getDestino().sendKeys(destino);

        cotizacionPage.getDestino().sendKeys(Keys.ENTER);

    }

    // Método para abrir el calendario y seleccionar el día
    private void seleccionarDiaEnCalendario(String day) {
        System.out.println(cotizacionPage.getOpenCalendarButton().isVisible());
        cotizacionPage.getOpenCalendarButton().click(); // Abrir el calendario

        // Seleccionar el día
        for (WebElementFacade dayElement : cotizacionPage.getAvailableDays()) {
            if (dayElement.getText().equals(day)) {
                dayElement.click();
                break;
            }
        }
    }

    // Método para ingresar la hora y los minutos
    private void ingresarHoraYMinuto(String hour, String minute) {
        cotizacionPage.getHourInput().type(hour);
        cotizacionPage.getMinuteInput().type(minute);
    }


    @Step("el usuario da clic en el botón de buscar")
    public void hacerClicBuscar() {
        WebElementFacade btnBuscar = cotizacionPage.getBtnBuscar();
        System.out.println(btnBuscar.isVisible());
        btnBuscar.waitUntilVisible(); // Espera hasta que el botón sea visible
        btnBuscar.click();
    }

    @Step("el usuario selecciona el vehículo")
    public void seleccionarVehiculo() {
        cotizacionPage.getBtnSedanBasico().click(); // Ajusta esto según el botón del vehículo seleccionado
    }


    @Step("el usuario da clic en continuar")
    public void hacerClicContinuar() {
        cotizacionPage.getBtnContinuar().click();
    }

    @Step("el usuario llena la información de contacto")
    public void llenarInformacionContacto(String nombreApellido, String email, String telefono, String pasajeros) {
        cotizacionPage.getInputNombreApellido().sendKeys(nombreApellido);
        cotizacionPage.getInputEmail().sendKeys(email);
        cotizacionPage.getInputTelefono().sendKeys(telefono);
        cotizacionPage.getInputPasajeros().sendKeys(pasajeros);
    }

    @Step("el usuario llena la información adicional")
    public void llenarInformacionAdicional(String comentarios) {
        cotizacionPage.getTextareaComentarios().sendKeys(comentarios);
    }


}
