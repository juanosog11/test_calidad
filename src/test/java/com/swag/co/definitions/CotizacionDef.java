package com.swag.co.definitions;

import com.swag.co.steps.cotizacion1.CotizacionSteps;
import com.swag.co.steps.cotizacion1.validations.validationsStep;
import com.swag.co.utilities.website.WebSite;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import org.junit.Assert;

public class CotizacionDef {

    @Steps(shared = true)
    WebSite url;

    @Steps(shared = true)
    CotizacionSteps cotizacion; // Automatically initialized by Serenity

    @Steps(shared = true)
    validationsStep validate; // Validation steps for cotizacion

    @Given("el usuario navega al sitio web")
    public void userNavigateToCotizacionPage() {
        url.navigateTo("https://www.transportesejecutivos.com/medellin"); // Reemplaza con la URL correspondiente
    }

    @When("el usuario ingresa los datos de origen, destino, fecha y hora")
    public void userEntersOriginDestinationDateAndTime() {
        String origen = "Medellín, Antioquia, Colombia";
        String destino = "Envigado, Antioquia, Colombia";



        String fechaYHora = "Sábado 16, 12:00 PM"; // Reemplaza con datos reales

        cotizacion.ingresarDatosOrigenDestinoFechaHora(origen, destino, fechaYHora);
    }


    @When("el usuario da clic en el botón de buscar")
    public void userClicksBuscarButton() {
        cotizacion.hacerClicBuscar();
    }

    @Then("esperar abrir la pestaña de los carros")
    public void userSeleccionarVehiculoVisible(){
        Assert.assertTrue(validate.titleSeleccionarVehiculoIsVisible());
    }

    @When("el usuario selecciona el vehículo")
    public void userSelectsVehicle() {
        cotizacion.seleccionarVehiculo(); // Asegúrate de que este método esté implementado en CotizacionSteps
    }

    @When("el usuario da clic en continuar")
    public void userClicksContinue() {
        cotizacion.hacerClicContinuar();
    }

    @When("el usuario llena la información de contacto")
    public void userFillsContactInformation() {
        cotizacion.llenarInformacionContacto("Juan Perez", "juan.perez@example.com", "3211234567", "4"); // Reemplaza con datos reales
    }

    @When("el usuario llena la información adicional")
    public void userFillsAdditionalInformation() {
        cotizacion.llenarInformacionAdicional("Comentarios adicionales aquí."); // Reemplaza con datos reales
    }

}
