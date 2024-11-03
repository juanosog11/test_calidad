package com.swag.co.definitions;

import com.swag.co.steps.login.LoginSteps;
import com.swag.co.steps.validations.ValidationStep;
import com.swag.co.utilities.website.WebSite;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import org.junit.Assert;

public class LoginDef {

    @Steps(shared = true)
    WebSite url;

    @Steps(shared = true)
    LoginSteps login; // This should be automatically initialized by Serenity

    @Steps(shared = true)
    ValidationStep validate;

    @Given("el usuario navega al sitio web")
    public void userNavigateTo() {
        url.navigateTo("https://www.saucedemo.com/v1/index.html");
    }

    @When("ingresar credenciales validas")
    public void userLoginWithValidCredentials() {
        login.typeUsername("standard_user");
        login.typePassword("secret_sauce");
        login.click_bottom();
    }

    @Then("la aplicacion deberia mostrar el modilo principal de productos")
    public void systemShowProductsModule() {

        Assert.assertTrue(validate.titleIsVisible());
    }
}
