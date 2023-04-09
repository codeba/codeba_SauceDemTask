package com.saucedemo.step_defs;

import com.saucedemo.pages.ProductPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Product_StepDefs {
    ProductPage productPage = new ProductPage();

    @Then("The user should be able to see page title : {string}")
    public void theUserShouldBeAbleToSeePageTitle(String pageName) {
        String actualPageTitle = productPage.getPageTitle(pageName);
        String expectedPageTitle = pageName;
        Assert.assertEquals(expectedPageTitle, actualPageTitle);

    }

    @When("The user should be able to sort items by order type:{string}")
    public void theUserShouldBeAbleToSortItemsByOrderType(String ordertype) {
        productPage.sortItems(ordertype);
    }

    @And("The user should be able to add items with item name:{string}")
    public void theUserShouldBeAbleToAddItemsWithItemName(String itemname) {
        productPage.addItem(itemname);
    }

    @Then("The user soud be able to verify added item quantitiy")
    public void theUserSoudBeAbleToVerifyAddedItemQuantitiy() {
        int actualQuantitiy = productPage.getBasketQuantitiy();
        int expectedQuantitiy = ProductPage.count;
        Assert.assertEquals(expectedQuantitiy, actualQuantitiy);
    }

    @When("The user navigate to your cart page")
    public void theUserNavigateToYourCartPage() {
        productPage.navigateyourcart();
    }
}
