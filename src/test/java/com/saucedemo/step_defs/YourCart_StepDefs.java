package com.saucedemo.step_defs;

import com.saucedemo.pages.YourCartPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;

public class YourCart_StepDefs {
    YourCartPage yourCartPage=new YourCartPage();
    @And("The user should see the added items on cart page")
    public void theUserShouldSeeTheAddedItemsOnCartPage(List<String> adedItems) {
        List<String> actualList = yourCartPage.getYourCartAddedItemsName();
        List<String> expectedList=adedItems;
        Assert.assertEquals(expectedList,actualList);


    }

    @When("The user navigate to page related button:{string}")
    public void theUserNavigateToPageRelatedButton(String buttonName) {
        yourCartPage.navigateToPage(buttonName);
    }
}
