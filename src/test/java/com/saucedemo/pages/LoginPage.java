package com.saucedemo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{
    @FindBy(id = "user-name")
    public WebElement userNameInput;
    @FindBy(id = "password")
    public WebElement passwordInput;
    @FindBy(id = "login-button")
    public WebElement loginButton;

    public void login(String username,String password){
        userNameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        loginButton.click();

    }
}
