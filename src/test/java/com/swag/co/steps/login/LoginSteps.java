package com.swag.co.steps.login;

import com.swag.co.pages.login.LoginPage;
import net.serenitybdd.annotations.Step;


public class LoginSteps {
    private LoginPage loginPage;


    @Step("Ingresar usuario")
    public void typeUsername(String username) {
        loginPage.getUsernameField().sendKeys(username);
    }

    @Step("Ingresar usuario")
    public void typePassword(String password) {
        loginPage.getPasswordField().sendKeys(password);
    }

    @Step("Click en el boton login")
    public void click_bottom() {
        loginPage.getBtn_loginField().click();
    }

}




