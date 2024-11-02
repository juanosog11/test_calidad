package com.swag.co.pages.login;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageObject {

    @FindBy(id = "user-name")
    protected WebElementFacade txt_username;

    @FindBy(id = "password")
    protected WebElementFacade txt_password;

    @FindBy(id = "login-button")
    public WebElementFacade btn_login;

    public WebElementFacade getUsernameField() {
        return txt_username;
    }

    public WebElementFacade getPasswordField() {
        return txt_password;
    }

    public WebElementFacade getBtn_loginField() {
        return btn_login;
    }
}
