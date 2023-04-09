package com.saucedemo.pages;

import com.saucedemo.utilities.BrowserUtils;
import com.saucedemo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class YourCartPage extends BasePage{
    @FindBy(xpath = "//div[@class='inventory_item_name']")
    public List<WebElement> adedItemsName;

    public List<String> getYourCartAddedItemsName(){
        List<String> actuallist = BrowserUtils.getElementsText(adedItemsName);
        return actuallist;
    }
    public void navigateToPage(String buttonName){
        Driver.get().findElement(By.xpath("//button[@id='"+buttonName+"']")).click();
    }
}
