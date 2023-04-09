package com.saucedemo.step_defs;

import com.saucedemo.pages.LoginPage;
import com.saucedemo.utilities.ConfigurationReader;
import com.saucedemo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class Login_StepDefs {
    LoginPage loginPage=new LoginPage();
    @Given("The user is on the login page")
    public void theUserIsOnTheLoginPage() {
        Driver.get().get(ConfigurationReader.get("url"));
    }

    @When("The user enter valid credentials:{string} and {string}")
    public void theUserEnterValidCredentialsAnd(String username, String password) {
       loginPage.login(username, password);

    }
}
